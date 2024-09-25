public class CWH_24_break {
    public static void main(String[] args) {
//        for (int i=0;i<=5;i++){
//            System.out.println(i);
//            System.out.println("Java is Awesome!");
//            if(i==2){
//                System.out.println("Loops ends here!");
//                break;
//            }
//
//        }
//        int i=0;
//        while (i<=5){
//            System.out.println(i);
//            System.out.println("Java is Awesome!");
//            i++;
//            if(i==2){
//                System.out.println("Loops ends here!");
//                break;
//            }
//        }
//        int i=0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is Awesome!");
//            i++;
//            if(i==2){
//                System.out.println("Loops ends here!");
//                break;
//            }
//        }while (i<=5);



//        for (int i=0;i<=5;i++){
//            if(i==2){
//                System.out.println("Loops ends here!");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is Awesome!");
//        }
//        int i=0;
//        while (i<=5){
//            i++;
//            if(i==2){
//                System.out.println("Loops ends here!");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is Awesome!");
//        }
        int i=0;
        do {
            i++;
            if(i==2){
                System.out.println("Loops ends here!");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Awesome!");
        }while (i<=5);
    }
}
