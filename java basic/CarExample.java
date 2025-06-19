public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.name = "Tesla";
        myCar.age = 20;
        
        Car anotherCar = new Car(7,"tesla");
        System.out.println("age= " + anotherCar.age + " name= " + anotherCar.name);
    }
}
