public class IfClass {
    public static void main (String[] args){
        boolean javascript_easy = false;
        boolean java_easy = true;
        boolean php_easy = true;
        if(javascript_easy){
            System.out.println("Javacript is easy");
        } else{
            System.out.println("Javascript Hard");
        }
        //time if else conditions
        int time = 20;
        if(time < 10 ){
            System.out.println("Good Day");
        }
        else if(time < 20){
            System.out.println("Good Afternoon");
        }
        else{
            System.out.println("Good Evening");
        }
        //shorthand
        time = 18;
       String result = (time > 18) ? "Good Day" : "Good Evening";
       System.out.println(result);
    }
}
