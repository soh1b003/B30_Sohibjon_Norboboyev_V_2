

public class Main {
    public static void main(String[] args) {


        String[] words = {"bir", "bir", "rib", "ikki", "ikki", "ii", "ii"};


        System.out.printf("soni", juftlik(words));


    }


    public static int juftlik(String[] words){
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