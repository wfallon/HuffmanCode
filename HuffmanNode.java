/*
 * @author billyfallon
 * @version 2/5/16	
 */

public class HuffmanNode implements Comparable<HuffmanNode>
{
	/**
	 * amount of times @namedValue appears in String
	 */
	protected int namedCount;
	
	/**
	 * String that is being stored
	 */
	protected String namedValue;
	
	/**
	 * HuffmanNode to the left of this HuffmanNode
	 */
	protected HuffmanNode left;
	
	/**
	 * HuffmanNode to the right of this HuffmanNode
	 */
	protected HuffmanNode right;
	
	
	public HuffmanNode (String str, int nC)
	{
		namedCount = nC;
		namedValue = str;
	}
	
	/**
	 * returns NamedCount to the user
	 * 
	 * @return int namedCount
	 */
	public int getNamedCount()
	{
		return namedCount;
	}
	
	/**
	 * changes NamedCount to @param i
	 * 
	 * @param i new NamedCount
	 */
	public void setNamedCount(int i)
	{
		namedCount = i;
	}
	
	/**
	 * returns namedValue to the user
	 * 
	 * @return int namedCount
	 */
	public String getNamedValue()
	{
		return namedValue;
	}
	
	/**
	 * changes NamedValue to @param i
	 * 
	 * @param i new NamedValue
	 */
	public void setNamedValue(String c)
	{
		namedValue = c;
	}
	
	/**
	 * returns left HuffmanNode to the user
	 * 
	 * @return HuffmanNode left
	 */
	public HuffmanNode getLeft()
	{
		return left;
	}
	
	/**
	 * sets left node to @param node 
	 * 
	 * @param node new Left node
	 */
	public void setLeft(HuffmanNode node)
	{
		left = node;
	}
	
	/**
	 * returns right HuffmanNode to the user
	 * 
	 * @return HuffmanNode right
	 */
	public HuffmanNode getRight()
	{
		return right;
	}
	
	/**
	 * sets right node to @param node 
	 * 
	 * @param node new right node
	 */
	public void setRight(HuffmanNode node)
	{
		right = node; 
	}
	
	/**
	 * returns a String representation of the HuffmanNode to the user
	 * 
	 * @return String representation of the HuffmanNode
	 */
	public String toString()
	{
		String str = "";
		str += namedValue;
		str += " ";
		str += namedCount;
		return str;
	}

	
	/**
	 * Compares this object with the specified object for order.
	 * 
	 * @return int if this node is greater than other node, return is > 0, if this node is equal to other node, 
	 * return = 0, if this node is less than other node, return is <0
	 * @param Other node being compared to
	 */
	public int compareTo(HuffmanNode node) 
	{
		return this.namedCount - node.getNamedCount();
	}
	
}
