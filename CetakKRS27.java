import java.util.Scanner;

public class CetakKRS27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("apakah ukt sudah lunas? (true/false): ");
        boolean uktlunas = sc.nextBoolean();

        if (uktlunas) {
            System.out.println("Cetak KRS");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }
        sc.close();
    }
}