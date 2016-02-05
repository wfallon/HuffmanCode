import java.util.ArrayList;

/*
 * @author billyfallon
 * @version 2/5/16	
 */
public class PriorityQueue 
{
	/**
	 * Where the HuffmanNodes are being stored
	 */
	private ArrayList<HuffmanNode> data;
	
	/**
	 * Size of the PriorityQueue
	 */
	private int size;
	
	/**
	 * Initializes the ArrayList data and sets size to 0
	 */
	public PriorityQueue()
	{
		data = new ArrayList<HuffmanNode>();
		size = 0;
	}
	
	/**
	 * Goes through the queue until the nodes value is less than one in the queue, and then adds it at that spot.
	 * Increments size and returns. If it cannot find any place to put it, it puts it at the end and increments size.
	 * 
	 * @param node HuffmanNode being added to the PriorityQueue
	 */
	public void add (HuffmanNode node)
	{
		
		for(int i = 0; i<size; i++)
		{
			if(node.compareTo(data.get(i))<0)
			{
				data.add(i, node);
				size++;
				return;
			}
				
		}
		data.add(node);
		size++;
	}
	
	/**
	 * returns the first HuffmanNode to the user
	 * 
	 * @return HuffmanNode
	 */
	public HuffmanNode peek()
	{
		return data.get(0);
	}
	
	/**
	 * removes and returns the first HuffmanNode to the user
	 * 
	 * @return HuffmanNode
	 */
	public HuffmanNode remove ()
	{
		size--;
		return data.remove(0);
	}
	
	/**
	 * returns the size of the queue of the user
	 * 
	 * @return int size of the queue
	 */
	public int length()
	{
		return size;
	}
	
	/**
	 * returns a String representation of the PriorityQueue to the user
	 * 
	 * @return String representation of the PriorityQueue
	 */
	public String toString()
	{
		return data.toString();
	}

	
	
	
}
