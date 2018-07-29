// https://www.interviewbit.com/problems/shortest-unique-prefix/

public class Solution {
    public ArrayList<String> prefix(ArrayList<String> A) {
        
        Trie trie = new Trie();
        trie.createTrie(A);
        return trie.shortestPrefix(A);
    }
}

class Trie {
    
    TrieNode root;
    
    Trie() {
        root = new TrieNode();
        root.visited = 0;
    }
    
    ArrayList<String> shortestPrefix(ArrayList<String> words) {
        
        ArrayList<String> res = new ArrayList<>();
        if (words == null || words.isEmpty()) return res;
        
        for (String word: words) {
            res.add(shortestPrefixRec(root, word, 0));
        }
        
        return res;
    }
    
    String shortestPrefixRec(TrieNode node, String word, int index) {
        
        if (root == null) return "";
        if (index == word.length()) return word;
        if (node.visited == 1) return word.substring(0, index);
        
        char c = word.charAt(index);
        return shortestPrefixRec(node.children.get(c), word, index + 1);
    }
    
    TrieNode createTrie(ArrayList<String> words) {
        
        for (String word: words) {
            TrieNode current = root;
            
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                TrieNode node = current.children.get(c);
                if (node == null) {
                    node = new TrieNode();
                    current.children.put(c, node);
                } else {
                    node.visited++;
                }
                
                current = node;
            }
        }
        
        return root;
    }
}

class TrieNode {
    
    Map<Character, TrieNode> children;
    int visited;
    
    TrieNode() {
        children = new HashMap<>();
        visited = 1;
    }
}