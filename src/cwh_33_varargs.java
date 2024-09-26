public class cwh_33_varargs {
//    static int sum (int a,int b){
//        return a+b;
//    }
//    static int sum (int a,int b,int c){
//        return a+b+c;
//    }
    static int sum(int ...ary){
        int result = 0;
        for (int i:ary){
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome  to Varargs!");
        System.out.println("The sum of 4 and 5 is: "+sum(4,5)+"");
        System.out.println("The sum of 3, 4 and 5 is: "+sum(3 ,4,5)+"");
        System.out.println("The sum of 2, 3, 4 and 5 is: "+sum(2,3 ,4,5)+"");
        System.out.println("The sum of 1,2, 3, 4 and 5 is: "+sum(1,2,3 ,4,5)+"");
    }
}
