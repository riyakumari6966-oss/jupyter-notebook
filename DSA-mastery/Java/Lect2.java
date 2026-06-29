package Java;
import java.util.*;
public class Lect2 {
    public static void main(String[] args){
        //variables
        int a = 10;
        int b = 20;
        int sum = a+b;
        int diff=b-a;
        int mul=a*b;
        int quiz=(a*b)/(a-b);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(quiz);
        //input
        Scanner sc =new Scanner(System.in);
        String name= sc.nextLine();
        //next()-takes just one token(means one word input)
        //nextLine()-takes one or more than one word input
        //nextInt()- takes integer input
        //nextFloat()-takes float input
        System.out.println(name);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int sum1 =a1+b1;
        System.out.println(sum1);

    }
    
}
