// Definiert eine generische Klasse 'ArrayGList', die das Interface 'GList' implementiert.
// Der generische Datentyp 'DATENTYP' ermöglicht es, dass diese Klasse mit verschiedenen Typen verwendet werden kann, z.B. Integer, String, etc.
public class ArrayGList<DATENTYP> implements GList<DATENTYP> {

    // Private Instanzvariablen:
    // 'liste' ist ein Array vom Typ 'DATENTYP', das die gespeicherten Elemente enthält.
    // 'length' speichert die Anzahl der aktuell in der Liste enthaltenen Elemente.
    private DATENTYP[] liste;
    private int length = 0;

    // Konstruktor der Klasse, der die maximale Größe des Arrays initialisiert.
    // 'max' gibt die maximale Anzahl von Elementen an, die in der Liste gespeichert werden können.
    ArrayGList(int max){
        // Erstellen eines Arrays vom Typ DATENTYP mit einer maximalen Größe von 'max'.
        liste = (DATENTYP[])new Object[max];
    }

    // Getter-Methode, die die Anzahl der Elemente in der Liste zurückgibt.
    // Rückgabewert: die Anzahl der in der Liste gespeicherten Elemente (Length)
    public int getLength(){
        return length;
    }

    // Methode zum Hinzufügen eines Elements am Ende der Liste (InsertLast).
    // Rückgabewert: 0 wenn erfolgreich, -1 wenn die Liste voll ist (d.h. mehr Elemente als die maximale Größe)
    public int insertLast(DATENTYP value){

        // Überprüft, ob die Liste voll ist (length überschreitet die maximale Größe des Arrays).
        if(length >= liste.length){
            return -1; // Rückgabe von -1, wenn kein Platz mehr für ein weiteres Element ist.
        }

        // Fügt das neue Element am Ende der Liste hinzu.
        liste[length] = value;
        length++; // Erhöht die Länge der Liste um 1, weil ein neues Element hinzugefügt wurde.
        return 0; // Rückgabe von 0 für Erfolg.
    }

    // Methode zum Abrufen des ersten Elements der Liste (getFrist).
    // Rückgabewert: das erste Element der Liste oder null, wenn die Liste leer ist.
    public DATENTYP getFrist() {

        // Überprüft, ob die Liste leer ist.
        if (length == 0) {
            return null; // Rückgabe von null, wenn keine Elemente vorhanden sind.
        }
        return liste[0]; // Rückgabe des ersten Elements der Liste.
    }

    // Methode zum Löschen des ersten Elements der Liste (deleteFirst).
    // Rückgabewert: 0 bei Erfolg, -1 wenn die Liste leer ist.
    public int deleteFirst(){

        // Überprüft, ob die Liste leer ist.
        if(length == 0) {
            return -1; // Rückgabe von -1, wenn keine Elemente zum Löschen vorhanden sind.
        }

        // Verschiebt alle Elemente nach dem ersten nach vorne, um das erste Element zu "löschen".
        for(int i = 0; i < length - 1; i++) {
            liste[i] = liste[i + 1]; // Verschiebt jedes Element an die vorherige Position.
        }

        // Setzt das letzte Element auf null, da es nun dupliziert wurde und nicht mehr benötigt wird.
        liste[length - 1] = null;

        length--; // Reduziert die Länge der Liste um 1, da ein Element gelöscht wurde.
        return 0; // Rückgabe von 0 für Erfolg.
    }

    // Methode zur Suche eines bestimmten Elements in der Liste (search).
    // Rückgabewert: true, wenn das Element gefunden wurde, andernfalls false.
    public boolean search(DATENTYP value){

        // Durchläuft alle Elemente der Liste und vergleicht sie mit dem gesuchten Wert.
        for(int i = 0; i < length; i++) {
            if(value == liste[i]){ // Wenn das Element gefunden wird, wird true zurückgegeben.
                return true;
            }
        }

        // Wenn das Element nicht gefunden wird, wird false zurückgegeben.
        return false;
    }

    // Methode, um alle Elemente der Liste auf der Konsole auszugeben (print).
    // Gibt die Elemente durch ein Komma getrennt aus.
    public void print(){

        // Durchläuft alle Elemente der Liste und gibt jedes Element aus.
        for(int i = 0; i < length; i++) {
            System.out.print(liste[i] + ", "); // Gibt das aktuelle Element mit einem Komma aus.
        }

        // Gibt eine neue Zeile aus, um das Ende der Ausgabe zu kennzeichnen.
        System.out.println();
    }
}
