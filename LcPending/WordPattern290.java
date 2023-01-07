package LcPending;
import java.util.*;
public class WordPattern290 {
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String pattern = scn.nextLine();

            String s = scn.nextLine();
            
      
            System.out.println(wordPattern(pattern, s));
      }

      
            public static boolean wordPattern(String pattern, String s) {
                String[] words = s.split(" ");
                if (words.length != pattern.length()) {
                    return false;
                }
        
                Map<Character, String> charToWord = new HashMap<>();
                Map<String, Character> wordToChar = new HashMap<>();
        
                for (int i = 0; i < pattern.length(); i++) {
                    char c = pattern.charAt(i);
                    String word = words[i];
        
                    if (!charToWord.containsKey(c)) {
                        charToWord.put(c, word);
                    }
        
                    if (!wordToChar.containsKey(word)) {
                        wordToChar.put(word, c);
                    }
        
                    if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
                        return false;
                    }
                }
        
                return true;        
            }
        
}
