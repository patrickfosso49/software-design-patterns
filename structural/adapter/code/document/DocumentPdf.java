package structural.adapter.code.document;

public class DocumentPdf implements Document {

    private final ComposantPdf outilPdf;

    DocumentPdf(ComposantPdf composantPdf) {
        this.outilPdf = composantPdf;
    }

    @Override
    public int setContenu(String contenu) {
        return outilPdf.pdfFixeContenu(contenu);
    }

    @Override
    public int dessine() {
        System.out.println("drawing your content in background");
        return 1;
    }

    @Override
    public int imprime() {
        outilPdf.pdfPrepareAffichage();
        outilPdf.pdfRafraichir();
        outilPdf.pdfTermineAffichage();
        outilPdf.pdfEnvoieImprimante();

        System.out.println("printed \n\n");
        System.out.println(outilPdf.getContenu());
        return 1;
    }

}
