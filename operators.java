public class operators {
    public static void main(String[] args) {
        // operators in java
        // arithmetic operators

        int a = 5;
        int b = 10;

        int c = a+b;
        int d = a-b;
        int e = a*b;    
        int f = a/b;   
        int g = a%b; //0

        System.out.println(c +" ," + d + " ," + e + " ," + f + " ," + g);

        // compound assignment operators
        int h = a+2;
        h += 2;
        h -= 2;
        h *= 2;
        h /= 2; 
        System.out.println(h);

        int i = 6;
        i++; // i = i+1
        i--; // i = i-1     
        System.out.println(i);

        // Pre increment and post increment
        int j = 7;
        j++; // j = j+1
        System.out.println(j); // 8
        ++j; // j = j+1
        System.out.println(j); // 9
        
    }
}
