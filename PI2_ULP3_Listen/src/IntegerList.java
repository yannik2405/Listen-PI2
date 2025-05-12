// Definition eines Interfaces namens IntegerList.
// Ein Interface legt nur die Methodensignaturen (also die "Verträge") fest,
// die jede implementierende Klasse erfüllen MUSS – jedoch keine konkrete Logik.
public interface IntegerList {

    // Diese Methode gibt die Anzahl der in der Liste gespeicherten Elemente zurück.
    // Rückgabewert: Die Anzahl der Elemente in der Liste (Typ: int)
    int getLength();

    // Diese Methode fügt ein neues Element am Ende der Liste hinzu.
    // Parameter: 'value' ist der Integer-Wert, der in die Liste eingefügt wird.
    // Rückgabewert: 0 wenn das Einfügen erfolgreich war, ein Fehlercode (z.B. -1) wenn ein Fehler auftritt,
    //              wie z.B. bei vollem Speicher.
    int insertLast(int value);

    // Diese Methode gibt das erste Element der Liste zurück, ohne es zu löschen.
    // Wenn die Liste leer ist, wird ein spezieller Fehlerwert (z.B. -9999) zurückgegeben.
    // Hinweis: Der Fehlerwert ist konventionell, eine bessere Lösung könnte ein Optional oder eine Exception sein.
    // Rückgabewert: Das erste Element der Liste oder ein Fehlerwert, wenn die Liste leer ist.
    int getFrist(); // Hinweis: Vermutlich ein Tippfehler, sollte "getFirst()" heißen.

    // Diese Methode löscht das erste Element aus der Liste.
    // Rückgabewert: 0 wenn das Löschen erfolgreich war, ein Fehlercode (z.B. -1) wenn die Liste leer ist.
    int deleteFirst();

    // Diese Methode sucht nach einem bestimmten Wert in der Liste.
    // Parameter: 'value' ist der Integer-Wert, der in der Liste gesucht wird.
    // Rückgabewert: true, wenn der Wert in der Liste gefunden wurde, andernfalls false.
    boolean search(int value);

    // Diese Methode gibt alle Elemente der Liste in lesbarer Form auf der Konsole aus.
    // Es gibt keinen Rückgabewert, da die Ausgabe direkt in der Konsole erfolgt.
    void print();
}
