import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    String nama;
    int jumlah;
    double harga;

    public Barang(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Jumlah Barang: " + jumlah);
        System.out.println("Harga Barang: " + harga);
    }
}

class BarangElektronik extends Barang {
    int garansi;

    public BarangElektronik(String nama, int jumlah, double harga, int garansi) {
        super(nama, jumlah, harga);
        this.garansi = garansi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}

class BarangNonElektronik extends Barang {
    String material;

    public BarangNonElektronik(String nama, int jumlah, double harga, String material) {
        super(nama, jumlah, harga);
        this.material = material;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Material: " + material);
    }
}

public class ManajemenInventaris {
    // Deklarasi ArrayList untuk menyimpan barang
    ArrayList<Barang> daftarBarang = new ArrayList<>();

    // Method untuk menambah barang elektronik
    public void tambahBarangElektronik() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Barang Elektronik: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan Garansi (tahun): ");
        int garansi = scanner.nextInt();

        BarangElektronik barang = new BarangElektronik(nama, jumlah, harga, garansi);
        daftarBarang.add(barang);

        System.out.println("Barang elektronik berhasil ditambahkan!");
    }

    // Method untuk menambah barang non-elektronik
    public void tambahBarangNonElektronik() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Barang Non-Elektronik: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Konsumsi newline
        System.out.print("Masukkan Material Barang: ");
        String material = scanner.nextLine();

        BarangNonElektronik barang = new BarangNonElektronik(nama, jumlah, harga, material);
        daftarBarang.add(barang);

        System.out.println("Barang non-elektronik berhasil ditambahkan!");
    }

    // Method untuk menampilkan semua barang
    public void tampilkanSemuaBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Tidak ada barang dalam inventaris.");
        } else {
            for (Barang barang : daftarBarang) {
                barang.tampilkanInfo();
                System.out.println("---------------------------");
            }
        }
    }

    public static void main(String[] args) {
        ManajemenInventaris inventaris = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tambah Barang Elektronik");
            System.out.println("2. Tambah Barang Non-Elektronik");
            System.out.println("3. Tampilkan Semua Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();

            switch (opsi) {
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
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}
