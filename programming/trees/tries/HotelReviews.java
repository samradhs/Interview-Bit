// https://www.interviewbit.com/problems/hotel-reviews/

public class Solution {
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        
        ArrayList<Integer> result = new ArrayList<>();
        if (A == null || A.length() == 0 || B == null || B.isEmpty()) return result;
        
        TrieNode root = createTrie(A);
        
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < B.size(); i++) {
            String review   = B.get(i);
            String[] words  = review.split("_");
            int count       = 0;
            
            for (String word: words) {
                if (searchWord(root, word)) count++;   
            }
            
            ArrayList<Integer> list = map.get(count);
            if (list == null) {
                list = new ArrayList<>();
                map.put(count, list);
            }
            
            list.add(i);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i: map.keySet()) {
            list.add(i);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i: list) {
            result.addAll(map.get(i));
        }
        
        return result;
    }
    
    private TrieNode createTrie(String goodWords) {
        
        TrieNode root       = new TrieNode();
        TrieNode current    = root;
        
        for (int i = 0; i < goodWords.length(); i++) {
            
            char c = goodWords.charAt(i);
            
            if (c == '_') {
                current.endOfWord = true;
                current = root;
                continue;
            }
            
            int index = c - 'a';
            TrieNode node = current.children[index];
            if (node == null) {
                node = new TrieNode();
                current.children[index] = node;
            }
            
            current = node;
        }
        
        current.endOfWord = true;
        return root;
    }
    
    private boolean searchWord(TrieNode root, String word) {
        
        if (root == null) return false;
        
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            
            char c          = word.charAt(i);
            int index       = c - 'a';
            TrieNode node   = current.children[index];
            
            if (node == null) return false;
            current = node;
        }
        
        return current.endOfWord;
    }
    
    class TrieNode {
        TrieNode[] children;
        boolean endOfWord;
        
        TrieNode() {
            children    = new TrieNode[26];
            endOfWord   = false;
        }
    }
}
