package windows;

import domain.Model;
import domain.Order;
import java.util.Collection;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;

/**
 * @author Marco Fiorito
 */
public class WindowBoxOrderList extends javax.swing.JFrame implements Observer {
    
    Model model;
    
    public WindowBoxOrderList(Model m) {
        model = m;
        model.addObserver(this);
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        lstOrder.setListData(model.getSortedListOfOrders().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOrder = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 3));

        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        lstOrder.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstOrder);

        jPanel5.add(jScrollPane1);

        jPanel2.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(5, 0));

        jPanel3.setLayout(new java.awt.GridLayout(3, 3));
        jPanel3.add(jLabel3);
        jPanel3.add(jLabel4);

        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack);
        jPanel3.add(jLabel5);
        jPanel3.add(jLabel6);
        jPanel3.add(jLabel17);
        jPanel3.add(jLabel18);
        jPanel3.add(jLabel19);

        jPanel6.add(jPanel3);

        jPanel2.add(jPanel6);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstOrderMouseClicked
        Order order = (Order)lstOrder.getSelectedValue();
        WindowBoxOrderDisplay wOrderDisplay = new WindowBoxOrderDisplay(model, order);
        wOrderDisplay.setVisible(true);
    }//GEN-LAST:event_lstOrderMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        WindowMain wMain = new WindowMain(model);
        wMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstOrder;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        lstOrder.setListData(model.getSortedListOfOrders().toArray());
    }
}
