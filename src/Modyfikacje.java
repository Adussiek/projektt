import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;

public class Modyfikacje {
    public static void modyfikuj(Quiz quiz){
        System.out.println(quiz.getNazwa());
        System.out.println("Czy chcesz zmienić nazwę Quizu??? (T/N)");
        Scanner scanner = new Scanner(System.in);
        String string ;
        string=scanner.next();
        if (string.equals("T")){
            System.out.println("Podaj nową nazwę!!");
            scanner.nextLine();
            string=scanner.nextLine();
            quiz.setNazwa(string);
        }
        System.out.println("Czy chcesz zmodyfikować pytania lub odpowiedzi ????(T/N)");
        string=scanner.next();
        if(string.equals("T")){
            ArrayList<Pytanie> lista=quiz.getPytania();
            for (int i=0;i< lista.size();i++){
                Pytanie pytanie=lista.get(i);
                System.out.println(pytanie);
                System.out.println("Czy chcesz zmodyfikować treść pytania  ? ? ? (T/N)");
                string=scanner.next();
                if (string.equals("T")){
                    System.out.println("Podaj nowa tresc pytania");
                    scanner.nextLine();
                    string= scanner.nextLine();
                    quiz.zmienPytanie(i,string);
                }
                System.out.println("Czy chcesz zmodyfikować treść odpowiedzi ???(T/N)");
                string=scanner.next();
                if(string.equals("T")){
                    ArrayList<Odpowiedz> listaO=pytanie.getOdpowiedzi();
                    for (int j=0;j<listaO.size();j++){
                        Odpowiedz odpowiedz = listaO.get(j);
                        System.out.println(odpowiedz);
                        System.out.println("Czy chcesz zmodyfikować tą odpowiedź???(T/N)");
                        string=scanner.next();
                        if (string.equals("T")){
                            System.out.println("Podaj nową odpowiedź !!! ");
                            scanner.nextLine();
                            string=scanner.nextLine();
                            odpowiedz.setOdpowiedz(string);
                        }
                    }
                    System.out.println("Dobra odpowiedz : "+(pytanie.getDobraOdp()+1));
                    System.out.println("Czy chcesz zmienić poprawną odpowiedź??(T/N)");
                    string=scanner.next();
                    if (string.equals("T")){
                        System.out.println("Podaj numer nowej poprawnej odpowiedzi");
                        int liczba=scanner.nextInt();
                        if (liczba>listaO.size()) System.out.println("Nieprawidłowa wartość");
                        else pytanie.zmienDobraOdp(i);
                    }


                }
            }
        }
        else return;
    }
}
