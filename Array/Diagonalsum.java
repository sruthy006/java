import java.util.Scanner;

class Diagonalsum{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the size of the square matrix (n x n): ");
int n = scanner.nextInt();

int[][] matrix = new int[n][n];
int sum = 0;

System.out.println("Enter the elements of the matrix:");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
matrix[i][j] = scanner.nextInt();}}
System.out.println("THE MATRIX IS:");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
System.out.print(matrix[i][j]+" ");}
System.out.println();
}

        

for (int i = 0; i < n; i++) {
sum += matrix[i][i];}

System.out.println("Sum of diagonal elements: " + sum);
 }

}
