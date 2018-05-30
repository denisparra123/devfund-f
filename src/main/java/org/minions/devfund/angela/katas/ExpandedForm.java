package org.minions.devfund.angela.katas;

/**
 * Gets the expanded form of a number.
 */
final class ExpandedForm {

    /**
     * Private constructor.
     */
    private ExpandedForm() {

    }

    /**
     * Gets the expanded form of a number e.g expandedForm(70304);
     * Should return "70000 + 300 + 4".
     * <p>
     * IntStream.range(0, String.valueOf(num).length())
     * .mapToObj(x -> String.valueOf( Character.getNumericValue(String.valueOf(num).charAt(x) ) *
     * (int)Math.pow(10, String.valueOf(num).substring(x).length()-1)))
     * .filter(x -> !x.equals("0"))
     * .collect(Collectors.joining(" + "));
     *
     * @param num int number to expand.
     * @return String with the number expanded form.
     */
    static String expandedForm(final int num) {
        return expandedForm(num, num, 0);
    }

    /**
     * Expanded form helper that gets the expanded form of a number
     * e.g expandedForm(70304) Should return "70000 + 300 + 4".
     *
     * @param original the original number subtracting units, tens, hundreds and so on.
     * @param num      the number divided by 100 each iteration.
     * @param c        counter to know to subtract units, tens, hundreds and so on.
     * @return String with the number expanded form.
     */
    private static String expandedForm(final int original, final int num, final int c) {
        final int lessThanTen = 9;
        if (num > lessThanTen) {
            final int ten = 10;
            return num % ten != 0 ? expandedForm((int) (original - ((num % ten) * Math.pow(ten, c))),
                    num - (num % ten), c) + " + " + (int) ((num % ten) * Math.pow(ten, c))
                    : expandedForm(original, num / ten, c + 1);
        } else {
            return original + "";
        }
    }

}
