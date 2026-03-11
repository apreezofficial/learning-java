public class Constructor {
    int y = 5;
    public Constructor(int x){
       y = x;
    }
    public static void main(String[] args){
        Constructor mybj = new Constructor(8);
        System.out.println(mybj.y);
    }
}
