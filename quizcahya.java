/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cahya;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author cahya
 */
public class karyawan {
    String idk, nama, jabatan;
    double gaji_pokok;
    
    double getGajiPokok (){
        if (null == jabatan) {
            gaji_pokok = 4000000;
        }else switch (jabatan) {
            case "hrd":
                gaji_pokok = 6000000;
                break;
            case "marketing":
                gaji_pokok = 4300000;
                break;
             case "staff":
                gaji_pokok = 4200000;
                break;
              case "programmer":
                gaji_pokok = 10000000;
                break;
            default:
                gaji_pokok = 4000000;
                break;
        }
        return gaji_pokok;
    }
    
    
    void cetak () {
        DecimalFormat df = new DecimalFormat ("##0,000");
        
         System.out.println("------ Detil  Karyawan ------");
        System.out.println("ID Karyawan : "+ this.idk);
        System.out.println("Nama        : "+ this.nama);
        System.out.println("Jabatan     : "+ this.jabatan);
        System.out.println("Gaji Pokok  : Rp."+ df.format(getGajiPokok()));
        System.out.println("Uang Makan  : Rp.25,000 ");
       
    }
               
    }


class MainKaryawan {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        karyawan k = new karyawan();
        
        System.out.print ("ID Karyawan: ");
        k.idk = sc.next();
        
         System.out.print ("Nama: ");
        k.nama = sc.next();
        
         System.out.print ("Jabatan: ");
        k.jabatan = sc.next();
        
k.cetak();
        
        
    }
}
    

