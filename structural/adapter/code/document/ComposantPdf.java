package structural.adapter.document;

public class ComposantPdf {

    private String contenu;

    int pdfFixeContenu(String contenu) {
        this.contenu = contenu;
        return 1;
    }

    int pdfPrepareAffichage() {
        System.out.println("loading preview...");

        return 1;
    }

    int pdfRafraichir() {
        System.out.println("refreshing...");
        return 1;
    }

    int pdfTermineAffichage() {
        System.out.println("finished to load preview: " + "\"" + contenu + "\"");
        return 1;
    }

    int pdfEnvoieImprimante() {
        System.out.println("sending to printer...");
        return 1;
    }

    public String getContenu() {
        return contenu;
    }
}
