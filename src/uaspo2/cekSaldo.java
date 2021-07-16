/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspo2;

/**
 *
 * @author ASUS
 */
public class cekSaldo {
    private int uang;
    private int stat;
    
    public int cekSaldo(int uang,int harga){
        if(uang <= harga){
            this.stat = -1;
        }else if(uang == harga){
            this.stat = 0;
        }else{
            this.stat = 1;
        }
       return stat;
    }
    
   public int updateHarga(String pilihan){
       int harga = 0;
       if(pilihan.equalsIgnoreCase("Stasiun 1")){
           harga = 1000;           
       }else if(pilihan.equalsIgnoreCase("Stasiun 2")){
           harga = 2000;           
       }else if(pilihan.equalsIgnoreCase("Stasiun 3")){
           harga = 3000;           
       }else if(pilihan.equalsIgnoreCase("Stasiun 4")){
           harga = 4000;
       }else if(pilihan.equalsIgnoreCase("Stasiun 5")){
           harga = 5000;
       }else{
           harga = 0;
       }
       return harga;
   }
}
