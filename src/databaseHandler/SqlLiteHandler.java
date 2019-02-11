package databaseHandler;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Marco Fiorito
 */
public class SqlLiteHandler extends Db{
    
          
    public SqlLiteHandler(String sDriverKey, String sUrlKey){
        try {
            init(sDriverKey, sUrlKey);
        } catch (Exception ex) {
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn != null){
            System.out.println("Connected OK using " + sDriverKey + " to " + sUrlKey);
        }else{
            System.out.println("Connection failed");
        }
    }

    public void createTables(){
        String createClient = "CREATE TABLE IF NOT EXISTS Client ( " +
                            "  ClientId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            "  ClientName VARCHAR(255), " +
                            "  ClientRut  VARCHAR(255) " +
                            ")";
        String createDrink = "CREATE TABLE IF NOT EXISTS Drink ( " +
                        "  DrinkId         INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "  DrinkType        VARCHAR(255), " +
                        "  DrinkSize        VARCHAR(255), " +
                        "  DrinkCost        INTEGER, " +
                        "  DrinkDescription VARCHAR(255), " +
                        "  DrinkBrand       SMALLINT" +
                        "    )";
        
        String createPlate = "CREATE TABLE IF NOT EXISTS Plate (" +
                        "  PlateId            INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "  PlateMainPlate      VARCHAR(255), " +
                        "  PlateSecondaryPlate VARCHAR(255), " +
                        "  PlateSauce          VARCHAR(255), " +
                        "  PlateCost           INT, " +
                        "  PlateDescription    VARCHAR(255)" +
                        ")";        
        String createTable = "CREATE TABLE IF NOT EXISTS TableR (" +
                   "TableId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                   " TableNumber INTEGER " + 
                   " )";
        
       /* String createOrder = "CREATE TABLE IF NOT EXISTS Order ( " +
                        "  OrderId       INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "  OrderDate     DATETIME, " +
                        "  TableId       INTEGER, " +
                        "  OrderDiscount INTEGER, " +
                        "  OrdenSubTotal INTEGER, " +
                        "  OrderTotal    INTEGER " +
                        "     )";
        
        String createOrderDrink = "CREATE TABLE IF NOT EXISTS OrderDrink ( " +
                            "  OrderId INTEGER NOT NULL , " +
                            "  DrinkId INTEGER NOT NULL,  " +
                            "     PRIMARY KEY ( OrderId,DrinkId ))";

        String createOrderPlate = "CREATE TABLE IF NOT EXISTS OrderPlate ( " +
                            "  OrderId INTEGER NOT NULL , " +
                            "  PlateId INTEGER NOT NULL, " +
                            "     PRIMARY KEY ( OrderId,PlateId ))";*/
        
      /*  String createClient = "CREATE TABLE CLIENT " +
                   "(id INTEGER not NULL AUTOINCREMENT, "
                    + "id VARCHAR(255), " +
                   " name VARCHAR(255), " + 
                   " PRIMARY KEY ( rut ))"; */
        
        /*String createDrink = "CREATE TABLE DRINK " +
                   "(id INTEGER not NULL AUTOINCREMENT, " +
                   " brand VARCHAR(255), " + 
                   " type VARCHAR(255), " + 
                   " size VARCHAR(255), " + 
                    " cost INTEGER, " +
                    " description VARCHAR(255), " +
                   " PRIMARY KEY ( id ))";  */
        
        /*String createPlate = "CREATE TABLE PLATE " +
                   "(PlateId INTEGER not NULL AUTOINCREMENT, " +
                   " PlateMainPlate VARCHAR(255), " + 
                   " secondaryPlate VARCHAR(255), " + 
                   " sauce VARCHAR(255), " + 
                    " cost INTEGER, " +
                    " description VARCHAR(255), " +                
                   " PRIMARY KEY ( id ))"; */
        
       /* String createTable = "CREATE TABLE TABLE " +
                   "(id INTEGER not NULL AUTOINCREMENT, " +
                   " number INTEGER, " + 
                   " PRIMARY KEY ( id ))";  */
                
       /* String createOrder = "CREATE TABLE ORDER " +
                   "(id INTEGER not NULL AUTOINCREMENT, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))";  */  

        
        
        /*String createModel = "CREATE TABLE MODEL " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; */
        
      /*  String createModel = "CREATE TABLE [Model] ( " +
                        "  [ModelId] SMALLINT    NOT NULL, " +
                        "     PRIMARY KEY ( [ModelId] ))";
        
        String createModelDrink = "CREATE TABLE [ModelListOfDrink] ( " +
                            "  [ModelId] SMALLINT    NOT NULL, " +
                            "  [DrinkId] SMALLINT    NOT NULL, " +
                            "     PRIMARY KEY ( [ModelId],[DrinkId] ))" +
                            "CREATE NONCLUSTERED INDEX [IMODELLISTOFDRINK1] ON [ModelListOfDrink] ( " +
                            "      [DrinkId])" +
                            "ALTER TABLE [ModelListOfDrink] " +
                            " ADD CONSTRAINT [IMODELLISTOFDRINK2] FOREIGN KEY ( [ModelId] ) REFERENCES [Model]([ModelId])" +
                            "ALTER TABLE [ModelListOfDrink] " +
                            " ADD CONSTRAINT [IMODELLISTOFDRINK1] FOREIGN KEY ( [DrinkId] ) REFERENCES [Drink]([DrinkId])";
     
     
        String createModelPlate = "CREATE TABLE [ModelListOfPlates] ( " +
                            "  [ModelId] SMALLINT    NOT NULL, " +
                            "  [PlateId] SMALLINT    NOT NULL, " +
                            "     PRIMARY KEY ( [ModelId],[PlateId] ))" +
                            "CREATE NONCLUSTERED INDEX [IMODELLISTOFPLATES1] ON [ModelListOfPlates] ( " +
                            "      [PlateId])" +
                            "ALTER TABLE [ModelListOfPlates] " +
                            " ADD CONSTRAINT [IMODELLISTOFPLATES2] FOREIGN KEY ( [ModelId] ) REFERENCES [Model]([ModelId])" +
                            "ALTER TABLE [ModelListOfPlates] " +
                            " ADD CONSTRAINT [IMODELLISTOFPLATES1] FOREIGN KEY ( [PlateId] ) REFERENCES [Plate]([PlateId])";*/
        int i = 0;
        try {
            i++;
            executeStmt(createClient);
        } catch (SQLException ex) {
            System.out.println("" + i);
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            i++;
            executeStmt(createDrink);
        } catch (SQLException ex) {
            System.out.println("" + i);
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            i++;            
            executeStmt(createPlate);
        } catch (SQLException ex) {
            System.out.println("" + i);            
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            i++;            
            executeStmt(createTable);
        } catch (SQLException ex) {
            System.out.println("" + i);            
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
      /*  try {
            i++;            
            executeStmt(createOrder);
            System.out.println("works 5");                                    
        } catch (SQLException ex) {
            System.out.println("" + i);            
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            i++;            
            executeStmt(createOrderDrink);
            System.out.println("works 6");                                                
        } catch (SQLException ex) {
            System.out.println("" + i);   
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            i++;            
            executeStmt(createOrderPlate);
            System.out.println("works 7");                                                            
        } catch (SQLException ex) {
            System.out.println("" + i);            
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*try {
            i++;            
            stmt.executeUpdate(createModel);
        } catch (SQLException ex) {
            System.out.println("" + i);            
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            i++;            
            stmt.executeUpdate(createModelDrink);
        } catch (SQLException ex) {
            System.out.println("" + i);            
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            i++;            
            stmt.executeUpdate(createModelPlate);
        } catch (SQLException ex) {
            System.out.println("" + i);            
            Logger.getLogger(SqlLiteHandler.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    
    }
    
}
