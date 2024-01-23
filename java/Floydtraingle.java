public class Floydtraingle {
    public static void main(String args[]){
        int n=1;
        for(int i=1;i<=5;i++){//outer loop
            for(int j=1;j<=i;j++){//inner loop//print  1
                System.out.print(" "+n);             //2 3
                n++; //n=n+1                        //4 5 6
            }                                       //7 8 9 10
            System.out.println();                   //11 12 13 14 15
        }
    }
}
