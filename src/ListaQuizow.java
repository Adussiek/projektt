import java.util.ArrayList;

public class ListaQuizow {
    //lista do przechowywania wszystkich quizow
    private ArrayList lista = new ArrayList<Quiz>();
    // bezparametrowy konstruktor
    public ListaQuizow() {
    }

    public ArrayList getLista() {
        return lista;
    }
// do wyswietlania quizow z numeracja
    @Override
    public String toString() {
        String tekst="";
        Quiz quiz = null;
        for (int i=0;i< lista.size();i++){
            quiz = (Quiz) lista.get(i);
            tekst+=i+1+". "+quiz.getNazwa()+"\n";

        }
        return tekst;
    }
    //metoda dodawania quizu
    public void dodaj (Quiz quiz)
    {
        lista.add(quiz);
    }
    public int size(){
        return lista.size();
    }
    //metoda zwracajaca z listy quizu o podanym indeksie
    public Quiz get (int i){
        return (Quiz) lista.get(i);
    }
    //usuwajaca metoda z listy quizu o podanym indeksie
    public void usun(int i){
        lista.remove(i);
    }
}
