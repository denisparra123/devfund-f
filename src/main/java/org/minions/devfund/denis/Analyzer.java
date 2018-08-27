
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/*
 * SD2x Homework #3
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the method signatures!
 */
public class Analyzer {

    /*
	 * Implement this method in Part 1
     */
    public static List<Sentence> readFile(String filename) {
        List<Sentence> result = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(filename))) {
            stream.forEach(line -> {
                if (line != null && line.length() > 1 && !line.contains("ignore me")) {
                    int score = 0;
                    if (line.startsWith("-") && line.charAt(2) != '.') {
                        score = Integer.parseInt(String.valueOf(line.charAt(1))) * -1;
                        line = line.substring(3);
                        result.add(new Sentence(score, line));
                    } else if (!line.startsWith("-") && line.charAt(1) != '.' && Character.isDigit(line.charAt(0))) {
                        score = Integer.parseInt(String.valueOf(line.charAt(0)));
                        line = line.substring(2);
                        result.add(new Sentence(score, line));
                    }
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(Analyzer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return result;
        }
    }

    /*
	 * Implement this method in Part 2
     */
    public static Set<Word> allWords(List<Sentence> sentences) {
        Set<Word> result = new HashSet<>();
        if (sentences != null) {
            sentences.forEach(sentence -> {
                if (sentence != null) {
                    String line = sentence.getText().toLowerCase();
                    line = line.replaceAll("'s", "");
                    String[] words = line.split(" ");
                    for (String word : words) {
                        if (word.matches("[a-zA-Z]+")) {
                            Word wd = new Word(word);
                            Word wdFound = result.stream().filter(wordDictionary -> wordDictionary.equals(wd)).findFirst().orElse(null);
                            if (wdFound != null) {
                                wdFound.increaseTotal(sentence.getScore());
                            } else {
                                result.add(wd);
                            }
                        }
                    }
                }
            });
        }
        return result;
    }

    /*
	 * Implement this method in Part 3
     */
    public static Map<String, Double> calculateScores(Set<Word> words) {
        Map<String, Double> result = new HashMap<>();
        if (words != null) {
            words.forEach(word -> {
                if (word != null) {
                    result.put(word.getText(), word.calculateScore());
                }
            });
        }
        return result;
    }

    /*
	 * Implement this method in Part 4
     */
    public static double calculateSentenceScore(Map<String, Double> wordScores, String sentence) {

        double result = 0;
        if (sentence != null && sentence.length() > 0 && wordScores != null) {
            sentence = sentence.toLowerCase();
            sentence = sentence.replaceAll("'s", "");
            sentence = sentence.replaceAll("/[^A-Za-z0-9]./", "");
            String[] words = sentence.split(" ");
            int excluded = 0;
            for (String word : words) {
                if (word.matches("[a-zA-Z]+")) {
                    result += wordScores.getOrDefault(word, 0.0);
                } else {
                    excluded++;
                }
            }
            result = (result == 0.0) ? 0.0 : result / (words.length - excluded);
        }
        return result;
    }

    /*
	 * This method is here to help you run your program. Y
	 * You may modify it as needed.
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify the name of the input file");
            System.exit(0);
        }
        String filename = args[0];
        System.out.print("Please enter a sentence: ");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        in.close();
        List<Sentence> sentences = Analyzer.readFile(filename);
        Set<Word> words = Analyzer.allWords(sentences);
        Map<String, Double> wordScores = Analyzer.calculateScores(words);
        double score = Analyzer.calculateSentenceScore(wordScores, sentence);
        System.out.println("The sentiment score is " + score);
    }
}
