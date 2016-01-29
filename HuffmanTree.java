import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
/**
 * 
 * @author billyfallon
 * @version 1/27/16	
 *
 * In this lab, the author is creating a program that generates HuffmanCode. When done properly, Huffman coding finds 
 * the minimum length bit string which can be used to encode a string of symbols. HuffmanCode finds the most common characters
 * in a text and assigns the msot common characters smaller references. The author used HashMap instead of TreeMap
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
	private PriorityQueue<HuffmanNode> queue;
	
	/**
	 * HashMap that stores the HuffmanNodes
	 */
	private HashMap map;
	
	/**
	 * 
	 * @param str String that the huffman tree will be created with
	 */
	public HuffmanTree (String str)
	{
		initMap(str);
	}
	
	/**
	 * Initializes the map and fills the priority queue
	 * 
	 * @param str String that the initMap will be created with
	 */
	public void initMap(String str)
	{
		
	}
	
}
