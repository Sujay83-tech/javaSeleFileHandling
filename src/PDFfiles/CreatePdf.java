package PDFfiles;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

public class CreatePdf {

	public static void main(String[] args) throws IOException {

		//Create a document
		PDDocument document = new PDDocument();
		
		//create a page
		PDPage page = new PDPage(PDRectangle.A4);
		
		document.addPage(page);
		
		//Create content Stream
		PDPageContentStream contentstream = new PDPageContentStream(document,page);
		
		//Font and Size
//		contentstream.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA),14);
		
		PDType1Font font = new PDType1Font(Standard14Fonts.FontName.HELVETICA);
		contentstream.setFont(font, 14);
		contentstream.beginText();
		contentstream.newLineAtOffset(40,500);
		contentstream.showText("Hello , welcome to File handling");
		contentstream.endText();
		
		contentstream.close();
		
		//doc save
		document.save(".\\data\\sample.pdf");
		document.close();
		System.out.println("PDF created sucesfully");
	}

}
