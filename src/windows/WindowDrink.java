package windows;

import domain.Drink;
import domain.Model;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Fiorito
 */
public class WindowDrink extends javax.swing.JFrame {
    private Model  model;

    public WindowDrink(Model m) {
        model = m;
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        lblCost = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        btnAddDrink = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescription.setText("Descripción:");
        getContentPane().add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 51, -1, -1));
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 70, -1));

        lblCost.setText("Costo:");
        getContentPane().add(lblCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        getContentPane().add(txtCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 70, -1));

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

    private void btnAddDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrinkActionPerformed
        String description = txtDescription.getText();
        try{
              int cost = Integer.parseInt( txtCost.getText());
              Drink drink = new Drink(cost, description);
              model.addDrink(drink);
             JOptionPane.showMessageDialog(this,"La bebida fue agregada correctamente","" , JOptionPane.INFORMATION_MESSAGE);
        }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(this, "Problema con el campo costo ","Debes ingresar números",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddDrinkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        WindowMain wMain = new WindowMain(model, "");
        wMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDrink;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables
}
