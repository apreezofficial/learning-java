import java.util.Scanner;
import mypack.Mypackage;
public class Scanns {
    public static void main(String[] a){
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = myinput.nextLine();
        System.out.print("My name is" + name);
//        Mypackage obj= new Mypackage();
//        System.out.println(obj.x);
    }
}
