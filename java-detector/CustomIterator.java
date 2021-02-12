import java.util.Iterator;

public class CustomIterator implements Iterator<String> {
    private int cursor;
    private final int range;

    public CustomIterator(int size){
        cursor=0;
        range=size;
    }
    public boolean hasNext(){
        return cursor + range<=WordReader.content.length();
    }
    public String next(){
        int temp = cursor;
        cursor++;
        return WordReader.content.substring(temp,temp+range);      
    }


}