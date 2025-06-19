public interface Animal {

    public void animalSound();
    public void sleep();

}
 public class Pig implements Animal {
    public void animalSound(){
        System.out.println("the pig says weewee");
    }
    public void sleep(){
        System.out.println("the pig is sleeping");
    }
}
