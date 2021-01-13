import java.io.*;
import java.util.*;

public class Array_1 {
    static void func(int arr[], int n)
    {
        int[] b = new int[n]; 
		int j = n; 
		for (int i = 0; i < n; i++) { 
			b[j - 1] = arr[i]; 
			j = j - 1; 
        } 
        System.out.print("Reversed array is: "); 
		for (int k = 0; k < n; k++) { 
			System.out.print(b[k]+" "); 
		} 
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter all the elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
		func(arr, n); 
    }
}
