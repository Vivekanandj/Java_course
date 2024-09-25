public class CWH_14_Stringmethod {
    public static void main(String[] args) {
//        String name = "Vivek";
//        String a1 = new String("Vivek");
//        System.out.println(name);
//        int value = name.length();
//        System.out.println(value);
//        String value1 = name.toLowerCase();
//        System.out.println(value1);
//        String value2 = name.toUpperCase();
//        System.out.println(value2);
//
//
//        String nonTrimmedString = "     Vivek     ";
//        System.out.println(nonTrimmedString);
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

//        String value4 = name.substring(3);
//        System.out.println(value4);

//        String name = "Vivekananda";
//        String v = name.substring(3);
//        System.out.println(v);
//        String v1 = name.substring(3,11);
//        System.out.println(v1);

        String name = "Harry";
        String v = name.replace('r','p');
        System.out.println(v);
        System.out.println(name.replace("rry", "ier"));
        System.out.println(name.replace("r", "ier"));

        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("ry"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ar"));
        System.out.println(name.indexOf("r", 3));
        System.out.println(name.lastIndexOf("r"));
        System.out.println(name.lastIndexOf("ry",5));
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("harrY"));

        System.out.println(" I am escape sequence \" double quote");
        System.out.println(" I am escape sequence \t double quote");
        System.out.println(" I am escape sequence \n double quote");
        System.out.println(" I am escape sequence \r double quote");
        System.out.println(" I am escape sequence \f double quote");
        System.out.println(" I am escape sequence \' double quote");
        System.out.println(" I am escape sequence \\ double quote");
    }
}
