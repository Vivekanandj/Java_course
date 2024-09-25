public class cwh_29_practice {
    public static void main(String[] args) {
        float sum=0;
        float[] num= {34.5f,25.7f,2.45f,32.44f,56.7f};
//        for (int i=0;i<num.length;i++){
//            sum=sum+num[i];
//        }
        for (float elements:num){
            sum=sum+elements;
        }
        System.out.println(sum);

        float[] marks= {89.5f,75.5f,100.0f,98.0f,99.5f};
        float number=75.0f;
        boolean isInArray=false;
        for (float marks1:marks){
            if (marks1==number){
                isInArray=true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The number is in the array");
        }else {
            System.out.println("The number is not in the array");
        }

        float[] marks2= {89.5f,75.5f,100.0f,98.0f,99.5f};
        float sum2=0;
        for (float marks21:marks2){
            sum2=sum2+marks21;
        }
        System.out.println("The average physics marks of all student is: "+sum2/marks2.length);

        int [][] mat1={{1,2,3},{4,5,6}};
        int [][] mat2={{7,8,9},{10,12,13}};
        int [][] result={{0,0,0},{0,0,0}};
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        // Practice Problem 5 2nd type
//        int [] arr = {1, 21, 3, 4, 5, 34, 67};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i=0; i<n; i++){
//            // Swap a[i] and a[l-1-i]
//            // a   b   temp
//            // |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }

//        for(int element: arr){
//            System.out.print(element + " ");
//        }
//        int [] days={31,23,12,14,17}; first type
//        for (int i=days.length-1;i>0;i--){
//            System.out.println(days[i]);
//        }
//        System.out.println(days[0]);

//        // find max in array
//        int []element={101,500,250,550,1001};
//        int max= Integer.MIN_VALUE;
//        for (int element1:element){
//            if (element1>max){
//                max=element1;
//            }
//
//        }
//        System.out.println("the value of the maximum element in this array is: "+ max);

        int []element={101,500,250,550,1001,88};
        int min= Integer.MAX_VALUE;
        for (int element1:element){
            if (element1<min){
                min=element1;
            }

        }
        System.out.println("the value of the minimum element in this array is: "+ min);

//        int [] arr= {11,23,2,47,33,12};
        boolean isSorted=true;
        int [] arr= {1,2,25,35,49};
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }else {
            System.out.println("The array is not sorted");
        }
    }
}
