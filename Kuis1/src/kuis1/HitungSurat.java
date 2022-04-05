/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis1;
import lomba.menulissurat;
/**
 *
 * @author ASUS
 */
public class HitungSurat implements menulissurat {
    double struktur, isi, kreatif2, bahasa;
    double hasil;
    public HitungSurat (double struktur, double isi, double kreatif2, double bahasa) {
        this.struktur = struktur;
        this.isi = isi;
        this.kreatif2 = kreatif2;
        this.bahasa = bahasa;
    }
    
    @Override
    public double struktur() {
        struktur = (struktur*10)/100;
        return struktur;
    }

    @Override
    public double isi() {
        isi = (isi*40)/100;
        return isi;
    }

    @Override
    public double kreatif() {
        kreatif2 = (kreatif2*30)/100;
        return kreatif2;
    }

    @Override
    public double bahasa() {
        bahasa = (bahasa*20)/100;
        return bahasa;
    }

    public double hasil() {
        hasil = struktur() + isi() + kreatif() + bahasa();
        return hasil;
    }
    
}
