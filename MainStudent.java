//package bagian1;
import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Student[] siswa = new Student[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Input Siswa ke-" + (i + 1) + " ---");
            System.out.print("Nama    : ");
            String nama = input.nextLine();
            System.out.print("Alamat  : ");
            String alamat = input.nextLine();
            System.out.print("Umur    : ");
            int umur = input.nextInt();
            System.out.print("Matematika : ");
            double math = input.nextDouble();
            System.out.print("IPA        : ");
            double science = input.nextDouble();
            System.out.print("Bahasa Inggris : ");
            double english = input.nextDouble();
            input.nextLine();

            siswa[i] = new Student(nama, alamat, umur, math, science, english);
        }

        System.out.println("\n========== DATA SISWA ==========");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("--- Siswa ke-" + (i + 1) + " ---");
            siswa[i].displayMessage();
            System.out.println("===================");
        }

        Student.jumlahObjek();
        input.close();
    }
}