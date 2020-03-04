
package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Angajati extends javax.swing.JPanel {

 
    public Angajati() {
        initComponents();
        tc_load();
        
    }
    
    public void tc_load(){
        try {
            DefaultTableModel dt = (DefaultTableModel) tabel_clienti.getModel();
            dt.setRowCount(0);
            
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM angajati");
            
            
            while (rs.next()) {  
                Vector v = new Vector();
                
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                dt.addRow(v);

            }
        } catch (SQLException e) {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        c_cautare = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        c_name = new javax.swing.JLabel();
        c_numartp = new javax.swing.JLabel();
        c_nume = new javax.swing.JTextField();
        c_tp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_clienti = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cautare_tabel = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Info Angajat:");

        c_cautare.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        c_cautare.setText("0");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Cautare ID:");

        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiune/img/search x30.png"))); // NOI18N
        jButton4.setText("Cautare");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(c_cautare, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_cautare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        c_name.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        c_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        c_name.setText("Nume:");

        c_numartp.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        c_numartp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        c_numartp.setText("Telefon:");

        c_nume.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        c_nume.setText("0");

        c_tp.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        c_tp.setText("0");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiune/img/save.png"))); // NOI18N
        jButton1.setText("Salveaza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiune/img/update.png"))); // NOI18N
        jButton2.setText("Actualizare");
        jButton2.setActionCommand("Cautare");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiune/img/remove.png"))); // NOI18N
        jButton3.setText("Sterge");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c_numartp, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_tp, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(c_nume))
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_name)
                    .addComponent(c_nume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_numartp))
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabel_clienti.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nume", "Telefon"
            }
        ));
        tabel_clienti.setShowGrid(false);
        tabel_clienti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_clientiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_clienti);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Cautare:");

        cautare_tabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cautare_tabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cautare_tabelKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cautare_tabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cautare_tabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //adaugare
        String nume = c_nume.getText();
        String tp = c_tp.getText();
        
        try {
            Statement a = db.mycon().createStatement();
            ResultSet rs = a.executeQuery("SELECT * FROM angajati WHERE nume_a='"+nume+"' AND tel_a='"+tp+"' ");
            if(!rs.next()){
            a.executeUpdate("INSERT INTO angajati (nume_a,tel_a) VALUES ('"+nume+"','"+tp+"')");
            JOptionPane.showMessageDialog(null, "Angajat adaugat");
            }
            else { JOptionPane.showMessageDialog(null, "Angajatul exista deja in baza de date!"); }
        } catch (SQLException e) {
            System.out.println(e);
        }
                    tc_load();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // functie cautare
        String cautare = c_cautare.getText();
        
        try {
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM angajati WHERE aid = '"+cautare+"'");
            
            
            if (rs.next()) {
                c_nume.setText(rs.getString("nume_a"));
                c_tp.setText(rs.getString("tel_a"));
            }
            else{
                JOptionPane.showMessageDialog(null, "Nu exista acest id");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        

        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //actualizare
        String nume = c_nume.getText();
        String tel = c_tp.getText();
        String id = c_cautare.getText();
        
        try {
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" UPDATE angajati SET nume_a='"+nume+"',tel_a='"+tel+"' WHERE aid='"+id+"' ");
            JOptionPane.showMessageDialog(null, "Date actualizate");
        } catch (SQLException e) {
            System.out.println(e);
        }
            tc_load();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //sterge
        String cautare = c_cautare.getText();
        
        try {
            Statement s = db.mycon().createStatement();
            s.executeUpdate(" DELETE FROM angajati WHERE aid='"+cautare+"' ");
            JOptionPane.showMessageDialog(null, "Angajat sters");
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        tc_load();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabel_clientiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_clientiMouseClicked
        //mouse click
        int r = tabel_clienti.getSelectedRow();
        String id = tabel_clienti.getValueAt(r, 0).toString();
        String nume = tabel_clienti.getValueAt(r, 1).toString();
        String tel = tabel_clienti.getValueAt(r, 2).toString();
        
        c_cautare.setText(id);
        c_nume.setText(nume);
        c_tp.setText(tel);

    }//GEN-LAST:event_tabel_clientiMouseClicked

    private void cautare_tabelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cautare_tabelKeyReleased
        //cautare tabel
        String cautareTabel = cautare_tabel.getText();
        
        try {
            DefaultTableModel dt = (DefaultTableModel) tabel_clienti.getModel();
            dt.setRowCount(0);
            Statement s = db.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM angajati WHERE nume_a LIKE '%"+cautareTabel+"%' ");
            
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                dt.addRow(v);

            }
            
            
            
        } catch (SQLException e) {
            tc_load();
        }

    }//GEN-LAST:event_cautare_tabelKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c_cautare;
    private javax.swing.JLabel c_name;
    private javax.swing.JLabel c_numartp;
    private javax.swing.JTextField c_nume;
    private javax.swing.JTextField c_tp;
    private javax.swing.JTextField cautare_tabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_clienti;
    // End of variables declaration//GEN-END:variables
}
