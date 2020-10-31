/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan29warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author M Hongki Alfikram
 * Kelas : IF10-K
 * NIM :10119915 */
public class PBO1010119915Latihan29Warna {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {   
        
        Scanner input = new Scanner(System.in);
        
        String warna, nama;
        String normal = "\u001b[0m";
        String merah = "\u001b[31m";
        String bmerah = "\u001b[41m";
        String hijau = "\u001b[32m";
        String bhijau = "\u001b[42m";
        String kuning = "\u001b[33m";
        String bkuning = "\u001b[43m";
        String birumuda = "\u001b[36m";
        String ungu = "\u001b[35m";
        String bungu = "\u001b[45m";
        String biru = "\u001b[34m";
        String bbiru = "\u001b[44m";
        String putih = "\u001b[37m";
        
        System.out.println(hijau+ "YUK " + ungu + "CEK " + birumuda + "KEPRIBADIAN " + merah + "DARI " + kuning+ "WARNA " + biru + "FAVORITMU" + normal);
        System.out.print("\n");
        System.out.println(bmerah + putih + "         MERAH        " + normal);
        System.out.println(bhijau + putih + "         HIJAU        " + normal);
        System.out.println(bkuning + putih + "         KUNING       " + normal);
        System.out.println(bbiru + putih + "         BIRU         " + normal);
        System.out.println(bungu + putih + "         UNGU         " + normal);
        System.out.print("\n");
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = input.next();
        warna = warna.toUpperCase();
        System.out.print("NAMA KAMU : ");
        nama = input.next();
        nama = nama.toUpperCase();
        
        System.out.print("\n");
        
        if(warna.equals("MERAH"))
            {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Warna Favoritmu adalah " + merah + warna + normal);
            System.out.println("1. Antagonis,");
            System.out.println("2. Pemberani,");
            System.out.println("3. Sombong,");
            System.out.println("4. Tidak Punya Rasa Takut,");
            System.out.println("5. Bukan Orang Penyabar,");
            System.out.println("6. Emosional,");
            System.out.println("7. Terlalu Ambisius .");
            }
        else if(warna.equals("HIJAU"))
            {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Warna Favoritmu adalah " + hijau + warna + normal);
            System.out.println("1. Tenang,");
            System.out.println("2. Santai,");
            System.out.println("3. Otak dingiin,");
            System.out.println("4. Rama,");
            System.out.println("5. Sopan,");
            System.out.println("6. Membawa Kedamaian,");
            System.out.println("7. Tidak Emosional.");
            }
        else if(warna.equals("KUNING"))
            {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Warna Favoritmu adalah " + kuning + warna + normal);
            System.out.println("1. Optimis,");
            System.out.println("2. Suka bergaul,");
            System.out.println("3. Mudah Beradaptasi Sama Lingkungan,");
            System.out.println("4. Senang menolong,");
            System.out.println("5. Lincah dan aktif,");
            System.out.println("6. Tidak suka meremehkan orang lain,");
            System.out.println("7. Loyal,");
            System.out.println("8. Rendah Hati,");
            System.out.println("9. Cenderung penakut.");
            }
        else if(warna.equals("BIRU"))
            {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Warna Favoritmu adalah " + biru + warna + normal);
            System.out.println("1. Menyenangkan,");
            System.out.println("2. Bijaksana,");
            System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
            System.out.println("4. Dinasmis,");
            System.out.println("5. Senang berbagi,");
            System.out.println("6. Mudah Bergaul,");
            System.out.println("7. Tidak Mudah Emosi,");
            }
        else if(warna.equals("UNGU"))
            {
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Warna Favoritmu adalah " + ungu + warna + normal);
            System.out.println("1. Gampang Selingkuh,");
            System.out.println("2. Tidak pernah ragu,");
            System.out.println("3. Orang Misterius,");
            System.out.println("4. Genit,");
            System.out.println("5. Centil,");
            System.out.println("6. Tidak Suka Ditebak,");
            System.out.println("7. Tidak Menyenangkan,");
            System.out.println("8. Tidak Mudah Melupakan Sesuatu,");
            }
        else
            System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
            System.out.println("Oops.. Belum terindentifikasi");
    
    }
    
    
}