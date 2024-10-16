package Tasks2024.Sep23;
import java.util.Scanner;

public class TaskparameterConveterswitch {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        System.out.println("enter the input value");
        int value = qw.nextInt();

        // System.out.println("value of parameter");
       // String Parameter = qw.nextLine();

        String parameter = "KmtoMl";
        switch (parameter){
            case "KmtoMl":
                System.out.println(value + "  Kilometer value converted to " + (value * 0.621371) + "  miles");
                break;
            case "CeltoFh":
                System.out.println(value + "  Celcies is converted to " + (value * 33.8) + "  Fh");
                break;
            default:
                System.out.println("Invalid inputs");
                break;
        }



    }
}
