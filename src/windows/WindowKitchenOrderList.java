package windows;

import domain.Model;
import domain.Order;
import domain.Plate;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;

/**
 * @author Marco Fiorito
 */
public class WindowKitchenOrderList extends javax.swing.JFrame implements Observer {
    private Model model;
    private ArrayList<Plate> listOfPlates;
    
    public WindowKitchenOrderList(Model m) {
        model = m;
        model.addObserver(this);
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        listOfPlates = model.getListOfOrderPlates();
        lstPlates.setListData(listOfPlates.toArray());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPlates = new javax.swing.JList();
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
        btnCompletePlate = new javax.swing.JButton();
        btnChangePlate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        jPanel5.setLayout(new java.awt.GridLayout());

        lstPlates.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstPlates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPlatesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstPlates);

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

        btnCompletePlate.setText("Completado");
        btnCompletePlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletePlateActionPerformed(evt);
            }
        });
        jPanel6.add(btnCompletePlate);

        btnChangePlate.setText("Modificar Plato");
        jPanel6.add(btnChangePlate);

        jPanel2.add(jPanel6);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstPlatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPlatesMouseClicked
       /* Order order = (Order)lstOrder.getSelectedValue();
        WindowBoxOrderDisplay wOrderDisplay = new WindowBoxOrderDisplay(model, order);
        wOrderDisplay.setVisible(true);*/
    }//GEN-LAST:event_lstPlatesMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        WindowMain wMain = new WindowMain(model);
        wMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCompletePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletePlateActionPerformed
        Plate selectedPlate = (Plate)lstPlates.getSelectedValue();
        listOfPlates.remove(selectedPlate);
        lstPlates.setListData(listOfPlates.toArray());
    }//GEN-LAST:event_btnCompletePlateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangePlate;
    private javax.swing.JButton btnCompletePlate;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstPlates;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        lstPlates.setListData(model.getListOfOrderPlates().toArray());
    }
}
