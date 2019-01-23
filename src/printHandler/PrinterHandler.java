package printHandler;

import java.awt.print.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import com.itextpdf.text.Document;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;

/**
 * @author Marco Fiorito
 */
public class PrinterHandler {
    
    public void sendToPrinter(Document document) throws PrinterException, PrintException{
        /*DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PAGEABLE;
        PrintRequestAttributeSet patts = new HashPrintRequestAttributeSet();
        patts.add(Sides.ONE_SIDED);
        PrintService[] ps = PrintServiceLookup.lookupPrintServices(flavor, patts);
        if (ps.length == 0) {
            throw new IllegalStateException("No Printer found");
        }
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintService(ps[0]);
    
        DocPrintJob printJob = job.getPrintService().createPrintJob();
        printJob.print((Doc) document, new HashPrintRequestAttributeSet());*/
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
