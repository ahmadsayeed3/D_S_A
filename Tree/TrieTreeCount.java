class Node{

	private Node[] nodes = new Node[26];
	private int startsWithCount;
	private int wordCount;
	
	public boolean containsKey(char ch){
		return nodes[ch - 'a'] != null;
	}
	
	public void put(char ch){
		nodes[ch - 'a'] = new Node();
	}
	
	public Node getNode(char ch){
		return nodes[ch - 'a'];
	}
	
	public void increaseStartWithCount(){
		this.startsWithCount +=1;
	}
	
	public void increaseWordCount(){
		this.wordCount += 1;
	}
	
	public void decreaseStartWithCount(){
		this.startsWithCount--;
	}
	
	public void decreaseWordCount(){
		this.wordCount--;
	}
	
	public int getWordCount(){
		return this.wordCount;
	}
	
	public int getStartsWithWordCount(){
		return this.startsWithCount;
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
		for(int i=0; i< chars.length; i++){
			if(!node.containsKey(chars[i])){
				node.put(chars[i]);
			}
			
			node = node.getNode(chars[i]);
			node.increaseStartWithCount();
		}
		
		node.increaseWordCount();
	}
	
	public int countWordsEqualTo(String word){
		Node node = this.rootNode;
		char[] chars = word.toCharArray();
		for(int i =0; i< chars.length; i++){
			if(!node.containsKey(chars[i]))
				return 0;
			
			node = node.getNode(chars[i]);
		}
		
		return node.getWordCount();
	}

	public int countWordsStartWIth(String word){
		Node node = this.rootNode;
		char[] chars = word.toCharArray();
		for(int i =0; i< chars.length; i++){
			if(!node.containsKey(chars[i]))
				return 0;
			
			node = node.getNode(chars[i]);
		}
		
		return node.getStartsWithWordCount();
	
	}
	
	public void erase(String word){
		Node node = this.rootNode;
		char[] chars = word.toCharArray();
		for(int i =0; i< chars.length; i++){
			if(!node.containsKey(chars[i]))
				return;
			
			node = node.getNode(chars[i]);
			node.decreaseStartWithCount();
		}
		
		node.decreaseWordCount();
	}
}


public class TrieTreeCount{
	
	public static void main(String[] args){
	System.out.println("Trie Program");
		Trie trie = new Trie();
		trie.insert("apple");
		trie.insert("apple");
		trie.insert("apps");
		trie.insert("ahmad");
		trie.insert("sayeed");
		trie.insert("sayeed");
		trie.insert("sayeed");
		
		System.out.println("apple word count: " + trie.countWordsEqualTo("apple"));
		System.out.println("apps word count: " + trie.countWordsEqualTo("apps"));
		System.out.println("ahmad word count: " + trie.countWordsEqualTo("ahmad"));
		System.out.println("sayeed word count: " + trie.countWordsEqualTo("sayeed"));
		
		System.out.println();
		System.out.println("app startWith count: " + trie.countWordsStartWIth("app"));
		System.out.println("ahm startWith count: " + trie.countWordsStartWIth("ahm"));
		System.out.println("say startWith count: " + trie.countWordsStartWIth("say"));
		
		System.out.println("After erase");
		trie.erase("apple");
		trie.erase("sayeed");
		trie.erase("ahmad");
		
		System.out.println("apple word count: " + trie.countWordsEqualTo("apple"));
		System.out.println("apps word count: " + trie.countWordsEqualTo("apps"));
		System.out.println("ahmad word count: " + trie.countWordsEqualTo("ahmad"));
		System.out.println("sayeed word count: " + trie.countWordsEqualTo("sayeed"));
		
		System.out.println();
		System.out.println("app startWith count: " + trie.countWordsStartWIth("app"));
		System.out.println("ahm startWith count: " + trie.countWordsStartWIth("ahm"));
		System.out.println("say startWith count: " + trie.countWordsStartWIth("say"));
		
		
	}

}