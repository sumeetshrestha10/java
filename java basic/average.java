import java.util.*;    

public class average {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        System.out.println("enter number of values");
        int j = sca.nextInt();
        int myArr[] = new int[j];
        double sum = 0;
        System.out.println("enter number you want the avaeage of:");
        for (int i = 0; i < j; i++) {
            myArr[i] = sca.nextInt();
        }
        for (int i = 0; i < j; i++) {
            sum = sum + myArr[i];
        }
        System.out.println("the sum is" + sum);
        System.out.println("the average is" + sum / j);
        sca.close();
    }
}