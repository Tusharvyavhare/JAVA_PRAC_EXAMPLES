import java.util.Scanner;
public class multiplication {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to calculate the table of multiplication");
        int num = sc.nextInt();
        while (num<=10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
            System.out.println("enter the number to calculate the table of multiplication");
            num = sc.nextInt();
            
        }
    }
}
