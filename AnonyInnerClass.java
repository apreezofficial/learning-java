class A
{
    public void show(){
        System.out.println("in a show");
    }
}
public class AnonyInnerClass {
    public static void main(String[] a){
        A myobj = new A();
        myobj.show();
    }
}
