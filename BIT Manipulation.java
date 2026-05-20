//Types of Bits
// 1.Get : To find bit
// 2.Set : If there is 0 then it makes 1 if 1 it
// 3.Clear
// 4.Update 


//Get Bit 
//Get the 3rd bit (position = 2) of a number n. (n = 0101)
//Bit Mask : 1<<i
//Operation : AND
import java.util.*;
public class Bits{
  public static void main(String args[]){
    int n = 5;
    int pos = 3;
    int bitMask = 1<<pos;  

    if(bitMask & n) == 0) {
      System.out.println("bit was zero");
    }else{
      System.out.println("bit was one ");
    }
  }
}

//Set Bit 
//Set the 2nd bit (position = 1) of a number n. (n=0101)
//Bit Mask : 1<<i
//Operation : OR
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
//Clear the 3rd bit(position = 2) of a number n.(n = 0101)
//Bit Mask : 1<<i
//Operation : AND with NOT 
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
//Update Bit
//Update the 2nd bit(position = 1) of a number n to 1.(n = 0101)
//For 0                            //For 1
//Bit Mask : 1<<i                  //Bit Mask : 1<<i
//Operation : AND with NOT         //Operation : OR

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
    
    
    
    
