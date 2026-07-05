public class stringpalindrome {
    public static void main(String[]args)
    {
        String original = "Hello Tushar";
        String reversed = "";
        for(int i=original.length()-1;i>=0;i--)
        {
            reversed = reversed + original.charAt(i);
        }
        if(original.equals(reversed))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
