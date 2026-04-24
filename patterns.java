//patterns implemented by nested loop
//Rules of pattern problem
//1.Always think row wise
//2.Count spaces and symbols
//3.Observe relation between i and j
//4.Break pattern into parts

//Pattern 1
/* *****
   *****
   *****
   ***** */
//code 
import java.util.*;


public class Patterns {
   public static void main(String args[]) {
       int n = 5;
       int m = 4;
       for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}


//Pattern 2
/*
*****
*   *
*   *
***** */
//code
import java.util.*;


public class Patterns {
   public static void main(String args[]) {
       int n = 5;
       int m = 4;
       for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}

//Pattern 3
/*
*
**
***
**** */
//code
import java.util.*;


public class Patterns {
   public static void main(String args[]) {
       int n = 4;
      
       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++) {
                   System.out.print("*");
           }
           System.out.println();
       }
   }
}

//Pattern 4
/*
****
***
**
*  */
//code
import java.util.*;


public class Patterns {
   public static void main(String args[]) {
       int n = 4;
      
       for(int i=n; i>=1; i--) {
           for(int j=1; j<=i; j++) {
                   System.out.print("*");
           }
           System.out.println();
       }
   }
}


//pattern 5
/*
   *
  **
 ***
**** */
//code
import java.util.*;

public class Patterns {
   public static void main(String args[]) {
       int n = 4;
      
       for(int i = n; i >= 1; i--) {

           // spaces
           for(int j = 1; j <= i - 1; j++) {
               System.out.print(" ");
           }

           // stars
           for(int j = 1; j <= n - i + 1; j++) {
               System.out.print("*");
           }

           System.out.println();
       }
   }
}
//Pattern 6
  1
  12
  123
  1234
  12345
//code
  import java.util.*;


public class Patterns {
   public static void main(String args[]) {
       int n = 5;
      
       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();
       }
   }
}

//pattern 7
12345
1234
123
12
1
//code
import java.util.*;


public class Patterns {
   public static void main(String args[]) {
       int n = 5;
      
       for(int i=n; i>=1; i--) {
           for(int j=1; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();
       }
   }
}

//pattern 8
1
2 3
4 5 6
7 8 9 10
11 12 13 14
//code
import java.util.*;


public class Patterns {
   public static void main(String args[]) {
       int n = 5;
       int number = 1;


       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++) {
               System.out.print(number+" ");
               number++;
           }
           System.out.println();
       }
   }
}

//pattern 9
1
0 1
1 0 1
0 1 0 1
0 1 0 1 0
  
//code
  import java.util.*;


public class Patterns {
   public static void main(String args[]) {
       int n = 5;


       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++) {
               if((i+j) % 2 == 0) {
                   System.out.print(1+" ");
               } else {
                   System.out.print(0+" ");
               }
           }
           System.out.println();
       }
   }
}

//pattern 10
/* *             *
   * *         * *
   * * *     * * *
   * * * * * * * *
   * * * * * * * *
   * * *     * * *
   * *         * *
   *             *     */
                   
//code
import java.util.*;

public class Solutions {
  public static void main(String args[]){
    int n = 4;
     //upper part
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=i; j++){
        System.out.print("*");
      }
      int spaces = 2 * (n - i);
      for(int j = 1; j<=spaces; j++) {
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    } 
   //Lower part
    for(int i=n; i>=1; i--){
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }

      int spaces = 2 * (n-i);
      for(int j=1; j<=spaces; j++){
        System.out.print(" ");
      }

      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

//pattern 11 
        *****
      *****
    *****
  *****
***** 

import java.util.*;

public class solutions {
  public static void main(String args[]){
    int n = 5;

    for(int i= 1; i<=n; i++){
      //spaces 
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      //stars 
      for(int j =1; j<=n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

//pattern 12

    1
   2 2                     
  3 3 3
 4 4 4 4
5 5 5 5 5 

  // code

  import java.util.*;
public class Solutions{
  public static void main(String args[]){
    int n = 5;

  for(int i=1; i<=n; i++){
    //spaces
    for(int j = 1; j<=n-i ; j++) {
      System.out.print(" ");
    }

    //numbers
    for(int j=1; j<=i ; j++){
      system.out.print(i+" ");
    }
    System.out.println();
  }
  }
} 

//pattern 13

          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
//code

import java.util.*;

public class Solutions{ 
  public static void main(string args[]){
    int n = 5;
    for(int i=1; i<=n; i++){
       //spaces
      for(int j=1; j<=n-1; j++) {
        System.out.print(j);
      }

      //first part
      for(int j=i; j>=1;j--){
        System.out.print(j);
      }
      //Second part
      for(int j=2; j<=i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
} 

//pattern 14

    *
   ***
  *****
 *******
 *******
  *****
   ***
    *
//upper part
import java.util.*;

public class Solutions{
  public static void main(String args[]) {
    int n = 5;

  //upper part
  for(int i=1; i<=n; i++) {
    //spaces
    for(int j =1; j<=n -i; j++){
      System.out.print(" ");
    }
    for(int j = 1; j<=2*i-1; j++){
      System.out.print("*");
    }
    System.out.println();
  }

  //lower part
  for(int i=n ; i>=1 ;i--){

    //spaces
    for(int j = 1; j<=n-1; j++){
      system.out.print("*");
    }
    System.out.println();
  }
  }
}
