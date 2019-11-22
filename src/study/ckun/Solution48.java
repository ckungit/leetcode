package study.ckun;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Solution48 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{5, 1, 9,11},{2, 4, 8,10},{13, 3, 6, 7},{15,14,12,16}};

        Solution48 solution = new Solution48();
        solution.rotate1(matrix1);
        for(int[] i:matrix1){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("=====================");
        solution.rotate2(matrix1);
        for(int[] i:matrix1){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("=====================");
        solution.rotate3(matrix1);
        for(int[] i:matrix1){
            System.out.println(Arrays.toString(i));
        }
    }

    private void rotate1(@NotNull int[][] matrix){
        int n = matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int tmp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j] = tmp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1]=tmp;
            }
        }
    }

    private void rotate2(@NotNull int[][] matrix){
        int n = matrix.length;
        for(int i=0;i<n/2+n%2;i++){
            for(int j=0;j<n/2;j++){
                int[] tmp = new int[4];
                int row = i;
                int col = j;
                for(int k=0;k<4;k++){
                    tmp[k] = matrix[row][col];
                    int x = row;
                    row = col;
                    col = n - 1 - x;
                }
                for(int k=0;k<4;k++){
                    matrix[row][col] = tmp[(k+3)%4];
                    int x = row;
                    row = col;
                    col = n -1 - x;
                }
            }
        }
    }

    private void rotate3(@NotNull int[][] matrix){
        int n = matrix.length;
        for(int i=0;i<(n+1)/2;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[n - 1 -j][i];
                matrix[n - 1 -j][i] = matrix[n - 1 -i][n -j -1];
                matrix[n - 1 -i][n - j -1] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
