/*Problem Statement: Given an array, we have to find the largest element in the array.
Example 1:
Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array. 

Example2:
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array. */


package Array;

public class Largest_Element {

  public static void main(String args[]) {

    int arr1[] = { 2, 5, 1, 3, 0 };
    System.out.println("The Largest element in the array is: " + findLargestElement(arr1));

    int arr2[] = { 8, 10, 5, 7, 9 };
    System.out.println("The Largest element in the array is: " + findLargestElement(arr2));
  }

  static int findLargestElement(int arr[]) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}
