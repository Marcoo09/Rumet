package windows;

import domain.Drink;
import domain.Model;
import domain.Order;
import domain.Plate;
import domain.Table;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Marco Fiorito
 */
public class WindowOrder extends javax.swing.JFrame {
    
    private Model model;
    private ArrayList<Plate> orderPlates;
    private ArrayList<Drink> orderDrinks;
    private boolean isAnUpdate = false;
    private Order receivedOrder = null;
    
    public WindowOrder(Model m, Order order) {
        model = m;
        receivedOrder = order;
        
        initComponents();
        
        lstPlates.setListData(model.getListOfPlates().toArray());
        lstDrinks.setListData(model.getListOfDrinks().toArray());
        
        Collections.sort(model.getListOfTables());
        
        jcbTables.setModel(new DefaultComboBoxModel(model.getListOfTables().toArray()));
        
        if(order == null){
            orderPlates = new ArrayList<>();
            orderDrinks = new ArrayList<>();
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }else{
            isAnUpdate = true;
            orderPlates = order.getListOfPlates();
            orderDrinks = order.getListOfDrinks();
            jcbTables.setSelectedIndex(order.getTable().getNumber() - 1);
            
            int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
            int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
            Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
            setSize((screenWidth + 34) / 2 + 7 , winSize.height + 10 );
            setLocation(winSize.width / 2 - 20,0);
            
                        
            GridLayout gridLayout = new GridLayout(5,7);
            jPanelMain.setLayout(gridLayout);
            
            jPanelMain.remove(jPanel1);
            jPanelMain.remove(jPanel10);
            jPanelMain.remove(jPanel19);
            jPanelMain.remove(jPanel28);
            jPanelMain.remove(jPanel37);
            jPanelMain.remove(jPanel8);
            jPanelMain.remove(jPanel18);
            jPanelMain.remove(jPanel27);
            jPanelMain.remove(jPanel36);
            jPanelMain.remove(jPanel45);


        }
        lstOrderPlates.setListData(orderPlates.toArray());
        lstOrderDrinks.setListData(orderDrinks.toArray());   
            
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
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSearchPlates = new javax.swing.JTextField();
        lblResultPlate = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtSearchDrink = new javax.swing.JTextField();
        lblResultDrink = new javax.swing.JLabel();
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
        txtQtyPlates = new javax.swing.JTextField();
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
        txtQtyDrinks = new javax.swing.JTextField();
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
        jLabel11 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Platos");
        jPanel11.add(jLabel1);

        jPanelMain.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(5, 0));
        jPanel12.add(jLabel12);
        jPanel12.add(jLabel13);
        jPanel12.add(jLabel14);

