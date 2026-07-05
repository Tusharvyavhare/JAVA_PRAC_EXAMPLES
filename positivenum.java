import java.util.Scanner;
public class positivenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check +ve or -ve or zero");
        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println(num+" is positive number");
        }
        else if(num<0)
        {
            System.out.println(num+" is negative number");
        }
        else
        {
            System.out.println(num+" is zero");
        }
    }
}
