public class MyPerson{
    static String name = "sumeet";
    String address = "bhaktapur";
    public static void main(String[] args){
        System.out.println(MyPerson.name);

        MyPerson m1 = new MyPerson();
        System.out.println(m1.address);
    }
}