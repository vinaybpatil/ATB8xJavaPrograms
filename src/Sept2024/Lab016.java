package Sept2024;
import java.util.Scanner;
public class Lab016 {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = as.nextInt();

        for (int i=0; i<=n; i++){
            if (i == 9){
                break;
            }
            System.out.println(i);
        }
    }
}
