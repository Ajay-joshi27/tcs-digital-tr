package Stringss;

import java.util.Arrays;

public class SortStrings {
public static void main(String[] args) 
        {
    String str="dbca";

    char[] arr=str.toCharArray();
    // Arrays.sort(arr);
    // System.out.println(arr);

     for (int i = 0; i < arr.length; i++) 
    {
        for (int j =i+1; j < arr.length; j++) 
        {
            if (arr[i]>arr[j]) 
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

    }
    System.out.println(new String(arr));
        }
        }
