public class FrenchConverter extends Converter{

    public FrenchConverter (String document){
        super(document);
    }
    
    public void makeLine() {
        System.out.println("Ligne en français");
    }
    public void makeParagraph() {
        System.out.println("Paragraphe en français");
    }
    public void makeTable() {
        System.out.println("Tableau en français");
    }
}
