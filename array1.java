

public class array1 {
    public static void main(String[] args) {
        int[] rollnum = new int[3];

        // rollnum[0] = 1;
        // rollnum[1] = 2;
        // rollnum[2] = 3;

        // System.out.println(rollnum[0]);
        // System.out.println(rollnum[1]);
        // System.out.println(rollnum[2]);

        // System.out.println(rollnum.length);

        int x =101;
        for (int i=0; i<rollnum.length;i++){
            rollnum[i] = x;
            x++;
        }

        for (int i =0; i<rollnum.length;i++){
            System.out.println(rollnum[i]);
        }
    }
}
