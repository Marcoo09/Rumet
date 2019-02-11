package windows;

import domain.Model;
import domain.Order;
import domain.Table;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * @author Marco Fiorito
 */
public class WindowBoxOrderList extends javax.swing.JFrame implements Observer{
    
    Model model;
    private static JButton[][] buttons;

    public WindowBoxOrderList(Model m) {
        model = m;
        model.addObserver(this);
        initComponents();
               
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Rectangle winSize = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        panelAuxiliarButtons.setPreferredSize(new Dimension(winSize.width,winSize.height / 10));
        
        this.createButtonMatrix();
    }

    public void createButtonMatrix(){               
        ArrayList<Table> listOfTables = model.getListOfTables();
        
        int columns = 8;
        int rows = (listOfTables.size() / 8);       
        
        Border thinBorder = LineBorder.createBlackLineBorder();

        panelButtons.setLayout(new GridLayout(columns, rows));
        buttons = new JButton[columns][rows];
        
        int tableIndex = 0;

        for (int i = 0; i < columns; i++) {
           for (int j = 0; j < rows; j++) {
               Table table = listOfTables.get(tableIndex);
               JButton jButton = new JButton();
               jButton.addMouseListener(new ButtonListener(i, j));               
               jButton.setContentAreaFilled(false);
               jButton.setOpaque(true);
               jButton.setText(table.getNumber() + "");
               jButton.setBorder(thinBorder);              
               
               panelButtons.add(jButton);
               
               buttons[i][j] = jButton;
               buttons[i][j].setFocusPainted(false);
               
               if(model.isAndOrderInThatTable(table.getNumber())){                   
                   buttons[i][j].setBackground(Color.decode("#992b1d"));
                           
               }else{
                    buttons[i][j].setBackground(Color.decode("#299e50"));                   
               }
               buttons[i][j].setForeground(Color.WHITE);
               tableIndex++;
           }
       } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAuxiliarButtons = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBack3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelButtons = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 0));

        panelAuxiliarButtons.setLayout(new java.awt.GridLayout(10, 10));
        panelAuxiliarButtons.add(jLabel1);
        panelAuxiliarButtons.add(jLabel2);
        panelAuxiliarButtons.add(jLabel3);
        panelAuxiliarButtons.add(jLabel4);
        panelAuxiliarButtons.add(jLabel5);
        panelAuxiliarButtons.add(jLabel6);
        panelAuxiliarButtons.add(jLabel7);
        panelAuxiliarButtons.add(jLabel8);
        panelAuxiliarButtons.add(jLabel9);

        btnBack3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Back_32px.png"))); // NOI18N
        btnBack3.setText("Volver");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });
        panelAuxiliarButtons.add(btnBack3);
        panelAuxiliarButtons.add(jLabel10);
        panelAuxiliarButtons.add(jLabel11);
        panelAuxiliarButtons.add(jLabel12);
        panelAuxiliarButtons.add(jLabel13);
        panelAuxiliarButtons.add(jLabel14);
        panelAuxiliarButtons.add(jLabel15);
        panelAuxiliarButtons.add(jLabel16);
        panelAuxiliarButtons.add(jLabel17);
        panelAuxiliarButtons.add(jLabel18);
        panelAuxiliarButtons.add(jLabel19);
        panelAuxiliarButtons.add(jLabel20);
        panelAuxiliarButtons.add(jLabel21);
        panelAuxiliarButtons.add(jLabel22);
        panelAuxiliarButtons.add(jLabel23);
        panelAuxiliarButtons.add(jLabel24);
        panelAuxiliarButtons.add(jLabel25);
        panelAuxiliarButtons.add(jLabel26);
        panelAuxiliarButtons.add(jLabel27);
        panelAuxiliarButtons.add(jLabel28);
        panelAuxiliarButtons.add(jLabel29);
        panelAuxiliarButtons.add(jLabel30);
        panelAuxiliarButtons.add(jLabel31);
        panelAuxiliarButtons.add(jLabel32);
        panelAuxiliarButtons.add(jLabel33);
        panelAuxiliarButtons.add(jLabel34);
        panelAuxiliarButtons.add(jLabel35);
        panelAuxiliarButtons.add(jLabel36);
        panelAuxiliarButtons.add(jLabel37);
        panelAuxiliarButtons.add(jLabel38);
        panelAuxiliarButtons.add(jLabel39);
        panelAuxiliarButtons.add(jLabel40);
        panelAuxiliarButtons.add(jLabel41);
        panelAuxiliarButtons.add(jLabel42);
        panelAuxiliarButtons.add(jLabel43);
        panelAuxiliarButtons.add(jLabel44);
        panelAuxiliarButtons.add(jLabel45);
        panelAuxiliarButtons.add(jLabel46);
        panelAuxiliarButtons.add(jLabel47);
        panelAuxiliarButtons.add(jLabel48);
        panelAuxiliarButtons.add(jLabel49);
        panelAuxiliarButtons.add(jLabel50);
        panelAuxiliarButtons.add(jLabel51);
        panelAuxiliarButtons.add(jLabel52);
        panelAuxiliarButtons.add(jLabel53);
        panelAuxiliarButtons.add(jLabel54);
        panelAuxiliarButtons.add(jLabel55);
        panelAuxiliarButtons.add(jLabel56);
        panelAuxiliarButtons.add(jLabel57);
        panelAuxiliarButtons.add(jLabel58);
        panelAuxiliarButtons.add(jLabel59);
        panelAuxiliarButtons.add(jLabel60);
        panelAuxiliarButtons.add(jLabel61);
        panelAuxiliarButtons.add(jLabel62);
        panelAuxiliarButtons.add(jLabel63);
        panelAuxiliarButtons.add(jLabel64);
        panelAuxiliarButtons.add(jLabel65);
        panelAuxiliarButtons.add(jLabel66);
        panelAuxiliarButtons.add(jLabel67);
        panelAuxiliarButtons.add(jLabel68);
        panelAuxiliarButtons.add(jLabel69);
        panelAuxiliarButtons.add(jLabel70);
        panelAuxiliarButtons.add(jLabel71);
        panelAuxiliarButtons.add(jLabel72);
        panelAuxiliarButtons.add(jLabel73);
        panelAuxiliarButtons.add(jLabel74);
        panelAuxiliarButtons.add(jLabel75);
        panelAuxiliarButtons.add(jLabel76);
        panelAuxiliarButtons.add(jLabel77);
        panelAuxiliarButtons.add(jLabel78);
        panelAuxiliarButtons.add(jLabel79);
        panelAuxiliarButtons.add(jLabel80);
        panelAuxiliarButtons.add(jLabel81);
        panelAuxiliarButtons.add(jLabel82);
        panelAuxiliarButtons.add(jLabel83);
        panelAuxiliarButtons.add(jLabel84);
        panelAuxiliarButtons.add(jLabel85);
        panelAuxiliarButtons.add(jLabel86);
        panelAuxiliarButtons.add(jLabel87);
        panelAuxiliarButtons.add(jLabel88);
        panelAuxiliarButtons.add(jLabel89);
        panelAuxiliarButtons.add(jLabel90);
        panelAuxiliarButtons.add(jLabel91);
        panelAuxiliarButtons.add(jLabel92);
        panelAuxiliarButtons.add(jLabel93);
        panelAuxiliarButtons.add(jLabel94);
        panelAuxiliarButtons.add(jLabel95);
        panelAuxiliarButtons.add(jLabel96);
        panelAuxiliarButtons.add(jLabel97);
        panelAuxiliarButtons.add(jLabel98);
        panelAuxiliarButtons.add(jLabel99);

        getContentPane().add(panelAuxiliarButtons);

        jPanel1.setLayout(new java.awt.CardLayout(100, 30));

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(panelButtons, "card2");

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        WindowMain wMain = new WindowMain(model);
        wMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnBack3;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelAuxiliarButtons;
    private javax.swing.JPanel panelButtons;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class ButtonListener implements MouseListener {

        private int x;
        private int y;

        public ButtonListener(int i, int j) {
            x = i;
            y = j;
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            int tableNumber = Integer.parseInt(buttons[x][y].getText());
            Order currentOrder = null;
            boolean founded = false;
            
            for(int i = 0 ; i < model.getSortedListOfOrders().size() && !founded; i++){
                if(model.getSortedListOfOrders().get(i).getTable().getNumber() == tableNumber){
                    currentOrder = model.getSortedListOfOrders().get(i);
                    founded = true;
                }
            }
            if(founded){
                WindowBoxOrderDisplay wOrderDisplay = new WindowBoxOrderDisplay(model, currentOrder);
                wOrderDisplay.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Esta mesa no tiene pedidos actualmente","" , JOptionPane.ERROR_MESSAGE);
            }
        }

        @Override
        public void mousePressed(MouseEvent me) {
            System.out.println("Mouse Pressed");
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            System.out.println("Mouse Released");
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            if(model.isAndOrderInThatTable(Integer.parseInt(buttons[x][y].getText()))){                   
                buttons[x][y].setBackground(Color.decode("#d13c29"));
            }else{
                buttons[x][y].setBackground(Color.decode("#31b75e"));                                        
            }            
        }

        @Override
        public void mouseExited(MouseEvent me) {
            if(model.isAndOrderInThatTable(Integer.parseInt(buttons[x][y].getText()))){                   
                buttons[x][y].setBackground(Color.decode("#992b1d"));
            }else{
                buttons[x][y].setBackground(Color.decode("#299e50"));                   
            }
        }
    }
}
