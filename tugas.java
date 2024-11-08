import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[10][6]; 
        double[] rataResponden = new double[10]; 
        double[] rataPertanyaan = new double[6]; 
        int jumlahPertanyaan, jumlahRespon, jumlahSeluruh = 0;
        
        for (int i = 0; i < a.length; i++) {
            jumlahPertanyaan = 0;
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("Masukkan nilai untuk a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
                jumlahPertanyaan += a[i][j]; 
            }
            rataResponden[i] = (double) jumlahPertanyaan / 6;
            System.out.println("Rata-rata responden " + i + ": " + rataResponden[i]);
        }
        
        for (int j = 0; j < a[0].length; j++) {
            jumlahRespon = 0;
            for (int i = 0; i < a.length; i++) {
                jumlahRespon += a[i][j]; 
            }
            rataPertanyaan[j] = (double) jumlahRespon / 10;
            System.out.println("Rata-rata pertanyaan " + j + ": " + rataPertanyaan[j]);
        }
      
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                jumlahSeluruh += a[i][j];
            }
        }
        double rataSeluruh = (double) jumlahSeluruh / (10 * 6);
        System.out.println("Rata-rata seluruh: " + rataSeluruh);
    }
}
