public class argsExample {
    public static void main(String[] args){
        if(args[0].equals("dev")){
            System.out.println("running on dev");
        }
        else{
            System.out.println("running on prod");
        }
    }
}
