package Sept2024;
import java.util.Scanner;
public class Lab017 {
    public static void main(String[] args) {
    // tables of n >> n *1/i = n ; n *2/i = n
        Scanner as = new Scanner(System.in);
        System.out.println("enter the value of the n");
        int n = as.nextInt();
         for (int i =1; i<=10; i++){
             int r= n*i;
             System.out.println(r);
         }



    }
}
