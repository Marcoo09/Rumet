package printHandler;

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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Marco Fiorito
 */
public class PdfHandler {
    
    public void createSimplePdfWithoutOptimize(Order order, int subtotal, float discount, int total){
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
                cell2.addElement(new Paragraph("" + currentDrink.getCost() + "$", thirdFont));
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
    
    public void createRutPdfWithoutOptimize(Order order, int subtotal, float discount, int total, String rut){
        ArrayList<Plate> listOfPlates = order.getListOfPlates();
        ArrayList<Drink> listOfDrinks = order.getListOfDrinks();
        Date date = order.getDate();
        
        Document document = new Document();
        document.setPageSize(com.itextpdf.text.PageSize.A5.rotate()); // for horizontal layout

        PdfWriter writer = null;
        Font mainFont = FontFactory.getFont(FontFactory.COURIER, 9, Font.BOLD, new CMYKColor(60, 60, 60, 100));
        Font secondaryFont = FontFactory.getFont(FontFactory.COURIER, 7, Font.BOLD, new CMYKColor(60, 60, 60, 100));
        Font thirdFont = FontFactory.getFont(FontFactory.COURIER, 6, Font.BOLD, new CMYKColor(60, 60, 60, 100));
        Font mainBlackFont = FontFactory.getFont(FontFactory.COURIER, 10, Font.BOLD, new CMYKColor(75, 68, 67, 90));
        
        try {
            writer = PdfWriter.getInstance(document, new FileOutputStream("account.pdf"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PdfHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PdfHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        document.open();    
        try {
            
            /*First Part of the account*/
            PdfPTable tableTop = new PdfPTable(2); // 2 columns.
            tableTop.setWidthPercentage(100); //Width 100%
            tableTop.setSpacingBefore(0f); //Space before table
            tableTop.setSpacingAfter(0f); //Space after table
            tableTop.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            //Set Column widths
            float[] columnWidths = {1f, 1f};
            tableTop.setWidths(columnWidths);
            
            PdfPCell cell1 = new PdfPCell(new Paragraph(""));
            cell1.setBorderColor(BaseColor.WHITE);
            cell1.setPaddingLeft(10);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            
            cell1.addElement(new Paragraph(" "));
            
            Paragraph rutP = new Paragraph(rut + "                    " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear() ,mainFont);
            rutP.setAlignment(Paragraph.ALIGN_LEFT);
            cell1.addElement(rutP);
            
            cell1.addElement(new Paragraph(" "));
            cell1.addElement(new Paragraph(" "));
            
            cell1.addElement(new Paragraph("       Mesa " + order.getTable().getNumber(), secondaryFont));

            cell1.addElement(new Paragraph(" "));
            cell1.addElement(new Paragraph(" "));

            for(int i = 0; i < listOfPlates.size(); i++){
                Plate currentPlate = listOfPlates.get(i);
                String fullPlate = currentPlate.getMainPlate();
                if(!currentPlate.getSecondaryPlate().equals("")){
                    fullPlate += " con " + currentPlate.getSecondaryPlate();
                }
                fullPlate += "          " + currentPlate.getCost() + "$";
                cell1.addElement(new Paragraph(fullPlate, secondaryFont));
            }
            
            for(int i = 0; i < listOfDrinks.size(); i++){
                Drink currentDrink = listOfDrinks.get(i);
                String drink = currentDrink.getBrand() + " " + currentDrink.getSize() + "LT";
                drink += "          " + currentDrink.getCost() + "$";
                cell1.addElement(new Paragraph(drink, secondaryFont));
            }
            
            PdfPCell cell2 = new PdfPCell(new Paragraph(""));
            cell2.setBorderColor(BaseColor.WHITE);
            cell2.setPaddingLeft(10);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);           
            
            cell2.addElement(new Paragraph(" "));
            
            rutP.setAlignment(Paragraph.ALIGN_LEFT);
            cell2.addElement(rutP);
            
            cell2.addElement(new Paragraph(" "));
            cell2.addElement(new Paragraph(" "));
            
            cell2.addElement(new Paragraph("       Mesa " + order.getTable().getNumber(), secondaryFont));

            cell2.addElement(new Paragraph(" "));
            cell2.addElement(new Paragraph(" "));

            for(int i = 0; i < listOfPlates.size(); i++){
                Plate currentPlate = listOfPlates.get(i);
                String fullPlate = currentPlate.getMainPlate();
                if(!currentPlate.getSecondaryPlate().equals("")){
                    fullPlate += " con " + currentPlate.getSecondaryPlate();
                }
                fullPlate += "          " + currentPlate.getCost() + "$";
                cell2.addElement(new Paragraph(fullPlate, secondaryFont));
            }
            
            for(int i = 0; i < listOfDrinks.size(); i++){
                Drink currentDrink = listOfDrinks.get(i);
                String drink = currentDrink.getBrand() + " " + currentDrink.getSize() + "LT";
                drink += "          " + currentDrink.getCost() + "$";
                cell2.addElement(new Paragraph(drink, secondaryFont));
            }
            
            tableTop.addCell(cell1);
            tableTop.addCell(cell2);
            
            document.add(tableTop);
  
            /*Second Part of the account*/            
            PdfPTable tableBottom = new PdfPTable(2);
            tableBottom.setWidths(columnWidths);
            tableBottom.setWidthPercentage(100); //Width 100%
            tableBottom.setSpacingBefore(0f); //Space before table
            tableBottom.setSpacingAfter(0f); //Space after table
            tableBottom.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            //Set Column widths
            PdfPCell cellBottom1 = new PdfPCell(new Paragraph(""));
            cellBottom1.setBorderColor(BaseColor.WHITE);
            cellBottom1.setPaddingLeft(10);
            cellBottom1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cellBottom1.setVerticalAlignment(Element.ALIGN_BOTTOM);
            
            PdfPCell cellBottom2 = new PdfPCell(new Paragraph(""));
            cellBottom2.setBorderColor(BaseColor.WHITE);
            cellBottom2.setPaddingLeft(10);
            cellBottom2.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cellBottom2.setVerticalAlignment(Element.ALIGN_BOTTOM);            

            Paragraph subTotalP = new Paragraph(subtotal + "$", mainFont);
            Paragraph discountP = new Paragraph(discount + "%", secondaryFont);
            Paragraph totalP = new Paragraph(total + "$", mainBlackFont);
            
            subTotalP.setAlignment(Paragraph.ALIGN_RIGHT);
            discountP.setAlignment(Paragraph.ALIGN_RIGHT);
            totalP.setAlignment(Paragraph.ALIGN_RIGHT);
            
            cellBottom1.addElement(subTotalP);
            cellBottom1.addElement(discountP);
            cellBottom1.addElement(totalP);

            cellBottom2.addElement(subTotalP);
            cellBottom2.addElement(discountP);
            cellBottom2.addElement(totalP);
            
            tableBottom.addCell(cellBottom1);
            tableBottom.addCell(cellBottom2);
            tableBottom.setSpacingBefore(document.getPageSize().getHeight() - tableTop.getTotalHeight() - 120);
            document.add(tableBottom);
            
            document.close();
            writer.close();
        } catch (DocumentException ex) {
            Logger.getLogger(PdfHandler.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void createRutPdf(Order order, int subtotal, float discount, int total, String rut){
        ArrayList<Plate> listOfPlates = order.getListOfPlates();
        ArrayList<Drink> listOfDrinks = order.getListOfDrinks();
        Date date = order.getDate();
        int FirstSpace = 25;
        int SecondSpace = 8;
        
        Document document = new Document();
        document.setPageSize(com.itextpdf.text.PageSize.A5.rotate()); // for horizontal layout

        PdfWriter writer = null;
        Font mainFont = FontFactory.getFont(FontFactory.COURIER, 9, Font.BOLD, new CMYKColor(60, 60, 60, 100));
        Font secondaryFont = FontFactory.getFont(FontFactory.COURIER, 7, Font.BOLD, new CMYKColor(60, 60, 60, 100));
        Font thirdFont = FontFactory.getFont(FontFactory.COURIER, 6, Font.BOLD, new CMYKColor(60, 60, 60, 100));
        Font mainBlackFont = FontFactory.getFont(FontFactory.COURIER, 10, Font.BOLD, new CMYKColor(75, 68, 67, 90));
        
        try {
            writer = PdfWriter.getInstance(document, new FileOutputStream("account.pdf"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PdfHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PdfHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        document.open();    
        try {
            
            /*First Part of the account*/
            PdfPTable tableTop = new PdfPTable(2); // 2 columns.
            tableTop.setWidthPercentage(100); //Width 100%
            tableTop.setSpacingBefore(0f); //Space before table
            tableTop.setSpacingAfter(0f); //Space after table
            tableTop.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            //Set Column widths
            float[] columnWidths = {1f, 1f};
            tableTop.setWidths(columnWidths);
            
            PdfPCell cell1 = new PdfPCell(new Paragraph(""));
            cell1.setBorderColor(BaseColor.WHITE);
            cell1.setPaddingLeft(10);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
            
            cell1.addElement(new Paragraph(" "));
            
            Paragraph rutP = new Paragraph(rut + "                    " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear() ,mainFont);
            rutP.setAlignment(Paragraph.ALIGN_LEFT);
            cell1.addElement(rutP);
            
            cell1.addElement(new Paragraph(" "));
            cell1.addElement(new Paragraph(" "));
            
            cell1.addElement(new Paragraph("       Mesa " + order.getTable().getNumber(), secondaryFont));

            cell1.addElement(new Paragraph(" "));
            cell1.addElement(new Paragraph(" "));

            HashMap<Plate,Integer> listOfPlatesWithQty = order.getPlatesAndQty();
            listOfPlatesWithQty.forEach((key,value) -> {
                Plate currentPlate = key;
                String fullPlate = currentPlate.getMainPlate();
                if(!currentPlate.getSecondaryPlate().equals("")){
                    fullPlate += " con " + currentPlate.getSecondaryPlate();
                }
                
                int space1Value = FirstSpace - fullPlate.length();
                String space1 = "";
                for (int i = 0; i < space1Value; i++) {
                    space1 += " "; 
                }
                
                String cost = currentPlate.getCost() + "$";
                int space2Value = SecondSpace - cost.length();
                String space2 = "";
                for (int i = 0; i < space2Value; i++) {
                    space2 += " ";
                }
                
                String totalCost = "" + (currentPlate.getCost() * value);
                int space3Value = SecondSpace - totalCost.length();
                String space3 = "";
                for (int i = 0; i < space3Value; i++) {
                    space3 += " ";
                }
                
                fullPlate += space1 + cost + space2 + value + space3 + totalCost;
                cell1.addElement(new Paragraph(fullPlate, secondaryFont));   
            });
            
            HashMap<Drink,Integer> listOfDrinksWithQty = order.getDrinksAndQty();
            listOfDrinksWithQty.forEach((key,value) -> {
                Drink currentDrink = key;
                String drink = currentDrink.getBrand() + " " + currentDrink.getSize() + "LT";
                
                int space1Value = FirstSpace - drink.length();
                String space1 = "";
                for (int i = 0; i < space1Value; i++) {
                    space1 += " ";
                }
                
                String cost = currentDrink.getCost() + "$";
                
                int space2Value = SecondSpace - cost.length();
                String space2 = "";
                for (int i = 0; i < space2Value; i++) {
                    space2 += " ";
                }
                
                String totalCost = "" + (currentDrink.getCost() * value);
                int space3Value = SecondSpace - totalCost.length();
                String space3 = "";
                for (int i = 0; i < space3Value; i++) {
                    space3 += " ";
                }
                
                drink += space1 + cost + space2 + value + space3 + totalCost;
                cell1.addElement(new Paragraph(drink, secondaryFont)); 
            });           
            
            PdfPCell cell2 = new PdfPCell(new Paragraph(""));
            cell2.setBorderColor(BaseColor.WHITE);
            cell2.setPaddingLeft(10);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);           
            
            cell2.addElement(new Paragraph(" "));
            
            rutP.setAlignment(Paragraph.ALIGN_LEFT);
            cell2.addElement(rutP);
            
            cell2.addElement(new Paragraph(" "));
            cell2.addElement(new Paragraph(" "));
            
            cell2.addElement(new Paragraph("       Mesa " + order.getTable().getNumber(), secondaryFont));

            cell2.addElement(new Paragraph(" "));
            cell2.addElement(new Paragraph(" "));

            listOfPlatesWithQty.forEach((key,value) -> {
                Plate currentPlate = key;
                String fullPlate = currentPlate.getMainPlate();
                if(!currentPlate.getSecondaryPlate().equals("")){
                    fullPlate += " con " + currentPlate.getSecondaryPlate();
                }
                
                int space1Value = FirstSpace - fullPlate.length();
                String space1 = "";
                for (int i = 0; i < space1Value; i++) {
                    space1 += " "; 
                }
                
                String cost = currentPlate.getCost() + "$";
                int space2Value = SecondSpace - cost.length();
                String space2 = "";
                for (int i = 0; i < space2Value; i++) {
                    space2 += " ";
                }
                
                String totalCost = "" + (currentPlate.getCost() * value);
                int space3Value = SecondSpace - totalCost.length();
                String space3 = "";
                for (int i = 0; i < space3Value; i++) {
                    space3 += " ";
                }
                
                fullPlate += space1 + cost + space2 + value + space3 + totalCost;
                cell2.addElement(new Paragraph(fullPlate, secondaryFont));   
            });
            
            listOfDrinksWithQty.forEach((key,value) -> {
                Drink currentDrink = key;
                String drink = currentDrink.getBrand() + " " + currentDrink.getSize() + "LT";
                
                int space1Value = FirstSpace - drink.length();
                String space1 = "";
                for (int i = 0; i < space1Value; i++) {
                    space1 += " ";
                }
                
                String cost = currentDrink.getCost() + "$";
                
                int space2Value = SecondSpace - cost.length();
                String space2 = "";
                for (int i = 0; i < space2Value; i++) {
                    space2 += " ";
                }
                
                String totalCost = "" + (currentDrink.getCost() * value);
                int space3Value = SecondSpace - totalCost.length();
                String space3 = "";
                for (int i = 0; i < space3Value; i++) {
                    space3 += " ";
                }
                
                drink += space1 + cost + space2 + value + space3 + totalCost;
                cell2.addElement(new Paragraph(drink, secondaryFont)); 
            });     
            
            tableTop.addCell(cell1);
            tableTop.addCell(cell2);
            
            document.add(tableTop);
  
            /*Second Part of the account*/            
            PdfPTable tableBottom = new PdfPTable(2);
            tableBottom.setWidths(columnWidths);
            tableBottom.setWidthPercentage(100); //Width 100%
            tableBottom.setSpacingBefore(0f); //Space before table
            tableBottom.setSpacingAfter(0f); //Space after table
            tableBottom.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            //Set Column widths
            PdfPCell cellBottom1 = new PdfPCell(new Paragraph(""));
            cellBottom1.setBorderColor(BaseColor.WHITE);
            cellBottom1.setPaddingLeft(10);
            cellBottom1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cellBottom1.setVerticalAlignment(Element.ALIGN_BOTTOM);
            
            PdfPCell cellBottom2 = new PdfPCell(new Paragraph(""));
            cellBottom2.setBorderColor(BaseColor.WHITE);
            cellBottom2.setPaddingLeft(10);
            cellBottom2.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cellBottom2.setVerticalAlignment(Element.ALIGN_BOTTOM);            

            Paragraph subTotalP = new Paragraph(subtotal + "$", mainFont);
            Paragraph discountP = new Paragraph(discount + "%", secondaryFont);
            Paragraph totalP = new Paragraph(total + "$", mainBlackFont);
            
            subTotalP.setAlignment(Paragraph.ALIGN_RIGHT);
            discountP.setAlignment(Paragraph.ALIGN_RIGHT);
            totalP.setAlignment(Paragraph.ALIGN_RIGHT);
            
            cellBottom1.addElement(subTotalP);
            cellBottom1.addElement(discountP);
            cellBottom1.addElement(totalP);

            cellBottom2.addElement(subTotalP);
            cellBottom2.addElement(discountP);
            cellBottom2.addElement(totalP);
            
            tableBottom.addCell(cellBottom1);
            tableBottom.addCell(cellBottom2);
            tableBottom.setSpacingBefore(document.getPageSize().getHeight() - tableTop.getTotalHeight() - 120);
            document.add(tableBottom);
            
            document.close();
            writer.close();
        } catch (DocumentException ex) {
            Logger.getLogger(PdfHandler.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
 
    public void createSimplePdf(Order order, int subtotal, float discount, int total){
        ArrayList<Plate> listOfPlates = order.getListOfPlates();
        ArrayList<Drink> listOfDrinks = order.getListOfDrinks();
        Date date = order.getDate();
        final int Spaces = 15;
        
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
            
            HashMap<Plate,Integer> listOfPlatesWithQty = order.getPlatesAndQty();
            listOfPlatesWithQty.forEach((key,value) -> {
                Plate currentPlate = key;
                String fullPlate = currentPlate.getMainPlate();
                if(!currentPlate.getSecondaryPlate().equals("")){
                    fullPlate += " con " + currentPlate.getSecondaryPlate();
                }
                cell1.addElement(new Paragraph(fullPlate, thirdFont));   
            });
            
            cell1.addElement(new Chunk(new LineSeparator()));

            cell1.addElement(new Paragraph("Bebidas: ", secondaryFont));
            
            cell1.addElement(new Chunk(new LineSeparator()));

            HashMap<Drink,Integer> listOfDrinksWithQty = order.getDrinksAndQty();
            listOfDrinksWithQty.forEach((key,value) -> {
                Drink currentDrink = key;
                String drink = currentDrink.getBrand() + " " + currentDrink.getSize() + "LT";
                cell1.addElement(new Paragraph(drink, thirdFont)); 
            });           
                        
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
            
            listOfPlatesWithQty.forEach((key,value) -> {
                Plate currentPlate = key;
                String cost = currentPlate.getCost() + "$" ;
                String totalCost = (currentPlate.getCost() * value + "$");
                int space1Value = Spaces - cost.length() - ("" + value).length();
                String space1 = "";
                for (int i = 0; i < space1Value; i++) {
                    space1 += " ";
                }
                int space2Value = Spaces - totalCost.length();
                String space2 = "";
                for (int i = 0; i < space2Value; i++) {
                    space2 += " ";
                }
                cell2.addElement(new Paragraph("" + cost + space1 + value + space2 + totalCost, thirdFont));
 
            });
            
            cell2.addElement(new Paragraph("\n\n\n"));

            listOfDrinksWithQty.forEach((key,value) -> {
                Drink currentDrink = key;
                String cost = currentDrink.getCost() + "$";
                String totalCost = (currentDrink.getCost() * value + "$");
                int space1Value = Spaces - cost.length() - ("" + value).length();
                String space1 = "";
                for (int i = 0; i < space1Value; i++) {
                    space1 += " ";
                }
                int space2Value = Spaces - totalCost.length();
                String space2 = "";
                for (int i = 0; i < 10; i++) {
                    space2 += " ";
                }
                cell2.addElement(new Paragraph("" + cost + space1 + value + space2 + totalCost, thirdFont));
            });           
                 
            
            cell2.addElement(new Paragraph("\n\n\n"));
            
            String subtotalText = "Subtotal: " + subtotal + "$";
            String discountText = "Descuento: " + discount + "%";
            String totalText = "Total: " + total + "$";
            
            cell2.addElement(new Paragraph(subtotalText, secondaryFont));
            cell2.addElement(new Paragraph(discountText, thirdFont));
            cell2.addElement(new Paragraph(totalText, mainBlackFont));
            
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
