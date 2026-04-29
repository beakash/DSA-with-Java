//OPERATORS
Symbols that tell compiler to perform some operation

//Arithmetic Operators 

  Binary               Unary
  + ( a + b )         ++ (  Increment)
  - ( a - b )         -- (  Decrement)
  * ( a * b )
  /  ( a / b)
  %  modulo 

  //Pre Increment ( ++a ) 
  //Rules
  //First change value
  //use value
  ++a 
  //code
  int a = 10;
  int b = 0;             
  b  = a++;
  System.out.println(a);
  System.out.println(b);

//Output:
   11
   10

     
//Post Increment ( a++ )
//Use value
 //change value

     
  a++
  int a = 10;
  int b = 0;
  b = ++a; 
System.out.println(a);
System.out.println(b)
  //Output
   11
   11

//Pre Decrement
//Rules : 1. value change
  //      2. value assign
  --a
  int a = 10;
  int b = 0;

   b = --a
   System.out.println(a);
   System.out.println(b);

//output
9
9 

//Post Decrement 
//Rules : 1. value change
  //      2. value assign 

  a--
  int a = 10;
  int b = 0;

  b =  a--;
  System.out.println(a);
  system.out.println(b);

//Output :
   9
   10 

//Relational Operators

     == ( equal to )
     != ( not equal to )
     > ( greater )
     < 
     >= ( greater than eual to )
     <=  

     //Logical Operators

     && ( Logical AND )
     || ( Logical OR )
     !  ( Logical NOT)

     //BINARY NUMBER SYSTEM 

     0 -> 000
     1 -> 001
     2 -> 010
     3 -> 011
     4 -> 100
     5 -> 101
     6 -> 110
     7 -> 111
     8 -> 1000
     9 -> 1001

     //Bitwise Operators 
     & ( Binary AND)
     | ( Binary OR )
     ^ ( Binary XOR )
     ~  (Binary One,s Complement )
     << ( Binary Left Shift )
     >> ( Binary Right Shift ) 

     //Assignment Operators 

     =
     +=
     -=
     *=
     /=
