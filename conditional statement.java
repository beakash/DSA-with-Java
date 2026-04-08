//conditional statement
if
else
Switch
break 
//Take input from the user use if else statement and print Adult or Not Adult
1.Take user input -> age
2. if(age>18) -> Adult
3. else -> Not adult

//code
  import java.util.*;
Scanner Sc = new Scanner(System.in);
int age = sc.nextint();
{
  if(age>18){
    Sytem.out.println("Adult");
  }else{
    System.out.println("Not Adult")
      }

//For even and odd
if(x%2==0){
  System.out.println("Even");
} else {
  System.out.println("odd"); 
//code for number is Equal , greater and lesser
import.java.util.*;
Scanner sc = new Scanner(System.in);
  int a = sc.nextint();
  int b = sc.nextint();
  if(a == b ){
    System.out.println("Equal");
  }else{
    if(a>b) {
      System.out.println("a is greater");
    }else{
      System.out.println("a is lesser");
    }
  }


  //Make a calculator by using conditional statement 
  import java.util.*;
  Class Main{
    Public Static void main(String[]ags){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int operater = sc.nextInt();
      Switch(operator){
        case 1:System.out.println(a+b);
        break;
        case 2:System.out.println(a-b);
        break;
        case 3:System.out.println(a*b);
        break;
        case 4:if(b==0){
                   System.out.println("Invalid Division");
        }else{
          System.out.println(a/b);
        }
        break;
        case 5 : if(b==0){
          System.out.println("Invalid Division");
        }else{
          System.out.println(a%b);
        }
        break;
        default:System.out.println("Invalid operator");
      }
    }
  }
