# Listen-PI2
Prof. Dr. C. Yuan<br/>
Praktikum "Praktische Informatik 2" TH Köln, Fakultät 07<br/>
Aufgaben zu Versuch 3
------------------------------------------------------------------------------------------------------------------------
# Aufgabe 3.1: Arbeiten mit Listen
Definieren Sie ein Interface IntegerList für eine „Liste ganzer Zahlen“ mit folgenden Methoden:<br/>
• int getLength() // liefert die Länge der Liste.<br/>
• int insertLast(int value) // fügt value am Ende der List ein.<br/>
• int getFirst() // liefert das erste Element der Liste.<br/>
• int deleteFirst() // entfernt das erste Element von der Liste.<br/>
• boolean search(int value) // prüft, ob der Wert in der Liste vorhanden ist.<br/>
• void print( ) // zeigt den Inhalt der Liste an.<br/>
<br/>
Programmieren Sie dann eine Klasse ArrayIntegerList, die das Interface IntegerList implementieren soll.<br/>
<br/>
Diese Klasse hat die folgenden Eigenschaften :<br/>
• Attribute sind ein Array mit int-Einträgen und eine int-Variable, die Länge der Liste angibt. Die Attribute sollen von außen nicht direkt zugreifbar sein.<br/>
• Ein Konstruktor: Der Konstruktor soll als Parameterwert die maximale Größe des Arrays übergeben bekommen. Er soll das Array erzeugen. Die Methode insertLast liefert eine 0, wenn der Wert erfolgreich in die Liste eingefügt werden kann, sonst eine -1.<br/>
• Die Methode getFirst liefert einen Wert -9999, wenn die Liste leer ist.<br/>
• Die Methode deleteFirst liefert eine 0 bei erfolgreicher Operation, sonst -1. Das Hauptprogramm soll zunächst ein Objekt der obigen Klasse erzeugen. Die maximale Arraygröße soll über die Tastatur eingelesen und dann an den Konstruktorübergeben werden. Anschließend soll der Benutzer die Möglichkeit haben, wiederholt eine Methode der Klasse zu wählen und den Rückgabewert der jeweiligen Methode auf den Bildschirm zu lesen. Testen Sie Ihr Programm, bis alle Methoden richtig funktionieren.<br/>
<br/>
# Aufgabe 3.2: Listen mit beliebigen Typen
Ändern Sie das Interface und die Klasse aus Aufgabe 3.1 so, dass Listen mit beliebigen Typen definiert werden können (z.B. eine Liste mit int-Werten oder eine Liste mit double-Werten).<br/>
<br/>
• Verwenden Sie dabei einen generischen Typ-Parameter.<br/>
• Nennen Sie nun das Interface GList und die Klasse ArrayGList.<br/>
• Realisieren Sie das Interface und die Klasse mit entsprechenden Modifizierungen.<br/>
<br/>
Ändern Sie das Hauptprogramm so, dass zunächst der Benutzer gefragt wird, was für ein Liste- Objekt erzeugt werden soll. Als Wahlmöglichkeiten kann der Daten-Typ entweder Integer oder Double sein. Danach erzeugen Sie das gewünschte Objekt und verfahren wie in Aufgabe 3.1. Testen Sie Ihr Programm sowohl mit einer Liste ganzer Zahlen (int) als auch mit double-Werten.