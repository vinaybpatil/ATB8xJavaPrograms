package Sept2024;
import java.util.Scanner;
public class Lab008 {
    public static void main(String[] args) {
        // switch statement
        Scanner as = new Scanner(System.in);
        System.out.println("enter the value of name");
        String name = as.nextLine();
        switch(name){
            case "Light" :
                System.out.println("Light is ON");
                break;
            case "Fan" :
                System.out.println("Fan is ON");
                break;
            case "Bulb":
                System.out.println("Bulb is ON");
                break;
            default:
                System.out.println("No power");
                break;
        }

    }
}
