package Function;
public class function3 {
    public static void main(String[] args) {
        // chaining of function 

        fun1();

        System.out.println("bye");

    }

    static void fun1(){
        fun2();
        System.out.println("hello");
    }

    static void fun2(){
        fun3();
        System.out.println("hellowwwwwww");
    }

    static void fun3(){
        System.out.println("how aree you");
    }
}
