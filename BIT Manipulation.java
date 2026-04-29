//Get Bit 

import java.util.*;
public class Bits{
  public static void main(String args[]){
    int n = 5;
    int pos = 3;
    int bitMask = 1<<pos;  

    if(bitMask & n) == 0) {
      System.out.println("bit was zero");
    }else{
      System.out.println("bit was one "1);
    }
  }
}

//Set Bit 
import java.util.* 

public class Bits {
  public static void main(String args[]) {
    int n = 5;
    int pos = 1;
    int bitMask = 1<<pos;

    int newNumber = bitMask | n;
    System.out.println(newNumber);
  }
} 

//Clear Bit 
import java.util.*;
public class Bits {
  public Static void main(String args[]){
  int n = 5;
  int pos = 2;
  int bitMask = 1<<pos;
    int newBitMask = newBitMask & n;
    System.out.println(newNumber);
  }
} 
//Update 

import java.util.*;

public class Bits{
  public Static void main(String args[]){
    Scanner sc = new Scanner(system.in);
    int oper = sc.nextInt();
    int n = 5;
    int pos = 1;

    int bitMask = 1<<pos;
    if(oper == 1) {

      int newNumber = bitMask | n;
      System.out.println(newNumber);
    }else {
      int newBitMask = ~(bitmask);
      int newNumber = newBitMask & n;
      System.out.println(newNumber);
    }
  }
}
    
    
    
    
