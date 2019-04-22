
package tugaspbo;

import java.util.Scanner;

public class Manusia {
    Scanner baca = new Scanner(System.in);
    
String nama, Alamat,hb;
int telepon;
    void identitas(){
        System.out.print("Nama :");
        nama = baca.next();
        System.out.print("Alamat :");
        Alamat = baca.next();
        System.out.print("Telepon :");
        telepon = baca.nextInt();
    }
    protected void hobby(){
        System.out.print("Hobby :");
        hb= baca.next();
    }
}    

