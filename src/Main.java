import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


//        String[] words = {"bir", "bir", "rib", "ikki", "ikki", "ii", "ii"};
//
//
//        System.out.printf("soni", juftlik(words));


        Set<String > set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("5");
        Set<String > set2 = new HashSet<>();
        set2.add("2");
        set2.add("3");
        set2.add("4");
        set2.add("6");
        Set<String > set3 = new HashSet<>();
        set2.add("1");
        set2.add("3");
        set2.add("9");
        set2.add("8");

        System.out.println(task4(set1, set2, set3));
    }

    private static Set<String > task4(Set<String > set1, Set<String > set2, Set<String > set3) {

        Set<String> result = new HashSet<>();

        Set<String> uxwaw = new HashSet<>(set1);
        uxwaw.retainAll(set1);
        uxwaw.retainAll(set2);
        result.addAll(uxwaw);

        Set<String> uxwawmas = new HashSet<>(set3);
        uxwawmas.removeAll(set1);
        uxwawmas.removeAll(set3);
        result.addAll(uxwawmas);

        return result;
    }


    public static int task3(String[] words){
        int num = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    num++;
                } else if (checkWord(words[i], words[j])) {
                    num++;
                }
            }
        }
        return num;
    }

    private static boolean checkWord(String word, String word1) {
        StringBuilder word2 = new StringBuilder();
        for(int i = word1.length() - 1 ; i >= 0; i--){
            word2.append('i');
        }

        if(word2.equals(word)){
            return true;
        }
        else {
            return false;
        }
    }


}