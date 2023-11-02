package structural.composite.code.text;

import java.util.ArrayList;
import java.util.List;

public class Section extends Texte {

    private List<Texte> sousSection = new ArrayList<>();

    @Override
    public int longeur() {
        int sum = 0;
        for (Texte texte : sousSection) {
            sum = sum + texte.longeur();
        }

        return sum;
    }

    @Override
    public void ajout(Texte text) {
        this.sousSection.add(text);
    }

    @Override
    public void retrait(int index) {
        if (index <= sousSection.size()) {
            sousSection.remove(index);
        }
    }

    public List<Texte> getSousection() {
        return this.sousSection;
    }

}
