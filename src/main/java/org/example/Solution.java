package org.example;

class Solution {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        int max = Math.max(word1.length(), word2.length());
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        for (int i = 0; i < max; i++) {
            if (min > i)
                result.append(w1[i]).append(word2.toCharArray()[i]);
            else
                result.append(word1.length() > word2.length() ? w1[i] : w2[i]);
        }
        return result.toString();
    }
}
