import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;

public class Tworzenie {
    //metoda tworzaca quiz
    public static Quiz stworz (int ilosc,String nazwa){
        Scanner scanner = new Scanner(System.in);

        int iloscO;
        boolean pCzyf;
        String nazwaP,nazwaO;
        ArrayList listaO = new ArrayList<Odpowiedz>();
        ArrayList listaP = new ArrayList<Pytanie>();
        String tekst;
        for(int i=0;i<ilosc;i++){
            System.out.println("Podaj treść pytania :");
            scanner.nextLine();
            tekst=scanner.nextLine();
            nazwaP=tekst;
            System.out.println("Podaj ile ma być odpowiedzi ");
            iloscO=scanner.nextInt();
            for (int j = 0; j <iloscO; j++) {
                System.out.println("Podaj treść odpowiedzi");
                scanner.nextLine();
                tekst=scanner.nextLine();
                nazwaO=tekst;
                System.out.println("Ta odpowiedz jest prawidziwa (T/N)");
                tekst=scanner.next();
                if(tekst.equals("T"))pCzyf=true;
                else pCzyf=false;
                listaO.add(new Odpowiedz(nazwaO));

            }
            listaP.add(new Pytanie(nazwaP,new ArrayList<>(listaO)));
            listaO.clear();



        }
            Quiz quiz = new Quiz(listaP,nazwa);

        return quiz;


    }

}
