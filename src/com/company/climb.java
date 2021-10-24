package com.company;

public class climb {
    public static void main(String[] args) {
        String sentence = "Climb mountains not so the world can see you, but so you can see the world";
        String[] words = sentence.split("\\s+");
        {
            System.out.println("This sentence consists of " + (words.length) + " words.");
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("the")) {
                count++;
            }
        }
        System.out.println("There are " + count + " the");

        int countS = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("s")) {
                countS++;
            }
        }
        System.out.println(countS + " words contains 's' letter");

        for (int i = 0; i < words.length; i++) {
            int countW = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    if (j < i) {
                        break;
                    }
                    countW++;
                }
            }
            if (countW > 1) {
                System.out.println("'" + words[i] + "'" + " is repeated " + countW + " times");

            }

        }
        String replaceString = sentence.replace("you", "You");
        System.out.println(replaceString);
    }
}

