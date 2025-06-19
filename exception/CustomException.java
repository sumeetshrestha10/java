package exception;
public class CustomException {
    static void validate(int age) throws Exceptional{
        if(age < 18){
            throw new Exceptional("age is not valid to vote");
        }else{
            System.out.println("welcome to vote");
        }
    }
    public static void main(String args[]){
        try{
            validate(17);
        }catch(Exceptional ex){
            System.out.println("caugth the exceptuion");

            System.out.println("exception occured" + ex);
        }

        System.out.println("rest of the code...");

    }
}
