package windows;

import domain.Drink;
import domain.Model;
import domain.Order;
import domain.Plate;
import domain.Table;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Marco Fiorito
 */
public class WindowOrder extends javax.swing.JFrame {
    
    private Model model;
    private ArrayList<Plate> orderPlates;
    private ArrayList<Drink> orderDrinks;
    
    public WindowOrder(Model m) {
        model = m;
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        lstPlates.setListData(model.getListOfPlates().toArray());
        lstDrinks.setListData(model.getListOfDrinks().toArray());
        
        Collections.sort(model.getListOfTables());
        
        cbxTables.addItem("");
        for (int i = 0; i < model.getListOfTables().size(); i++) {
            Table currentTable = model.getListOfTables().get(i);
            cbxTables.addItem("" + currentTable.getNumber());
        }
        orderPlates = new ArrayList<>();
        orderDrinks = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlates = new javax.swing.JLabel();
        lblOrderPlates = new javax.swing.JLabel();
        lblOrderDrink = new javax.swing.JLabel();
        lblDrink = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOrderPlates = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDrinks = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOrderDrinks = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstPlates = new javax.swing.JList();
        btnPlatesLeft = new javax.swing.JButton();
        btnPlatesRight = new javax.swing.JButton();
        btnDrinkRight = new javax.swing.JButton();
        btnDrinkLeft = new javax.swing.JButton();
        lblTable = new javax.swing.JLabel();
        cbxTables = new javax.swing.JComboBox<>();
        btnAddOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPlates.setText("Platos");
        getContentPane().add(lblPlates, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lblOrderPlates.setText("Platos Pedidos");
        getContentPane().add(lblOrderPlates, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        lblOrderDrink.setText("Bebidas pedidas");
        getContentPane().add(lblOrderDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        lblDrink.setText("Bebidas");
        getContentPane().add(lblDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        lstOrderPlates.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstOrderPlates);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        lstDrinks.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstDrinks);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        lstOrderDrinks.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstOrderDrinks);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        lstPlates.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstPlates);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnPlatesLeft.setText("<");
        btnPlatesLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatesLeftActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlatesLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 40, -1));

        btnPlatesRight.setText(">");
        btnPlatesRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatesRightActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlatesRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 40, -1));

        btnDrinkRight.setText(">");
        btnDrinkRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkRightActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrinkRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 40, -1));

        btnDrinkLeft.setText("<");
        btnDrinkLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkLeftActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrinkLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 40, -1));

        lblTable.setText("Mesa:");
        getContentPane().add(lblTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        cbxTables.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        btnAddOrder.setText("Agregar");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlatesRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatesRightActionPerformed
        Plate selectedPlate = (Plate)lstPlates.getSelectedValue();
        orderPlates.add(selectedPlate);
        lstOrderPlates.setListData(orderPlates.toArray());
    }//GEN-LAST:event_btnPlatesRightActionPerformed

    private void btnPlatesLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatesLeftActionPerformed
        Plate selectedPlate = (Plate)lstOrderPlates.getSelectedValue();
        orderPlates.remove(selectedPlate);
        lstOrderPlates.setListData(orderPlates.toArray());
    }//GEN-LAST:event_btnPlatesLeftActionPerformed

    private void btnDrinkRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkRightActionPerformed
        Drink selectedDrink = (Drink)lstDrinks.getSelectedValue();
        orderDrinks.add(selectedDrink);
        lstOrderDrinks.setListData(orderDrinks.toArray());
    }//GEN-LAST:event_btnDrinkRightActionPerformed

    private void btnDrinkLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkLeftActionPerformed
        Drink selectedDrink = (Drink)lstOrderDrinks.getSelectedValue();
        orderDrinks.remove(selectedDrink);
        lstOrderDrinks.setListData(orderDrinks.toArray());
    }//GEN-LAST:event_btnDrinkLeftActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        int index = cbxTables.getSelectedIndex();
        if(index == 0){
            JOptionPane.showMessageDialog(this, "Error mesa'","Debes seleccionar una mesa",  JOptionPane.ERROR_MESSAGE);
        }else{
            Table table = model.getListOfTables().get(index - 1);
            Order order = new Order(orderPlates, orderDrinks, 0, table);
            model.addOrder(order);
            JOptionPane.showMessageDialog(this,"", "La orden fue agregada correctamente", 0);
        }


    }//GEN-LAST:event_btnAddOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnDrinkLeft;
    private javax.swing.JButton btnDrinkRight;
    private javax.swing.JButton btnPlatesLeft;
    private javax.swing.JButton btnPlatesRight;
    private javax.swing.JComboBox<String> cbxTables;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblDrink;
    private javax.swing.JLabel lblOrderDrink;
    private javax.swing.JLabel lblOrderPlates;
    private javax.swing.JLabel lblPlates;
    private javax.swing.JLabel lblTable;
    private javax.swing.JList lstDrinks;
    private javax.swing.JList lstOrderDrinks;
    private javax.swing.JList lstOrderPlates;
    private javax.swing.JList lstPlates;
    // End of variables declaration//GEN-END:variables
}
