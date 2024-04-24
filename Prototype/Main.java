public class Main {
    public static void main(String[] args) {
        // Create and display cloned instances of documents from the registry
        // DocumentPrototype plainTextDocument = DocumentRegistry.getDocument("plain", "This is a plain text document.");
        // DocumentPrototype htmlDocument = DocumentRegistry.getDocument("html", "<html><body><h1>This is an HTML document.</h1></body></html>");
        // DocumentPrototype htmlDocument1 = DocumentRegistry.getDocument("h", "<html><body><h1>This is an HTML document.</h1></body></html>");

        DocumentPrototype plainTextPrototype = new PlainTextDocument("hiii");
        plainTextPrototype.clone();
        plainTextPrototype.display();

        DocumentPrototype htmlPrototype = new HTMLDocument("<html></html>");
        htmlPrototype.clone();
        htmlPrototype.display();

        // plainTextDocument.display();
        // htmlDocument.display();
        // htmlDocument1.display();
    }
}
