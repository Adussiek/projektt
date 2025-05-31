import java.util.ArrayList;

public class Quiz {
    private ArrayList pytania = new ArrayList<Pytanie>();

    Quiz(Pytanie ... pytania){
        for (Pytanie i : pytania){
            this.pytania.add(i);
        }
    }

    public ArrayList getPytania() {
        return pytania;
    }

    public void setPytania(ArrayList pytania) {
        this.pytania = pytania;
    }
}
