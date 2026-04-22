//Declaration 

StringBuilder sb = new StringBuilder(" Be Akash ");
System.out.println(sb);
//Get A character from Index 
StringBuilder sb = new StringBuilder("Tony");
//Set character from Index
System.out.println(sb.charAt(0));

//Insert a character at some Index 
import java.util.*;

public class Strings {
  public static void main(String args[]) {
    StringBuilder sb = new StringBuilder("Tony");
    //Insert char 
  sb.insert(0, 'S');
  System.out.println(sb);
  }
} 

//Delete char at some index
import java.util.*;
public class Strings {
  public static void main(String args[]) {
    StringBuilder sb  = new SubstringBuilder("tony");
    //Insert char
    sb.insert(0, 'S');
    //Delete char
    sb.delete(0, 1);
    System.out.println(sb);
  }
}

//Append a char 
//append means to add something at the end.
import java.util.*;

public class Strings {
  public static void main(String args[]){
    stringBuilder sb = new StringBuilder("Tony");
    sb.append(" Stark ");
    System.out.println(sb);
  }
} 

//Print Length of string
import java.util.*;

public class Strings {
  public static void main(String args[]){
    StringBuilder sb = new StringBuilder("Tony");
    sb.append("Stark");
    System.out.println(sb);

    system.out.println(sb.length());
  }
} 

//reverse a string ( using stringBuilder class) 

import java.util.*;

public class Strings {
  public static void main(String args[]){
    StringBuilder sb = new StringBuilder("HelloWorld");

    for(int i =0; i<sb.length()/2; i++) {
      int front =i;
      int back = sb.length() - i - 1;

      char frontchar = sb.charAt(front);
      char backchar = sb.charAt(back);

        sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }


     System.out.println(sb);
   }
}

      
  
