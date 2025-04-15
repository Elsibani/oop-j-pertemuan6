package pertemuan6;

import java.util.Scanner;

/**
 *
 * @elsibani
 * TGL: 15 April 2025
 */
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VolumeBalok vb = new VolumeBalok();
        Scanner inp = new Scanner (System.in);
        
        System.out.println("Hitung Volume Balok");
        System.out.print("Nilai Panjang: ");
        vb.setPanjang(inp.nextInt());
        System .out.print("Nilai Lebar: ");
        vb.setlebar(inp.nextInt());
        System .out.print("Nilai Lebar: ");
        vb.settinggi(inp.nextInt ());
        System .out.print("Nilai Volumenya: ");
        System.out.print("V= P * L * T");
        System.out.printf (" = %d * %d * %d\n", vb.getpanjang(),vb.getlebar(),vb.gettinggi());
        System.out.printf(" =%d",vb.valume());
        
      
    }
  
        }
    
    