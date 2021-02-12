import java.util.Set;
public class Jaccard implements Similarity{
    public Jaccard(){

    }
    public double score(HashTableWordMap a,HashTableWordMap b){
        Set<String> keys =a.SetKeys();
        int intersection=0;
        int union ;
        for(String i:keys){
            if(b.contains(i)){
                intersection++;
            }
        }
        if(intersection==0){
            union = a.size()+b.size();
        }
        else{
            union = a.size()+b.size()-intersection;
        }
        return (double)intersection/(double)union;
    }
}
