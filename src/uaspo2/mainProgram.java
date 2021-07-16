/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspo2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author ASUS
 baya*/
public class mainProgram extends JFrame implements ActionListener{
    int count = 0;
    cekSaldo cs = new cekSaldo();
    JPanel form = new JPanel();
    JTextField id = new JTextField();
    JTextField harga = new JTextField();
    JTextField nama = new JTextField();
    JTextField tbayar = new JTextField();
    JTextArea alamat = new JTextArea();
    JCheckBox pilihan = new JCheckBox();
    JCheckBox pilihan1 = new JCheckBox();
    JCheckBox pilihan2 = new JCheckBox();
    JCheckBox pilihan3 = new JCheckBox();
    JCheckBox pilihan4 = new JCheckBox();
    JLabel jnama = new JLabel("Masukan Nama :");
    JLabel stasiun = new JLabel("Pilih Tujuan Stasiun : ");
    JLabel lalamat = new JLabel("Masukan Alamat : ");
    JLabel lharga = new JLabel("Harga Ticket : ");
    JLabel jbayar = new JLabel("Jumlah Bayar : ");
    JLabel stasiun1 = new JLabel("Stasiun 1 ");
    JLabel stasiun2 = new JLabel("Stasiun 2 ");
    JLabel stasiun3 = new JLabel("Stasiun 3 ");
    JLabel stasiun4 = new JLabel("Stasiun 4 ");
    JLabel stasiun5 = new JLabel("Stasiun 5 ");    
    JButton bayar = new JButton("Bayar");
    
    
    mainProgram(){
        jfram();
        setForm();
    }
    
    
   
