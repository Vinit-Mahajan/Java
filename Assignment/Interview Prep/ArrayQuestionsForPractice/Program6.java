/*

   Program 6:
Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and find the min number from the array

Input:
n=6
Enter elements in the array:
2
3
6
9
5
1
Output:
1

*/

import java.util.*;
class Program6 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int size = sc.nextInt();

                int arr[] = new int[size];

                for(int i = 0 ; i < arr.length ; i++) {

                        arr[i] = sc.nextInt();
                }

                int min = Integer.MAX_VALUE;

                for(int i = 0 ; i < arr.length ; i++) {

                        if(min > arr[i]) {

                                min = arr[i];
                        }
                }

                System.out.println(min);
        }

}

