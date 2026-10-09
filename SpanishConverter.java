public class SpanishConverter extends Converter{

    public SpanishConverter(String document){
        super(document);
    }
    
    public void makeLine() {
        System.out.println("Línea en Español");
    }
    public void makeParagraph() {
        System.out.println("Párrafo en Español");
    }
    public void makeTable() {
        System.out.println("Tabla en Español");
    }
}