package windows;

import domain.Drink;
import domain.Model;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
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
        lblDescription = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtDescription = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        lblCost = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtCost = new javax.swing.JTextField();
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
        jPanel36 = new javax.swing.JPanel();
        btnAddDrink = new javax.swing.JButton();
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
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanelMain.setLayout(new java.awt.GridLayout(5, 9));
        jPanelMain.add(jPanel1);
        jPanelMain.add(jPanel2);
        jPanelMain.add(jPanel3);
        jPanelMain.add(jPanel4);
        jPanelMain.add(jPanel5);
        jPanelMain.add(jPanel6);
        jPanelMain.add(jPanel7);
        jPanelMain.add(jPanel8);

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

        lblDescription.setText("Descripción:");
        jPanel11.add(lblDescription);

        jPanelMain.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(5, 0));
        jPanel12.add(txtDescription);

        jPanelMain.add(jPanel12);
        jPanelMain.add(jPanel13);
        jPanelMain.add(jPanel14);
        jPanelMain.add(jPanel15);
        jPanelMain.add(jPanel16);
        jPanelMain.add(jPanel17);
        jPanelMain.add(jPanel18);
        jPanelMain.add(jPanel19);

        jPanel20.setLayout(new java.awt.GridLayout(5, 0));

        lblCost.setText("Costo:");
        jPanel20.add(lblCost);

        jPanelMain.add(jPanel20);

        jPanel21.setLayout(new java.awt.GridLayout(5, 0));
        jPanel21.add(txtCost);

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
        jPanelMain.add(jPanel35);

        btnAddDrink.setText("Agregar");
        btnAddDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrinkActionPerformed(evt);
            }
        });
        jPanel36.add(btnAddDrink);

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
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables
}
