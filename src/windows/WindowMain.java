package windows;

import domain.Model;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utils.Utils;
/**
 * @author Marco Fiorito
 */
public class WindowMain extends javax.swing.JFrame {
    
    private Model model;
    
    public WindowMain(Model m, String typeOfUser) {
        model = m;
        initComponents();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Dimension jpanel = new Dimension();
        jpanel.height = 400;
        jpanel.width = screenSize.width;
        
        jpanelButtons.setPreferredSize(jpanel);
        
        if(typeOfUser.equals("cocina")){
            btnDrink.setVisible(false);
            btnTable.setVisible(false);
            btnPlate.setVisible(false);
            btnOrder.setVisible(false);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelButtons = new javax.swing.JPanel();
        btnOrder = new javax.swing.JButton();
        btnPlate = new javax.swing.JButton();
        btnDrink = new javax.swing.JButton();
        btnTable = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnListOfOrders = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(15, 0));

        jpanelButtons.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpanelButtons.setMaximumSize(new java.awt.Dimension(32767, 200));
        jpanelButtons.setLayout(new java.awt.GridLayout(1, 0));

        btnOrder.setText("Pedido");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnOrder);

        btnPlate.setText("Plato");
        btnPlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlateActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnPlate);

        btnDrink.setText("Bebida");
        btnDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnDrink);

        btnTable.setText("Mesa");
        btnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnTable);

        btnClose.setText("Salir");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnClose);

        getContentPane().add(jpanelButtons);

        jPanel1.setLayout(new java.awt.GridLayout());

        btnListOfOrders.setText("Lista de pedidos");
        btnListOfOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfOrdersActionPerformed(evt);
            }
        });
        jPanel1.add(btnListOfOrders);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlateActionPerformed
        WindowPlate wPlate = new WindowPlate(model);
        wPlate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPlateActionPerformed

    private void btnDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkActionPerformed
        WindowDrink wDrink = new WindowDrink(model);
        wDrink.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDrinkActionPerformed

    private void btnTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableActionPerformed
       WindowTable wTable = new WindowTable(model);
        wTable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTableActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
       
        try{
            model.getListOfDrinks();
            model.getListOfPlates();
            model.getListOfTables();
            WindowOrder wOrder = new WindowOrder(model, null);
            wOrder.setVisible(true);
            this.dispose();              
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "Debes registrar por lo menos un plato, bebida y mesa.","Error" , JOptionPane.ERROR_MESSAGE);
        }
          
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnListOfOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfOrdersActionPerformed
        WindowOrderList orderDetail = new WindowOrderList(model);
        orderDetail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListOfOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDrink;
    private javax.swing.JButton btnListOfOrders;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPlate;
    private javax.swing.JButton btnTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanelButtons;
    // End of variables declaration//GEN-END:variables
}
