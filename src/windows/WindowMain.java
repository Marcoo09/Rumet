package windows;

import domain.Model;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * @author Marco Fiorito
 */
public class WindowMain extends javax.swing.JFrame {
    
    private Model model;
    
    public WindowMain(Model m) {
        model = m;
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
       
        //Size of tavs
        Dimension dimensionTab = new Dimension(1500, 1000);
       tabOrder.setSize(2000,2000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabsContainer = new javax.swing.JTabbedPane();
        tabInitial = new javax.swing.JTabbedPane();
        tabOrder = new javax.swing.JTabbedPane();
        tabPlate = new javax.swing.JTabbedPane();
        tabDrink = new javax.swing.JTabbedPane();
        tabTable = new javax.swing.JTabbedPane();
        tabClient = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabsContainer.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        tabsContainer.setToolTipText("");

        tabInitial.setToolTipText("");
        tabsContainer.addTab("Pantalla Inicial", tabInitial);

        tabOrder.setToolTipText("");
        tabOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabOrderMouseEntered(evt);
            }
        });
        tabsContainer.addTab("Orden", tabOrder);
        tabOrder.getAccessibleContext().setAccessibleDescription("");

        tabsContainer.addTab("Plato", tabPlate);
        tabsContainer.addTab("Bebida", tabDrink);
        tabsContainer.addTab("Mesa", tabTable);
        tabsContainer.addTab("Cliente", tabClient);

        getContentPane().add(tabsContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 400, 310));
        tabsContainer.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabOrderMouseClicked

    }//GEN-LAST:event_tabOrderMouseClicked

    private void tabOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabOrderMouseEntered
        WindowOrder order = new WindowOrder(model);
        order.setVisible(true);
    }//GEN-LAST:event_tabOrderMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabClient;
    private javax.swing.JTabbedPane tabDrink;
    private javax.swing.JTabbedPane tabInitial;
    private javax.swing.JTabbedPane tabOrder;
    private javax.swing.JTabbedPane tabPlate;
    private javax.swing.JTabbedPane tabTable;
    private javax.swing.JTabbedPane tabsContainer;
    // End of variables declaration//GEN-END:variables
}
