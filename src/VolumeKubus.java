import java.util.Scanner;

public class VolumeKubus {
    /**
     * program tentang menghitung volume kubus
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sisi, volume;
        /**
         * menggunakan int untuk menghitung angka
         */

        System.out.println("Program Menghitung Volume Kubus");
        System.out.println("Masukkan Sisi Kubus : ");
        /**
         * sout berfungsi untuk menampilkan output
         */
        sisi = scanner.nextInt();
        volume = (sisi*sisi*sisi);
        /**
         * rumus untuk menghitung volume kubus
         */
        System.out.println("Volume Kubus Adalah: "+ volume);
        /**
         * output untuk menampilkan hasil
         */
    }
}