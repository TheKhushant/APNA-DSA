public class diagonalSum {
    public static void Dgnlsum(int arr[][]) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                    sum+=arr[i][j];
                }
                else{
                    System.out.print(" ");
                }
                if(i+j == arr.length-1){
                    sum+=arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }    
            System.out.println();
        }
        System.out.println("total value is  : "+sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Dgnlsum(arr);
    }
}
