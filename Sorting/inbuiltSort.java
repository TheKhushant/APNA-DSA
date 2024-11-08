import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {
    public static void main(String[] args){
        Integer arr[] = {5,2,3,4,1};
        
        //simply sort array
        Arrays.sort(arr);

        // to reverse and sort array
        // Arrays.sort(arr, Collections.reverseOrder());
        print(arr);
    }
    public static void print(Integer arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

