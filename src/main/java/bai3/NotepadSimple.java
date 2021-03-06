/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author VanTT
 */
public class NotepadSimple extends javax.swing.JFrame {

    /**
     * Creates new form NotepadSimple
     */
    public NotepadSimple() {
        initComponents();
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
        taContent = new javax.swing.JTextArea();
        btWrite = new javax.swing.JButton();
        btRead = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notepad");

        taContent.setColumns(20);
        taContent.setRows(5);
        jScrollPane1.setViewportView(taContent);

        btWrite.setText("Write");
        btWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWriteActionPerformed(evt);
            }
        });

        btRead.setText("Read");
        btRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btWrite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRead)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btWrite)
                    .addComponent(btRead))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWriteActionPerformed
        // TODO add your handling code here:
        try {
            
            //B1: Tao doi tuong de thuc hien viec ghi du lieu vao file
            FileOutputStream fos = new FileOutputStream("notepad.txt");
            
            //B2: Thuc hien viec viec ghi du lieu vao file
            //Chuan bi du lieu
            String content = taContent.getText();
            byte []contentByte = content.getBytes();
            
            //goi phuong thuc write de luu du lieu vao file
            fos.write(contentByte);
            
            //lam sach du lieu sau khi ghi
            fos.flush();
            
            //B3: Dong doi tuong ghi file
            fos.close();
            JOptionPane.showMessageDialog(this, "Ban vua ghi thanh cong!");
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Qua trinh ghi bi loi!");
        }
        
    }//GEN-LAST:event_btWriteActionPerformed

    private void btReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadActionPerformed
        // TODO add your handling code here:
        
        try {
            
            //B1: 
            FileInputStream fis = new FileInputStream("notepad.txt");
            
            //B2:
            int c;
            String data = "";
            while(  (c = fis.read()) != -1 ){
                //System.out.print(c + " ");    
                data = data + String.valueOf((char)c);
            }
            
            taContent.setText(data);
            
            //B3:
            fis.close();
            JOptionPane.showMessageDialog(this, "Ban vua doc thanh cong!");
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Qua trinh doc bi loi!");
        }
        
    }//GEN-LAST:event_btReadActionPerformed

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
            java.util.logging.Logger.getLogger(NotepadSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadSimple().setVisible(true);
            }
        });
    }

    private void readCharacterData(){
    
    }
    
    private void writeCharacterData(){
        
    }
    
    
    private void readByteData() {
        try {
            //B1: Tao doi tuong de FileInputStream de doc du lieu tu file notepad.txt
            FileInputStream fis = new FileInputStream("notepad.txt");

            //B2: Goi phuong thuc read() de doc tung byte. 
            //Phuong thuc read() tra ve -1 neu ko con byte nao de doc
            int c;
            String data = "";
            while ((c = fis.read()) != -1) {
                char cdata = (char) c;
                data = data + String.valueOf(cdata);
            }
            //dua du lieu trong data len TextArea
            taContent.setText(data);

            //B3: Goi phuong thuc close() dong doi tuong doc du lieu
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeByteData() {
        try {
            //B1: Tao doi tuong thuc hien viec ghi du lieu vao file
            FileOutputStream fos = new FileOutputStream("notepad.txt", true);

            //B2: Thuc hien viec ghi file su dung phuong thuc write()
            //Lay du lieu tu TextArea
            String content = taContent.getText();
            //chuyen chuoi nay sang thanh mang byte
            byte[] contentByte = content.getBytes();
            //goi phuong thuc write() cua lop FileOutputStream
            fos.write(contentByte);
            //Lam sach du lieu sau khi ghi vao file
            fos.flush();

            //B3: Dong doi tuong ghi file bang cach goi phuong thuc close()
            fos.close();

            //hien thi thong bao luu thanh cong
            JOptionPane.showMessageDialog(this, "Ban vua luu du lieu thanh cong!");

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(this, "Luu du lieu that bai!");
            ioe.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRead;
    private javax.swing.JButton btWrite;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taContent;
    // End of variables declaration//GEN-END:variables
}
