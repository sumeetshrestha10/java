import java.util.*;
public class TemperatureCon {
    public static void main(String[] args) {
        System.out.println(9/5);
        Scanner input = new Scanner(System.in);
        System.out.println("enter the temperature");
        float temperature = input.nextFloat();
        System.out.println("what do you want the temperature in?");
        System.out.println("press 1 for celsius and 2 for fahrenheit");
        String option = input.next();
        if (option.equals("1")) {
            double celsius = (temperature-32)*5/9;
            System.out.println("the celsius is "+celsius);
        }else if(option.equals("2")){
            double fahrenheit = (1.8*temperature+32);
            System.out.println("the fahrenheit is "+fahrenheit);
        }
        else{
            System.out.println("enter a approprite temperature");
        }
        input.close();

    }
}
