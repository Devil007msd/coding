class demo{
int data;
public static void main(String[] args) {
    demo d1;
    d1=new demo();
    d1.data+=90;
    demo d2;
    d2=new demo();
    d2.data+=98;
    System.out.println("before swapping the first value "+d1.data);
    System.out.println("Before swapping the second value is "+d2.data);
    swap(d1,d2);
}
static void swap(demo x,demo y){
int temp=x.data;
x.data=y.data;
y.data=temp;
System.out.println("After swapping the value"+x.data);
System.out.println("After swapping the second value"+y.data);
}
}
