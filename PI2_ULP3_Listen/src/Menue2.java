import java.util.Scanner; // Importiert die Scanner-Klasse, um Eingaben über die Konsole zu lesen

// Hauptklasse Menue2
public class Menue2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner zur Eingabe von Benutzerdaten erstellen

        ArrayGList list; // Deklaration der Liste, die entweder Integer oder Double speichert

        // Benutzer wird gefragt, ob Integer (0) oder Double (1) gespeichert werden sollen
        System.out.println("Sollen Integer (0) oder Double (1) gespeichert werden?");
        int datentyp = scanner.nextInt(); // Eingabe wird gelesen

        // Benutzer wird gefragt, wie groß die Liste sein soll
        System.out.println("Bitte geben sie die gewünschte Größe der Liste ein!");
        int size = scanner.nextInt(); // Größe der Liste wird gelesen

        boolean laufend = true; // Steuerungsvariable für die Hauptschleife

        boolean isInterger; // Gibt an, ob die Liste mit Integer oder Double arbeitet

        // Je nach Benutzerauswahl wird eine generische Liste für Integer oder Double erstellt
        if(datentyp == 0){
            list = new ArrayGList<Integer>(size); // Liste für Integer
            isInterger = true;
        }
        else {
            list = new ArrayGList<Double>(size); // Liste für Double
            isInterger = false;
        }

        // Start der Menüschleife
        while (laufend) {

            // Menüanzeige mit den möglichen Optionen
            System.out.println("----Bitte wählen Sie einen Menü Punkt----");
            System.out.println("1: getLenght()");       // Gibt die Anzahl der gespeicherten Elemente aus
            System.out.println("2: insertlast()");       // Fügt ein neues Element am Ende ein
            System.out.println("3: getFirst()");         // Gibt das erste Element aus
            System.out.println("4: deleteFirst()");      // Löscht das erste Element
            System.out.println("5: search()");           // Sucht nach einem bestimmten Wert
            System.out.println("6: print()");            // Gibt alle Elemente aus
            System.out.println("7: Beenden");            // Beendet das Programm

            int auswahl = scanner.nextInt(); // Auswahl des Benutzers

            switch (auswahl) {

                case 1:
                    // Länge der Liste ausgeben
                    System.out.println("Aktuelle Länge der Liste: " + list.getLength());
                    break;

                case 2:
                    // Benutzer zur Eingabe eines Werts auffordern
                    System.out.println("Geben Sie einen Wert ein, welcher eingefügt werden soll!");

                    if(isInterger){
                        int eingabeInt = scanner.nextInt(); // Eingabe als Integer

                        // Versuch, den Wert am Ende einzufügen. 0 = Erfolg
                        if(list.insertLast(eingabeInt) == 0) {
                            System.out.println("Der Wert wurde erfolgreich hinzugefügt!");
                        } else {
                            System.out.println("Der Wert konnte nicht hinzugefügt werden.");
                        }
                    } else {
                        double eingabeDouble = scanner.nextDouble(); // Eingabe als Double

                        // Versuch, den Wert am Ende einzufügen
                        if(list.insertLast(eingabeDouble) == 0) {
                            System.out.println("Der Wert wurde erfolgreich hinzugefügt!");
                        } else {
                            System.out.println("Der Wert konnte nicht hinzugefügt werden.");
                        }
                    }
                    break;

                case 3:
                    // Gibt das erste Element zurück oder meldet, dass die Liste leer ist
                    if(list.getFrist() == null) {
                        System.out.println("Die Liste ist leer.");
                    } else {
                        System.out.println("Das erste Element der Liste ist: " + list.getFrist());
                    }
                    break;

                case 4:
                    // Versuch, das erste Element zu löschen
                    if(list.deleteFirst() == 0) {
                        System.out.println("Das erste Element wurde erfolgreich entfernt!");
                    } else {
                        System.out.println("Es konnte kein Element entfernt werden!");
                    }
                    break;

                case 5:
                    // Benutzer wird zur Eingabe eines Suchwertes aufgefordert
                    System.out.println("Geben Sie einen Wert ein, welcher gesucht werden soll!");
                    double suche = scanner.nextDouble(); // Achtung: funktioniert korrekt nur bei Double-Listen

                    // Sucht den Wert in der Liste
                    if(list.search(suche)) {
                        System.out.println("Das Element ist in der Liste enthalten.");
                    } else {
                        System.out.println("Das Element ist NICHT in der Liste enthalten.");
                    }
                    break;

                case 6:
                    // Gibt alle Elemente in der Liste aus
                    list.print();
                    break;

                case 7:
                    // Beendet die Schleife und somit das Programm
                    laufend = false;
                    System.out.println("Programm wird beendet.");
                    break;

                default:
                    // Bei ungültiger Eingabe
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie eine Option von 1 bis 5.");
            }
        }
    }
}
