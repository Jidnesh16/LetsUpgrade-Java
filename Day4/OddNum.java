package com.letsupgrade;

public class OddNum {
    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.println("Some no's: ");
        for (int i=0;i<arr.length;i++){
            arr[i] = i+1;
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nOdd no's: ");
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}