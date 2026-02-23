public class MethodDouble {
    static int plus(int x, int y){
        return x + y;
    }
    static double plus(double x, double y){
        return x + y;
    }
    public static void main(String[] args){
        int num1 = plus(1,3);
                double num2 = plus(1.399,1.5999);
        System.out.println(num1);
        System.out.println(num2);

    }
}
