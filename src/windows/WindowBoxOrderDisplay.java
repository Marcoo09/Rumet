package windows;

import com.itextpdf.text.Document;
import domain.Drink;
import domain.KitchenPossibilities;
import domain.Model;
import domain.Order;
import domain.Plate;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintException;
import javax.swing.JFrame;
import printHandler.PdfHandler;
import printHandler.PrinterHandler;

/**
 * @author Marco Fiorito
 */
public class WindowBoxOrderDisplay extends javax.swing.JFrame {
    private Model model;
    private Order order;
    private ArrayList<KitchenPossibilities> listOfKitchenPossibilities;
    private int subtotal = 0;
    private float discount = 0;
    private int total = 0;
    
    public WindowBoxOrderDisplay(Model m, Order o) {
        model = m;
        order = o;
        ArrayList<Plate> plates = order.getListOfPlates();
        ArrayList<Drink> drinks= order.getListOfDrinks();
        listOfKitchenPossibilities = new ArrayList<>();
        discount = order.getDiscount();
        
        initComponents();
        
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        setSize(screenWidth / 2 , winSize.height+ 10 );
        setLocation(-7,0);
      
      for(int i = 0; i < plates.size();i++){
          listOfKitchenPossibilities.add(plates.get(i));
          subtotal += plates.get(i).getCost();
      }  
         for(int i = 0; i < drinks.size();i++){
          listOfKitchenPossibilities.add(drinks.get(i));
          subtotal += drinks.get(i).getCost();
      }  
      
         if(discount == 0){
             total = subtotal;
         }else{
             total = subtotal - (int)(subtotal * (discount / 100));
         }
         
         txtSubTotal.setText("" + subtotal);
         txtDiscount.setText("" + discount);
         txtTotal.setText("" + total);
         lstPlatesAndDrinks.setListData(listOfKitchenPossibilities.toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPlatesAndDrinks = new javax.swing.JList();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnAddPlatesOrDinrks = new javax.swing.JButton();
        btnImpress = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new java.awt.GridLayout(2, 1));

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        lstPlatesAndDrinks.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstPlatesAndDrinks);

        jPanel5.add(jScrollPane1);

        jPanel2.add(jPanel5);

        jPanel10.setLayout(new java.awt.GridLayout(5, 2));
        jPanel10.add(jLabel1);
        jPanel10.add(jLabel2);
        jPanel10.add(jLabel12);
        jPanel10.add(jLabel13);
        jPanel10.add(jLabel14);
        jPanel10.add(jLabel15);
        jPanel10.add(jLabel16);

        jLabel17.setText("Subtotal: ");
        jPanel10.add(jLabel17);

        txtSubTotal.setEditable(false);
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(txtSubTotal);
        jPanel10.add(jLabel18);

        jLabel19.setText("Descuento: ");
        jPanel10.add(jLabel19);

        txtDiscount.setEditable(false);
        txtDiscount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(txtDiscount);
        jPanel10.add(jLabel20);

        jLabel21.setText("Total: ");
        jPanel10.add(jLabel21);

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(txtTotal);

        jPanel2.add(jPanel10);

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout(10, 2));
        jPanel8.add(jLabel3);
        jPanel8.add(jLabel4);
        jPanel8.add(jLabel5);
        jPanel8.add(jLabel6);
        jPanel8.add(jLabel7);
        jPanel8.add(jLabel8);
        jPanel8.add(jLabel9);
        jPanel8.add(jLabel10);
        jPanel8.add(jLabel11);
        jPanel8.add(jLabel22);
        jPanel8.add(jLabel23);
        jPanel8.add(jLabel24);
        jPanel8.add(jLabel25);
        jPanel8.add(jLabel26);
        jPanel8.add(jLabel27);
        jPanel8.add(jLabel28);
        jPanel8.add(jLabel29);
        jPanel8.add(jLabel30);

        btnAddPlatesOrDinrks.setText("Agregar");
        btnAddPlatesOrDinrks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlatesOrDinrksActionPerformed(evt);
            }
        });
        jPanel8.add(btnAddPlatesOrDinrks);

        btnImpress.setText("Imprimir");
        btnImpress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpressActionPerformed(evt);
            }
        });
        jPanel8.add(btnImpress);

        jPanel3.add(jPanel8);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPlatesOrDinrksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlatesOrDinrksActionPerformed
        WindowOrder modifiedOrder = new WindowOrder(model, order);
        modifiedOrder.setVisible(true);
    }//GEN-LAST:event_btnAddPlatesOrDinrksActionPerformed

    private void btnImpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpressActionPerformed
        model.addFinalizedorder(order);
        model.removeOrder(order);
        
        /*Codigo imprimir*/
        PdfHandler pdfHandler = new PdfHandler();
        Document doc = pdfHandler.createSimplePdf(order, subtotal, discount, total);
        
        PrinterHandler printerHandler = new PrinterHandler();
        try {
            printerHandler.sendToPrinter(doc);
        } catch (PrinterException ex) {
            Logger.getLogger(WindowBoxOrderDisplay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PrintException ex) {
            Logger.getLogger(WindowBoxOrderDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
    }//GEN-LAST:event_btnImpressActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPlatesOrDinrks;
    private javax.swing.JButton btnImpress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstPlatesAndDrinks;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
