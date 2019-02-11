package controller;

import databaseHandler.SqlLiteHandler;
import domain.Model;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import test.addingData;
import utils.Utils;
import windows.login.WindowLogin;

/**
 * @author Marco Fiorito
 */
public class Rumet {
    private static Model model;
    
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException {
        model = new Model();
        /*Dummy data*/
        addingData testClass = new addingData(model);
        testClass.addingInitialApplicationData();
        /*Dummy data*/
        
        /*Creating or loading database*/        
        String sUrlString = "jdbc:sqlite:Rumet.db";
        SqlLiteHandler mydb = new SqlLiteHandler("org.sqlite.JDBC",sUrlString);
        mydb.createTables();
        /*Creating or loading database*/

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        File f1 = new File("Data");
        
        
        if(f1.exists()){
                FileInputStream file = new FileInputStream("Data");
                BufferedInputStream buffer = new BufferedInputStream(file);
                ObjectInputStream input = new ObjectInputStream(buffer);
                model =(Model)(input.readObject());
        }       
        WindowLogin login = new WindowLogin(model);
        login.setVisible(true);
        
        Runtime.getRuntime().addShutdownHook(new Thread(){
                @Override
                public void run() {
                    close();
                }                
         });
    }
    
    public static void close(){
        Utils.serialize(model);
    }
    
}
