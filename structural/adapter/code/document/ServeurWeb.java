package structural.adapter.document;

public class ServeurWeb {

    public static void main(String[] args) {

        ComposantPdf composantPdf = new ComposantPdf();
        Document document = new DocumentPdf(composantPdf);

        document.setContenu("new content");

        document.dessine();
        document.imprime();
    }
}
