import java.util.Scanner;


public class System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(java.lang.System.in);
        ListaQuizow lista = new ListaQuizow();
        Quiz quiz = Pliki.odczyt("pamiec.txt");
        lista.dodaj(quiz);
        String nazwa;
        int liczba=0;
        while (liczba != 6) {
            java.lang.System.out.println("Witaj w konsolowym systemie quizowym");
            java.lang.System.out.println("1.Graj quiz");
            java.lang.System.out.println("2.Stwórz quiz");
            java.lang.System.out.println("3.Modyfikuj");
            java.lang.System.out.println("4.Wczytaj z Pliku");
            java.lang.System.out.println("5.Zapisz do Pliku");
            java.lang.System.out.println("6.Zakończ działanie programu.");
            java.lang.System.out.println("Wybierz tryb : ");

            liczba = sc.nextInt();
            switch (liczba){
                case 1:
                    java.lang.System.out.println(lista);
                    java.lang.System.out.println("Wybierz Quiz do rozwiązania");
                    liczba=sc.nextInt();
                    if(liczba>lista.size()) java.lang.System.out.println("Nie ma quizu o takim numerze :( ");
                    else Granie.graj(lista.get(liczba-1));
                    break;
                case 2:
                    java.lang.System.out.println("Podaj Nazwe Quizu : ");
                    sc.nextLine();
                    nazwa=sc.nextLine();
                    java.lang.System.out.println("Podaj ilość pytań : ");
                    liczba=sc.nextInt();
                    if (liczba<1)java.lang.System.out.println("Ilość pytań musi być większa od 0");
                    else quiz=Tworzenie.stworz(liczba,nazwa);
                    break;
            }
        }
    }
}
