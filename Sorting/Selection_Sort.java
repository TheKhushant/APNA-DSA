public class Selection{
    public static void selecti(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int min=i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        // return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,5};
        selecti(arr);
        Display(arr);
    }
    public static void Display(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}


/// Selection sort in decinding order
public class Selection{
    public static void selecti(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int min=i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[min] < arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        // return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,5};
        selecti(arr);
        Display(arr);
    }
    public static void Display(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
