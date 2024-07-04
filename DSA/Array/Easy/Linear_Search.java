/* Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.

Examples:

Example 1:
Input: arr[]= 1 2 3 4 5, num = 3
Output: 2
Explanation: 3 is present in the 2nd index

Example 2:
Input: arr[]= 5 4 3 2 1, num = 5
Output: 0
Explanation: 5 is present in the 0th index*/
package Array.Easy;
import java.util.*;

public class Linear_Search {
    static int search(int a[],int k){
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={22,3,5,5,23,2,6,6};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int k=sc.nextInt();
        System.out.println(search(a, k));
    }
}
