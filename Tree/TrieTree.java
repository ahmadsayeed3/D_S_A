// Actions: Insert, IsExists, isPrefixExists

class Node{

	private Node[] nodes = new Node[26];
	private boolean complete;
	
	public boolean containsKey(char ch){
		return (nodes[ch - 'a'] != null);
	}
	
	public void put(char ch, Node node){
		nodes[ch - 'a'] = node;
	}
	
	public Node getNode(char ch){
		return nodes[ch - 'a'];
	}
	
	public boolean isComplete(){
		return this.complete;
	}
	
	public void setComplete(){
		this.complete = true;
	}

}


class Trie{

	private Node rootNode;
	
	public Trie(){
		this.rootNode = new Node();
	}

	public void insert(String word){
		Node node = this.rootNode;
		char[] chars = word.toCharArray();
		for(int i= 0; i< chars.length; i++){
			if(!node.containsKey(chars[i])){
				node.put(chars[i], new Node());
			}
			
			node = node.getNode(chars[i]);
		}
		
		node.setComplete();
	
	}
	
	public boolean isWordExists(String word){
		char[] chars = word.toCharArray();
		Node node = this.rootNode;
		for(int i =0; i< chars.length; i++){
			if(!node.containsKey(chars[i]))
				return false;
				
			node = node.getNode(chars[i]);
		}
		
		return node.isComplete();
	}
	
	public boolean isWordPrexifExists(String word){
		Node node = this.rootNode;
		char[] chars = word.toCharArray();
		for(int i=0; i< chars.length; i++){
			if(!node.containsKey(chars[i]))
				return false;
		}
		
		return true;
	}

}

public class TrieTree{
	
	public static void main(String[] args){
		System.out.println("Trie Program");
		Trie trie = new Trie();
		trie.insert("apple");
		trie.insert("apps");
		trie.insert("ahmad");
		trie.insert("sayeed");
		
		System.out.println("Check if apple exists: " + trie.isWordExists("apple"));
		System.out.println("Check if apps exists: " + trie.isWordExists("apps"));
		System.out.println("Check if ahmad exists: " + trie.isWordExists("ahmad"));
		System.out.println("Check if sayeed exists: " + trie.isWordExists("sayeed"));
		
		System.out.println("Check if appl prefix exists: " + trie.isWordPrexifExists("appl"));
		System.out.println("Check if app prefix exists: " + trie.isWordPrexifExists("app"));
		System.out.println("Check if ahma prefix exists: " + trie.isWordPrexifExists("ahma"));
		System.out.println("Check if sayee prefix exists: " + trie.isWordPrexifExists("sayee"));
		
		System.out.println("\nCheck if babu prefix exists: " + trie.isWordPrexifExists("babu"));
		
		System.out.println("\nCheck if applecard word exists: " + trie.isWordExists("applecard"));
	}


}