import java.util.ArrayList;

public class Quiz {
    private ArrayList pytania = new ArrayList<Pytanie>();
    private String nazwa;

    Quiz(ArrayList pytania,String nazwa){
        this.pytania=pytania;
        this.nazwa=nazwa;

    }

    public ArrayList getPytania() {
        return pytania;
    }

    public void setPytania(ArrayList pytania) {
        this.pytania = pytania;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    //metoda do zmiany tresci pytania o podanym indeksie
    public void zmienPytanie(int i,String nazwa){
        Pytanie pytanie=(Pytanie) pytania.get(i);
        pytanie.setPytanie(nazwa);
        pytania.set(i,pytanie);

    }
}

