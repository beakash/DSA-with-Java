//patterns implemented by nested loop
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
      
       for(int i=n; i>=1; i--) {
           for(int j=1; j<i; j++) {
               System.out.print(" ");
           }


           for(int j=0; j<=n-i; j++) {
               System.out.print("*");
           }
           System.out.println();
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



