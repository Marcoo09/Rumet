package windows;

import domain.Drink;
import domain.Model;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
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
        
        jcbSizes.setModel(new DefaultComboBoxModel(Drink.posibleSizes));
        jcbTypes.setModel(new DefaultComboBoxModel(Drink.typePosibilities));
        
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
        lblDrink = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtBrand = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jcbSizes = new javax.swing.JComboBox();
        jPanel15 = new javax.swing.JPanel();
        lblLT = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lblType = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jcbTypes = new javax.swing.JComboBox();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
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
        lblMoney = new javax.swing.JLabel();
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

        lblDrink.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDrink.setForeground(new java.awt.Color(255, 255, 255));
        lblDrink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDrink.setText("Bebida:");
        jPanel11.add(lblDrink);

        jPanelMain.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(5, 0));

        txtBrand.setBackground(new java.awt.Color(102, 102, 102));
        txtBrand.setForeground(new java.awt.Color(255, 255, 255));
        txtBrand.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });
        jPanel12.add(txtBrand);

        jPanelMain.add(jPanel12);

        jPanel13.setLayout(new java.awt.GridLayout(5, 0));
        jPanelMain.add(jPanel13);

        jPanel14.setLayout(new java.awt.GridLayout(5, 5));

        jcbSizes.setBackground(new java.awt.Color(102, 102, 102));
        jcbSizes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel14.add(jcbSizes);

        jPanelMain.add(jPanel14);

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0));

        lblLT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLT.setForeground(new java.awt.Color(255, 255, 255));
        lblLT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLT.setText("LT");
        jPanel15.add(lblLT);

        jPanelMain.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout(1, 0));

        lblType.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblType.setForeground(new java.awt.Color(255, 255, 255));
        lblType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblType.setText("Tipo:");
        lblType.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel16.add(lblType);

        jPanelMain.add(jPanel16);

        jPanel17.setLayout(new java.awt.GridLayout(5, 0));

        jcbTypes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel17.add(jcbTypes);

        jPanelMain.add(jPanel17);
        jPanelMain.add(jPanel18);
        jPanelMain.add(jPanel19);

        jPanel20.setLayout(new java.awt.GridLayout(5, 0));
        jPanelMain.add(jPanel20);

        jPanel21.setLayout(new java.awt.GridLayout(5, 0));
        jPanelMain.add(jPanel21);

        jPanel22.setLayout(new java.awt.GridLayout(5, 0));
        jPanelMain.add(jPanel22);

        jPanel23.setLayout(new java.awt.GridLayout(5, 0));
        jPanelMain.add(jPanel23);

        jPanel24.setLayout(new java.awt.GridLayout(5, 0));
        jPanelMain.add(jPanel24);
        jPanelMain.add(jPanel25);
        jPanelMain.add(jPanel26);
        jPanelMain.add(jPanel27);
        jPanelMain.add(jPanel28);

        jPanel29.setLayout(new java.awt.GridLayout(5, 0));

        lblDescription.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setText("Descripción (opcional):");
        jPanel29.add(lblDescription);

        jPanelMain.add(jPanel29);

        jPanel30.setLayout(new java.awt.GridLayout(5, 0));

        txtDescription.setBackground(new java.awt.Color(102, 102, 102));
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel30.add(txtDescription);

        jPanelMain.add(jPanel30);

        jPanel31.setLayout(new java.awt.GridLayout(1, 0));
        jPanelMain.add(jPanel31);

        jPanel32.setLayout(new java.awt.GridLayout(5, 0));

        lblCost.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCost.setForeground(new java.awt.Color(255, 255, 255));
        lblCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCost.setText("Costo:");
        jPanel32.add(lblCost);

        jPanelMain.add(jPanel32);

        jPanel33.setLayout(new java.awt.GridLayout(5, 0));

        txtCost.setBackground(new java.awt.Color(102, 102, 102));
        txtCost.setForeground(new java.awt.Color(255, 255, 255));
        txtCost.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel33.add(txtCost);

        jPanelMain.add(jPanel33);

        jPanel34.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0));

        lblMoney.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(255, 255, 255));
        lblMoney.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMoney.setText("$");
        jPanel34.add(lblMoney);

        jPanelMain.add(jPanel34);

        jPanel35.setLayout(new java.awt.GridLayout(5, 5));
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

    private void btnAddDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrinkActionPerformed
        String description = txtDescription.getText();
        String size = jcbSizes.getSelectedItem().toString();
        String brand = txtBrand.getText();
        String type = jcbTypes.getSelectedItem().toString();
        
        try{
              int cost = Integer.parseInt( txtCost.getText());
              if(cost != 0 && !brand.trim().isEmpty()){
                Drink drink = new Drink(cost, description,size, brand, type);
                model.addDrink(drink);
                jcbSizes.setSelectedIndex(0);
                jcbTypes.setSelectedIndex(0);
                txtBrand.setText("");
                txtCost.setText("");
                txtDescription.setText("");
                drink = null;
                JOptionPane.showMessageDialog(this,"La bebida fue agregada correctamente","" , JOptionPane.INFORMATION_MESSAGE);
              }else{
                JOptionPane.showMessageDialog(this, "Problema con el campo costo y/o bebida ","Debes ingresar una bebida y un costo",  JOptionPane.ERROR_MESSAGE);
              }
        }catch(NumberFormatException e){
               JOptionPane.showMessageDialog(this, "Problema con el campo costo ","Debes ingresar números",  JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddDrinkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        WindowMain wMain = new WindowMain(model);
        wMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed


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
    private javax.swing.JComboBox jcbSizes;
    private javax.swing.JComboBox jcbTypes;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDrink;
    private javax.swing.JLabel lblLT;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables
}
