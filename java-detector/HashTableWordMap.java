import java.util.*;


public class HashTableWordMap {


    private Hashtable<String,Integer> structure;
    private int size;
    
    public Set<String> SetKeys(){
        return structure.keySet();
    }

    public HashTableWordMap(){
        structure=new Hashtable<String,Integer>(100);
        size=0;
    }
 
 /**
     * Returns the logical size of this WordMap. That is the number of
     * associations currently stored in it.
     *
     * @return the logical size of this WordMap
     */
    
    public int size() {

        return size;
        
    }

    /**
     * Returns true if and only if this WordMap contains the specified
     * word.
     *
     * @param key the specified word
     * @return true if and only if this WordMap contains the specified word
     * @throws NullPointerException if the value of the parameter is null
     */

    public boolean contains(String key) {

        return structure.containsKey(key);
        
    }
    
    /**
     * Returns the count associated with the specified word or 0 if
     * the word is absent.
     *
     * @param key the specified word
     * @return the count associated with the specified word or 0 if absent
     * @throws NullPointerException if the value of the parameter is null
     */
    
    public int get(String key) {

        return structure.get(key);
        
    }
    
    /**
     * Increments by 1 the counter associated with the specified
     * word. If the specified word is absent from the data structure,
     * a new association is created.
     *
     * @param key the specified word
     * @throws NullPointerException if the value of the parameter is null
     */
    @SuppressWarnings( "deprecation" )
    public int update(String key) {

        if(structure.containsKey(key)){
            int temp = structure.get(key);
            structure.replace(key,temp+1);
            return temp+1;
        }
       
        else{
            Integer temp = new Integer(1);
            structure.put(key,temp);
            size++;
            return 1;
        }       
        
    }
    
    /**
     * Returns all the keys (words) of this WordMap using their
     * natural order.
     *
     * @return all the keys (words)
     */
    
    
}