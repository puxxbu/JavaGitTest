/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd7_b_10606;

/**
 * Nama : Benidiktus Valerino Gozen
 * NPM : 200710606
 */
public class Dokter<X,Y> {
    private X namaDokter;
    private Y gaji;
    private X spesialisasi;

    public Dokter(X namaDokter, Y gaji, X spesialisasi) {
        this.namaDokter = namaDokter;
        this.gaji = gaji;
        this.spesialisasi = spesialisasi;
    }
    
    public void tampilDokter(){
        System.out.println("\tNama : "+namaDokter);
        System.out.println("\tGaji : "+gaji);
        System.out.println("\tSpesialisasi : "+spesialisasi);
    }
}
