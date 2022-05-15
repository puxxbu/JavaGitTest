/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd7_b_10606;

/**
 * Nama : Benidiktus Valerino Gozen
 * NPM : 200710606
 */
public class Pasien<T> {
    private T namaPasien,golonganDarah;

    public Pasien(T namaPasien, T golonganDarah) {
        this.namaPasien = namaPasien;
        this.golonganDarah = golonganDarah;
    }
    
    public void tampilPasien(){
        System.out.println("\tNama Pasien : "+namaPasien);
        System.out.println("\tGolongan Darah : "+golonganDarah);
    }
}
