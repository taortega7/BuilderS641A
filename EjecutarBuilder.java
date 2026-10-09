public class EjecutarBuilder {
    public static void main(String[] args) {
        
        Converter c1 = new SpanishConverter("Book");
        Converter c2 = new EnglishConverter("Artículo");
        Converter c3 = new FrenchConverter("Noticia");
        Converter c4 = new ItalianConverter("Twitt");

        Reader r1 = new Reader("LINE", c1);
        Reader r2 = new Reader("PARAGRAPH", c2);
        Reader r3 = new Reader("TABLE", c3);
        Reader r4 = new Reader("TABLE", c1);
        Reader r5 = new Reader("TABLE", c4);

        r1.parseInput();
        r2.parseInput();
        r3.parseInput();
        r4.parseInput();
        r5.parseInput();

    }
}
