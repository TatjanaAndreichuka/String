package com.company;

public class Main {

    public static void main(String[] args) {
        String[] words = {"Computer", "Plate", "Chair", "Girl", "Boy"};
        startsC(words);
        endsE(words);
        five(words);
        containЕ(words);
        containТе(words);
        histogram(words);
    }

    static void startsC(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("C")) {
                count++;
            }
        }
        System.out.println(count + " words starts with C");
    }

    static void endsE(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("e")) {
                count++;
            }
        }
            System.out.println(count + " words ends with e");
        }
    static void five(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()==5) {
                count++;
            }
        }
        System.out.println(count + " words consists of 5 letters");
    }
    static void containЕ(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("e")) {
                count++;
            }
        }
        System.out.println(count + " words contain  e  inside");
    }
    static void containТе(String[] words) {
        int i = 0;
            if (words[i].contains("te"))
        System.out.println("There are words that contain  te  inside");
            else
                System.out.println("There are no words that contain  te  inside");
    }

    //counting the maximum length between words
    static int lengthW(String[] words) {
        int lengthW = 0;
        for (int i=0; i<words.length; i++) {
            if (words[i].length() > lengthW){
                lengthW = words[i].length();
            }
        }
        return lengthW;
    }

    static void histogram(String[] words) {

        int nameL = 1;
        while (nameL <= lengthW(words)) {
            int countW = 0;
            for (int i=0; i<words.length; i++) {
                if (words[i].length() == nameL) {
                    countW++;
                }
            }
            System.out.println(countW + " words are " + nameL + " letters long");
            nameL++;
        }
    }
    }

