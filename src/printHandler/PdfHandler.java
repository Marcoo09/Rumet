package printHandler;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import domain.Drink;
import domain.Order;
import domain.Plate;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Marco Fiorito
 */
public class PdfHandler {
    
    public void createSimplePdf(Order order, int subtotal, float discount, int total){
        ArrayList<Plate> listOfPlates = order.getListOfPlates();
        ArrayList<Drink> listOfDrinks = order.getListOfDrinks();
        Date date = order.getDate();
        
        Document document = new Document();
        document.setPageSize(com.itextpdf.text.PageSize.A4.rotate()); // for horizontal layout

        PdfWriter writer = null;
        Font mainFont = FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(60, 60, 60, 100));
        Font secondaryFont = FontFactory.getFont(FontFactory.COURIER, 12, Font.BOLD, new CMYKColor(60, 60, 60, 100));
        Font thirdFont = FontFactory.getFont(FontFactory.COURIER, 10, Font.BOLD, new CMYKColor(60, 60, 60, 100));
        Font mainBlackFont = FontFactory.getFont(FontFactory.COURIER, 16, Font.BOLD, new CMYKColor(75, 68, 67, 90));
        
        try {
            writer = PdfWriter.getInstance(document, new FileOutputStream("account.pdf"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PdfHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PdfHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        document.open();
        try {
            
            PdfPTable table = new PdfPTable(2); // 2 columns.
            table.setWidthPercentage(50); //Width 100%
            table.setSpacingBefore(0f); //Space before table
            table.setSpacingAfter(0f); //Space after table
            table.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            //Set Column widths
            float[] columnWidths = {1f, 1f};
            table.setWidths(columnWidths);

            PdfPCell cell1 = new PdfPCell(new Paragraph(""));
            cell1.setBorderColor(BaseColor.WHITE);
            cell1.setPaddingLeft(10);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            
            cell1.addElement(new Paragraph("Mesa " + order.getTable().getNumber() + " Día: " + date.getDay() + " Hora: " + date.getHours(), mainFont));
            cell1.addElement(new Chunk(new LineSeparator()));
            

            cell1.addElement(new Paragraph("Platos: ", secondaryFont));
            cell1.addElement(new Chunk(new LineSeparator()));

            for(int i = 0; i < listOfPlates.size(); i++){
                Plate currentPlate = listOfPlates.get(i);
                String fullPlate = currentPlate.getMainPlate();
                if(!currentPlate.getSecondaryPlate().equals("")){
                    fullPlate += " con " + currentPlate.getSecondaryPlate();
                }
                cell1.addElement(new Paragraph(fullPlate, thirdFont));
            }
            
            cell1.addElement(new Chunk(new LineSeparator()));

            cell1.addElement(new Paragraph("Bebidas: ", secondaryFont));
            
            cell1.addElement(new Chunk(new LineSeparator()));

            for(int i = 0; i < listOfDrinks.size(); i++){
                Drink currentDrink = listOfDrinks.get(i);
                String drink = currentDrink.getBrand() + " " + currentDrink.getSize() + "LT";
                cell1.addElement(new Paragraph(drink, thirdFont));
            }
                        
            PdfPCell cell2 = new PdfPCell(new Paragraph(""));
            cell2.setBorderColor(BaseColor.WHITE);
            cell2.setPaddingLeft(10);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
            
            Paragraph p = new Paragraph();
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            p.add(new Paragraph(" ", secondaryFont));
            
            cell2.addElement(p);
            
            for(int i = 0; i < listOfPlates.size(); i++){
                Plate currentPlate = listOfPlates.get(i);
                cell2.addElement(new Paragraph("" + currentPlate.getCost() + "$", thirdFont));
            }

            cell2.addElement(new Paragraph("\n\n\n"));

            
            for(int i = 0; i < listOfDrinks.size(); i++){
                Drink currentDrink = listOfDrinks.get(i);
                cell2.addElement(new Paragraph("" +currentDrink.getCost() + "$", thirdFont));
            }
            
            cell2.addElement(new Paragraph("\n\n\n"));
            
            cell2.addElement(new Paragraph("Subtotal: " + subtotal + "$", secondaryFont));
            cell2.addElement(new Paragraph("Descuento: " + discount + "%", thirdFont));
            cell2.addElement(new Paragraph("Total: " + total + "$", mainBlackFont));
            
            table.addCell(cell1);
            table.addCell(cell2);
            
            document.add(table);
            document.close();
            writer.close();
        } catch (DocumentException ex) {
            Logger.getLogger(PdfHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
