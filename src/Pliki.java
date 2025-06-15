import java.io.*;
import java.util.ArrayList;
import java.lang.System;
import java.util.Arrays;
import java.util.List;


public class Pliki {
    public static Quiz odczyt(String plik){
        String tekst,nazwa,nazwaP;
        boolean pCzyf;
        ArrayList listaO = new ArrayList<Odpowiedz>();
        ArrayList listaP = new ArrayList<Pytanie>();
        int liczba;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(plik));

            nazwa = reader.readLine();
            while((tekst= reader.readLine())!=null) {

                nazwaP = tekst;
                tekst=reader.readLine();
                String [] tab=tekst.split(";");
                tekst= reader.readLine();
                liczba=Integer.parseInt(tekst);
                for (int i=0;i<tab.length;i++){
                    if (i==liczba-1)pCzyf=true;
                    else pCzyf = false;
                    listaO.add(new Odpowiedz(tab[i],pCzyf));
                }
                listaP.add(new Pytanie(nazwaP, new ArrayList<Odpowiedz>(listaO)));
                listaO.clear();

            }
            Quiz quiz = new Quiz(listaP,nazwa);
            return quiz;
        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku: "+plik);

        }catch (IOException e){
            System.out.println("Błąd odczytu pliku");
        }
        return null;
    }


}
