import java.util.Scanner;
public class Calculator {
    static int add(int num1, int num2){
        return num1 + num2;
    }
    static int calc(int num1, int num2, char sign){
        int ans;
        ans = 0;
        switch (sign){
            case '+':
            ans = num1 + num2;
            break;

            case '-':
                ans = num1 - num2;
                break;

            case '*':
                ans = num1 * num2;
                break;

            case '/':
                ans = num1 / num2;
                break;
        }
        return ans;
        }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What calculation do you want to make (+,-,/,*)");
        char sign = input.next().charAt(0);
        System.out.println("Enter the numbers you want to calculate:");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(calc(x, y, sign));
    }
}
