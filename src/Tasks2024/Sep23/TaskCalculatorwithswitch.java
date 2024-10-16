package Tasks2024.Sep23;
import java.util.Scanner;

public class TaskCalculatorwithswitch {
    public static void main(String[] args) {

        Scanner aq = new Scanner(System.in);
        System.out.println("enter the num1 value");
        int num1 = aq.nextInt();
        System.out.println("enter the value of num2");
        int num2 = aq.nextInt();
       // System.out.println("enter the value of the operation");
       // String operation = aq.nextLine();
        String operation = "mod";


         switch (operation){
             case "add" -> System.out.println("addotion of two value is " +( num1 + num2));
             case "sub" -> System.out.println("sub of two value is " +(num1 - num2));
             case "mul" -> System.out.println("mul of two value is " +(num1 * num2));
             case "mod" -> System.out.println("mod of two value is " +(num1 % num2));
             case "div" -> System.out.println("div of two value is " + (num1 / num2));
             default -> System.out.println("No valid inputs");
         }
    }
}
