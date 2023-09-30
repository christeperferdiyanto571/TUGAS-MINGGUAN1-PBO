import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;

        do {
            int baris, kolom;
            System.out.print("Masukkan jumlah baris matriks: ");
            baris = input.nextInt();
            System.out.print("Masukkan jumlah kolom matriks: ");
            kolom = input.nextInt();

            int[][] nilai = new int[baris][kolom];
            int total = 0;
            int[] nilaiSatuDimensi = new int[baris * kolom]; // Array satu dimensi untuk menyimpan nilai-nilai matriks.

            // Meminta pengguna untuk memasukkan elemen-elemen matriks.
            System.out.println("Masukkan elemen-elemen matriks:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print("Masukkan nilai baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + ": ");
                    nilai[i][j] = input.nextInt();
                    nilaiSatuDimensi[i * kolom + j] = nilai[i][j]; // Menyimpan nilai dalam array satu dimensi.
                    total += nilai[i][j];
                }
            }

            // Menghitung rata-rata nilai matriks.
            double rata_rata = (double) total / (baris * kolom);

            // Menghapus layar konsol.
            clearScreen();

            // Menampilkan matriks yang dimasukkan oleh pengguna.
            System.out.println("Matriks yang dimasukkan:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print(nilai[i][j] + " ");
                }
                System.out.println();
            }

            // Menampilkan rata-rata nilai matriks.
            System.out.println("Rata-rata nilai matriks: " + rata_rata);

            // Menampilkan nilai-nilai dalam array satu dimensi.
            System.out.println("Nilai-nilai dalam array satu dimensi:");
            for (int i = 0; i < baris * kolom; i++) {
                System.out.print(nilaiSatuDimensi[i] + " ");
            }
            System.out.println();

            // Meminta pengguna apakah ingin menghitung rata-rata lagi.
            System.out.print("Hitung rata-rata lagi? (y/n): ");
            ulangi = input.next().charAt(0);
            
            // Menghapus layar konsol.
            clearScreen();
        } while (ulangi == 'y' || ulangi == 'Y');

        input.close();
    }

    // Fungsi untuk menghapus layar konsol (clear screen).
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
