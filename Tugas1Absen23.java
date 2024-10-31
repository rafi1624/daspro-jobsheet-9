import java.util.Scanner;

public class Tugas1Absen23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int n = sc.nextInt();
        int[] arrNilai = new int[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }      
        double total = 0;
        int nilaiTertinggi = arrNilai[0];
        int nilaiTerendah = arrNilai[0];

        for (int nilai : arrNilai) {
            total += nilai;
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai; 
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai; 
            }
        }

        double rataRata = total / n;
        System.out.println("Rata-Rata Nilai : " + rataRata);
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah  : " + nilaiTerendah);

    
    }
}
