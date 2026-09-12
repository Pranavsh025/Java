

public class array {
    public static void main(String[] args) {
        // multi dimensional array 

        int[][] marks = new int[3][3];
        marks[0][0] = 1;
        marks[0][1] = 2;
        marks[0][2] = 3;
        marks[1][0] = 4;
        marks[1][1] = 5;
        marks[1][2] = 6;
        marks[2][0] = 7;
        marks[2][1] = 8;
        marks[2][2] = 9;

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
