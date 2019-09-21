import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMapDemo {
	public static void main(String args[])
	{
		Map<String,Integer> treemap=new TreeMap<String,Integer>();
		treemap.put("Maruti",60000);
		treemap.put("Toyoto",70000);
		treemap.put("BMW",80000);
		treemap.put("Maruti",90000);
		int i=treemap.get("BMW");
		System.out.println(i);
		System.out.println(treemap.containsKey("Maruti"));
		System.out.println(treemap.containsValue(60000));
		treemap.remove("Toyoto");
		Set<String> set=treemap.keySet();
		for(String s:set)
		{
			System.out.println("for key"+s+"value is"+treemap.keySet());
			
		}
		System.out.println();
		System.out.println("tree map"+treemap);
		Map<String,Integer>hashmap=new HashMap<String,Integer>();
		hashmap.put("Maruti",60000);
		hashmap.put("Toyoto",70000);
		hashmap.put("BMW",80000);
		hashmap.put("Maruti",90000);
		System.out.println("hashmap"+hashmap);
	}

}
