package Tasks2024.Sep23;
import java.util.Scanner;

public class TaskMonthwithswitch {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);
        System.out.println("enter the input value");
        int month = ab.nextInt();
        switch (month){
            case 1 -> System.out.println("This is January");
            case 2 -> System.out.println("This is February");
            case 3 -> System.out.println("This is March");
            case 4 -> System.out.println("This is April");
            case 5 -> System.out.println("This is May");
            case 6 -> System.out.println("This is June");
            case 7 -> System.out.println("This is July");
            case 8 -> System.out.println("This is August");
            case 9 -> System.out.println("This is September");
            case 10 -> System.out.println("This is October");
            case 11 -> System.out.println("This is November");
            case 12 -> System.out.println("This is December");
            default -> System.out.println("Invalid inputs");



        }
    }
}
