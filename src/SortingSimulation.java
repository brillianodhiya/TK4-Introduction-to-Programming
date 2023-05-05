import java.util.*;

public class SortingSimulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[5];
        int pilihan = 0;

        while (pilihan != 6) {
            System.out.println("Selamat Datang di Program Simulasi");
            System.out.println("Menu");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Bubble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Batas Bawah: ");
                    int bawah = input.nextInt();
                    System.out.print("Batas Atas: ");
                    int atas = input.nextInt();
                    generateRandomData(data, bawah, atas);
                    printData(data);
                    break;
                case 2:
                    bubbleSortAscending(data);
                    break;
                case 3:
                    selectionSortAscending(data);
                    break;
                case 4:
                    bubbleSortDescending(data);
                    break;
                case 5:
                    selectionSortDescending(data);
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public static void generateRandomData(int[] data, int bawah, int atas) {
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(atas - bawah + 1) + bawah;
        }
    }

    public static void printData(int[] data) {
        System.out.println(Arrays.toString(data));
    }

    public static void bubbleSortAscending(int[] data) {
        System.out.println("Simulasi Bubble Sort - Ascending");
        int n = data.length;
        int temp;

        for (int i = 0; i < n; i++) {
            System.out.println("Pass " + (i + 1));
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
                printData(data);
            }
            System.out.println("Result of Pass " + (i + 1));
            printData(data);
        }
    }

    public static void selectionSortAscending(int[] data) {
        System.out.println("Simulasi Selection Sort - Ascending");
        int n = data.length;
        int minIndex, temp;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            System.out.println("Pass " + (i + 1));
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
            printData(data);
            System.out.println("Result of Pass " + (i + 1));
            printData(data);
        }
    }

    public static void bubbleSortDescending(int[] data) {
        System.out.println("Simulasi Bubble Sort - Descending");
        int n = data.length;
        int temp;

        for (int i = 0; i < n; i++) {
            System.out.println("Pass " + (i + 1));
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] < data[j]) {
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
                printData(data);
            }
            System.out.println("Result of Pass " + (i + 1));
            printData(data);
        }
    }

    public static void selectionSortDescending(int[] data) {
        System.out.println("Simulasi Selection Sort - Descending");
        int n = data.length;
        int maxIndex, temp;

        for (int i = 0; i < n - 1; i++) {
            maxIndex = i;
            System.out.println("Pass " + (i + 1));
            for (int j = i + 1; j < n; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                temp = data[i];
                data[i] = data[maxIndex];
                data[maxIndex] = temp;
            }
            printData(data);
            System.out.println("Result of Pass " + (i + 1));
            printData(data);
        }
    }
}