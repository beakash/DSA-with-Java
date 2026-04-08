//BASIC JAVA+DSA CONCEPT

//output in java
//printing output in same line
System.out.print("Hello World");
System.out.print("Hello world with Java "); 

//output : Hello World Hello world with Java 
//Note : It will print in same Line 
//For print in next line in two ways 

//1st way
//printing output in diffeerent line

System.out.Println("Hello World");
System.out.Println("Hello World with Java ");

/*output : Hello World
           Hello world with Java */ 

//2nd way
System.out.println("Hello World \n Hello world with Java ");
/*output : Hello World 
           Hello world with Java */

\n //-> for next line 


  /*Draw this pattern in two ways
  *
  **
  ***
  ****  */ 

  //1st way
  System.out.println("*");
  System.out.println("**");
  System.out.println("***");
  System.out.println("****"); 
//2nd way
 System.out.println("*\n ** \n *** \n **** "); 


//variable in java 

String name = "Tony stark";
int age = 48;
double price = 28.25;
int a = 25;
int b = 30;

b = 20;
name = " Ironman "; 

//Data Types 

//Java is a type language 
//primitive data type
int 
char 
float
short
byte 
long 
double 
boolean 
//Non-primitive Data type
  string
  Array
  Class
  Object
  Interface 

  // How to take input in java 
Scanner sc = new Scanner(System.in);
Scanner name = sc.next();  // for printing single token
Scanner name = sc.nextLine(); // for printing String
Scanner Int = sc.nextInt();//for integer value
Scanner Float = sc.nextFloat();// for floating value 

//Example 
Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int sum = a + b;
System.out.println(sum); 

//Output
a = 2
b = 3
sum = 5

