public class PresentationDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument(){
        return new PresentationDocument();
    }
    
}
