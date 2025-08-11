import java.util.Scanner;

class Binarysearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, k, l = 0, u, mid = 0, temp, i, j, flag = 0;

        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int ar[] = new int[n];
        u = n - 1;

        System.out.println("Enter elements of the array:");
        for (i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

      
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        System.out.print("Enter the element to search: ");
        k = sc.nextInt();

      
        while (l <= u) {
            mid = (l + u) / 2;
            if (k == ar[mid]) {
                flag = 1;
                break;
            } else if (k < ar[mid]) {
                u = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        if (flag == 0)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + mid);
    }
}
