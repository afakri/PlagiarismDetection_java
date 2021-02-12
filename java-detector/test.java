
public class test{

    public static void main(String[]args){
        HashTableWordMap w1= new HashTableWordMap();
        HashTableWordMap w2= new HashTableWordMap();

        w1.update("one");
        w1.update("two");
        w1.update("three");
        w1.update("four");

        w2.update("one");
        w2.update("two");
        w2.update("three");
        w2.update("four");
        w2.update("cinq");
        w2.update("six(6)");
        w2.update("sept");
        w2.update("huit");
        w2.update("neuf");
        w2.update("dix");

        Jaccard j= new Jaccard();
        System.out.println(j.score(w1, w2));
    }

}