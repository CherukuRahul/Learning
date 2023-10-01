import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        int matrix[][] = {{ 1, 0, 0},
              { 1, 0, 0},
              { 1, 0, 0},
              { 0, 0, 0}};
        Arrays.fill(matrix[1],1);
        System.out.println(Arrays.toString(matrix[1]));

    }
}
