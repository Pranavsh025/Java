package Function;
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

    static int sum(int a , int b , int c){ // different number of parameters 
        return a+b+c;
    }

    static int sum(double a , double b){ // different data type of parameters
        return (int)(a+b);
    }

    // function overloading is possible with different number of parameters and different data type of parameters but not with different return type of parameters
}
