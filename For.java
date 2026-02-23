public class For {
    public static void main(String[] args){
        int i;
        for(i= 20; i<50; i+=10){
            if ( i == 30){
                continue;
            }
            System.out.println(i);
        }
    }
}
