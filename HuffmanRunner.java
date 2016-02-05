import java.util.Map;
import java.util.HashMap;

/*
 * @author billyfallon
 * @version 2/5/16	
 */
public class HuffmanRunner 
{
	public static void main(String[] args)
	{	
		String str = "Sally sells sea shells at the sea shore";
		HuffmanTree tree = new HuffmanTree(str);
		System.out.println(tree.getEncryptedString(str));
	}
}
