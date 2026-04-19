//Declaration

String name = "Tony";

//Taking Input 
Scanner sc = new Scanner(System.in);
      string name = sc.next();
//Methods

//Method 1 : Concatenation(Joining 2 strings )

String firstName = "Tony";
     String secondName = "Stark";

String fullName = firstName + " " + secondName;
System.out.println(fullName);  

//Method 2 : Print length of a string
String firstName = "Tony";
    String secondName = "Stark";

String fullName = firstName + " " + secondName;
System.out.println(fullName.length()); 

//Acess characters of a string 
String firstName = "Tony";
    String secondName = "Stark";

String fullname = firstName + " " + secondName;

for(int i = 0; i<fullName.length(); i++) {
  system.out.println(fullName.charAt(i));
} 

//Compare 2 strings 
import java.util.*;

public class Strings {
  public static void main(String args[]) {
    String name1 = "Tony";
    String name2 = "Tony"; 
  

       if(name1.equals(name2)) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //DO NOT USE == to check for string equality
       //Gives correct answer here
       if(name1 == name2) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //Gives incorrect answer here
       if(new String("Tony") == new String("Tony")) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
      
   }
}
//Substring 
//The Substring of a string is a subpart of it. 

public class Strings {
   public static void main(String args[]) {
       String name = "TonyStark";
     
       System.out.println(name.substring(0, 4));
      
      
   }
}

//ParseInt Method of Integer class 
public class Strings {
  public static void main(String args[]) {
    String str = "123";
    int number = Integer.parseInt(str);
    System.out.println(number);

  }
} 

//Always Remember : Java Strings are Immutable. 
