package Sept2024;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Lab007 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = ad.nextInt();
        System.out.println("Enter the value b");
        int b = ad.nextInt();
        System.out.println("Enter the value of c");
        int c = ad.nextInt();

        if(a == b && a==c){
            System.out.println("a and b and c are equal");
        } else if (a == b && a!=c) {
            System.out.println("a and b are equal and not equal to c");
        } else if (a != b && a != c) {
            System.out.println("Nothing is equal");
        } else{
            System.out.println("Nothing is equal");
        }

    }
}
