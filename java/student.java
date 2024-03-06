class Demo {
    private String name;
    private int roll;
    public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
public void setRoll(int roll){
this.roll=roll;
}
public int getRoll(){
    return roll;
}
}
public class student{
    public static void main(String args[]) {
        Demo x=new Demo();
        x.setName("rohan");
        x.setRoll(90);
        System.out.println(x.getName());
        System.out.println(x.getRoll());
    }
}