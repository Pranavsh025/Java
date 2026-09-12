package Function;
public class function4 {
    public static void main(String[] args) {
        //scope of a variable 

        int x =4;
        int y= 5;

        System.out.println(x + "," + y);

        fun();
    }
    // this x and y are not accessible here because they are local variables of main function and their scope is limited to main function only.
    // if we want to access them in other function then we have to pass them as parameters to that function.
    
    
    static void fun(){
        System.out.println(x + "," + y);
    }
}
