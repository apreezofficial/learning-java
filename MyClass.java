public class MyClass{
    int x = 4;
    public void Mypublic(){
        System.out.println("public shi");
    }
    public static void main(String[] args){
        MyClass publicobj = new MyClass();
        publicobj.Mypublic();
        MyClass myobj = new MyClass();
        System.out.println(myobj.x);
        Method myobj2 = new Method();
        System.out.print(myobj2.y);
    }
}
