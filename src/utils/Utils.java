package utils;

import domain.Model;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Marco Fiorito
 */
public class Utils {
  
     public static void serialize(Model model){
             FileOutputStream fileOutput = null;
        try {
            fileOutput = new FileOutputStream("Data");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      BufferedOutputStream buffer = new BufferedOutputStream(fileOutput);
      ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(buffer);
        } catch (IOException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            stream.writeObject(model);
             stream.flush();
            stream.close();
        } catch (IOException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
        
    public static boolean validateAttribute(int numberToValidate, int intialRange, int finalRange) {
        //Check if the first parameter is between the range
        boolean returnValue = (numberToValidate >= intialRange && numberToValidate <= finalRange);
        return returnValue;
    }
    
    public static boolean validateRange(int numberToValidate, int intialRange, int finalRange) {
        //Check if the first parameter is between the range        
        return (numberToValidate >= intialRange && numberToValidate <= finalRange);
    }
        
}
