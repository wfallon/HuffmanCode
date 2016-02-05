import java.util.HashMap;

/**
 * 
 * @author billyfallon
 * @version 2/5/16	
 *
 * In this lab, the author is creating a program that generates HuffmanCode. When done properly, Huffman coding finds 
 * the minimum length bit string which can be used to encode a string of symbols. HuffmanCode finds the most common characters
 * in a text and assigns the most common characters smaller references. The author used HashMap instead of TreeMap
 * in this lab. The advantage to TreeMap is that the order of the keys will always be sorted, but its disadvantage is that
 * it has a slower run time than HashMap. The sorting of the values is not needed in this lab as the PriorityQueue will sort
 * them anyway, which is why the obvious choice in this case is HashMap. 
 */
public class HuffmanTree 
{
	/**
	 * root pointer
	 */
	private HuffmanNode root;
	
	/**
	 * Stores the HuffmanNodes until only one huffmanNode is left
	 */
	private PriorityQueue queue;
	
	/**
	 * HashMap that stores the HuffmanNodes
	 */
	private HashMap<Character, Integer> map;
	
	/**
	 * 
	 * @param str String that the huffman tree will be created with
	 */
	public HuffmanTree (String str)
	{
		run(str);
	}
	
	/**
	 * returns the encrypted String to the user
	 * 
	 * @param String str message being encrypted
	 * @return String encryptedString 
	 */
	public String getEncryptedString(String str)
	{
		String s = "";
		for(int i = 0; i<str.length(); i++)
		{
			s += getHuffmanCode(str.charAt(i), root, "");
		}
		return s;
	}
	
	/**
	 * Codes for a single character in HuffmanCode recursively.
	 * 
	 * @param c char being coded for
	 * @param curr current huffman node
	 * @param str HuffmanCode string
	 * @return String 
	 */
	public String getHuffmanCode(char c, HuffmanNode curr, String str)
	{
		if(curr.getNamedValue().length() == 1 && curr.getNamedValue().charAt(0) == c)
		{
			return str;
		}
		
		if(doesContain(curr.getLeft().getNamedValue(), c))
		{
			return getHuffmanCode(c, curr.getLeft(), str + "0");
		}
		return getHuffmanCode(c, curr.getRight(), str + "1");
	}
	
	/**
	 * returns whether or not @param str contains @param c
	 * 
	 * @param str String of text
	 * @param c char being checked
	 * @return boolean whether or not the String contains the char
	 */
	public boolean doesContain(String str, char c)
	{
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == c)
				return true;
		}
		return false;
	}
	
	/**
	 * runs the huffman code and creates
	 * 
	 * @param str String that the huffman tree will be run with
	 */
	public void run(String str)
	{
		map = new HashMap<Character, Integer>();
		queue = new PriorityQueue();
		initMap(str);
		initPriorityQueue(str);
		joinHuffmanNodes();
		root = queue.peek();
	}
	
	/**
	 * Initializes the map. If the map does not contain a character, it adds it to the map. If it does create the character,
	 * it removes the character and adds it back in with a value of +1
	 * 
	 * @param str String that the initMap will be created with
	 */
	public void initMap(String str)
	{
		for(int i = 0; i<str.length(); i++)
		{
			if(!(map.containsKey(str.charAt(i))))
			{
				map.put(str.charAt(i), 1);
			}
			else
			{
				int holder = map.get(str.charAt(i));
				map.remove(str.charAt(i));
				map.put(str.charAt(i), holder+1);
			}
		}
	}
	
	/**
	 * If the map contains any given char, it removes it and adds a new HuffmanNode to the PriorityQueue
	 * 
	 * @param str String that the priority queue is being initialized with
	 */
	public void initPriorityQueue(String str)
	{
		for(int i = 0; i<str.length(); i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				String str1 =  "" + str.charAt(i);
				queue.add(new HuffmanNode(str1, map.get(str.charAt(i))));
				map.remove(str.charAt(i));
			}
		}
	}
	
	/**
	 * returns the HashMap to the user
	 * 
	 * @return HashMap<Character, Integer> 
	 */
	public HashMap<Character, Integer> getHashMap()
	{
		return map;
	}
	
	/**
	 * returns the PriorityQueue to the user
	 * 
	 * @return PriorityQueue
	 */
	public PriorityQueue getQueue()
	{
		return queue;
	}
	
	/**
	 * Goes through the queue and systematically joins the first two Huffman nodes, then adds the conjoined HuffmanNode
	 * to the queue until the length of the queue is one.
	 */
	public void joinHuffmanNodes()
	{
		while(queue.length() > 1)
		{
			HuffmanNode holder = queue.remove();
			HuffmanNode holder1 = queue.remove();
			HuffmanNode newNode = new HuffmanNode(holder.getNamedValue() + holder1.getNamedValue(), holder.getNamedCount() + holder1.getNamedCount());
			newNode.setLeft(holder);
			newNode.setRight(holder1);
			queue.add(newNode);
			
		}
		
	}
}
