/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis1;
import lomba.animasi;
/**
 *
 * @author ASUS
 */
public class HitungAnimasi implements animasi {
    double a,k,anim,s;
    String keterangan;
    double hasil;
    
    public HitungAnimasi(double alur, double konten, double kreatif1, double cinema) {
        this.a = alur;
        this.k = konten;
        this.anim = kreatif1;
        this.s = cinema;
    }
    
     @Override
    public double alur() {
        a = a*0.15;
        return a;
    }

    @Override
    public double konten() {
        k = k*0.35;
        return k;
    }

    @Override
    public double kreatif() {
        anim = anim*0.35;
        return anim;
    }

    @Override
    public double cinema() {
        s = s*0.15;
        return s;
    }

    @Override
    public double hasil() {
        hasil = alur()+ konten()+ kreatif()+ cinema();
        return hasil;
    }   
    
 
}
