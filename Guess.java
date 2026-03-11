import java.util.Scanner;
public class Guess {
    public static void main(String[] args){
        int guess_num = (int)(Math.random() * 6) + 1;
        int[] range = {(guess_num - 5), (guess_num + 5)};
       Scanner input = new Scanner(System.in);
       System.out.println("Guess a number between " + range[0] + " and " + range[1]);
       int guessed_num = input.nextInt();
       if(guessed_num >=range[0] & guessed_num<= range[1]){
           if(guessed_num == guess_num) {
               System.out.println("Correct");
           }else{
               System.out.println("Wrong");
           }
       }else{
           System.out.println("Please pick from the range");
       }
    }
}
