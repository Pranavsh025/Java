package loops;
public class flowstatement {
    public static void main(String[] args) {
        boolean b = true;
        int i = 5;


        // seleaction statements
        // if else statement 

        // if(i > 5 && i<10){
        //     System.out.println("i is equal to 5");
        // } 
        // else{
        //     System.out.println("i is not 5");
        // }

        // if(i % 2 == 0){
        //     System.out.println("i is even");
        // }
        // else{
        //     System.out.println("i is odd");
        // } 

        // nested if else statement
        // if(i>5){
        //     if(i<10){
                
        //         System.out.println("i is greater than 5 and less than 10");
        //     }
        //     else{
        //         System.out.println("i is greater than 10");
        //     }
        // }

        // if-else-if ladder statement
        // if (i == 5){
        //     System.out.println("i is equal to 5");
        // }
        // else if(i==6){
        //     System.out.println("i is equal to 6");
        // }
        
        // Switch statement 
        switch (i) {
            case 1:
                System.out.println("i is equal to 1");
                break;
            case 2:
                System.out.println("i is equal to 2");
                break;
            case 3:
                System.out.println("i is equal to 3");
                break;
            case 4:
                System.out.println("i is equal to 4");
                break;
            case 5:
                System.out.println("i is equal to 5");
                break;
            case 6:
                System.out.println("i is equal to 6");
                break;

            default:
                break;
        }
    }
}
