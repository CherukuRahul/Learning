public class FindingMin {
    public static void main(String[] args) {
        int  arr[] = {3,4,1,1,5,2};
        int min = Integer.MAX_VALUE; 
        for(int i = 0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
