import java.util.Scanner;

// @author Ahmad Kamil Almasyhur (@145150200111170)
public class SoalC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputan = input.next();
        String angka = inputan.replaceAll("\\p{Alpha}", "0");
        if (angka.length()== 6) {
            ubah(inputan);
        } else {
            System.out.println(-1);
        }
    }

    public static void ubah(String a) {
        int hasil[] = new int[6];
        for (int i = 0; i < 6; i++) {
            int h_ubah = (Integer.parseInt(String.valueOf(a.charAt(i))) + 7) % 10;
            hasil[i] = h_ubah;
        }
        int hasil2[] = new int[6];
        hasil2[0] = hasil[5];//d1
        hasil2[1] = hasil[3];//d2
        hasil2[2] = hasil[4];//d3
        hasil2[3] = hasil[1];//d4
        hasil2[4] = hasil[2];//d5
        hasil2[5] = hasil[0];//d6
        int hasil_rev [] = new int [6];
        int k = 5;
        for (int i = 0; i < 6; i++) {
            hasil_rev[k--] = hasil2[i];
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(hasil_rev[i]);
        }
	   System.out.println();
    }

}
