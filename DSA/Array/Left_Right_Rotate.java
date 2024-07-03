/*Rotate array by K elements

Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

Examples:

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position. */

package Array;
import java.util.*;


public class Left_Right_Rotate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int arr1[] = {3, 7, 8, 9, 10, 11};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int k = sc.nextInt();
        RightPrint(arr, k);
        leftPrint(arr1, k);
    }

    static void RightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // Right shift
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static void LeftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // Left shift
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
    }

    static void RightPrint(int[] arr, int k) {
        RightRotate(arr, k);
        // Print the rotated array
        System.out.print("Right Rotated Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void leftPrint(int[] arr, int k) {
        LeftRotate(arr, k);
        // Print the rotated array
        System.out.print("Left Rotated Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
