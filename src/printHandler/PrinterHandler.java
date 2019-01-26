package printHandler;

import java.awt.print.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;

/**
 * @author Marco Fiorito
 */
public class PrinterHandler {
    
    public void sendToPrinter() throws PrinterException, PrintException{
        FileInputStream psStream = null;  
        try {  
            psStream = new FileInputStream("account.pdf");
        } catch (FileNotFoundException ffne) {  
            ffne.printStackTrace();  
        }  
        if (psStream == null) {  
            return;
        } 
             
        DocFlavor psInFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;  
        DocAttributeSet das = new HashDocAttributeSet();
        Doc myDoc = new SimpleDoc(psStream, psInFormat, das);    
        PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();  
        PrintService services = PrintServiceLookup.lookupDefaultPrintService();  
        DocPrintJob job = services.createPrintJob();  
        try {  
             job.print(myDoc, aset);  
        } catch (Exception pe){
            pe.printStackTrace();
        }  
    }

}
