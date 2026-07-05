import java.util.Scanner;
public class largest {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three numbers to check greater among them");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1>num2&&num1>num3)
        {
            System.out.println(num1+" is the  greater number");
        }
        else if(num2>num1&&num2>num3)
        {
            System.out.println(num2+" is the greater number");
        }
        else
        {
            System.out.println(num3+" is the greater number");
        }
        

    }
}
