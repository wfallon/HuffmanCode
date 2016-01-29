import java.util.Map;
import java.util.HashMap;


public class HuffmanRunner 
{
	public static void main(String[] args)
	{
		HuffmanNode test = new HuffmanNode(1, 't');
		HuffmanNode test2 = new HuffmanNode(2, 'o');
		test2.setLeft(test);
		System.out.println("works");
		System.out.println(test2.compareTo(test));
	}
}
