import java.net.SocketPermission;
import java.util.*;
public class calculator {
   
    public static void main(String [] args){
   Scanner s=new Scanner(System.in);
   System.out.println("Enter two numbers:");
   double a=s.nextInt();
    double b=s.nextInt();
    System.out.println("Enter '+' to add this numbers:");
    System.out.println("Enter '-' to sub this numbers:");
    System.out.println("Enter '*' to mul this numbers:");
    System.out.println("Enter '/' to div this numbers:");
    System.out.println("Enter '%' to modul this numbers:");
   String choice=s.next();
   switch(choice){
     case "+":
     System.out.println("Your Addition is:"+(a+b));
     break;
     case "-":
     System.out.println("Your substraction is:"+(a-b));
     break;
      case "*":
     System.out.println("Your multiplication is:"+(a*b));
     break;
      case "/":
     System.out.println("Your divition  is:"+(a/b));
     break;
      case "%":
     System.out.println("Your modulus is:"+(a%b));
     break;
   }
  }
}