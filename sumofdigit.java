import java.util.Scanner;
public class sumofdigit {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to calculate sum of digit");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0)
        {
            sum = sum+(num%10);
            num = num/10;
        }
        System.out.println("sum of digit is:) "+sum);
    }
}
