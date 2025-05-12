public interface GList <DATENTYP> {
    int getLength();

    int insertLast(DATENTYP value);

    DATENTYP getFrist();

    int deleteFirst();

    boolean search(DATENTYP value);

    void print();
}