    public void setForm(){
        harga.setEnabled(false);
        bayar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });
        
       pilihan.addActionListener(this);
       pilihan1.addActionListener(this);
       pilihan2.addActionListener(this);
       pilihan3.addActionListener(this);
       pilihan4.addActionListener(this);
       bayar.addMouseListener(new MouseListener(){
           @Override
           public void mouseClicked(MouseEvent e){
               if(harga.getText().equalsIgnoreCase("") || tbayar.getText().equalsIgnoreCase("")){
                   JOptionPane.showMessageDialog(null, "Mohon Input harga dan uang bayar terlebih dahulu !");
               }else{
                    String regex = "\\d*";
                    if(!Pattern.matches(regex, tbayar.getText())){
                        JOptionPane.showMessageDialog(null, "Mohon Masukan Angka untuk kolom bayar ! !");
                    }else{
                        int b = Integer.parseInt(tbayar.getText());
                        int h = Integer.parseInt(harga.getText());
                        int hasil;
                        if(b<h){
                            hasil = h-b;
                            JOptionPane.showMessageDialog(null, "Maaf Uang Anda Tidak Mencukupi \n uang anda kurang sebesar : " + hasil);
                        }else if(b==h){
                            hasil = b-h;
                            JOptionPane.showMessageDialog(null, "Uang Anda Pas !");
                            cetakLaporan cl = new cetakLaporan(nama.getText(),alamat.getText(),harga.getText(),tbayar.getText(),String.valueOf(hasil));
                            
                        }else{
                            hasil = b-h;
                            JOptionPane.showMessageDialog(null, "Berhasil Membeli Ticket ! \n Silahkan ambil kembalian sebesar : " + hasil);                            
                            cetakLaporan cl = new cetakLaporan(nama.getText(),alamat.getText(),harga.getText(),tbayar.getText(),String.valueOf(hasil));
                        }
                    }

                   
               }
             
           }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
       });
       

    }  
    
    
    public void jfram(){
        setPreferredSize(setDimensi(500,500));
        setTitle("Tiket Kereta");
        panel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        add(form);
        pack();
        setVisible(true);
    }
    public void panel(){

        
        form.setLayout(null);
        
        form.setPreferredSize(setDimensi(this.getWidth(),this.getHeight()));
        form.add(nama);
        form.add(pilihan);
        form.add(pilihan1);
        form.add(pilihan2);        
        form.add(pilihan3);
        form.add(pilihan4);
        form.add(alamat);
        form.add(harga);
        form.add(tbayar);
        
        form.add(jnama);
        form.add(stasiun);
        form.add(stasiun1);
        form.add(stasiun2);
        form.add(stasiun3);
        form.add(stasiun4);
        form.add(stasiun5);
        form.add(lalamat);
        form.add(lharga);
        form.add(jbayar);
        
        form.add(bayar);
        
        //setBounds
        nama.setBounds(190,50,200,30);
        pilihan.setBounds(190,100,20,30);
        pilihan1.setBounds(190,150,20,30);
        pilihan2.setBounds(190,200,20,30);
        pilihan3.setBounds(300,100,20,30);
        pilihan4.setBounds(300,150,20,30);
        stasiun1.setBounds(220,100,100,30);
        stasiun2.setBounds(220,150,100,30);
        stasiun3.setBounds(220,200,100,30);
        stasiun4.setBounds(320,100,100,30);
        stasiun5.setBounds(320,150,100,30);

        alamat.setBounds(190,250,200,50);
        harga.setBounds(190,310,200,30);
        tbayar.setBounds(190,360,200,30);
        
        
        jnama.setBounds(50,50,200,30);
        stasiun.setBounds(50,100,200,30);   
        lalamat.setBounds(50,250,200,30);
        lharga.setBounds(50,310,200,30);        
        jbayar.setBounds(50,360,200,30);
        
        bayar.setBounds(190,400,200,40);


        harga.setForeground(Color.black);
        harga.setText("0");
        harga.setFont(new Font("Segoe UI",Font.BOLD,20));
        bayar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        pilihan.setText("Stasiun 1");
        pilihan1.setText("Stasiun 2");
        pilihan2.setText("Stasiun 3");
        pilihan3.setText("Stasiun 4");
        pilihan4.setText("Stasiun 5");
        form.setVisible(true);
    }
    
    public Dimension setDimensi(int a, int b){
        Dimension z = new Dimension(a,b);
        return z;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainProgram mp = new mainProgram();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int hargaTotal = Integer.parseInt(harga.getText());
        if(e.getSource() == pilihan  || e.getSource() == pilihan1  || e.getSource() == pilihan2  || e.getSource() == pilihan3  || e.getSource() == pilihan4){
            if(count<3){
                
                if(e.getSource() == pilihan && !pilihan.isSelected()){
                    hargaTotal = hargaTotal - cs.updateHarga("Stasiun 1");
                    harga.setText(String.valueOf(hargaTotal));   
                    count--;
                }else if(e.getSource() == pilihan1 && !pilihan1.isSelected()){
                    hargaTotal = hargaTotal - cs.updateHarga("Stasiun 2");
                    harga.setText(String.valueOf(hargaTotal));   
                    count--;
                }else if(e.getSource() == pilihan2 && !pilihan2.isSelected()){
                    hargaTotal = hargaTotal - cs.updateHarga("Stasiun 3");
                    harga.setText(String.valueOf(hargaTotal));   
                    count--;
                }else if(e.getSource() == pilihan3 && !pilihan3.isSelected()){
                    hargaTotal = hargaTotal - cs.updateHarga("Stasiun 4");
                    harga.setText(String.valueOf(hargaTotal));   
                    count--;
                }else if(e.getSource() == pilihan4 && !pilihan4.isSelected()){
                    hargaTotal = hargaTotal - cs.updateHarga("Stasiun 5");
                    harga.setText(String.valueOf(hargaTotal));   
                    count--;
                }else{
                    count++;
                    if(e.getSource() == pilihan){
                       hargaTotal = hargaTotal + cs.updateHarga("Stasiun 1");
                       harga.setText(String.valueOf(hargaTotal));                        
                    }else if(e.getSource() == pilihan1){
                       hargaTotal = hargaTotal + cs.updateHarga("Stasiun 2");
                       harga.setText(String.valueOf(hargaTotal));
                    }else if(e.getSource() == pilihan2){
                       hargaTotal = hargaTotal + cs.updateHarga("Stasiun 3");
                       harga.setText(String.valueOf(hargaTotal));
                    }else if(e.getSource() == pilihan3){
                       hargaTotal = hargaTotal + cs.updateHarga("Stasiun 4");
                       harga.setText(String.valueOf(hargaTotal));
                    }else if(e.getSource() == pilihan4){
                       hargaTotal = hargaTotal + cs.updateHarga("Stasiun 5");
                       harga.setText(String.valueOf(hargaTotal));
                    }
                }
            }else{
                if(e.getSource() == pilihan && !pilihan.isSelected()){
                    hargaTotal = hargaTotal - cs.updateHarga("Stasiun 1");
                    harga.setText(String.valueOf(hargaTotal));
                    count--;
                }else if(e.getSource() == pilihan1 && !pilihan1.isSelected()){
                    hargaTotal = hargaTotal - cs.updateHarga("Stasiun 2");
                    harga.setText(String.valueOf(hargaTotal));
                    count--;
                }else if(e.getSource() == pilihan2 && !pilihan2.isSelected()){
                    hargaTotal = hargaTotal - cs.updateHarga("Stasiun 3");
                    harga.setText(String.valueOf(hargaTotal));
                    count--;
                }else if(e.getSource() == pilihan3 && !pilihan3.isSelected()){
                    hargaTotal = hargaTotal - cs.updateHarga("Stasiun 4");
                    harga.setText(String.valueOf(hargaTotal));
                    count--;
                }else if(e.getSource() == pilihan4 && !pilihan4.isSelected()){
                    hargaTotal = hargaTotal - cs.updateHarga("Stasiun 5");
                    harga.setText(String.valueOf(hargaTotal));
                    count--;
                }else{
                    JOptionPane.showMessageDialog(null, "Maaf Tidak Bisa memilih lebih dari 3 stasiun");
                    if(e.getSource() == pilihan){
                        pilihan.setSelected(false);
                    }else if(e.getSource() == pilihan1){
                        pilihan1.setSelected(false);
                    }else if(e.getSource() == pilihan2){
                        pilihan2.setSelected(false);
                    }else if(e.getSource() == pilihan3){
                        pilihan3.setSelected(false);
                    }else if(e.getSource() == pilihan4){
                        pilihan4.setSelected(false);
                    }
                }
                    
            }
        }

    }
    
}
