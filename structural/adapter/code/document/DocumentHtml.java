package structural.adapter.code.document;

public class DocumentHtml implements Document {

    @Override
    public int setContenu(String contenu) {
        return 1;
    }

    @Override
    public int dessine() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dessine'");
    }

    @Override
    public int imprime() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprime'");
    }

}
