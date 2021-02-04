import java.util.Iterator;
public class test{

    public static void main(String[]args){
        String s = "let it be";
        Iterator<String> i = new CustomIterator(4,s);
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
    }




    static class CustomIterator implements Iterator<String>{
        private int cursor;
        private final int range;
        private String string;

        public CustomIterator(int size,String s){
            cursor=0;
            range=size;
            string=s;
        }
        public boolean hasNext(){
            return cursor + range<=string.length();
        }
        public String next(){
            int temp = cursor;
            cursor++;
            return string.substring(temp,temp+range);      
        }


    }
}