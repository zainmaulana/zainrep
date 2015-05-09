/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinchange;

import java.util.Scanner;

/**
 *
 * @author Zain
 */
public class Coinchange {

    static int uang;
    static int [] coin = {500,200,100};
    static int jumlah;
    
    public static void main(String[] args) {
        
    Scanner kb = new Scanner(System.in);
    
        System.out.print("Masukkan uang = ");
        uang = kb.nextInt();
        
        if (uang <= 2000) {
            for (int i = 0; i < coin.length; i++) {
            if(coin[i]<=uang){
                jumlah = uang/coin[i];
                    System.out.println(jumlah + " x " + coin[i] + " Rupiah");
                        uang = uang - (jumlah * coin[i]);
                        if(uang < 100){
                            System.out.println("Uang yang disumbangkan : " + uang + " Rupiah");
                        }
            }
        }
    }
        else {
            System.out.println("Tidak Pakai Kembalian Receh");
        }
    }
        
    
}
