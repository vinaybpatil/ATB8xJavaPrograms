package Tasks2024.September;
import java.util.Scanner;

public class Tasktableforloop {
    public static void main(String[] args) {

        Scanner as = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = as.nextInt();
        for (int i=1; i<=10; i++){
            int result = i * n;
            System.out.println(result);
        }
    }
}
