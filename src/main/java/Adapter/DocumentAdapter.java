package Adapter;

public class DocumentAdapter implements DocumentProcessor {
    private PDFProcessor pdfProcessor;

    public DocumentAdapter(PDFProcessor pdfProcessor) {
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public void process() {
        System.out.println("Конвертация PDF в DOC...");
        pdfProcessor.process();
        System.out.println("Документ конвертирован");
    }
}
