package Adapter;

public class Main1 {
    public static void main(String[] args) {
        DocumentProcessor doc = new DOCProcessor("file.doc");
        doc.process();

        PDFProcessor pdf = new PDFProcessor("file.pdf");
        DocumentProcessor adapted = new DocumentAdapter(pdf);
        adapted.process();
    }

}
