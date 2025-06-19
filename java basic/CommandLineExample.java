public class CommandLineExample{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("no arguments passed.");
    }else{
        for(String arg : args){
            System.out.println(arg);
        }
    }
}
}