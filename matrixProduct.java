import java.util.*;

class matrixProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int R = sc.nextInt();
        System.out.println("Enter no. of cols: ");
        int C = sc.nextInt();
        int[][] A = new int[R][C];
        System.out.println("Enter 2D array elemnts: ");
        
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter an integer: ");
        int B = sc.nextInt();
        product(A, B);
        System.out.println();
        System.out.println("Product of the given array: ");        
        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }

    public static int[][] product(int[][] A, int B) {
        
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                A[i][j] = B * A[i][j];
            }
        }
        return A;

    }
}