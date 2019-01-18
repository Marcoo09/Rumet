package windows;

import domain.Drink;
import domain.Model;
import domain.Order;
import domain.Plate;
import domain.Table;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Marco Fiorito
 */
public class WindowOrder extends javax.swing.JFrame {
    
    private Model model;
    private ArrayList<Plate> orderPlates;
    private ArrayList<Drink> orderDrinks;
    private boolean isAnUpdate = false;
    
    public WindowOrder(Model m, Order order) {
        model = m;
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        lstPlates.setListData(model.getListOfPlates().toArray());
        lstDrinks.setListData(model.getListOfDrinks().toArray());
        
        Collections.sort(model.getListOfTables());
        
        jcbTables.setModel(new DefaultComboBoxModel(model.getListOfTables().toArray()));
        
        if(order == null){
            orderPlates = new ArrayList<>();
            orderDrinks = new ArrayList<>();
         
        }else{
            isAnUpdate = true;
            orderPlates = order.getListOfPlates();
            orderDrinks = order.getListOfDrinks();
            jcbTables.setSelectedIndex(order.getTable().getNumber() - 1);
        }
            lstOrderPlates.setListData(orderPlates.toArray());
            lstOrderDrinks.setListData(orderDrinks.toArray());   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelMain = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPlates = new javax.swing.JList();
        jPanel21 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstOrderPlates = new javax.swing.JList();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstDrinks = new javax.swing.JList();
        jPanel25 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstOrderDrinks = new javax.swing.JList();
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
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jcbTables = new javax.swing.JComboBox();
        jPanel40 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        txtDiscount = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jpanelMain.setLayout(new java.awt.GridLayout(5, 9));
        jpanelMain.add(jPanel1);
        jpanelMain.add(jPanel2);
        jpanelMain.add(jPanel3);
        jpanelMain.add(jPanel4);
        jpanelMain.add(jPanel5);
        jpanelMain.add(jPanel6);
        jpanelMain.add(jPanel7);
        jpanelMain.add(jPanel8);

        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel9.add(btnBack);

        jpanelMain.add(jPanel9);
        jpanelMain.add(jPanel10);

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 60));

        jLabel1.setText("Platos");
        jPanel11.add(jLabel1);

        jpanelMain.add(jPanel11);
        jpanelMain.add(jPanel12);

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 60));

        jLabel2.setText("Platos Pedidos");
        jPanel13.add(jLabel2);

        jpanelMain.add(jPanel13);
        jpanelMain.add(jPanel14);

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 60));

        jLabel3.setText("Bebidas");
        jPanel15.add(jLabel3);

        jpanelMain.add(jPanel15);
        jpanelMain.add(jPanel16);

        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 1, 60));

        jLabel4.setText("Bebidas Pedidas");
        jPanel17.add(jLabel4);

        jpanelMain.add(jPanel17);
        jpanelMain.add(jPanel18);
        jpanelMain.add(jPanel19);

        jPanel20.setLayout(new java.awt.GridLayout(1, 0));

        lstPlates.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstPlates);

        jPanel20.add(jScrollPane1);

        jpanelMain.add(jPanel20);

        jPanel21.setLayout(new java.awt.GridLayout(4, 2));

        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton1);
        jPanel21.add(jLabel5);
        jPanel21.add(jLabel6);

        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton3);

        jpanelMain.add(jPanel21);

        jPanel22.setLayout(new java.awt.GridLayout(1, 0));

        lstOrderPlates.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstOrderPlates);

        jPanel22.add(jScrollPane2);

        jpanelMain.add(jPanel22);
        jpanelMain.add(jPanel23);

        jPanel24.setLayout(new java.awt.GridLayout(1, 0));

        lstDrinks.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstDrinks);

        jPanel24.add(jScrollPane3);

        jpanelMain.add(jPanel24);

        jPanel25.setLayout(new java.awt.GridLayout(4, 2));

        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton2);
        jPanel25.add(jLabel7);
        jPanel25.add(jLabel8);

        jButton4.setText("<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton4);

        jpanelMain.add(jPanel25);

        jPanel26.setLayout(new java.awt.GridLayout(1, 0));

        lstOrderDrinks.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstOrderDrinks);

        jPanel26.add(jScrollPane4);

        jpanelMain.add(jPanel26);
        jpanelMain.add(jPanel27);
        jpanelMain.add(jPanel28);
        jpanelMain.add(jPanel29);
        jpanelMain.add(jPanel30);
        jpanelMain.add(jPanel31);
        jpanelMain.add(jPanel32);
        jpanelMain.add(jPanel33);
        jpanelMain.add(jPanel34);
        jpanelMain.add(jPanel35);
        jpanelMain.add(jPanel36);
        jpanelMain.add(jPanel37);

        jLabel9.setText("Mesa:");
        jPanel38.add(jLabel9);

        jpanelMain.add(jPanel38);

        jPanel39.setLayout(new java.awt.GridLayout(5, 0));

        jcbTables.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel39.add(jcbTables);

        jpanelMain.add(jPanel39);

        jLabel10.setText("Descuento:");
        jPanel40.add(jLabel10);

        jpanelMain.add(jPanel40);

        jPanel41.setLayout(new java.awt.GridLayout(5, 0));
        jPanel41.add(txtDiscount);

        jpanelMain.add(jPanel41);
        jpanelMain.add(jPanel42);
        jpanelMain.add(jPanel43);

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel44.add(btnAdd);

        jpanelMain.add(jPanel44);
        jpanelMain.add(jPanel45);

        getContentPane().add(jpanelMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Plate selectedPlate = (Plate)lstPlates.getSelectedValue();
        orderPlates.add(selectedPlate);
        lstOrderPlates.setListData(orderPlates.toArray());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Plate selectedPlate = (Plate)lstOrderPlates.getSelectedValue();
        orderPlates.remove(selectedPlate);
        lstOrderPlates.setListData(orderPlates.toArray());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Drink selectedDrink = (Drink)lstDrinks.getSelectedValue();
        orderDrinks.add(selectedDrink);
        lstOrderDrinks.setListData(orderDrinks.toArray());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Drink selectedDrink = (Drink)lstOrderDrinks.getSelectedValue();
        orderDrinks.remove(selectedDrink);
        lstOrderDrinks.setListData(orderDrinks.toArray());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if(isAnUpdate){
            this.dispose();
        }else{
            WindowMain wMain = new WindowMain(model, "");
            wMain.setVisible(true);
            this.dispose();            
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Order order;
        
        String table = jcbTables.getSelectedItem().toString();
        int number = Integer.parseInt(Character.toString(table.charAt(table.length() - 1)));
        float discount = 0;
        if(txtDiscount.getText().equals("")){
            
        }else{
            discount = Float.parseFloat(txtDiscount.getText());
        }
        
        Table selectedTable = null;
        Table currentTable;
        
        for(int i = 0; i < model.getListOfTables().size(); i++){
            currentTable = model.getListOfTables().get(i);
            if(currentTable.getNumber() == number){
                selectedTable = currentTable;
            }
        }

        if(orderDrinks.isEmpty() && orderPlates.isEmpty()){
               JOptionPane.showMessageDialog(this, "No has agregado ni platos ni bebidas ","Error",  JOptionPane.ERROR_MESSAGE);
        }else{
            order = new Order(orderPlates, orderDrinks, discount, selectedTable);
            model.addOrder(order);
            JOptionPane.showMessageDialog(this,"La Orden fue agregada correctamente","" , JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox jcbTables;
    private javax.swing.JPanel jpanelMain;
    private javax.swing.JList lstDrinks;
    private javax.swing.JList lstOrderDrinks;
    private javax.swing.JList lstOrderPlates;
    private javax.swing.JList lstPlates;
    private javax.swing.JTextField txtDiscount;
    // End of variables declaration//GEN-END:variables
}
