package org.minions.devfund.mauricioz.linkedList;

import java.util.LinkedList;

/**
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */
public class LinkedListUtils {
    /**
     * This method will add an ellement on a sorted list.
     * @param list a list.
     * @param value a value.
     */
    public static void insertSorted(final LinkedList<Integer> list, int value) {
		/* IMPLEMENT THIS METHOD! */
        if (list == null) {
            return;
        }
        if (list.isEmpty()) {
            list.addFirst(value);
        }
        else {
            int index = list.size();
            if (value <= list.getFirst()) {
                list.addFirst(value);
            }
            else if (value >= list.getLast()) {
                list.addLast(value);
            }
            else {
                for (int i = 1; i < index; i++) {
                    if(value <= list.get(i)) {
                        list.add(i, value);
                        return;
                    }
                }
            }

        }
	}

    /**
     * this method will remove a max value from a list.
     * @param list a list.
     * @param N index
     */
	public static void removeMaximumValues(LinkedList<String> list, int N) {
        /* IMPLEMENT THIS METHOD! */
        if (N < 0 || list == null) {
            return;
        }
        else {
            int index = list.size();
            for (int j = N; j > 0; j--) {
                if (!list.isEmpty()) {
                    removeElementOfTheList(list);
                }
            }
        }
	}

    /**
     * remove an element of the list.
     * @param list a list.
     */
    private static void removeElementOfTheList(LinkedList<String> list) {
        String maximumValue = getMaximumValue(list);
        for (int i = 0; i < list.size(); i++) {
            if (maximumValue.compareTo(list.get(i)) == 0) {
                list.remove(i);
            }
        }
    }

    /**
     * method to compare all the strings on a list and return the maximum value.
     * @param list a list.
     * @return largest string on the list.
     */
    private static String getMaximumValue(LinkedList<String> list) {
        String maxValue = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(maxValue) > 0) {
                maxValue = list.get(i);
            }
        }
        return maxValue;
    }

    /**
     *
     * @param one
     * @param two
     * @return
     */
	public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {

		/* IMPLEMENT THIS METHOD! */
		
		return true; // this line is here only so this code will compile if you don't modify it
	}
}
