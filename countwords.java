public class countwords {
    public static void main(String[]args)
    {
        String name = "TUSHAR MACHINDRA VYAVHARE";
        int countwords = name.split("\\s").length;
        System.out.println(countwords);
    }
}
