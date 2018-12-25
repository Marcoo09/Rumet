package windows;

import domain.Model;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Marco Fiorito
 */
public class WindowMain extends javax.swing.JFrame {
    
    private Model model;
    
    public WindowMain(Model m) {
        model = m;
        initComponents();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Dimension jpanel = new Dimension();
        jpanel.height = 400;
        jpanel.width = screenSize.width;
        
        jpanelButtons.setPreferredSize(jpanel);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelButtons = new javax.swing.JPanel();
        btnOrder = new javax.swing.JButton();
        btnPlate = new javax.swing.JButton();
        btnDrink = new javax.swing.JButton();
        btnMesa = new javax.swing.JButton();

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

        btnMesa.setText("Mesa");
        btnMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesaActionPerformed(evt);
            }
        });
        jpanelButtons.add(btnMesa);

        getContentPane().add(jpanelButtons);

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

    private void btnMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesaActionPerformed
       WindowTable wTable = new WindowTable(model);
        wTable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMesaActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        if(!model.getListOfDrinks().isEmpty() || !model.getListOfPlates().isEmpty() || !model.getListOfTables().isEmpty()){
            JOptionPane.showMessageDialog(this, "Error", "Debes registrar por lo menos un plato, bebida y mesa.", JOptionPane.ERROR_MESSAGE);
        }else{
            WindowOrder wOrder = new WindowOrder(model);
            wOrder.setVisible(true);
            this.dispose();            
        }
    }//GEN-LAST:event_btnOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrink;
    private javax.swing.JButton btnMesa;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPlate;
    private javax.swing.JPanel jpanelButtons;
    // End of variables declaration//GEN-END:variables
}
