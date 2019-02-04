package windows;

import domain.Model;
import domain.Table;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Marco Fiorito
 */
public class WindowTable extends javax.swing.JFrame {

    private Model model;
    
    public WindowTable(Model m) {
        model = m;
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        FondoSwing fondo;
        try {
            fondo = new FondoSwing(ImageIO.read(getClass().getResource("/resources/images/Background.jpg")));
            jPanelMain.setBorder(fondo);            
            jPanel1.setBorder(fondo);
            jPanel2.setBorder(fondo);
            jPanel3.setBorder(fondo);
            jPanel4.setBorder(fondo);
            jPanel5.setBorder(fondo);
            jPanel6.setBorder(fondo);
            jPanel7.setBorder(fondo);
            jPanel8.setBorder(fondo);
            jPanel9.setBorder(fondo);
            jPanel10.setBorder(fondo);
            jPanel11.setBorder(fondo);
            jPanel12.setBorder(fondo);
            jPanel13.setBorder(fondo);
            jPanel14.setBorder(fondo);
            jPanel15.setBorder(fondo);
        } catch (IOException ex) {
            Logger.getLogger(WindowMain.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblRange = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtInit = new javax.swing.JTextField();
        txtFinal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanelMain.setLayout(new java.awt.GridLayout(5, 3));
        jPanelMain.add(jPanel2);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        lblRange.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRange.setForeground(new java.awt.Color(255, 255, 255));
        lblRange.setText("Rango de mesas a agregar");
        jPanel1.add(lblRange);

        jPanelMain.add(jPanel1);

        jPanel3.setLayout(new java.awt.GridLayout(3, 3));
        jPanel3.add(jLabel35);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Back_32px.png"))); // NOI18N
        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack);
        jPanel3.add(jLabel36);
        jPanel3.add(jLabel37);
        jPanel3.add(jLabel38);
        jPanel3.add(jLabel39);

        jPanelMain.add(jPanel3);
        jPanelMain.add(jPanel5);

        jPanel4.setLayout(new java.awt.GridLayout(5, 3));
        jPanel4.add(jLabel11);
        jPanel4.add(jLabel12);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel20);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel21);
        jPanel4.add(jLabel22);
        jPanel4.add(jLabel23);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inicial");
        jPanel4.add(jLabel2);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Final");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel1);

        txtInit.setBackground(new java.awt.Color(102, 102, 102));
        txtInit.setForeground(new java.awt.Color(255, 255, 255));
        txtInit.setText(" ");
        txtInit.setCaretColor(new java.awt.Color(255, 255, 255));
        txtInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInitActionPerformed(evt);
            }
        });
        jPanel4.add(txtInit);

        txtFinal.setBackground(new java.awt.Color(102, 102, 102));
        txtFinal.setForeground(new java.awt.Color(255, 255, 255));
        txtFinal.setText(" ");
        txtFinal.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalActionPerformed(evt);
            }
        });
        jPanel4.add(txtFinal);

        jPanelMain.add(jPanel4);
        jPanelMain.add(jPanel6);
        jPanelMain.add(jPanel7);
        jPanelMain.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(5, 5));
        jPanel9.add(jLabel7);
        jPanel9.add(jLabel9);
        jPanel9.add(jLabel10);
        jPanel9.add(jLabel8);
        jPanel9.add(jLabel13);
        jPanel9.add(jLabel14);
        jPanel9.add(jLabel15);
        jPanel9.add(jLabel16);
        jPanel9.add(jLabel29);
        jPanel9.add(jLabel30);
        jPanel9.add(jLabel31);
        jPanel9.add(jLabel32);
        jPanel9.add(jLabel33);
        jPanel9.add(jLabel34);

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel9.add(btnAdd);

        jPanelMain.add(jPanel9);
        jPanelMain.add(jPanel10);
        jPanelMain.add(jPanel11);
        jPanelMain.add(jPanel12);
        jPanelMain.add(jPanel13);
        jPanelMain.add(jPanel14);
        jPanelMain.add(jPanel15);

        getContentPane().add(jPanelMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalActionPerformed

    private void txtInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int init = 0;
        int fin = 0;
        if(txtInit.getText().equals("") || txtFinal.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Error","Debes llenar ambos campos", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                init = Integer.parseInt(txtInit.getText().trim());
                fin = Integer.parseInt(txtFinal.getText().trim());
                if(fin >= init){
                    while(init <= fin){
                        Table table = new Table(init);
                        model.addTable(table);
                        init++;
                    }
                    txtFinal.setText("");
                    txtInit.setText("");
                    JOptionPane.showMessageDialog(this, "Las mesas fueron agregadas correctamente","", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Rango inválido","Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(this, "Error","Debes escribir solo números", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        WindowMain wMain = new WindowMain(model);
        wMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JLabel lblRange;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtInit;
    // End of variables declaration//GEN-END:variables
}
