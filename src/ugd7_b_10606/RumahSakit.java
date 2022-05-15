/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd7_b_10606;

import java.util.ArrayList;
import java.util.List;

/**
 * Nama : Benidiktus Valerino Gozen
 * NPM : 200710606
 */
public class RumahSakit<X> {
    private String namaRumahSakit;
    private List<X> daftar;

    public RumahSakit(String namaRumahSakit) {
        this.namaRumahSakit = namaRumahSakit;
        daftar = new ArrayList<>();
    }
    
    public void tambah(X part){
        daftar.add(part);
    }
    
    public String getNamaRumahSakit(){
        return namaRumahSakit;
    }
    
    public List<X> getDaftar(){
        return daftar;
    }
    
    
    
    
}
