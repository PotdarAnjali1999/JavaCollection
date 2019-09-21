import java.util.*;
public class TestGrade {
	public static void main(String args[])
	{

		Grade g1=new Grade(100,200,300);
		Grade g2=new Grade(200,300,400);
		Grade g3=new Grade(400,100,200);
		Grade g4=new Grade(200,300,100);

		Map<String,Grade> map=new HashMap<String,Grade>();
		map.put("shraddha", g1);
		map.put("anjali", g2);
		map.put("pratik",g3);
		
		map.put("revati", g4);
		display(map);
		
		Map<String,Grade> tmap=new TreeMap<String,Grade>(map);
		/*tmap.put("shraddha", g1);
		tmap.put("anjali", g2);
		tmap.put("pratik",g3);
		tmap.put("revati", g4);*/
		
		display(tmap);
	}
	public static void display(Map<String, ?> map)//generic term
	{
		/*Set<String> st=map.keySet();
		for(String s:st)
		{
			Grade g=(Grade)map.get(s);
			System.out.println(s+"\t"+g.getAvg());

		}*/
		
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry)it.next();
			String key=(String)entry.getKey();
			Grade g=(Grade)entry.getValue();
		
			System.out.println("for key :"+key+"\tavg is:"+g.getAvg());
		}
	}


}


