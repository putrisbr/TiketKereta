/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspo2;

import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class cetakLaporan extends JDialog{

    cetakLaporan(String vnama, String valamat ,String vharga , String vbayar,String vkembalian){
        tampilan();
        nama.setText(vnama);
        alamat.setText(valamat);
        harga.setText(vharga);
        bayar.setText(vbayar);
        kembalian.setText(vkembalian);
    }
    
    public void tampilan(){
        panel();
        this.setTitle("Print Laporan");
        Dimension screen = new Dimension(500,500);
        this.setPreferredSize(screen);
        this.add(pane);
        pack();
        this.setVisible(true);
    }
    
    public void panel(){
        pane.setLayout(null);
        
        pane.add(lnama);
        pane.add(lalamat);
        pane.add(lharga);
        pane.add(lbayar);
        pane.add(lkembalian);

        pane.add(nama);
        pane.add(alamat);
        pane.add(harga);
        pane.add(bayar);
        pane.add(kembalian);

        pane.add(a);
        pane.add(b);
        pane.add(c);
        pane.add(d);
        pane.add(e);
        pane.add(f);
        
        
        lnama.setBounds(10,50,200,30);
        lalamat.setBounds(10,100,200,30);
        lharga.setBounds(10,150,200,30);
        lbayar.setBounds(10,200,200,30);
        lkembalian.setBounds(10,250,200,30);

        a.setBounds(100,50,200,30);
        b.setBounds(100,100,200,30);
        c.setBounds(100,150,200,30);
        d.setBounds(100,200,200,30);
        e.setBounds(100,250,200,30);
        
        nama.setBounds(110,50,200,30);
        alamat.setBounds(110,100,200,30);
        harga.setBounds(110,150,200,30);
        bayar.setBounds(110,200,200,30);
        kembalian.setBounds(110,250,200,30);
    }
    

    JPanel pane = new JPanel();
    JLabel lnama = new JLabel("Nama");
    JLabel lalamat = new JLabel("Alamat");
    JLabel ltujuan = new JLabel("Tujuan");
    JLabel lharga = new JLabel("Harga");
    JLabel lbayar = new JLabel("Bayar");
    JLabel lkembalian = new JLabel("Kembalian");
    
    JLabel a = new JLabel(":");
    JLabel b = new JLabel(":");
    JLabel c = new JLabel(":");
    JLabel d = new JLabel(":");
    JLabel e = new JLabel(":");
    JLabel f = new JLabel(":");
    
    JLabel nama = new JLabel();
    JLabel alamat = new JLabel();
    JLabel harga = new JLabel();
    JLabel bayar = new JLabel();
    JLabel kembalian = new JLabel();
}
