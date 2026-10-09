public class ItalianConverter extends Converter{
    
    public ItalianConverter(String document){
        super(document);
    }

    public void makeLine() {
        System.out.println("Linea in italiano");
    }
    public void makeParagraph() {
        System.out.println("Paragrafo in italiano");
    }
    public void makeTable() {
        System.out.println("Tabella in italiano");
    }
}