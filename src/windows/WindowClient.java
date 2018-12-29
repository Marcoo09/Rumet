package windows;

import domain.Client;
import domain.Model;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Marco Fiorito
 */
public class WindowClient extends javax.swing.JFrame {

    private Model model;
    
    public WindowClient(Model m) {
        model = m;
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnAddDrink = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setText("Nombre:");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 44, -1, -1));

        lblRut.setText("RUT:");
        getContentPane().add(lblRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 70, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 70, -1));

        btnAddDrink.setText("Agregar");
        btnAddDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrinkActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrinkActionPerformed
        String name = txtName.getText();
        String rut = txtRut.getText();
        Client client = new Client(name, rut);
        model.addClient(client);
        JOptionPane.showMessageDialog(this,"", "El plato fue agregado correctamente", 0);
    }//GEN-LAST:event_btnAddDrinkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        WindowMain wMain = new WindowMain(model, "");
        wMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDrink;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRut;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
