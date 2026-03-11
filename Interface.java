interface Cars{
    public void Color();
    public void Exhaust();
}
class Honda implements Cars{
    public void Color(){
        System.out.println("Red");
    }
    public void Exhaust(){
       System.out.println("Double nittro");
    }
}
public class Interface{
    public static void main(String[] a){
        Honda myobj = new Honda();
        myobj.Color();
        myobj.Exhaust();
    }
}
