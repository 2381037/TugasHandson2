import java.util.Scanner;
public class HitungLuasKelilingPersegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Pilih bangun datar:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");

        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();


        if (pilihan == 1) {
                System.out.print("Masukkan sisi persegi: ");
                    double sisi = scanner.nextDouble();

            double luas = sisi * sisi;
            double keliling = 4 * sisi;

                System.out.println("Luas persegi: " + luas);
                System.out.println("Keliling persegi: " + keliling);


        } else if (pilihan == 2) {
            System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                        double lebar = scanner.nextDouble();

                double luas = panjang * lebar;
                    double keliling = 2 * (panjang + lebar);

            System.out.println("Luas persegi panjang: " + luas);
                System.out.println("Keliling persegi panjang: " + keliling);


        } else if (pilihan == 3) {
            System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = scanner.nextDouble();

            double luas = Math.PI * jariJari * jariJari;
            double keliling = 2 * Math.PI * jariJari;

            System.out.println("Luas lingkaran: " + luas);
                System.out.println("Keliling lingkaran: " + keliling);

        } else {
            System.out.println("Pilihan tidak valid.");
        }


        scanner.close();
    }
}