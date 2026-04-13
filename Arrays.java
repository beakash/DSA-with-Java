Arrays in Java :
//Arrays in java like list of elements of the same DATA TYPE. 
//Array in java starts with index value 0.
//i.e : 
       1.List of integer(int)
       2.List of string(String)
  // Creating an Array  :
  //Method 1 - 
  int[] marks = new int[3];
  marks[0] = 55;
  marks[1] = 65;
  marks[2] = 75;

//Method 2 -
int[] marks = { 55,65,75 }; 

//Example 1 : Taking an array as an input and printing its element .
import java.util.*;

public class Arrays {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];
  
    for(int i = 0 ; i<size ; i++){
      numbers[i] = sc.nextInt();
    }
    //print the numbers in array
    for(int i =0; i< numbers.length; i++){
      system.out.println(numbers[i]+" ");
    }
  }
}

//Example 2: Take an array of names as input from the user and print them on the screen.

import java.util.*;

public class Arrays [
  public void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String name = new String[size];

    //input
    for(int i=0; i<size ; i++) {
      names[i] = sc.next();
    }

    //output

    for(int i = 0; i<names.length; i++) {
      System.out.println("name" + (i + 1) " is : " + names[i]);
    }
  }

  }

//Find the maximum & minimum number in an array of integers

import java.util.*;

public class Arrays {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int sisize = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }


       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
      
   }
}

/*Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order. */


  import java.util.*;


public class Arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      boolean isAscending = true;
     
       for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
           if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
               isAscending = false;
           }
       }


       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }
      
   }
}

