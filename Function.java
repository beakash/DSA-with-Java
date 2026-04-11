//Methods / Functions
A function is a block of code that performs a specific task.
  //Syntax 
  return-type function_name(parameter 1, parameter2, ....parameter n){
  //function_body
}
return-type
// example : 

package com.beakash;

public class Main {
  //A Method to  calculate sum of 2 numbers - a & b
public static void sum(int a, int b) {
  int sum = a + b;
  System.out.println(sum);
}

public static void main (String[] args){
  int a = 10;
  int b = 20;
   sum(a, b); //Function call
   }
}  

//Write a function to multiply 2 numbers.

import java.util.*; //package for taking input from user

public class Functions{

//Multiply 2 numbers

public static int multiply(int a , int b){
  return a*b; //return type of a function is the data type of the variable that functions returns.
}
  public static void main(String args[]){

  Scannner sc = new Scanner(System.in); // for taking input from user 
    int a = sc.nextInt(); //take first input 
    int b = sc.nextInt(); //take second input

    int result = multiply(a, b);

    System.out.println(result); //print result
  }
}

//Write a function to calculate the factorial of a number.

import java.util.*;

public class Functions {
  public static void printFactorial(int n){
    //loop
  if(n < 0){
    System.out.println("Invalid Number");
    return ;
  } 
    int factorial = 1;

    for(int i = n; i>=1; i--) {
      factorial = factorial * i;
    }
    System.out.println(factorial);
    return;
  } 

  public static void main(String args[]);

  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  printFactorial(n);
 }
}

//Write a function to calculate the product of 2 numbers.

import java.util.*;

public class Functions{
  public static int calculateProduct(int a , int b); //product calculate k liye function bnAYA
  return a*b;
}

public static void main(String args[]);
Scanner sc = new Scanner(System.in);//take input from user
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(calculateProduct(a,b));
}
}
    
