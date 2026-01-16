

public class MatAddition {
    public static void main(String[] args) {
        int matA [][] = {{1,3,4},{2,4,3},{3,4,5}};
        int matB [][] = {{4,8,6},{34,54,87},{12,10,87}};

        int matC [][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matC[i][j] = matA[i][j]+matB[i][j];

                System.out.print(matC[i][j]+" ");
            }
            System.out.println();
        }
    }
}
