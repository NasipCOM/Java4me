package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
//         int [] arr1 = {2, 3, 4, 5};
//         int [] arr2 = {9, 2, 5, 6, 3};
//        mergeArrays(arr1, arr2);

        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));

    }

    static public int lengthOfLastWord(String s){

        String [] numOfWords = s.split(" ");
        return numOfWords[numOfWords.length - 1].length();
    }





    static void mergeArrays(int [] arr1, int [] arr2){

        int [] mergedArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < mergedArr.length; i++) {
            mergedArr[i] = arr2[j++];
        }

        Arrays.sort(mergedArr);
        for (int el: mergedArr) {
            System.out.print(el + " ");
        }

    }

}




