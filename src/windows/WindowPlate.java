package windows;

import domain.Model;
import domain.Plate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Marco Fiorito
 */
public class WindowPlate extends javax.swing.JFrame {
    private Model model;
    
    public WindowPlate(Model m) {
        model =m;
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
        lblPlate1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblPlate = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtMainPlate = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        lblWith = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        txtSecondaryPlate = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        lblSauce = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtSauce = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        lblDescription = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        txtDescription = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        lblCost = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        txtCost = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
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
        btnAddDrink = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanelMain.setLayout(new java.awt.GridLayout(5, 9));

        jPanel1.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout());

        lblPlate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlate1.setText("(opcional)");
        lblPlate1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(lblPlate1);

        jPanelMain.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel8);

        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel9.add(btnBack);

        jPanelMain.add(jPanel9);

        jPanel10.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel10);

        jPanel11.setLayout(new java.awt.GridLayout());

        lblPlate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlate.setText("Plato:");
        lblPlate.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel11.add(lblPlate);

        jPanelMain.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(5, 0));
        jPanel12.add(txtMainPlate);

        jPanelMain.add(jPanel12);

        jPanel13.setLayout(new java.awt.GridLayout());

        lblWith.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWith.setText("Con");
        lblWith.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel13.add(lblWith);

        jPanelMain.add(jPanel13);

        jPanel14.setLayout(new java.awt.GridLayout(5, 0));
        jPanel14.add(txtSecondaryPlate);

        jPanelMain.add(jPanel14);

        jPanel15.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel16);

        jPanel17.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel17);

        jPanel18.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel18);

        jPanel19.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel19);

        jPanel20.setLayout(new java.awt.GridLayout(5, 0));

        lblSauce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSauce.setText("Salsa (opcional):");
        lblSauce.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel20.add(lblSauce);

        jPanelMain.add(jPanel20);

        jPanel21.setLayout(new java.awt.GridLayout(5, 0));
        jPanel21.add(txtSauce);

        jPanelMain.add(jPanel21);

        jPanel22.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel22);

        jPanel23.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel23);

        jPanel24.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel24);

        jPanel25.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel25);

        jPanel26.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel26);

        jPanel27.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel27);

        jPanel28.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel28);

        jPanel29.setLayout(new java.awt.GridLayout());

        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Descripción (opcional):");
        lblDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel29.add(lblDescription);

        jPanelMain.add(jPanel29);

        jPanel30.setLayout(new java.awt.GridLayout(5, 0));
        jPanel30.add(txtDescription);

        jPanelMain.add(jPanel30);

        jPanel31.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel31);

        jPanel32.setLayout(new java.awt.GridLayout());

        lblCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCost.setText("Costo:");
        lblCost.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel32.add(lblCost);

        jPanelMain.add(jPanel32);

        jPanel33.setLayout(new java.awt.GridLayout(5, 0));
        jPanel33.add(txtCost);

        jPanelMain.add(jPanel33);

        jPanel34.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel34);

        jPanel35.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel35);

        jPanel36.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel36);

        jPanel37.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel37);

        jPanel38.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel38);

        jPanel39.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel39);

        jPanel40.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel40);

        jPanel41.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel41);

        jPanel42.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel42);

        jPanel43.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel43);

        jPanel44.setLayout(new java.awt.GridLayout());
        jPanelMain.add(jPanel44);

        btnAddDrink.setText("Agregar");
        btnAddDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrinkActionPerformed(evt);
            }
        });
        jPanel45.add(btnAddDrink);

        jPanelMain.add(jPanel45);

        getContentPane().add(jPanelMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        WindowMain wMain = new WindowMain(model, "");
        wMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrinkActionPerformed
        String description = txtDescription.getText();
        String mainPlate = txtMainPlate.getText();
        if(!mainPlate.trim().isEmpty()){
            String secondaryPlate = txtSecondaryPlate.getText();
            String sauce = txtSauce.getText();
            try{
                int cost = Integer.parseInt( txtCost.getText());
                Plate plate = new Plate(cost, description,mainPlate,secondaryPlate,sauce);
                model.addPlate(plate);
                JOptionPane.showMessageDialog(this,"El plato fue agregado correctamente","" , JOptionPane.INFORMATION_MESSAGE);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Problema con el campo costo'","Debes ingresar números",  JOptionPane.ERROR_MESSAGE);
            }            
        }else{
            JOptionPane.showMessageDialog(this, "Problema con el campo Plato","Debes ingresar un plato",  JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAddDrinkActionPerformed


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
    private javax.swing.JLabel lblPlate;
    private javax.swing.JLabel lblPlate1;
    private javax.swing.JLabel lblSauce;
    private javax.swing.JLabel lblWith;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtMainPlate;
    private javax.swing.JTextField txtSauce;
    private javax.swing.JTextField txtSecondaryPlate;
    // End of variables declaration//GEN-END:variables
}
