import java.util.Scanner;
public class dsa {
//     public static int multiplication( int n){
//     return n*n;
//     }
//     public static  void main(String args[]){
// System.out.println(multiplication(8));
//     }
// }
public static void main(String args[]){
    Scanner  obj=new Scanner(System.in);
    int n,digit,rev=0;
    System.out.println("Enter a number");
    n=obj.nextInt();
    int temp=n;
    while(n>0){
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }
    if(temp==rev){
        System.out.println("it is a palindrome number");
    }
    else{
        System.out.println("it's not palindrome number");
    }
}}