// import java.util.Scanner;
// public class Rsc {
//     public static void main(String args[]){
//         int a[];
//         a=new int[1];
//         System.out.println(a[0]);
//         a[0]+=8;
//         System.out.println(a[0]);
//         call (a);
//         System.out.println(a[0]);
//     }
//     public static void call(int hx[] ){
// hx[0]++;
//     }
//     }
// public static void main(String args[]){
//     int arr[];
//     String str[];
//     arr=new int[4];
//     str=new String[4];
//     System.out.println("After array constructed element");
//     for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//     }
//     for(int i=0;i<str.length;i++){
//         System.out.println(str[i]);
//     }
//     System.out.println("intialize array element are");
//     arr[0]=12;
//     arr[1]=13;
//     arr[2]=65;
//     arr[3]=90;
//     str[0]=new String("Red");
//     str[1]=new String("blue");
//     str[2]=new String("yellow");
//     str[3]=new String("vennn");
// System.out.println("After intialize array element are");
// for(int i=0;i<arr.length;i++){
//     System.out.println(arr[i]);
// }
// for(int i=0;i<str.length;i++){
//     System.out.println(str[i]);
// }
// }}
// int data;
// public static void main(String args[]){
//     Jt d1;
// d1=new Jt();
// d1.data+=90;
// Jt d2;
// d2=new Jt();
// d2.data+=98;
// swap(d1,d2);
// }
 
//  static void swap(Jt x,Jt y){
// int temp=x.data;
// x.data=y.data;
// y.data= temp;
// System.out.println(x.data);
// System.out.println(y.data);
//   } }
// public static void main(String []args){
// Scanner obj=new Scanner(System.in);
// int n=5;
// System.out.println("The squre of"+(n*n));
// }
//  }
// System.out.println("Enter the value of n");
// int n=obj.nextInt();
// if(n<=0){
//     System.out.println("number should be greater than 0");
// }
// System.out.println("The first" +n+ "squre numbers are");
// for(int i=1;i<=n;i++){
//     System.out.println(i*i + " ");
// }}}
// public static void main(String args[]){
//     int n=5;
//     int m=4;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             if(i==0 || i==n-1 || j==0 || j==m-1){
//             System.out.print("* ");
//             }else{
//                 System.out.print("  ");
//             }
//         }
//         System.out.println();
//     }
// }
// }
// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }}
// public static void main(String args[]){
//     Scanner obj=new Scanner(System.in);
//     System.out.println("Enter two number");
//     float a=obj.nextFloat();
//     float b=obj.nextFloat();
//     System.out.println("Enter  + to addition  number");
//     System.out.println("Enter - subtraction number ");
//     System.out.println("Enter * multiplication number");
//     System.out.println("Enter / to division number");
//     System.out.println("Enter % modulus of number");
//     String choice=obj.next();
//     switch(choice){
//         case "+":
//         System.out.println("Your addition is"+(a+b));
//         break;
//         case "-":
//         System.out.println("Your subtraction is "+(a-b));
//         break;
//         case "*":
//         System.out.println("Your mulplication is="+(a*b));
//         break;
//         case "/":
//         System.out.println("Your division is="+(a/b));
//         break;
//         case "%":
//         System.out.println("Your modulus is="+(a%b));
//         break;
//     }
// public static void main(String args[]){
//     Scanner obj=new Scanner(System.in);
//     System.out.println("Enter your age");
//     int n=obj.nextInt();
//     if(n<=18){
//         System.out.println("You are eligible for voting");
//     }
//     else{
//         System.out.println("You are not eligible for voting");
//     }
//     int Bjp,Bjd,Aap;
//     while(n<=18){
//         System.out.println("Enter 1 for Bjp");
//         System.out.println("Enter 2 for Bjd");
//         System.out.println("Enter 3 for  Aap");
//         int choice=obj.nextInt();
//         switch(choice){
//             case 1:
//             System.out.println("Press  1 for Bjp");
//             Bjp=obj.nextInt();
//             if(Bjp==1){
// System.out.println("Voting added sucessfully");
//             }
//             else{
//                 System.out.println("Incorrect choice");
//             }
//             break;                                           
//             case 2:
//             System.out.println("Press 2 for Bjd");
//             Bjd=obj.nextInt();
//             if(Bjd==2){
//                 System.out.println("votting  added sucessfully");
//             }
//             else{
//                 System.out.println("Incorrect choice");
//             }
//             break;                                               voting purpose
//             case 3:
//             System.out.println("Press 3 for Aap");
//             Aap=obj.nextInt();
//             if(Aap==3){
//                 System.out.println("Votting added sucessfully");
//             }
//             else{
//                 System.out.println("Incorrect choice");
//             }
//             break;
//         }
//     break;
// }
// }
// }
public static void main(String args[]){
    // for( ;;i++){
    for(int i=1;i<=4;i++){
        for(int j=1;j<=4-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=4;i>=1;i--){
        for(int j=1;j<=4-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*"); 
        }
        System.out.println();
    }
}
}
