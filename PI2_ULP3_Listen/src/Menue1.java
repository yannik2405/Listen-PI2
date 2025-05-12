import java.util.Scanner; // Importiert die Scanner-Klasse, um Benutzereingaben zu lesen.

public class Menue1 {

    public static void main(String[] args) {

        // Scanner-Objekt wird erstellt, um Eingaben von der Konsole zu lesen.
        Scanner scanner = new Scanner(System.in);

        // Benutzer wird aufgefordert, die gewünschte Größe der Liste anzugeben.
        System.out.println("Bitte geben sie die gewünschte Größe der Liste ein!");

        // Die Eingabe des Benutzers wird als Ganzzahl gelesen und in der Variable 'size' gespeichert.
        int size = scanner.nextInt();

        // Es wird ein neues Objekt der Klasse 'ArrayIntegerList' mit der angegebenen Größe erstellt.
        ArrayIntegerList list = new ArrayIntegerList(size);

        // Die Schleifensteuerungsvariable 'laufend' wird auf true gesetzt, damit die Schleife gestartet wird.
        boolean laufend = true;

        // Hauptmenü-Schleife: läuft solange 'laufend' true ist.
        while (laufend) {

            // Das Menü mit den verfügbaren Optionen wird ausgegeben.
            System.out.println("----Bitte wählen Sie einen Menü Punkt----");
            System.out.println("1: getLenght()");       // Gibt die aktuelle Länge der Liste zurück.
            System.out.println("2: insertlast()");       // Fügt ein Element am Ende der Liste ein.
            System.out.println("3: getFirst()");         // Gibt das erste Element der Liste zurück.
            System.out.println("4: deleteFirst()");      // Entfernt das erste Element aus der Liste.
            System.out.println("5: search()");           // Sucht nach einem bestimmten Element.
            System.out.println("6: print()");            // Gibt alle Elemente der Liste aus.
            System.out.println("7: Beenden");            // Beendet das Programm.

            // Die Auswahl des Benutzers wird als Ganzzahl eingelesen.
            int auswahl = scanner.nextInt();

            // Entscheidung basierend auf der Benutzerauswahl.
            switch (auswahl) {

                case 1:
                    // Gibt die aktuelle Länge der Liste aus.
                    System.out.println("Aktuelle Länge der Liste: " + list.getLength());
                    break;

                case 2:
                    // Fordert den Benutzer auf, einen Wert zur Liste hinzuzufügen.
                    System.out.println("Geben Sie einen Wert ein, welcher eingefügt werden soll!");
                    int eingabe = scanner.nextInt();

                    // Versucht, den Wert ans Ende der Liste einzufügen. 0 bedeutet Erfolg.
                    if(list.insertLast(eingabe) == 0) {
                        System.out.println("Der Wert wurde erfolgreich hinzugefügt!");
                    } else {
                        System.out.println("Der Wert konnte nicht hinzugefügt werden.");
                    }
                    break;

                case 3:
                    // Gibt das erste Element der Liste zurück, falls vorhanden.
                    if(list.getFrist() == -9999) {
                        System.out.println("Die Liste ist leer.");
                    } else {
                        System.out.println("Das erste Element der Liste ist: " + list.getFrist());
                    }
                    break;

                case 4:
                    // Versucht, das erste Element aus der Liste zu entfernen. 0 bedeutet Erfolg.
                    if(list.deleteFirst() == 0) {
                        System.out.println("Das erste Element wurde erfolgreich entfernt!");
                    } else {
                        System.out.println("Es konnte kein Element entfernt werden!");
                    }
                    break;

                case 5:
                    // Fordert den Benutzer auf, einen Wert einzugeben, nach dem in der Liste gesucht werden soll.
                    System.out.println("Geben Sie einen Wert ein, welcher gesucht werden soll!");
                    int suche = scanner.nextInt();

                    // Sucht nach dem angegebenen Wert in der Liste.
                    if(list.search(suche)) {
                        System.out.println("Das Element ist in der Liste enthalten.");
                    } else {
                        System.out.println("Das Element ist NICHT in der Liste enthalten.");
                    }
                    break;

                case 6:
                    // Gibt alle Elemente der Liste aus.
                    list.print();
                    break;

                case 7:
                    // Setzt die Steuerungsvariable auf false, um die Schleife zu beenden.
                    laufend = false;
                    System.out.println("Programm wird beendet.");
                    break;

                // Wenn die Eingabe keiner gültigen Option entspricht.
                default:
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie eine Option von 1 bis 5.");
            }
        }
    }
}
