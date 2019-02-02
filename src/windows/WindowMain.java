package windows;

import domain.Model;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utils.Utils;
/**
 * @author Marco Fiorito
 */
public class WindowMain extends javax.swing.JFrame {
    
    private Model model;
    
    public WindowMain(Model m){
        model = m;
        initComponents();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Dimension jpanel = new Dimension();
        jpanel.height = 400;
        jpanel.width = screenSize.width;
        
        jpanelButtons.setPreferredSize(jpanel);
        FondoSwing fondo;
        try {
            fondo = new FondoSwing(ImageIO.read(getClass().getResource("/resources/images/Background.jpg")));
            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
            jpanelButtons.setBorder(fondo);
        } catch (IOException ex) {
            Logger.getLogger(WindowMain.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        if(model.getTypeOfUser().equals("cocina")){
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

        jpanelButtons.setBackground(new java.awt.Color(51, 51, 51));
        jpanelButtons.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpanelButtons.setMaximumSize(new java.awt.Dimension(32767, 200));
        jpanelButtons.setLayout(new java.awt.GridLayout(1, 0));

        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Bill_32px.png"))); // NOI18N
        btnOrder.setText("Pedido");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnOrder);

        btnPlate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/tray_24px.png"))); // NOI18N
        btnPlate.setText("Plato");
        btnPlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlateActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnPlate);

        btnDrink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Bottle_32px.png"))); // NOI18N
        btnDrink.setText("Bebida");
        btnDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnDrink);

        btnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Table_32px.png"))); // NOI18N
        btnTable.setText("Mesa");
        btnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnTable);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Close_32px.png"))); // NOI18N
        btnClose.setText("Salir");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnClose);

        getContentPane().add(jpanelButtons);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnListOfOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/List_32px.png"))); // NOI18N
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
        if(model.getTypeOfUser().equals("cocina")){
            WindowKitchenOrderList orderDetail = new WindowKitchenOrderList(model);
            orderDetail.setVisible(true);
        }else{
            WindowBoxOrderList orderDetail = new WindowBoxOrderList(model);
            orderDetail.setVisible(true);            
        }
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
