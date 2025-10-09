import java.util.Scanner;

public class UjianSkripsiNested27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        String bebasKompen;
        int bimbinganP1;
        int bimbinganP2;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        bimbinganP1 = sc.nextInt();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        bimbinganP2 = sc.nextInt();
        sc.nextLine();

        if (bebasKompen.equalsIgnoreCase("ya")) {

            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {

                pesan = "semua syarat terpenuhi, mahasiswa boleh daftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {

                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali dan P2 belum mencapai 4 kali!";

            } else if (bimbinganP1 < 8) {

                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali!";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali!";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen!";
        }

        System.out.println("------------------------------------------");
        System.out.println("Hasil: " + pesan);
        sc.close();
    }
}