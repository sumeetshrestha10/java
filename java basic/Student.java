public class Student {
    private String name;
    private int age;

    Student(){
        System.out.println("this is the defaulf");
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.length() == 0){
            System.out.println("invalid name");
            return;
        }
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }
    }
}
