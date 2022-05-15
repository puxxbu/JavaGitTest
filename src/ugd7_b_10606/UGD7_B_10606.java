/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd7_b_10606;

/**
 * Nama : Benidiktus Valerino Gozen
 * NPM : 200710606
 */
public class UGD7_B_10606 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RumahSakit<Dokter> RS1 = new RumahSakit<Dokter>("1 - Valerino - 10606");
        Dokter<String,Double> D1 = new Dokter<String,Double>("Pablo",4100000.0,"Jantung");
        Dokter<String,Double> D2 = new Dokter<String,Double>("Escobar",5100000.0,"Syaraf");
        
        RS1.tambah(D1);
        RS1.tambah(D2);
        
        RumahSakit<Pasien> RS2 = new RumahSakit<Pasien>("2 - Valerino - 10606");
        Pasien<String> P1 = new Pasien<String>("Nigel","AB");
        Pasien<String> P2 = new Pasien<String>("Giovanno","O");
        
        RS2.tambah(P1);
        RS2.tambah(P2);
        
        
        
        
        
        System.out.println("================================================");
        System.out.println("\tRumah Sakit "+RS1.getNamaRumahSakit());
        System.out.println("\n\t\t[Data Dokter]\n");
        for (int i = 0; i < RS1.getDaftar().size(); i++) {
            System.out.println("\t\t-Dokter "+(i+1)+"-");
            RS1.getDaftar().get(i).tampilDokter();
            System.out.println("");
        }
        System.out.println("================================================");
        System.out.println("\tRumah Sakit "+RS2.getNamaRumahSakit());
        System.out.println("\n\t\t[Data Pasien]\n");
        for (int i = 0; i < RS2.getDaftar().size(); i++) {
            System.out.println("\t\t-Pasien "+(i+1)+"-");
            RS2.getDaftar().get(i).tampilPasien();
            System.out.println("");
        }
        System.out.println("================================================");
       
        
        
    }
    
}
