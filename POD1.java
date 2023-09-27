import java.util.ArrayList;

public class POD1 {
    public static void main(String[] args) {
        int arr[] = {1,4,5,7};
        int brr[] = {10,20,30,40};
        int n = 4;
        int m = 4;
        int x = 50;
        ArrayList<Integer> L = printClosest(arr, brr, n, m, x);
        System.out.println(L);
    }   
    
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
       ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int right = m-1;
        int diff = Integer.MAX_VALUE;
        
        while(left < n && right >= 0)
        {
            int currsum = arr[left] + brr[right];
            int currdiff = Math.abs(currsum - x);
            
            if(currdiff < diff)
            {
                diff = currdiff;
                list.clear();
                list.add(arr[left]);
                list.add(brr[right]);
            }
            
            if(currsum < x)
            {
                left++;
            }
            else{
                right--;
            }
        }
        
        return list;
    }

    

}