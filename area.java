import java.util.Scanner;
public class area {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the rectangle");
        double length = sc.nextDouble();
        System.out.println("enter the breadth of the rectangle");
        double breadth = sc.nextDouble();
        System.out.println("Area of rectangle is"+length*breadth);
    }
}
