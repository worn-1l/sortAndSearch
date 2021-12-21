package org.bowen.controller;

/**
 * @author bowencoder
 * @date 2021/12/21 16:23
 */
public class selectSort {
    public static void selectSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int index = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[index]>arr[j]){
                    index = j;
                }
            }
            if (i != index){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int [] array = {5,1,0,3,2};
        selectSort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");

        }
    }
}
