public class EnglishConverter extends Converter {

    //Constructor de la clase
    public EnglishConverter(String document) {
        super(document);
    }

    //Metodos
    @Override
    public void makeLine() {
        System.out.println("Line in English");
    }
    @Override
    public void makeParagraph() {
        System.out.println("Paragraph in English");
    }
    @Override
    public void makeTable() {
        System.out.println("Table in English");
    }
}