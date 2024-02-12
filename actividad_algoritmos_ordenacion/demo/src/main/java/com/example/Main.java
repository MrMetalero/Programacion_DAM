package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{10,5,30,7,8,9,15};



        Integer n = arr.length;
        Integer temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (arr[j] < arr[j-1]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }

            }


        }


        System.out.println(Arrays.toString(arr));
   
    


    }
}