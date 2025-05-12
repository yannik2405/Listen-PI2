import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Bitte geben sie die gewünschte Größe der Liste ein!");
            
            int size = scanner.nextInt();

            ArrayIntegerList list = new ArrayIntegerList(size);
            
            boolean laufend = true;

            while (laufend) {

                System.out.println("----Bitte wählen Sie einen Menü Punkt----");
                System.out.println("1: getLenght()");
                System.out.println("2: insertlast()");
                System.out.println("3: getFirst()");
                System.out.println("4: deleteFirst()");
                System.out.println("5: search()");
                System.out.println("6: print()");
                System.out.println("7: Beenden");

                int auswahl = scanner.nextInt();

                switch (auswahl) {

                    case 1:
                        System.out.println("Aktuelle Länge der Liste: " + list.getLength());
                        break;

                    case 2:
                        System.out.println("Geben Sie einen Wert ein, welcher eingefügt werden soll!");
                        int eingabe = scanner.nextInt();
                        if(list.insertLast(eingabe) == 0)
                        {
                            System.out.println("Der Wert wurde erfolgreich hinzugefügt!");
                        }
                        else {
                            System.out.println("Der Wert konnte nicht hinzugefügt werden.");
                        }
                        break;

                    case 3:
                        if(list.getFrist() == -9999)
                        {
                            System.out.println("Die Liste ist leer.");
                        }
                        else {
                            System.out.println("Das erste Element der Liste ist: " + list.getFrist());
                        }
                        break;

                    case 4:
                        if(list.deleteFirst() == 0)
                        {
                            System.out.println("Das erste Element wurde erfolgreich entfernt!");
                        }
                        else {
                            System.out.println("Es konnte kein Element entfernt werden!");
                        }
                        break;

                    case 5:
                        System.out.println("Geben Sie einen Wert ein, welcher gesucht werden soll!");
                        int suche = scanner.nextInt();
                        if(list.search(suche))
                        {
                            System.out.println("Das Element ist in der Liste enthalten.");
                        }
                        else {
                            System.out.println("Das Element ist NICHT in der Liste enthalten.");
                        }
                        break;

                    case 6:
                        list.print();
                        break;

                    case 7:
                        laufend = false;
                        System.out.println("Programm wird beendet.");
                        break;

                   
                    default:
                        System.out.println("Ungültige Eingabe. Bitte wählen Sie eine Option von 1 bis 5.");
                }
            }
        }
    }
