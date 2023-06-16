import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }
    public static void task1(){
        System.out.println(" ");
        System.out.println("Exercise 1");

        int[] array1 = new int[3];
        for (int i = 0; i < array1.length; i++){
            array1[i] = i + 1;
            System.out.println(array1[i]);
        }

        double[] array2 = {1.57 , 7.654 , 9.986};
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);

        int[] array3 = new int[4];
        for (int i =0; i < array3.length; i++){
            array3[i] = (int) (Math.random() * 10);
            System.out.println(array3[i]);
        }
    }

    public static void task2(){
        System.out.println(" ");
        System.out.println("Exercise 2");

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++){
            array[i] = array.length - i;
            if(i < array.length - 1){
                System.out.print(array[i] + " , ");
            } else {
                System.out.println(array[i]);
            }
        }

        double[] array2 = {1.57 , 7.654 , 9.986};

        for (int i = 0; i < array2.length; i++) {
            if (i < array2.length - 1){
                System.out.print(array2[i] + " , ");
            } else {
                System.out.println(array2[i]);
            }
        }
        int[] array3 = new int[4];
        for (int i =0; i < array3.length; i++) {
            array3[i] = (int) (Math.random() * 10);
            if (i < array3.length - 1) {
                System.out.print(array3[i] + " , ");
            } else {
                System.out.println(array3[i]);
            }
        }
    }
    public static void task3(){
        System.out.println(" ");
        System.out.println("Exercise 3");

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++){
            array[i] = array.length - i;
            if ( i < array.length -1){
                System.out.print(array[i] + " , ");
            } else {
                System.out.println(array[i]);
            }
        }

        double[] array2 = {1.57 , 7.654 , 9.986};

        for (int i = 0; i < array2.length; i++){
            if (i < array2.length  -1){
                System.out.print(array2[array2.length - 1 - i]   + " , ");
            } else {
                System.out.println(array2[array2.length -1 - i] );
            }
        }

        int[] array3 = {1 , 2, 3, 4};

        for (int i = 0; i < array3.length; i++){
            array3[i] = array3.length - i;
            if (i < array3.length -1){
                System.out.print(array3[i] + " , ");
            } else {
                System.out.println(array3[i]);
            }
        }
    }

    public static void task4(){
        System.out.println(" ");
        System.out.println("Exercise 4");

        int[] array = {1, 2, 3};

        for (int i = 0; i < array.length; i ++){
            if (array[i] % 2 != 0){
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}