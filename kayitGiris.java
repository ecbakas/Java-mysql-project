/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalKargo;
import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Seda Demir
 */
public class kayitGiris extends javax.swing.JFrame {

    /**
     * Creates new form kayitGiris
     */
   

    public kayitGiris() {
        initComponents();
        Connection conn = null;
        PreparedStatement psmt = null;
        try {         
            conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
            ArrayList<String> groupNames = new ArrayList<>();
            String sorgu = "SELECT sAdi FROM sTable";
            psmt = conn.prepareStatement(sorgu);
            try (ResultSet rs = psmt.executeQuery(sorgu)) {
                while (rs.next()) {
                    String groupName = rs.getString("sAdi");
                    groupNames.add(groupName);
                }
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(groupNames.toArray());
            DefaultComboBoxModel model2 = new DefaultComboBoxModel(groupNames.toArray());
            gSubeBox.setModel(model);
            aSubeBox.setModel(model2);
            
        } catch (SQLException se) {
        } catch (Exception e) {
        }     
        
        try {         
            conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
            ArrayList<String> groupNames = new ArrayList<>();
            String sorgu = "SELECT dDurum FROM dTable";
            psmt = conn.prepareStatement(sorgu);
            try (ResultSet rs = psmt.executeQuery(sorgu)) {
                while (rs.next()) {
                    String groupName = rs.getString("dDurum");
                    groupNames.add(groupName);
                }
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(groupNames.toArray());
            dDurumBox.setModel(model);
            
        } catch (SQLException se) {
        } catch (Exception e) {

        }     
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gAdiTxt = new javax.swing.JTextField();
        gSoyadiTxt = new javax.swing.JTextField();
        gAdresTxt = new javax.swing.JTextField();
        gTelTxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        kayitgirBtn = new javax.swing.JButton();
        aSoyadiTxt = new javax.swing.JTextField();
        aAdresTxt = new javax.swing.JTextField();
        aTelTxt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        aAdiTxt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        kKiloTxt = new javax.swing.JTextField();
        gTarihTxt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tTarih = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        kNeredeTxt = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gSubeBox = new javax.swing.JComboBox<>();
        aSubeBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        dDurumBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("GÖNDERİCİ");
        jLabel1.setToolTipText("");

        jLabel2.setText("ALICI");

        jLabel3.setText("Adı:");
        jLabel3.setToolTipText("");

        jLabel4.setText("Soyad:");

        jLabel5.setText("Adres:");

        jLabel6.setText("Tel No:");

        gAdiTxt.setToolTipText("");
        gAdiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gAdiTxtActionPerformed(evt);
            }
        });

        gTelTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gTelTxtActionPerformed(evt);
            }
        });

        jLabel20.setText("KARGO");

        kayitgirBtn.setText("Kayıt Gir");
        kayitgirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitgirBtnActionPerformed(evt);
            }
        });

        aTelTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aTelTxtActionPerformed(evt);
            }
        });

        jLabel21.setText("Adı:");
        jLabel21.setToolTipText("");

        jLabel22.setText("Soyad:");

        jLabel23.setText("Adres:");

        jLabel24.setText("Tel No:");

        aAdiTxt.setToolTipText("");

        jLabel25.setText("Kilogram:");
        jLabel25.setToolTipText("");

        kKiloTxt.setToolTipText("");
        kKiloTxt.setActionCommand("<Not Set>");

        gTarihTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gTarihTxtActionPerformed(evt);
            }
        });

        jLabel27.setText("Teslim Tarihi:");

        jLabel7.setText("Tarih:");

        tTarih.setText("yyyy-mm-dd");

        jLabel28.setText("Nerede:");

        kNeredeTxt.setToolTipText("");
        kNeredeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kNeredeTxtActionPerformed(evt);
            }
        });

        jLabel29.setText("Durum:");

        jLabel8.setText("Şube:");

        gSubeBox.setMaximumRowCount(10);
        gSubeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gönderici Şube Seçiniz" }));
        gSubeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gSubeBoxActionPerformed(evt);
            }
        });

        aSubeBox.setMaximumRowCount(10);
        aSubeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alıcı Şube Seçiniz" }));
        aSubeBox.setToolTipText("");
        aSubeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aSubeBoxActionPerformed(evt);
            }
        });

        jLabel9.setText("Şube:");

        dDurumBox.setMaximumRowCount(10);
        dDurumBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Durum Seçiniz" }));
        dDurumBox.setToolTipText("");
        dDurumBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dDurumBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gSubeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(gTarihTxt))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(gAdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gSoyadiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gAdresTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(gTelTxt))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aSubeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kayitgirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aAdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aSoyadiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(aAdresTxt)
                                        .addComponent(aTelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addGap(102, 102, 102))
                            .addComponent(jLabel20)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kNeredeTxt)
                                    .addComponent(kKiloTxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dDurumBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTarih)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(gAdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(gSoyadiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(gAdresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(aAdiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(kKiloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(aSoyadiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(kNeredeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(aAdresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(dDurumBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aTelTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gTelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gTarihTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel27)
                            .addComponent(tTarih))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gSubeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(aSubeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(kayitgirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        gAdiTxt.getAccessibleContext().setAccessibleName("gonderenAd");
        gSoyadiTxt.getAccessibleContext().setAccessibleName("gonderenSoyad");
        gAdresTxt.getAccessibleContext().setAccessibleName("gondericiAdres");
        gTelTxt.getAccessibleContext().setAccessibleName("gonderenTel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gTelTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gTelTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gTelTxtActionPerformed

    private void kayitgirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitgirBtnActionPerformed
        teslimatTarihi tsl = new teslimatTarihi();    
        String tarhh=gTarihTxt.getText();        
        Date yTarih=Date.valueOf(tarhh); 
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");    
        tTarih.setText(tsl.yeniTarih(yTarih));
        Connection conn = null;
        PreparedStatement psmt = null;
        PreparedStatement psmt2 = null;
         PreparedStatement psmt3 = null;
        
        /* Gönderici kısmı tanımlamalar */
        String gAdi = gAdiTxt.getText();
        String gSoyadi = gSoyadiTxt.getText();
        String gAdres = gAdresTxt.getText();
        int gTel = Integer.parseInt(gTelTxt.getText());
        /* Alıcı kısmı tanımlamalar */
        String aAdi = aAdiTxt.getText();
        String aSoyadi = aSoyadiTxt.getText();
        String aAdres = aAdresTxt.getText();
        int aTel = Integer.parseInt(aTelTxt.getText());
        
        /* Kargo kısmı tanımlamalar */
        String gTarihi = gTarihTxt.getText();
        Date gTarihC=Date.valueOf(gTarihi);
        String kKilosu  = (kKiloTxt.getText());
        String kNerede = kNeredeTxt.getText();
        String kgSube = gSubeBox.getSelectedItem().toString();
        String kaSube = aSubeBox.getSelectedItem().toString();
        int kDurum = dDurumBox.getSelectedIndex()+1;
        MethodOverloading over = new MethodOverloading();//MethodOverloading sınıfından nesne oluşturma
        double x = Double.parseDouble(kKiloTxt.getText());  
        String kFiyati="Şuanlık Boş";
        
        //Girilen verinin türüne göre değişken gönderme.
        try {
              int y= Integer.parseInt(kKiloTxt.getText()); 
              kFiyati = Integer.toString(over.fiyat(y));
        }catch(NumberFormatException e) {
              kFiyati = Double.toString(over.fiyat(x));
        } 
        
        try {         
            conn = DriverManager.getConnection("jdbc:mysql://localhost/javadb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
            String gEkle = " insert into gTable (gAdi, gSoyadi, gAdres, gTel)" + " values (?, ?, ?, ?)";
            String aEkle = " insert into aTable (aAdi, aSoyadi, aAdres, aTel)" + " values (?, ?, ?, ?)";
            String kEkle = " insert into kTable (gTarih, tTarih, kKilo, kNerede, kgSube, kaSube, kDurumID,kFiyat)" + " values (?, ?, ?, ?, ?, ?, ?,?)";
            
            /* Gönderici tablo ekleme kısmı */
            psmt = conn.prepareStatement(gEkle);            
            psmt.setString (1, gAdi);
            psmt.setString (2, gSoyadi);
            psmt.setString (3, gAdres);
            psmt.setInt (4, gTel);
            psmt.executeUpdate(); 
            psmt.close();
            /* Alıcı tablo ekleme kısmı */
            psmt2 = conn.prepareStatement(aEkle);
            psmt2.setString (1, aAdi);
            psmt2.setString (2, aSoyadi);
            psmt2.setString (3, aAdres);
            psmt2.setInt (4, aTel);
            psmt2.executeUpdate(); 
            psmt2.close();
            /* Kargo tablo ekleme kısmı */
            psmt3 = conn.prepareStatement(kEkle);
            psmt3.setDate (1, gTarihC);
            psmt3.setDate (2, yTarih);
            psmt3.setString (3, kKilosu);
            psmt3.setString (4, kNerede);
            psmt3.setString (5, kgSube);
            psmt3.setString (6, kaSube);
            psmt3.setInt (7, kDurum);
            psmt3.setString (8, kFiyati);
            psmt3.executeUpdate();
            psmt3.close();
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Kayıt girme işlemi başarılı.");
            /* Bağlantı kapama */
            conn.close();
            
        } catch (SQLException | HeadlessException se) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Kayıt girme işlemi başarısız.");

        }     
    }//GEN-LAST:event_kayitgirBtnActionPerformed

    private void aTelTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aTelTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aTelTxtActionPerformed

    private void gAdiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gAdiTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gAdiTxtActionPerformed

    private void gTarihTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gTarihTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gTarihTxtActionPerformed

    private void gSubeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gSubeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gSubeBoxActionPerformed

    private void aSubeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aSubeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aSubeBoxActionPerformed

    private void dDurumBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dDurumBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dDurumBoxActionPerformed

    private void kNeredeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kNeredeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kNeredeTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kayitGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new kayitGiris().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aAdiTxt;
    private javax.swing.JTextField aAdresTxt;
    private javax.swing.JTextField aSoyadiTxt;
    private javax.swing.JComboBox<String> aSubeBox;
    private javax.swing.JTextField aTelTxt;
    private javax.swing.JComboBox<String> dDurumBox;
    private javax.swing.JTextField gAdiTxt;
    private javax.swing.JTextField gAdresTxt;
    private javax.swing.JTextField gSoyadiTxt;
    private javax.swing.JComboBox<String> gSubeBox;
    private javax.swing.JTextField gTarihTxt;
    private javax.swing.JTextField gTelTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kKiloTxt;
    private javax.swing.JTextField kNeredeTxt;
    private javax.swing.JButton kayitgirBtn;
    private javax.swing.JLabel tTarih;
    // End of variables declaration//GEN-END:variables
    
    private static class gonderenAd {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public gonderenAd() {
        }
    }
}
