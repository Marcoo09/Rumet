package windows;

import domain.Model;
import domain.Table;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Marco Fiorito
 */
public class WindowTable extends javax.swing.JFrame {

    private Model model;
    
    public WindowTable(Model m) {
        model = m;
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRange = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFinal = new javax.swing.JTextField();
        txtInit = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRange.setText("Rango de mesas a agregar");
        getContentPane().add(lblRange, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel1.setText("Final");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabel2.setText("Inicial");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtFinal.setText(" ");
        txtFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalActionPerformed(evt);
            }
        });
        getContentPane().add(txtFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 70, -1));

        txtInit.setText(" ");
        txtInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInitActionPerformed(evt);
            }
        });
        getContentPane().add(txtInit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, -1));

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

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
                init = Integer.parseInt(txtInit.getText());
                fin = Integer.parseInt(txtFinal.getText());
                if(fin >= init){
                    while(init <= fin){
                        Table table = new Table(init);
                        model.addTable(table);
                        init++;
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Error","Rango inválido", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblRange;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtInit;
    // End of variables declaration//GEN-END:variables
}
