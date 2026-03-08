import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> res = new ArrayList<>();

        for(String word : words){
            if(match(word, pattern))
                res.add(word);
        }

        return res;
    }

    boolean match(String w, String p){
        char[] map1 = new char[26];
        char[] map2 = new char[26];

        for(int i = 0; i < w.length(); i++){
            char c1 = w.charAt(i);
            char c2 = p.charAt(i);

            if(map1[c1-'a'] == 0 && map2[c2-'a'] == 0){
                map1[c1-'a'] = c2;
                map2[c2-'a'] = c1;
            }
            else if(map1[c1-'a'] != c2)
                return false;
        }

        return true;
    }
}