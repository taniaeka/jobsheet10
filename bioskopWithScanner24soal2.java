import java.util.Scanner;

public class bioskopWithScanner24soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println(" -------- MENU -------- ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int pilihMenu = sc.nextInt();
            sc.nextLine();

            switch (pilihMenu) {
                case 1 :
                do {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4) {
                        System.out.println("Baris tidak valid");
                    } else if (kolom < 1 || kolom > 2) {
                        System.out.println("Kolom tidak valid");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                } while (next.equalsIgnoreCase("y")) ;
                    break;

                case 2 :
                    System.out.println("-------------------");
                    System.out.println(  "Daftar Penonton");
                    System.out.println("-------------------");
                    for (int i = 0; i < penonton.length; i++) {
                        for(int j = 0; j < penonton[i].length; j++) {
                                System.out.println(penonton[i][j]);
                        }
                    }
                    break;

                case 3 :
                    System.out.println("Log out");
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}