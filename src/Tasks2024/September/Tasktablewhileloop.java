package Tasks2024.September;
import java.util.Scanner;
public class Tasktablewhileloop {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = as.nextInt();
        System.out.println("enter the value of i");
        int i = as.nextInt();
        while (i<=10){
            int result = i * n ;
            System.out.println(result);
            i++;
        }

    }
}
