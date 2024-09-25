public class CWH_15_practice {
    public static void main(String[] args) {
        String name = "VIVEK";
        System.out.println(name.toLowerCase());

        String name1 = "Vivekananda J";
        System.out.println(name1.replace(" ", "_"));

        String letter = " Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>", "Sai"));

        String v = "This string contains Double and  Triple spaces";
        System.out.println(v.indexOf("  "));
        System.out.println(v.indexOf("   "));


        String letter1 = "Dear Vivek,\n\t This java course is nice.\n\t Thanks!";
        System.out.println(letter1);
    }
}
