package Sept2024;
import java.util.Scanner;
public class Lab019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter thev value of i");
        int i = sc.nextInt();
        while (i <= 10)
        {
        int result = i * n;
        System.out.println(result);
        i++;}
    }
}