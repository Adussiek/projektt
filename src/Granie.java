import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;

public class Granie {
    public static void graj(Quiz quiz){
        System.out.println(quiz.getNazwa());
        Scanner scanner = new Scanner(System.in);
        ArrayList lista = quiz.getPytania();
        String odp;
        int dobra,wynik=0;
        char litera;
        for(int i=0;i<lista.size();i++){
            Pytanie pytanie =(Pytanie) lista.get(i);
            System.out.println(pytanie);
            System.out.println("Wybierz odpowiedź : ");
            odp=scanner.next();
            dobra = pytanie.getDobraOdp();
            litera = odp.charAt(0);
            if(litera-65==dobra)wynik++;
            System.out.println("");

        }
        System.out.println("Zdobyłeś : "+wynik+" punktów z "+lista.size());


    }
}
