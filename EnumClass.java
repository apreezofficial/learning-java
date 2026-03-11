enum Level{
    High,
    Low,
    Medium
}
public class EnumClass {
    public static void main(String[] a) {
        Level myvar = Level.Low;
        switch(myvar){
            case Low:
                System.out.println("Low level");
                break;
            case High:
                System.out.println("High level");
                break;
            case Medium:
                System.out.println("Medium level");
                break;
            default :
                System.out.println("Default level");
        }
//        System.out.println(myvar);
        for (Level myVar : Level.values()){
            System.out.println(myVar);
        }
    }
}
