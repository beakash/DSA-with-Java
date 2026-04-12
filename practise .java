//1.Enter 3 numbers from the user & make a function to print their average

import java.util.*;
public class Solutions{
  public staticvoid main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

  int average = (a + b + c ) / 3;
    System.out.println(average);
  }
}

//2.Write a function to print to print the sum of all odd numbers from 1 to n.

import java.util.*;

pubic class Solutions {
  public static void printsum(int n) {
    int sum = 0;

  for(int i = 1; i<=n ; i++) {
    if(i % 2 != 0) {
      sum = sum + i;
    }
  }
    System.out.println(sum);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();
    printSum(n);
  }
} 

//3. Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class solutions {
  public static int getGreater(int a, int b) {
    if(a > b){
      return a ;
    } else {
      return b;
    }
  }
  public static void main(String args[]) {
    scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(getGreater(a, b));
  }
}

//4. write a Function that takes in the radius as input and returns the circumference of a circle.
import.java.util.*;

public class Solutions {
  public static Double getCircumference(Double radius) {
    return 2 * 3.14 * radius;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(system.in);
    Double r = sc.nextDouble();
    System.out.println(getCircumference(radius));
  }
} 

/*5.Write a function that takes in age as input and returns if that person is eligible to vote or not.
A person of age>18 is eligible to vote .*/ 

import java.util.*;

public class Solutions {
  public static boolean isElligible(int age ){
    if(age > 18 ) {
      return true ;
    }
    return false;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    System.out.println(isElligible(age));
  }
}

//6. Write an infinite loop using do while condition.
import java.util.*;

public class Solutions {
  public static void main(String args[]){
    do {
    }while(true);
  }
}
}

//7. write a program to enter the numbers till the user wants and ath the end it should display the count of positive , negative and zeros entered.

import java.util.*;

public class Solutions {
  public static void main(string args[]){
    int positive = 0, negative = 0, zeros = 0;
    System.out.println("Press 1 to continue & 0 to stop ");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
           while(input == 1) {
           System.out.println("Enter your number : ");
           int number = sc.nextInt();
           if(number > 0) {
               positive++;
           } else if(number < 0) {
               negative++;
           } else {
               zeros++;
           }


           System.out.println("Press 1 to continue & 0 to stop");
           input = sc.nextInt();
       }


       System.out.println("Positives : "+ positive);
       System.out.println("Negatives : "+ negative);
       System.out.println("Zeros : "+ zeros);
   }   
}
// 8 .  Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
   import java.util.*;


public class Solutions {
   public static void main(String args[]) {
       System.out.println("Enter x");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println("Enter n");
       int n = sc.nextInt();


       int result = 1;
       //Please see that n is not too large or else result will exceed the size of int
       for(int i=0; i<n; i++) {
           result = result * x;
       }


       System.out.println("x to the power n is : "+ result);
   }   
}

  
