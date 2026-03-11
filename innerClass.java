final class P{
   int age;
   public void show() {
System.out.println("show...");
   }
   static class B{
       public void config(){
           System.out.println("Configure...");
       }
   }
        }
public class innerClass {
    public static void main(String[] a) {
        P myobj = new P();
        myobj.show();
        P.B myobj1 = new P.B();
        myobj1.config();
    }
}
