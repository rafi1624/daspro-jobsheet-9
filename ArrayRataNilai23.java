import java.util.Scanner;

public class ArrayRataNilai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        double total = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jumlahTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2 = total / jumlahMahasiswa;
        double rataRataLulus = (jumlahLulus > 0) ? totalLulus / jumlahLulus : 0;
        double rataRataTidakLulus = (jumlahTidakLulus > 0) ? totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-Rata Nilai = " + rata2);
        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);
        System.out.println("Jumlah Mahasiswa Yang Lulus: " + jumlahLulus);
        
        
    }
}