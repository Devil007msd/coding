public class swap {
    public static void main(String args[]){
        int a=10,b=20,c=50;
        // int c=a;
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println("a"+a);
        System.out.println("B"+b);
        System.out.println("c"+c);
    }
}
