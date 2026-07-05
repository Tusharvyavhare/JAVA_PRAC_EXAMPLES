import java.util.Scanner;
public class sumofnnumbers {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to calculate sum");
        int num = sc.nextInt();
        int sum = num*(num+1)/2;
        System.out.println("sum of first n natural numbers is "+sum);
    }
}
