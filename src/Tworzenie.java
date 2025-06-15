import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;

public class Tworzenie {

    public static Quiz stworz (int ilosc,String nazwa){
        Scanner scanner = new Scanner(System.in);

        int iloscO;
        Odpowiedz odpowiedz = new Odpowiedz("",false);
        Pytanie pytanie = new Pytanie("",odpowiedz);
        ArrayList listaO = new ArrayList<Odpowiedz>();
        ArrayList listaP = new ArrayList<Pytanie>();
        String tekst;
        for(int i=0;i<ilosc;i++){
            System.out.println("Podaj treść pytania :");
            scanner.nextLine();
            tekst=scanner.nextLine();
            pytanie.setPytanie(tekst);
            System.out.println("Podaj ile ma być odpowiedzi ");
            iloscO=scanner.nextInt();
            for (int j = 0; j <iloscO; j++) {
                System.out.println("Podaj treść odpowiedzi");
                scanner.nextLine();
                tekst=scanner.nextLine();
                odpowiedz.setOdpowiedz(tekst);
                System.out.println("Ta odpowiedz jest prawidziwa (T/N)");
                tekst=scanner.next();
                if(tekst.equals("T"))odpowiedz.setCzyPrawda(true);
                else odpowiedz.setCzyPrawda(false);
                listaO.add(odpowiedz);

            }
            pytanie.setOdpowiedzi(listaO);
            listaO.clear();
            listaP.add(pytanie);



        }
            Quiz quiz = new Quiz(listaP,nazwa);

        return quiz;


    }

}
