package Sept2024;
import java.util.Scanner;
public class Lab014 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("enter the value of the n");
        int n = as.nextInt();

        for(int i = 0; i<=n; i++){
            if(i%2 == 0){
                continue;}
            System.out.println("odd number -> " + i);
        }
    }
}
