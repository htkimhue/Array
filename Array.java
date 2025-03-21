package CMU;

import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.
        int[] array;

        //2.  
        int n;
        do {
            System.out.print("Enter the number Of elements for the array: ");
            n = sc.nextInt();
            if (1 > n || n > 100) {
                System.out.println("Please re-enter from 1 to 100 ");
            }

        } while (1 > n || 100 < n);

        //3.
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = sc.nextInt();
        }

        //4.
        System.out.println("Array" + Arrays.toString(array));

        //5.
        ascending(array);
        System.out.print("Ascending order: ");
        displayArray(array);

        //6.
        findEvenNumber(array);

        //7.
        findOddNumber(array);

        //8.
        findLargesElement(array);
        
        //9.
        calculateSumDivisibleBy7(array);

    }

    //4. Write a method to display the array
    public static void displayArray(int[] arr) {
        System.out.println(Arrays.toString(arr));

    }

    //5. Write a method to sort the array in ascending order
    public static void ascending(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i < j) {
                    int t = arr[i];
                    arr[i] =arr[j];
                    arr[j] = t;
                }
            }
        }

    }

    //6. Write a method to find even numbers in the array
    public static void findEvenNumber(int[] arr) {
        System.out.print("Even numbers in array: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //7. Write a method to find odd number in the array 
    public static void findOddNumber(int[] arr) {
        System.out.print("Odd number in array: ");
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //8. Write a method to find the largest element in the array
    public static void findLargesElement(int[] arr) {
        System.out.print("Largest number in array: ");
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

    //9. Write a method to calculate the sum of elements divisible by 7
    public static void calculateSumDivisibleBy7(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 7 == 0) {
                sum+=i;
            }
        }
        System.out.println("Sum of elements divisible by 7: "+sum);
    }

}
