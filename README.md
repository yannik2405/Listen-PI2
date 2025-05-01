# liste-PI2
Prof. Dr. C. Yuan
Praktikum "Praktische Informatik 2" TH Köln, Fakultät 07
Aufgaben zu Versuch 3
------------------------------------------------------------------------------------------------------------------------
# Aufgabe 3.1: Arbeiten mit Listen
Definieren Sie ein Interface IntegerList für eine „Liste ganzer Zahlen“ mit folgenden
Methoden:
• int getLength() // liefert die Länge der Liste.
• int insertLast(int value) // fügt value am Ende der List ein.
• int getFirst() // liefert das erste Element der Liste.
• int deleteFirst() // entfernt das erste Element von der Liste.
• boolean search(int value) // prüft, ob der Wert in der Liste vorhanden ist.
• void print( ) // zeigt den Inhalt der Liste an.

Programmieren Sie dann eine Klasse ArrayIntegerList, die das Interface IntegerList implementieren soll.

Diese Klasse hat die folgenden Eigenschaften :
• Attribute sind ein Array mit int-Einträgen und eine int-Variable, die Länge der Liste angibt. Die Attribute sollen von außen nicht direkt zugreifbar sein.
• Ein Konstruktor: Der Konstruktor soll als Parameterwert die maximale Größe des Arrays übergeben bekommen. Er soll das Array erzeugen. Die Methode insertLast liefert eine 0, wenn der Wert erfolgreich in die Liste eingefügt werden kann, sonst eine -1.
• Die Methode getFirst liefert einen Wert -9999, wenn die Liste leer ist.
• Die Methode deleteFirst liefert eine 0 bei erfolgreicher Operation, sonst -1. Das Hauptprogramm soll zunächst ein Objekt der obigen Klasse erzeugen. Die maximale Arraygröße soll über die Tastatur eingelesen und dann an den Konstruktorübergeben werden. Anschließend soll der Benutzer die Möglichkeit haben, wiederholt eine Methode der Klasse zu wählen und den Rückgabewert der jeweiligen Methode auf den Bildschirm zu lesen. Testen Sie Ihr Programm, bis alle Methoden richtig funktionieren.

# Aufgabe 3.2: Listen mit beliebigen Typen
Ändern Sie das Interface und die Klasse aus Aufgabe 3.1 so, dass Listen mit beliebigen Typen definiert werden können (z.B. eine Liste mit int-Werten oder eine Liste mit double-Werten).

• Verwenden Sie dabei einen generischen Typ-Parameter.
• Nennen Sie nun das Interface GList und die Klasse ArrayGList.
• Realisieren Sie das Interface und die Klasse mit entsprechenden Modifizierungen.

Ändern Sie das Hauptprogramm so, dass zunächst der Benutzer gefragt wird, was für ein Liste- Objekt erzeugt werden soll. Als Wahlmöglichkeiten kann der Daten-Typ entweder Integer oder Double sein. Danach erzeugen Sie das gewünschte Objekt und verfahren wie in Aufgabe 3.1. Testen Sie Ihr Programm sowohl mit einer Liste ganzer Zahlen (int) als auch mit double-Werten.