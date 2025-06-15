import java.util.ArrayList;

public class ListaQuizow {
    private ArrayList lista = new ArrayList<Quiz>();

    public ListaQuizow() {
    }

    public ArrayList getLista() {
        return lista;
    }

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
    public void dodaj (Quiz quiz)
    {
        lista.add(quiz);
    }
    public int size(){
        return lista.size();
    }
    public Quiz get (int i){
        return (Quiz) lista.get(i);
    }
    public void usun(int i){
        lista.remove(i);
    }
}
