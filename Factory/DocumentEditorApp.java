// DocumentEditorApp.java
public class DocumentEditorApp {
    public static void main(String[] args) {
        
        DocumentFactory textDocumentFactory = new TextDocumentFactory();
        Document textDocument = textDocumentFactory.createDocument();
        textDocument.open();
        textDocument.save();

        DocumentFactory spreadsheetDocumentFactory = new SpreadsheetDocumentFactory();
        Document spreadsheetDocument = spreadsheetDocumentFactory.createDocument();
        spreadsheetDocument.open();
        spreadsheetDocument.save();

        DocumentFactory PresentationDocumentFactory = new PresentationDocumentFactory();
        Document PresentationDocument = PresentationDocumentFactory.createDocument();
        PresentationDocument.open();
        PresentationDocument.save();
    }
}

