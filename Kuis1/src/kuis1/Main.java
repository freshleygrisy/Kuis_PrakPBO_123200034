/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis1;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int pil;
        double alur, konten, kreatif1, cinema;
        double struktur, isi, kreatif2, bahasa;
        String nama,sekolah;
        System.out.println("--------------------------------------------");
        System.out.println("| Lomba Apresiasi Pahlawan Wanita Indonesia |");
        System.out.println("--------------------------------------------");
        System.out.println("| Input Kategori Lomba                      |");
        System.out.println("| 1. Animasi (Tim)                          |");
        System.out.println("| 2. Menulis Surat (Individu)               |");
        System.out.println("--------------------------------------------");
        System.out.print("Pilihan kategori : ");
        pil = keyboard.nextInt();
        
        if (pil == 1) {
            System.out.println(" --- Form Pendaftaran --- ");
            System.out.print("Masukan Nama   : ");
            nama = keyboard.next();
            
            System.out.print("Asal Sekolah   : ");
            sekolah = keyboard.next();
            do {
                System.out.println(" --- Form Penilaian --- ");
                System.out.println("Ket: Nilai dari 1-100");
                System.out.print("Nilai Alur Cerita   : ");
                alur = keyboard.nextDouble();
                System.out.print("Nilai Konten        : ");
                konten = keyboard.nextDouble();
                System.out.print("Nilai Kreativitas   : ");
                kreatif1 = keyboard.nextDouble();
                System.out.print("Nilai Sinematografi : ");
                cinema = keyboard.nextDouble();
            } while (alur > 100 || alur < 0 || konten > 100 || konten < 0 || kreatif1 < 0 || kreatif1 > 100 || cinema < 0 || cinema > 100);
            do {
                System.out.println(" --  Menu  -- ");
                System.out.println(" 1. Tampil ");
                System.out.println(" 2. Edit   ");
                System.out.println(" 3. Exit   ");
                System.out.print("menu : ");
                pil = keyboard.nextInt();
                if (pil == 1) {
                    double hasil;
                    HitungAnimasi pa;
                    pa = new HitungAnimasi (alur,konten,kreatif1,cinema);
                    hasil = pa.hasil();
                    System.out.println("Nilai Akhir : " + hasil);
                    if (hasil < 85) {
                        System.out.println("Keterangan : GAGAL");
                        System.out.println("MOHON MAAF " + nama + " dari sekolah " + sekolah + " TIDAK LULUS seleksi LOMBA ANIMASI!");
                    }
                    else if (hasil >= 85) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("SELAMAT! " + nama + " dari sekolah " + sekolah + "  LULUS seleksi LOMBA ANIMASI!");
                    }
                }
                else if (pil == 2) {
                    do {
                        System.out.println(" --- Form Penilaian --- ");
                        System.out.println("Ket: Nilai dari 1-100");
                        System.out.print("Nilai Alur Cerita   : ");
                        alur = keyboard.nextDouble();
                        System.out.print("Nilai Konten        : ");
                        konten = keyboard.nextDouble();
                        System.out.print("Nilai Kreativitas   : ");
                        kreatif1 = keyboard.nextDouble();
                        System.out.print("Nilai Sinematografi : ");
                        cinema = keyboard.nextDouble();
                    } while (alur > 100 || alur < 0 || konten > 100 || konten < 0 || kreatif1 > 100 || kreatif1 < 0 || cinema > 100 || cinema < 0);
                }
            } while (pil != 3);
            
        }
        
        else if (pil == 2) {
            System.out.println(" --- Form Pendaftaran ---");
            System.out.print("Masukan Nama   : ");
            nama = keyboard.next();
            System.out.print("Asal Sekolah   : ");
            sekolah = keyboard.next();
            
            do {
                System.out.println(" --- Form Penilaian --- ");
                System.out.println("Ket: Nilai dari 1-100");
                System.out.print("Nilai Struktur                : ");
                struktur = keyboard.nextDouble();
                System.out.print("Nilai Isi                     : ");
                isi = keyboard.nextDouble();
                System.out.print("Nilai Kreativitas             : ");
                kreatif2 = keyboard.nextDouble();
                System.out.print("Nilai Penerapan Kaidah Bahasa : ");
                bahasa = keyboard.nextDouble();
            } while (struktur > 100 || struktur < 0 || isi > 100 || isi < 0 ||  kreatif2 > 100 || kreatif2<0 || bahasa > 100|| bahasa < 0);
            
             do {
                System.out.println(" --  Menu  -- ");
                System.out.println(" 1. Tampil ");
                System.out.println(" 2. Edit   ");
                System.out.println(" 3. Exit   ");
                System.out.print("menu : ");
                pil = keyboard.nextInt();
                if (pil == 1) {
                    double hasil;
                    HitungSurat ps;
                    ps = new HitungSurat (struktur,isi,kreatif2,bahasa);
                    hasil = ps.hasil();
                    System.out.println("Nilai Akhir : " + hasil);
                    if (hasil < 85) {
                        System.out.println("Keterangan : GAGAL");
                        System.out.println("MOHON MAAF " + nama + " dari sekolah " + sekolah + " TIDAK LULUS seleksi LOMBA MENULIS SURAT!");
                    }
                    else if (hasil >= 85) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("SELAMAT! " + nama + " dari sekolah " + sekolah + " LULUS seleksi LOMBA MENULIS SURAT!");
                    }
                }
                else if (pil == 2) {
                    do {
                        System.out.println(" --- Form Penilaian --- ");
                        System.out.println("Ket: Nilai dari 1-100");
                        System.out.print("Nilai Struktur                : ");
                        struktur = keyboard.nextDouble();
                        System.out.print("Nilai Isi                     : ");
                        isi = keyboard.nextDouble();
                        System.out.print("Nilai Kreativitas             : ");
                        kreatif2 = keyboard.nextDouble();
                        System.out.print("Nilai Penerapan Kaidah Bahasa : ");
                        bahasa = keyboard.nextDouble();
                    } while (struktur > 100 || struktur < 0 || isi > 100 || isi < 0 ||  kreatif2 > 100 || kreatif2<0 || bahasa > 100|| bahasa < 0);
                 }
             }while (pil != 3);
        }
    }
}
