/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.databukucontroller;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author BIMA
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    databukucontroller dc;
    public MainView() {
        initComponents();
        dc = new databukucontroller(this);
        dc.isitabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataBuku = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTxtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTxtjudulbuku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTxtgenrebuku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTxtpenulisbuku = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTxtpenerbitbuku = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTxtlokasibuku = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTxtstockbuku = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        bttampildata = new javax.swing.JButton();
        btubah = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelDataBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(tabelDataBuku);

        jLabel1.setText("ID");

        JTxtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtidActionPerformed(evt);
            }
        });

        jLabel2.setText("judul buku");

        jLabel3.setText("genre buku");

        jLabel4.setText("penulis buku");

        JTxtpenulisbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtpenulisbukuActionPerformed(evt);
            }
        });

        jLabel5.setText("penerbit buku");

        jLabel6.setText("lokasi buku");

        jLabel7.setText("stock buku");

        btntambah.setText("tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        bttampildata.setText("tampil data");

        btubah.setText("ubah");

        bthapus.setText("hapus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addComponent(JTxtid, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTxtpenerbitbuku)
                            .addComponent(JTxtpenulisbuku)
                            .addComponent(JTxtgenrebuku)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTxtjudulbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTxtstockbuku)
                            .addComponent(JTxtlokasibuku))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btntambah)
                        .addGap(18, 18, 18)
                        .addComponent(bttampildata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btubah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bthapus)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JTxtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JTxtjudulbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTxtgenrebuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTxtpenulisbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTxtpenerbitbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JTxtlokasibuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTxtstockbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntambah)
                    .addComponent(bttampildata)
                    .addComponent(btubah)
                    .addComponent(bthapus))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTxtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtidActionPerformed

    private void JTxtpenulisbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtpenulisbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTxtpenulisbukuActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        dc.insert();
    }//GEN-LAST:event_btntambahActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTxtgenrebuku;
    private javax.swing.JTextField JTxtid;
    private javax.swing.JTextField JTxtjudulbuku;
    private javax.swing.JTextField JTxtlokasibuku;
    private javax.swing.JTextField JTxtpenerbitbuku;
    private javax.swing.JTextField JTxtpenulisbuku;
    private javax.swing.JTextField JTxtstockbuku;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton bttampildata;
    private javax.swing.JButton btubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDataBuku;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelDataBuku() {
        return tabelDataBuku;
    }

    public void setTabelDataBuku(JTable tabelDataBuku) {
        this.tabelDataBuku = tabelDataBuku;
    }

    public JTextField getJTxtgenrebuku() {
        return JTxtgenrebuku;
    }

    public void setJTxtgenrebuku(JTextField JTxtgenrebuku) {
        this.JTxtgenrebuku = JTxtgenrebuku;
    }

    public JTextField getJTxtid() {
        return JTxtid;
    }

    public void setJTxtid(JTextField JTxtid) {
        this.JTxtid = JTxtid;
    }

    public JTextField getJTxtjudulbuku() {
        return JTxtjudulbuku;
    }

    public void setJTxtjudulbuku(JTextField JTxtjudulbuku) {
        this.JTxtjudulbuku = JTxtjudulbuku;
    }

    public JTextField getJTxtlokasibuku() {
        return JTxtlokasibuku;
    }

    public void setJTxtlokasibuku(JTextField JTxtlokasibuku) {
        this.JTxtlokasibuku = JTxtlokasibuku;
    }

    public JTextField getJTxtpenerbitbuku() {
        return JTxtpenerbitbuku;
    }

    public void setJTxtpenerbitbuku(JTextField JTxtpenerbitbuku) {
        this.JTxtpenerbitbuku = JTxtpenerbitbuku;
    }

    public JTextField getJTxtpenulisbuku() {
        return JTxtpenulisbuku;
    }

    public void setJTxtpenulisbuku(JTextField JTxtpenulisbuku) {
        this.JTxtpenulisbuku = JTxtpenulisbuku;
    }

    public JTextField getJTxtstockbuku() {
        return JTxtstockbuku;
    }

    public void setJTxtstockbuku(JTextField JTxtstockbuku) {
        this.JTxtstockbuku = JTxtstockbuku;
    }

    
    
}


