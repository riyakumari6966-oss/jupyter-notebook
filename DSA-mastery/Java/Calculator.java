package Java;
import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("1.ADD");
        System.out.println("2.SUBSTRACT");
        System.out.println("3.MULTIPLY");
        System.out.println("4.DIVISION");
        
        int choice= sc.nextInt();
        switch (choice){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            default:System.out.println("Invalid choice1");
        }
    }
}
