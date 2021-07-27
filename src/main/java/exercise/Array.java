package exercise;


/*
Problem 1: Find the Contiguous Subarray with Sum to a Given Value in an array.

Given an array of positive integer and given value X, find Contiguous sub array whose sum is equal to X.
For example:

1
2
3
4
5
6
arr[]={14, 12, 70, 15, 99, 65, 21, 90};
X =97.
Sum found between index 1 to 3
Elements are 12, 17 and 15
 */

public class Array {

    public static void main(String[] args){

        int total = 176;

        int[] contiguous = {14, 12, 70, 15, 99, 65, 21, 90};

        subArray(contiguous, total);

    }

    //right now this will only work if you provide numbers that do not exceed the the searched for total
    //Want to improve so it can drop numbers  that to not meet the goal
    //change output so it is not inclusive
    public static void subArray(int[] subarray, int goal){

        for (int i = 0; i < subarray.length; i ++){

            int temp = subarray[i];

            for (int j = i + 1; j < subarray.length; j++){

                temp = temp + subarray[j];

                //if the most recent number exceeds the goal it will remove the most recent numbers
                if(temp > goal){

                  temp = temp - subarray[j];

                }

                if(temp == goal){
                    System.out.println("Sum found between index " + i + " to " + j);
                    System.out.println("The numbers are");
                    for (int k = i; k<=j; k++)
                    {
                        if(k == j)
                        {
                            System.out.println("and ");
                        }
                        System.out.println(subarray[k] + " ");
                    }

                    return;
                }

            }
        }

        System.out.println("Does not work");

    }
}