        txtSearchPlates.setBackground(new java.awt.Color(102, 102, 102));
        txtSearchPlates.setForeground(new java.awt.Color(255, 255, 255));
        txtSearchPlates.setText("Buscador");
        txtSearchPlates.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSearchPlates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchPlatesMouseClicked(evt);
            }
        });
        txtSearchPlates.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchPlatesKeyPressed(evt);
            }
        });
        jPanel12.add(txtSearchPlates);
        jPanel12.add(lblResultPlate);

        jPanelMain.add(jPanel12);

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Platos Pedidos");
        jPanel13.add(jLabel2);

        jPanelMain.add(jPanel13);
        jPanelMain.add(jPanel14);

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bebidas");
        jPanel15.add(jLabel3);

        jPanelMain.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout(5, 0));
        jPanel16.add(jLabel16);
        jPanel16.add(jLabel17);
        jPanel16.add(jLabel18);

        txtSearchDrink.setBackground(new java.awt.Color(102, 102, 102));
        txtSearchDrink.setForeground(new java.awt.Color(255, 255, 255));
        txtSearchDrink.setText("Buscador");
        txtSearchDrink.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSearchDrink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchDrinkMouseClicked(evt);
            }
        });
        txtSearchDrink.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchDrinkKeyPressed(evt);
            }
        });
        jPanel16.add(txtSearchDrink);
        jPanel16.add(lblResultDrink);

        jPanelMain.add(jPanel16);

        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 1, 60));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bebidas Pedidas");
        jPanel17.add(jLabel4);

        jPanelMain.add(jPanel17);
        jPanelMain.add(jPanel18);
        jPanelMain.add(jPanel19);

        jPanel20.setLayout(new java.awt.GridLayout(1, 0));

        lstPlates.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstPlates);

        jPanel20.add(jScrollPane1);

        jPanelMain.add(jPanel20);

        jPanel21.setLayout(new java.awt.GridLayout(5, 2));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/right-arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton1);
        jPanel21.add(jLabel5);

        txtQtyPlates.setBackground(new java.awt.Color(102, 102, 102));
        txtQtyPlates.setForeground(new java.awt.Color(255, 255, 255));
        txtQtyPlates.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtyPlates.setText("1");
        txtQtyPlates.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel21.add(txtQtyPlates);
        jPanel21.add(jLabel6);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/left-arrow.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton3);

        jPanelMain.add(jPanel21);

        jPanel22.setLayout(new java.awt.GridLayout(1, 0));

        lstOrderPlates.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstOrderPlates);

        jPanel22.add(jScrollPane2);

        jPanelMain.add(jPanel22);
        jPanelMain.add(jPanel23);

        jPanel24.setLayout(new java.awt.GridLayout(1, 0));

        lstDrinks.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstDrinks);

        jPanel24.add(jScrollPane3);

        jPanelMain.add(jPanel24);

        jPanel25.setLayout(new java.awt.GridLayout(5, 2));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/right-arrow.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton2);
        jPanel25.add(jLabel7);

        txtQtyDrinks.setBackground(new java.awt.Color(102, 102, 102));
        txtQtyDrinks.setForeground(new java.awt.Color(255, 255, 255));
        txtQtyDrinks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtyDrinks.setText("1");
        txtQtyDrinks.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel25.add(txtQtyDrinks);
        jPanel25.add(jLabel8);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/left-arrow.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton4);

        jPanelMain.add(jPanel25);

        jPanel26.setLayout(new java.awt.GridLayout(1, 0));

        lstOrderDrinks.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstOrderDrinks);

        jPanel26.add(jScrollPane4);

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
        jPanelMain.add(jPanel36);
        jPanelMain.add(jPanel37);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mesa:");
        jPanel38.add(jLabel9);

        jPanelMain.add(jPanel38);

        jPanel39.setLayout(new java.awt.GridLayout(5, 0));

        jcbTables.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel39.add(jcbTables);

        jPanelMain.add(jPanel39);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Descuento:");
        jPanel40.add(jLabel10);

        jPanelMain.add(jPanel40);

        jPanel41.setLayout(new java.awt.GridLayout(5, 0));

        txtDiscount.setBackground(new java.awt.Color(102, 102, 102));
        txtDiscount.setForeground(new java.awt.Color(255, 255, 255));
        txtDiscount.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel41.add(txtDiscount);

        jPanelMain.add(jPanel41);

        jPanel42.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("%");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel42.add(jLabel11);

        jPanelMain.add(jPanel42);
        jPanelMain.add(jPanel43);

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel44.add(btnAdd);

        jPanelMain.add(jPanel44);
        jPanelMain.add(jPanel45);

        getContentPane().add(jPanelMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Plate selectedPlate = (Plate)lstPlates.getSelectedValue();
        
        try{
            int qty = Integer.parseInt(txtQtyPlates.getText().trim());
            for (int i = 1; i <= qty; i++) {
                orderPlates.add(selectedPlate);
            }
        }catch(NumberFormatException e){
            System.out.println("Fail" + e.getMessage());
        }
        txtQtyPlates.setText("1");
        lstOrderPlates.setListData(orderPlates.toArray());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Plate selectedPlate = (Plate)lstOrderPlates.getSelectedValue();
        
        try{
            int qty = Integer.parseInt(txtQtyPlates.getText().trim());
            for (int i = 1; i <= qty; i++) {                
                orderPlates.remove(selectedPlate);
            }
        }catch(NumberFormatException e){
            System.out.println("Fail" + e.getMessage());
        }
        
        txtQtyPlates.setText("1");
        lstOrderPlates.setListData(orderPlates.toArray());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Drink selectedDrink = (Drink)lstDrinks.getSelectedValue();
        
        try{
            int qty = Integer.parseInt(txtQtyDrinks.getText().trim());
            for (int i = 1; i <= qty; i++) {
                orderDrinks.add(selectedDrink);
            }
        }catch(NumberFormatException e){
            System.out.println("Fail" + e.getMessage());
        }
        
        txtQtyDrinks.setText("1");
        lstOrderDrinks.setListData(orderDrinks.toArray());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Drink selectedDrink = (Drink)lstOrderDrinks.getSelectedValue();
        
        try{
            int qty = Integer.parseInt(txtQtyDrinks.getText().trim());
            for (int i = 1; i <= qty; i++) {
                orderDrinks.remove(selectedDrink);
            }
        }catch(NumberFormatException e){
            System.out.println("Fail" + e.getMessage());
        }
        
        txtQtyDrinks.setText("1");        
        lstOrderDrinks.setListData(orderDrinks.toArray());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if(isAnUpdate){
            this.dispose();
        }else{
            WindowMain wMain = new WindowMain(model);
            wMain.setVisible(true);
            this.dispose();            
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Order newOrder;
        
        String table = jcbTables.getSelectedItem().toString();
        int number = Integer.parseInt(Character.toString(table.charAt(table.length() - 1)));
        float discount = 0;
        if(!txtDiscount.getText().equals("")){
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
            if(isAnUpdate){
                receivedOrder.setOrderChanges(orderPlates, orderDrinks, discount, selectedTable);
                this.dispose();
            }else{
                newOrder = new Order(orderPlates, orderDrinks, discount, selectedTable);
                model.addOrder(newOrder);
                jcbTables.setSelectedIndex(0);
                txtDiscount.setText("");
                orderDrinks = new ArrayList<>();
                orderPlates = new ArrayList<>();
                lstOrderDrinks.setListData(orderDrinks.toArray());
                lstOrderPlates.setListData(orderPlates.toArray());
                newOrder = null;
                JOptionPane.showMessageDialog(this,"La Orden fue agregada correctamente","" , JOptionPane.INFORMATION_MESSAGE);
            
            }
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSearchPlatesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchPlatesKeyPressed
        String search = txtSearchPlates.getText().trim();
        ArrayList<Plate> listOfPlates = model.searchPlates(search.toLowerCase());
        if(!listOfPlates.isEmpty()){
            lblResultPlate.setText("");
            lstPlates.setSelectedValue(listOfPlates.get(0), true);
        }else{
            lblResultPlate.setText("No se encontraron resultados");
        }
    }//GEN-LAST:event_txtSearchPlatesKeyPressed

    private void txtSearchDrinkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchDrinkKeyPressed
        String search = txtSearchDrink.getText().trim();
        ArrayList<Drink> listOfDrinks = model.searchDrink(search.toLowerCase());
        if(!listOfDrinks.isEmpty()){
            lblResultDrink.setText("");
            lstDrinks.setSelectedValue(listOfDrinks.get(0), true);
        }else{
            lblResultDrink.setText("No se encontraron resultados");
        }
    }//GEN-LAST:event_txtSearchDrinkKeyPressed

    private void txtSearchPlatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchPlatesMouseClicked
        if(txtSearchPlates.getText().trim().equals("Buscador")){
            txtSearchPlates.setText("");
        }
    }//GEN-LAST:event_txtSearchPlatesMouseClicked

    private void txtSearchDrinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchDrinkMouseClicked
        if(txtSearchDrink.getText().trim().equals("Buscador")){
            txtSearchDrink.setText("");
        }
    }//GEN-LAST:event_txtSearchDrinkMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox jcbTables;
    private javax.swing.JLabel lblResultDrink;
    private javax.swing.JLabel lblResultPlate;
    private javax.swing.JList lstDrinks;
    private javax.swing.JList lstOrderDrinks;
    private javax.swing.JList lstOrderPlates;
    private javax.swing.JList lstPlates;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtQtyDrinks;
    private javax.swing.JTextField txtQtyPlates;
    private javax.swing.JTextField txtSearchDrink;
    private javax.swing.JTextField txtSearchPlates;
    // End of variables declaration//GEN-END:variables
}
