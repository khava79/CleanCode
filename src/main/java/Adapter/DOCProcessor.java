package Adapter;

public class DOCProcessor implements DocumentProcessor {
    private String file;

    public DOCProcessor(String file) {
        this.file = file;
    }

    @Override
    public void process() {
        System.out.println("Обработка документа DOC: " + file);
    }
}
