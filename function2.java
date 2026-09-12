public class function2 {
    public static void main(String[] args) {
        // function overloading in java

        int x = sum(10,20);
        System.out.println(x);

        int y = sum(5,6);
        System.out.println(y);
        
    }

    static int sum(int a , int b){
        return a+b;
    }
}
