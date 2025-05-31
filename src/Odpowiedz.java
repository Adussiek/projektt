public class Odpowiedz {
    private String odpowiedz;
    private boolean czyPrawda;
    Odpowiedz(String odpowiedz,boolean czyPrawda){
        this.odpowiedz=odpowiedz;
        this.czyPrawda=czyPrawda;

    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public void setOdpowiedz(String odpowiedz) {
        this.odpowiedz = odpowiedz;
    }

    public void setCzyPrawda(boolean czyPrawda) {
        this.czyPrawda = czyPrawda;
    }
    public boolean getCzyPrawda(){

        return czyPrawda;
    }

    @Override
    public String toString() {
        return odpowiedz;
    }

}
