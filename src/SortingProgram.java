import java.util.*;

public class SortingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[5];
        boolean sorted;
        int temp, choice, min, max;

        do {
            System.out.println("Menu Pilihan:");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Bubble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan batas bawah: ");
                    min = input.nextInt();
                    System.out.print("Masukkan batas atas: ");
                    max = input.nextInt();
                    for (int i = 0; i < 5; i++) {
                        data[i] = (int) (Math.random() * (max - min + 1)) + min;
                    }
                    System.out.println("Data random: " + Arrays.toString(data));
                    break;
                case 2:
                    sorted = false;
                    for (int i = 0; i < data.length - 1 && !sorted; i++) {
                        sorted = true;
                        for (int j = 0; j < data.length - 1 - i; j++) {
                            if (data[j] > data[j + 1]) {
                                temp = data[j];
                                data[j] = data[j + 1];
                                data[j + 1] = temp;
                                sorted = false;
                            }
                        }
                        System.out.println("Putaran " + (i + 1) + ": " + Arrays.toString(data));
                    }
                    break;
                case 3:
                    for (int i = 0; i < data.length - 1; i++) {
                        min = i;
                        for (int j = i + 1; j < data.length; j++) {
                            if (data[j] < data[min]) {
                                min = j;
                            }
                        }
                        temp = data[min];
                        data[min] = data[i];
                        data[i] = temp;
                        System.out.println("Putaran " + (i + 1) + ": " + Arrays.toString(data));
                    }
                    break;
                case 4:
                    sorted = false;
                    for (int i = 0; i < data.length - 1 && !sorted; i++) {
                        sorted = true;
                        for (int j = 0; j < data.length - 1 - i; j++) {
                            if (data[j] < data[j + 1]) {
                                temp = data[j];
                                data[j] = data[j + 1];
                                data[j + 1] = temp;
                                sorted = false;
                            }
                        }
                        System.out.println("Putaran " + (i + 1) + ": " + Arrays.toString(data));
                    }
                    break;
                case 5:
                    for (int i = 0; i < data.length - 1; i++) {
                        min = i;
                        for (int j = i + 1; j < data.length; j++) {
                            if (data[j] > data[min]) {
                                min = j;
                            }
                        }
                        temp = data[min];
                        data[min] = data[i];
                        data[i] = temp;
                        System.out.println("Putaran " + (i + 1) + ": " + Arrays.toString(data));
                    }
                    break;
                case 6:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 6);

        input.close();
    }
}