package controller;

import domain.Model;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import windows.login.WindowLogin;

/**
 * @author Marco Fiorito
 */
public class Rumet {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException {
        Model model = new Model();
        
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
    }
    
}
