public class ArrayGList<DATENTYP> implements GList<DATENTYP> {
    private DATENTYP[] liste;
    private int length = 0;
    ArrayGList(int max){
        liste = (DATENTYP[])new Object[max];
    }

    public int getLength(){
        return length;
    }

    public int insertLast(DATENTYP value){

        if(length > liste.length){
            return -1;
        }
        liste[length] = value;
        length ++;
        return 0;
    }


    public DATENTYP getFrist() {
        if (length == 0)
        {
            return null;
        }
        return liste[0];
    }

    public int deleteFirst(){
        if(length == 0)
        {
            return -1;
        }

        for(int i = 0; i < length -1; i++)
        {
             liste[i] = liste[i +1];
        }
        length--;
        return 0;
    }

    public boolean search(DATENTYP value){
        for(int i =0;i < length; i++)
        {
            if(value == liste[i]){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(int i =0;i < length; i++)
        {
            System.out.print(liste[i]+", ");

        }
        System.out.println();
    }
}
