package PDFfiles;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;

public class ReadPdf {

    public static void main(String[] args) {
        
        File pdfFile = new File(".\\data\\Steganography Data Hiding and Detection Synopsis.pdf");
        
        try {
            // Load the PDF document
            PDDocument document = Loader.loadPDF(pdfFile);
            
            // Create text stripper
            PDFTextStripper stripper = new PDFTextStripper();
            
            // Extract text
            String text = stripper.getText(document);
            
            // Close document
            document.close();
            
            // Print the extracted text
            System.out.println(text);
            
        } catch (IOException e) {
            System.err.println("Error reading PDF file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}