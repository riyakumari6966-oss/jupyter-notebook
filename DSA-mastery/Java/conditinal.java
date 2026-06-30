package Java;
import java.util.*;
public class conditinal {
    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();

        if (number%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
