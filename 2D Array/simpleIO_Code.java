import java.util.Scanner;

public class MATERIX {
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
        for(int i=0; i<m;i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("done");
    }
}
