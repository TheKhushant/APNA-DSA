import java.util.Scanner;

public class MATERIX {
    public static boolean searchIT(int search, int[][] matrix) {
        int m = matrix.length;
        int n = matrix.length;
        for(int i=0; i<m;i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == search){
                    System.out.println("found at locatin : " + i +" " + j);
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of columns and rows for matrix : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        
        System.out.println("enter the "+ m*n +" elements :: ");
        for(int i=0; i<m;i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("your array inpute is  : ");
        for(int i=0; i<m;i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("searching : ");
        System.out.println("enter element to search : ");
        int search = sc.nextInt();
        searchIT(search, matrix);
    }
}
