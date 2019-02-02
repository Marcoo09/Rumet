package windows;

import domain.Client;
import domain.Model;
import java.awt.Color;
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
public class WindowClient extends javax.swing.JFrame {

    private Model model;
    
    public WindowClient(Model m) {
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
            jPanel16.setBorder(fondo);
            jPanel17.setBorder(fondo);
            jPanel18.setBorder(fondo);
            jPanel19.setBorder(fondo);
            jPanel20.setBorder(fondo);
            jPanel21.setBorder(fondo);
            jPanel22.setBorder(fondo);
            jPanel23.setBorder(fondo);
            jPanel24.setBorder(fondo);
            jPanel25.setBorder(fondo);
            jPanel26.setBorder(fondo);
            jPanel27.setBorder(fondo);
            jPanel28.setBorder(fondo);
            jPanel29.setBorder(fondo);
            jPanel30.setBorder(fondo);
            jPanel31.setBorder(fondo);
            jPanel32.setBorder(fondo);
            jPanel33.setBorder(fondo);
            jPanel34.setBorder(fondo);
            jPanel35.setBorder(fondo);
            jPanel36.setBorder(fondo);
            jPanel37.setBorder(fondo);
            jPanel38.setBorder(fondo);
            jPanel39.setBorder(fondo);
            jPanel40.setBorder(fondo);
            jPanel41.setBorder(fondo);
            jPanel42.setBorder(fondo);
            jPanel43.setBorder(fondo);
            jPanel44.setBorder(fondo);
            jPanel45.setBorder(fondo);
        } catch (IOException ex) {
            Logger.getLogger(WindowMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        lblRut = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtRut = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        btnAddClient = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanelMain.setLayout(new java.awt.GridLayout(5, 9));
        jPanelMain.add(jPanel1);
        jPanelMain.add(jPanel2);
        jPanelMain.add(jPanel3);
        jPanelMain.add(jPanel4);
        jPanelMain.add(jPanel5);
        jPanelMain.add(jPanel6);
        jPanelMain.add(jPanel7);
        jPanelMain.add(jPanel8);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Back_32px.png"))); // NOI18N
        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel9.add(btnBack);

        jPanelMain.add(jPanel9);
        jPanelMain.add(jPanel10);

        jPanel11.setLayout(new java.awt.GridLayout(5, 0));

        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Nombre:");
        jPanel11.add(lblName);

        jPanelMain.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(5, 0));

        txtName.setBackground(new java.awt.Color(102, 102, 102));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel12.add(txtName);

        jPanelMain.add(jPanel12);
        jPanelMain.add(jPanel13);
        jPanelMain.add(jPanel14);
        jPanelMain.add(jPanel15);
        jPanelMain.add(jPanel16);
        jPanelMain.add(jPanel17);
        jPanelMain.add(jPanel18);
        jPanelMain.add(jPanel19);

        jPanel20.setLayout(new java.awt.GridLayout(5, 0));

        lblRut.setForeground(new java.awt.Color(255, 255, 255));
        lblRut.setText("RUT:");
        jPanel20.add(lblRut);

        jPanelMain.add(jPanel20);

        jPanel21.setLayout(new java.awt.GridLayout(5, 0));

        txtRut.setBackground(new java.awt.Color(102, 102, 102));
        txtRut.setForeground(new java.awt.Color(255, 255, 255));
        txtRut.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel21.add(txtRut);

        jPanelMain.add(jPanel21);
        jPanelMain.add(jPanel22);
        jPanelMain.add(jPanel23);
        jPanelMain.add(jPanel24);
        jPanelMain.add(jPanel25);
        jPanelMain.add(jPanel26);
        jPanelMain.add(jPanel27);
        jPanelMain.add(jPanel28);
        jPanelMain.add(jPanel29);
        jPanelMain.add(jPanel30);
        jPanelMain.add(jPanel31);
        jPanelMain.add(jPanel32);
        jPanelMain.add(jPanel33);
        jPanelMain.add(jPanel34);

        btnAddClient.setText("Agregar");
        btnAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClientActionPerformed(evt);
            }
        });
        jPanel35.add(btnAddClient);

        jPanelMain.add(jPanel35);
        jPanelMain.add(jPanel36);
        jPanelMain.add(jPanel37);
        jPanelMain.add(jPanel38);
        jPanelMain.add(jPanel39);
        jPanelMain.add(jPanel40);
        jPanelMain.add(jPanel41);
        jPanelMain.add(jPanel42);
        jPanelMain.add(jPanel43);
        jPanelMain.add(jPanel44);
        jPanelMain.add(jPanel45);

        getContentPane().add(jPanelMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClientActionPerformed
        String name = txtName.getText();
        String rut = txtRut.getText();
        Client client = new Client(name, rut);
        model.addClient(client);
        txtName.setText("");
        txtRut.setText("");
        client = null;
        JOptionPane.showMessageDialog(this,"", "El Cliente fue agregado correctamente", 0);
    }//GEN-LAST:event_btnAddClientActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        WindowMain wMain = new WindowMain(model);
        wMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClient;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRut;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
