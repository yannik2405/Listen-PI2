public class ArrayIntegerList implements IntegerList {
    private int liste[];
    private int length = 0;
    ArrayIntegerList(int max){
        liste = new int[max];
    }
    public int getLength(){
        return length;
    }

    public int insertLast(int value){

        if(length > liste.length){
            return -1;
        }
        liste[length] = value;
        length ++;
        return 0;
    }


    public int getFrist() {
        if (length == 0)
        {
            return -9999;
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

    public boolean search(int value){
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
