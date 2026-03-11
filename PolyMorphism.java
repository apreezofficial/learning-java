class Animal{
    public void animalsound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    public void animalsound(){
        System.out.println("Dog, bwo bwo");
    }
}
class Pig extends Animal{
    public void animalsound(){
        System.out.println("Pig, we we we");
    }
}
public class PolyMorphism {
    public static void main(String[] a){
        Animal sound = new Animal();
        Animal dogsound = new Dog();
        Animal pigsound = new Pig();
        sound.animalsound();
        dogsound.animalsound();
        pigsound.animalsound();
    }
}
