import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari ManajemenInventaris
        ManajemenInventaris inventaris = new ManajemenInventaris();

        // Membuat Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Loop menu list
        while (true) {
            System.out.println("=== Menu Manajemen Inventaris ===");
            System.out.println("1. Tambah Barang Elektronik");
            System.out.println("2. Tambah Barang Non-Elektronik");
            System.out.println("3. Tampilkan Semua Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            
            int pilihan = scanner.nextInt();

            // Menjalankan opsi yang dipilih
            switch (pilihan) {
                case 1:
                    inventaris.tambahBarangElektronik();
                    break;
                case 2:
                    inventaris.tambahBarangNonElektronik();
                    break;
                case 3:
                    inventaris.tampilkanSemuaBarang();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program dihentikan.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih opsi yang benar.");
            }
        }
    }
}
