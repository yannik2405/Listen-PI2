// Das Interface 'GList' definiert die grundlegenden Methoden, die von jeder Liste implementiert werden müssen,
// unabhängig vom spezifischen Typ oder der Implementierung der Liste.
// Das Interface ist generisch und ermöglicht es, beliebige Datentypen (repräsentiert durch 'DATENTYP') zu verwenden.
public interface GList<DATENTYP> {

    // Methode zur Abfrage der Länge der Liste.
    // Diese Methode gibt die Anzahl der aktuell in der Liste enthaltenen Elemente zurück.
    // Rückgabewert: Die Anzahl der Elemente in der Liste (Type: int)
    int getLength();

    // Methode zum Einfügen eines neuen Elements am Ende der Liste.
    // Die Methode nimmt ein Element des generischen Typs 'DATENTYP' als Parameter und fügt es ans Ende der Liste an.
    // Rückgabewert: 0 bei erfolgreichem Einfügen des Elements, -1 bei Fehler (z.B. wenn die Liste voll ist)
    int insertLast(DATENTYP value);

    // Methode zum Abrufen des ersten Elements der Liste.
    // Diese Methode gibt das erste Element der Liste zurück, oder null, wenn die Liste leer ist.
    // Rückgabewert: Das erste Element der Liste (Typ: DATENTYP) oder null, wenn die Liste leer ist.
    DATENTYP getFrist();

    // Methode zum Löschen des ersten Elements der Liste.
    // Diese Methode entfernt das erste Element der Liste und verschiebt die restlichen Elemente nach vorne.
    // Rückgabewert: 0 bei erfolgreichem Löschen des ersten Elements, -1 wenn die Liste leer ist.
    int deleteFirst();

    // Methode zur Suche eines bestimmten Elements in der Liste.
    // Die Methode durchläuft die Liste und prüft, ob das angegebene Element vorhanden ist.
    // Rückgabewert: true, wenn das Element gefunden wurde, false wenn nicht.
    boolean search(DATENTYP value);

    // Methode zum Ausgeben der Elemente der Liste.
    // Diese Methode gibt alle Elemente der Liste in einer Form aus, die in der Konsole sichtbar ist.
    // Rückgabewert: Keine Rückgabe, da es sich um eine void-Methode handelt.
    void print();
}
