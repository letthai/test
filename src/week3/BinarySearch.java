import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BinarySearch {
    public static int binarySearch(int[] a, int number) {
        int first = 0;
        int last = a.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (number < a[mid]) {last = mid - 1;}
            else if (number > a[mid]) {first = mid + 1;}
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        System.out.println("\nMang sau khi duoc random tu 1 den 100 la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nMang sau khi duoc sap xep la: ");
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nNhap so can tim: ");
        int number = sc.nextInt();
        System.out.println("So can tim o vi tri: " + (binarySearch(a, number) + 1));
    }

}
