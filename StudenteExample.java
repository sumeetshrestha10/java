public class StudenteExample {
    public static void main(String[] args){
        Student s1 = new Student("ram" , 10);
        System.out.println("name= " + s1.getName());
        System.out.println("age= " + s1.getAge());

        Student s2 = new Student();
        s2.setName("anothoer ram");
        s2.setAge(10);
        System.out.println("name= " + s2.getName());
        System.out.println("age= " + s2.getAge());
        
    }
}
