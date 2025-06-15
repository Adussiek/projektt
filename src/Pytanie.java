import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;

public class Pytanie {
    private String pytanie;
    private ArrayList odpowiedzi = new ArrayList<Odpowiedz>();



    Pytanie(String pytanie, ArrayList<Odpowiedz> odpowiedzi){

        this.pytanie=pytanie;
        this.odpowiedzi=odpowiedzi;

    }

    public void setOdpowiedzi(ArrayList odpowiedzi) {
        this.odpowiedzi = odpowiedzi;

    }

    public ArrayList getOdpowiedzi() {
        return odpowiedzi;
    }

    public void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }

    public String getPytanie() {
        return pytanie;
    }
//metoda tostring wyswietlajaca tresc pytania z wyliczeniem odp od a - z
    @Override
    public String toString() {
        char znak=65;
        String wynik = pytanie;
        for (int i = 0;i<odpowiedzi.size();i++){
            wynik+="\n"+znak+") "+odpowiedzi.get(i);
            znak++;
        }
        return wynik;
    }
    //metoda zwracajaca indeks dobrej odpowiedzi
    public int getDobraOdp (){
        for (int i = 0;i<odpowiedzi.size();i++){
            Odpowiedz odpowiedz = (Odpowiedz) odpowiedzi.get(i);
            if(odpowiedz.getCzyPrawda()) return i;
        }
        return -1;
    }
    //metoda zmieniajaca poprawną odpowiedz
    public void zmienDobraOdp(int i){
        Odpowiedz odpowiedz = (Odpowiedz) odpowiedzi.get(i);
        Odpowiedz odpowiedz1 = (Odpowiedz) odpowiedzi.get(getDobraOdp());
        odpowiedz1.setCzyPrawda(false);
        odpowiedz.setCzyPrawda(true);
    }
}
