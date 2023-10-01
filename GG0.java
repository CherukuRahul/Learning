import java.util.ArrayList;
import java.util.Arrays;

public class GG0 {
    public static void main(String[] args) {
       int  matrix[][] = {{ 1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15,16}};
        ArrayList<Integer> result = boundaryTraversal(matrix,4,4);
        System.out.println(result);
        
        
    }
     static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
         ArrayList<Integer> L = new ArrayList<Integer>();
         if( n == 1 || m == 1){
             for(int i = 0 ; i<n; i++){
                 for(int j = 0; j<m; j++){
                     L.add(matrix[i][j]);
                 }
             }
             return L;
         }
         
         for(int i = 0; i < n; i++){
             for(int j =0; j < m; j++){
                 if(i == 0 ||  j == m-1){
                     L.add(matrix[i][j]);
                 }
             }
         }
         
         for(int i = n-1; i>=0; i--){
             for(int j = m-1; j >=0; j--){
                 if( (i == n-1 || j == 0)){
                     if((i == n-1) && (j == m-1)){
                         continue;
                     }else{
                     L.add(matrix[i][j]);
                     }
                 }
         }
         }
         L.remove(L.size()-1);
         return L;
    }
}
