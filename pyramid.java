public class pyramid {
    public static void main(String args[]){
        int  n=5;
        for(int i=1;i<=n;i++){
            //  inner loop->space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
                // inner loop->star prinnt
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
