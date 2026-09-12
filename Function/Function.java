package Function;
public class Function {
    public static void main(String[] args) {
        // function in java

        //greet();

        sayhello("jonny");

        System.out.println(getnumber());

        System.out.println(add(10,20));
    }

    // No Ip , no Op
    static void greet(){
       System.out.println("hello");
       return;  // optional 
    }

    // ip , no op
    static void sayhello(String name){
        System.out.println("Hello "+ name);
    }

    // no ip , op
    static int getnumber(){
        return 10;
    }

    // ip , op
    static int add(int a, int b){
        return a+b;
    }
}
