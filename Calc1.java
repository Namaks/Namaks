/**
 * Created by Maks on 17.05.2024.
 */
import java.util.Scanner;
public class Calc1 {

    public static void main(String[] args) {
        System.out.println("введите выражение :");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String[] numbers;
        String[] Roman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
        int operand1 = 0;
        int operand2 = 0;

        int result;


        if (str.indexOf('+') > 0) {

            numbers = str.split("[+]");

            if (numbers.length > 2) {
                System.out.println("ERROR");
                return;
            }


            for (int i = 0; i < 21; i++) {
                if (numbers[0].equals(Roman[i])) {
                    operand1 = i;
                    break;
                }

            }



            for (int i = 0; i < 21; i++) {
                if (numbers[1].equals(Roman[i])) {
                    operand2 = i;
                    break;
                }
            }



            if (operand1 == 0 && operand2 != 0 || operand2 == 0 && operand1 != 0) {
                System.out.println("error");
                return;
            } else {
                result = operand1 + operand2;

            }

            for (int i = 0; i < 21; i++) {
                if (result == i && result != 0) {
                    System.out.println("результат равен=" + Roman[i]);
                }
            }
            if (operand1 == 0 && operand2 == 0) {
                result = Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[0]);
                System.out.println("результат равен=" + result);
            }
        } else if (str.indexOf('-') > 0) {
            numbers = str.split("[-]");


            if (numbers.length > 2) {
                System.out.println("ERROR");
            }
            for (int i = 0; i < Roman.length; i++) {
                if (numbers[0].equals(Roman[i])) {
                    operand1 = i;
                    break;
                }
            }

            System.out.println("operand1=" + operand1);
            for (int i = 0; i < 21; i++) {
                if (numbers[1].equals(Roman[i])) {
                    operand2 = i;
                    break;
                }
            }


            if (operand1 == 0 && operand2 != 0 || operand2 == 0 && operand1 != -0 || operand2 > operand1) {
                System.out.println("error");
                return;
            } else {
                result = operand1 - operand2;

            }

            for (int i = 1; i < 21; i++) {
                if (result == i) {
                    System.out.println("результат равен=" + Roman[i]);
                }
            }
            if (operand1 == 0 && operand2 == 0) {
                result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
                System.out.println("результат равен=" + result);
            }


        } else if (str.indexOf('/') > 0) {
            numbers = str.split("[/]");


            if (numbers.length > 2) {
                System.out.println("ERROR");
            }
            for (int i = 0; i < Roman.length; i++) {
                if (numbers[0].equals(Roman[i])) {
                    operand1 = i;
                    break;

                }
            }


            for (int i = 0; i < 21; i++) {
                if (numbers[1].equals(Roman[i])) {
                    operand2 = i;
                    break;
                }
            }


            if (operand1 == 0 && operand2 != 0 || operand2 == 0 && operand1 != 0) {
                System.out.println("error");
                return;
            } else if (operand1 == 0 && operand2 == 0) {

                result = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
                System.out.println("результат равен=" + result);
            } else result = operand1 / operand2;

            for (int i = 0; i < 21; i++) {
                if (result == i) {
                    System.out.println("результат равен=" + Roman[i]);
                }
            }


        } else if (str.indexOf('*') > 0) {
            numbers = str.split("[*]");


            if (numbers.length > 2) {
                System.out.println("ERROR");
            }
            for (int i = 0; i < Roman.length; i++) {
                if (numbers[0].equals(Roman[i])) {
                    operand1 = i;
                    break;

                }
            }


            for (int i = 0; i < 21; i++) {
                if (numbers[1].equals(Roman[i])) {
                    operand2 = i;
                    break;
                }
            }


            if (operand1 == 0 && operand2 != 0 || operand2 == 0 && operand1 != 0) {
                System.out.println("error");
                return;
            } else if (operand1 == 0 && operand2 == 0) {

                result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
                System.out.println("результат равен=" + result);
            } else result = operand1 * operand2;

            for (int i = 0; i < 21; i++) {
                if (result == i) {
                    System.out.println("результат равен=" + Roman[i]);
                }

            }

        }
    }
}







