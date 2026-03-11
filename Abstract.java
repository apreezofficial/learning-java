abstract class Car{
        public abstract void Drive();
        public abstract void fly();
        public void PlayMusic(){
System.out.println("play music");
        }
        }
        class Wagonr extends Car{
        public void Drive(){
System.out.println("Driving...");
        }
        public void fly(){
                        System.out.println("flying...");
        }
        }
public class Abstract{
        public static void main(String[] a){
                Car obj = new Wagonr();
                obj.Drive();
                obj.fly();
                obj.PlayMusic();
        }
}


