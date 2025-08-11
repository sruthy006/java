import java.util.Scanner;
class Transpose {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i, j;
System.out.println("Enter number of rows:");
int r = sc.nextInt();
System.out.println("Enter number of columns:");
int c = sc.nextInt();
int[][] matrix = new int[r][c];
System.out.println("Enter elements of matrix:");
for (i = 0; i < r; i++) {
for (j = 0; j < c; j++) {
matrix[i][j] = sc.nextInt();
}
}
System.out.println("Original matrix is:");
for (i = 0; i < r; i++) {
for (j = 0; j < c; j++) {
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
int[][] transpose = new int[c][r]; // Fix: use c × r
for (i = 0; i < r; i++) {
for (j = 0; j < c; j++) {
transpose[j][i] = matrix[i][j];
}
}
System.out.println("Transposed matrix is:");
for (i = 0; i < c; i++) {
for (j = 0; j < r; j++) {
System.out.print(transpose[i][j] + " ");
}
System.out.println();
}
}
}
