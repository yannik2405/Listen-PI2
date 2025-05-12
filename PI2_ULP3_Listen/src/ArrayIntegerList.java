// Die Klasse ArrayIntegerList implementiert das Interface IntegerList.
// Sie stellt eine einfache Liste dar, die mit einem Array arbeitet und nur Integer-Werte speichert.
public class ArrayIntegerList implements IntegerList {

    // Das interne Array, das die tatsächlichen Integer-Werte speichert.
    private int liste[];

    // Die aktuelle Anzahl der gespeicherten Elemente in der Liste.
    private int length = 0;

    // Konstruktor: Initialisiert das Array mit einer vom Benutzer vorgegebenen Maximalgröße.
    ArrayIntegerList(int max){
        liste = new int[max]; // Speicherreservierung für die Liste
    }

    // Gibt die aktuelle Anzahl der gespeicherten Elemente zurück.
    public int getLength(){
        return length;
    }

    // Fügt ein neues Element am Ende der Liste ein.
    // Rückgabewert: 0 bei Erfolg, -1 wenn das Array bereits voll ist.
    public int insertLast(int value){

        // Fehler: Wenn length größer als die Länge des Arrays ist, ist kein Platz mehr vorhanden.
        // ACHTUNG: Sollte "length >= liste.length" heißen, da Array-Indizes bei 0 beginnen!
        if(length >= liste.length){
            return -1; // Kein Platz mehr
        }

        // Der neue Wert wird am Ende eingefügt
        liste[length] = value;

        // Die Anzahl der Elemente wird erhöht
        length++;

        return 0; // Erfolgreich eingefügt
    }

    // Gibt das erste Element der Liste zurück, ohne es zu entfernen.
    // Rückgabewert: tatsächlicher Wert oder -9999, wenn die Liste leer ist.
    public int getFrist() {  // Anmerkung: Schreibfehler im Methodennamen, sollte "getFirst()" sein.
        if (length == 0)
        {
            return -9999; // Konventioneller Fehlerwert
        }

        return liste[0]; // Erstes Element im Array
    }

    // Entfernt das erste Element aus der Liste.
    // Rückgabewert: 0 bei Erfolg, -1 wenn Liste leer ist.
    public int deleteFirst(){
        if(length == 0)
        {
            return -1; // Nichts zu löschen
        }

        // Alle Elemente werden eine Position nach vorne verschoben (überschreiben das erste)
        for(int i = 0; i < length - 1; i++)
        {
            liste[i] = liste[i + 1];
        }

        // Die Anzahl der Elemente wird reduziert (letztes Element ist nun "vergessen")
        length--;

        return 0; // Erfolgreich entfernt
    }

    // Durchsucht die Liste nach einem bestimmten Wert.
    // Rückgabewert: true, wenn gefunden; false, wenn nicht.
    public boolean search(int value){
        for(int i = 0; i < length; i++)
        {
            if(value == liste[i]){ // Vergleich mit aktuellem Element
                return true;
            }
        }
        return false; // Nach kompletter Durchsuchung nichts gefunden
    }

    // Gibt alle gespeicherten Elemente der Liste in einer Zeile aus.
    public void print(){
        for(int i = 0; i < length; i++)
        {
            System.out.print(liste[i] + ", "); // Elemente durch Komma getrennt
        }
        System.out.println(); // Neue Zeile am Ende der Ausgabe
    }
}
