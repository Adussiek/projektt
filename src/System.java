import java.util.Scanner;


public class System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(java.lang.System.in);
        ListaQuizow lista = new ListaQuizow();
        //pierwszy quiz
        Quiz quiz = Pliki.odczyt("pamiec.txt");
        lista.dodaj(quiz);
        String nazwa;
        int liczba=0;
        while (liczba != 7) {
            java.lang.System.out.println("Witaj w konsolowym systemie quizowym");
            java.lang.System.out.println("1.Graj quiz");
            java.lang.System.out.println("2.Stwórz quiz");
            java.lang.System.out.println("3.Usuń quiz");
            java.lang.System.out.println("4.Modyfikuj");
            java.lang.System.out.println("5.Wczytaj z Pliku");
            java.lang.System.out.println("6.Zapisz do Pliku");
            java.lang.System.out.println("7.Zakończ działanie programu.");
            java.lang.System.out.println("Wybierz tryb : ");

            liczba = sc.nextInt();
            switch (liczba){
                case 1:
                    java.lang.System.out.println(lista);
                    java.lang.System.out.println("Wybierz Quiz do rozwiązania");
                    liczba=sc.nextInt();
                    if(liczba>lista.size()||liczba<1) java.lang.System.out.println("Nie ma quizu o takim numerze :( ");
                    else Granie.graj(lista.get(liczba-1));
                    break;
                case 2:
                    java.lang.System.out.println("Podaj Nazwe Quizu : ");
                    sc.nextLine();
                    nazwa=sc.nextLine();
                    java.lang.System.out.println("Podaj ilość pytań : ");
                    liczba=sc.nextInt();
                    if (liczba<1)java.lang.System.out.println("Ilość pytań musi być większa od 0");
                    else lista.dodaj(Tworzenie.stworz(liczba,nazwa));
                    break;
                case 3:
                    java.lang.System.out.println(lista);
                    java.lang.System.out.println("Wybierz Quiz do usunięcia");
                    liczba=sc.nextInt();
                    if(liczba>lista.size()||liczba<1) java.lang.System.out.println("Nie ma quizu o takim numerze :( ");
                    else lista.usun(liczba-1);
                    break;
                case 4:
                    java.lang.System.out.println(lista);
                    java.lang.System.out.println("Wybierz Quiz do modyfikacji");
                    liczba=sc.nextInt();
                    if(liczba>lista.size()||liczba<1) java.lang.System.out.println("Nie ma quizu o takim numerze :( ");
                    else Modyfikacje.modyfikuj(lista.get(liczba-1));

                    break;
                case 5:
                    java.lang.System.out.println("Podaj nazwę pliku!");
                    nazwa = sc.next();
                    lista.dodaj(Pliki.odczyt(nazwa));
                    break;
                case 6:
                    java.lang.System.out.println("Pod jaka nazwa ma byc zapisany");
                    nazwa = sc.next();
                    java.lang.System.out.println(lista);
                    java.lang.System.out.println("Wybierz Quiz do zapisania");
                    liczba=sc.nextInt();
                    if(liczba>lista.size()||liczba<1) java.lang.System.out.println("Nie ma quizu o takim numerze :( ");
                    else Pliki.zapis(nazwa,lista.get(liczba-1));
                    break;
                case 7:
                    break;
                default:
                    java.lang.System.out.println("Nie poprawna opcja !!!!");
            }
        }
    }
}
