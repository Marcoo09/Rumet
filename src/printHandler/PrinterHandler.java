package printHandler;

import java.awt.print.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

/**
 * @author Marco Fiorito
 */
public class PrinterHandler {
    
    /*public void sendToPrinter() throws PrinterException, PrintException{
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
    
    public void sendToPrinter2(){
        FileInputStream psStream = null;  
        try {  
            psStream = new FileInputStream("account.pdf");
        } catch (FileNotFoundException ffne) {  
            ffne.printStackTrace();  
        }  
        if (psStream == null) {  
            return;
        } 

        // Set the document type
        DocFlavor myFormat = DocFlavor.INPUT_STREAM.TEXT_PLAIN_US_ASCII;
        // Create a Doc
        Doc myDoc = new SimpleDoc(psStream, myFormat, null); 
        // Build a set of attributes
        PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet(); 
        aset.add(new Copies(1)); 
       // aset.add(MediaSize.ISO.A4);
        aset.add(Sides.DUPLEX); 
        // discover the printers that can print the format according to the
        // instructions in the attribute set
        PrintService[] services = PrintServiceLookup.lookupPrintServices(myFormat, aset);
        // Create a print job from one of the print services
        if (services.length > 0) { 
            DocPrintJob job = services[0].createPrintJob(); 
        try { 
           job.print(myDoc, aset); 
        } catch (PrintException pe) {} 
        } 

    }
    */
    public void sendToPrinter() throws IOException{
    // Indicamos el nombre del archivo Pdf que deseamos imprimir
        PDDocument document = PDDocument.load(new File("./account.pdf"));

        PrinterJob job = PrinterJob.getPrinterJob();

      //  LOGGER.log(Level.INFO, "Mostrando el dialogo de impresion");
        //if (job.printDialog() == true) {            
            job.setPageable(new PDFPageable(document));
        try {
            job.print();
        } catch (PrinterException ex) {
            Logger.getLogger(PrinterHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        //}  
    }

}
