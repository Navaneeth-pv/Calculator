import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;


        Scanner input = new Scanner(System.in);


        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 for exit");
        operator = input.next().charAt(0);


        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();


        switch (operator) {

            case '1':
                result = number1 + number2;
                System.out.println(number1+ " + "+number2 + " = " + result );
                break;
        }


    }
}