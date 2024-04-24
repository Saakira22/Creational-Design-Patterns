public class PresentationDocument implements Document {
  @Override
  public void open(){
    System.out.println("Opening Presentation");
  }  
  @Override
  public void save(){
    System.out.println("Saving Presentation");
  }
    
}
