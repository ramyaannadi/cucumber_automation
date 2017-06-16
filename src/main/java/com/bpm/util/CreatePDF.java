package com.bpm.util;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
 
public class CreatePDF {
	  OutputStream file;
	  Document document;
	  PdfPTable table;
	  PdfPCell cell;
	  Image image;
	  List pdflist;
	  int pdftablerows;
	  int pCount;
	  int CCount;
	  int SCount;
	  String filepath;
	  File fi;
	public CreatePDF(String path) throws Exception
	{
		 try {
			 filepath=path;
			 // TO SET THE PATH FOR CREATION OF PDF REPORT.
			 fi = new File(path);
           file = new FileOutputStream(fi);
           document = new Document();
           PdfWriter.getInstance(document, file);
           
           	  //PATH OF THE LOG TO FIX ON THE PDF.
              image = Image.getInstance (System.getProperty("user.dir")+"\\src\\XTG.png");
              image.scaleAbsolute(110f, 60f);//image width,height  
             
              table=new PdfPTable(3);
              
              cell = new PdfPCell (new Paragraph ("Testing Result"));
              cell.setColspan (3);
              cell.setHorizontalAlignment (Element.ALIGN_CENTER);
              cell.setPadding (10.0f);
              cell.setBackgroundColor (new BaseColor (128, 128, 128));                                  

              table.addCell(cell);                                      
              
              PdfPCell Class = new PdfPCell (new Paragraph ("Class Name"));
              Class.setHorizontalAlignment (Element.ALIGN_CENTER);
              Class.setBackgroundColor (new BaseColor (205, 133, 63));    
              
              PdfPCell Method = new PdfPCell (new Paragraph ("Method Name"));
              Method.setHorizontalAlignment (Element.ALIGN_CENTER);
              Method.setBackgroundColor (new BaseColor (205, 133, 63));  
              
              PdfPCell Result = new PdfPCell (new Paragraph ("Result"));
              Result.setHorizontalAlignment (Element.ALIGN_CENTER);
              Result.setBackgroundColor (new BaseColor (205, 133, 63));   
              
              table.addCell(Class);
              table.addCell(Method);
              table.addCell(Result);
		 }
		 
		 catch(Exception pde)
		 {
			 pde.printStackTrace();
		 }
			 
	}
	
	// INSERT TABLE IN PDF REPORT.
	public void table(String Class, String Method , String TResult) throws Exception
   {
		
		  PdfPCell TResult1 = new PdfPCell(new Paragraph(TResult));
		  TResult1.setHorizontalAlignment(Element.ALIGN_CENTER);	  
		 
		  PdfPCell Class1 = new PdfPCell(new Paragraph(Class));
		  Class1.setHorizontalAlignment(Element.ALIGN_CENTER);	  
		 
		  PdfPCell Method1 = new PdfPCell(new Paragraph(Method));
		  Method1.setHorizontalAlignment(Element.ALIGN_CENTER);	  
		 
		  table.addCell(Class1);
		  table.addCell(Method1);
                                 
		  // TO COUNT OF PASS AND FAIL METHODS.
        
        if(TResult.contains("Pass"))
        {
      	  TResult1.setBackgroundColor(new BaseColor(145,255,0));
      	  pCount= pCount+1;
      	  table.addCell(TResult1); 
        }   
        
        else if (TResult.contains("Skip"))
        {
        	TResult1.setBackgroundColor(new BaseColor(255,255,0));
         	SCount= SCount+1;
         	table.addCell(TResult1); 
        }
        else
        { 
      	  TResult1.setBackgroundColor(new BaseColor(255,0,0));
      	  table.addCell(TResult1); 
        }
        
        table.setSpacingBefore(30.0f);       // Space Before table starts, like margin-top in CSS
        table.setSpacingAfter(30.0f);        // Space After table ends, like margin-Bottom in CSS
        
   	}
	
	//LIST IN PDF REPORT.
	  
	  public void pdfList() throws Exception
	  {
		 		   		  			
		  pdftablerows = table.getRows().size()-2;
			 
                  pdflist=new List(true,30);
                  pdflist.add(new ListItem("Total no of Test Method Executed :" + pdftablerows));
                  pdflist.add(new ListItem("Total no of Test Methods Passed During execution :" + pCount));
                  pdflist.add(new ListItem("Total no of Test Methods Skipped During execution :" + SCount));
                  pdflist.add(new ListItem("Total no of Test Methods Failed During execution :" + (pdftablerows-pCount-SCount)));  
	  }
	  public void addpdf(String InvokedBrowser) throws Exception
	  {
		  		// INSERTING LINES IN TO PDF.
                        
                Chunk chunk=new Chunk("The below is the test result ");
             
                Chunk chunk1=new Chunk("for the project XTBills ");
              
                Chunk chunk2=new Chunk("performed in the Browser -" + InvokedBrowser);

                // Insert Every Thing Into PDF Document
                document.open();//PDF document opened........                  
                document.add(image);
                document.add(Chunk.NEWLINE);   
                document.add(new Paragraph("Dear Manager,"));
                document.add(chunk);
                document.add(chunk1);
                document.add(chunk2);
                document.add(Chunk.NEWLINE);         
                // TO INSER TABLE
                document.add(table);

                 // TO INSER LIST 
                document.add(pdflist);            
                document.add(Chunk.NEWLINE);
                document.add(new Paragraph("Document Generated On - "+new Date().toString()));   

                document.bottom();
                document.close();
                file.close();
                
                System.out.println("Pdf created successfully..");
	  }
	  
	  public void rename(String name)
	  {
		  File file = new File(name);
		  fi.renameTo(file);
		  System.out.println("The File name changed to " + file.getName());
		  fi.delete();
	  }
}