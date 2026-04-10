package Adapter;

public class PDFProcessor implements DocumentProcessor {
    private String file;

    public PDFProcessor(String file) {
        this.file = file;
    }

    @Override
    public void process() {
        System.out.println("Обработка документа PDF: " + file);
    }
}
