import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMapEmp {
	public static void main(String args[])
	{
		Map<String,Employee> emp=accept();
		display(emp);
		
	}
	public static Map<String,Employee> accept() {
		Map<String,Employee> emp=new HashMap<String,Employee>();
		emp.put("emp11", new Employee("Ramesh",40000));
		emp.put("emp12", new Employee("Suresh",50000));
		emp.put("emp13", new Employee("Ganesh",60000));
		emp.put("emp14", new Employee("Yogesh",70000));
		
		
		return emp;
		
	}
	public static void display(Map<String,Employee> map)
	{
		Set<String> st=map.keySet();
		
		for(String s:st)
		{
			Employee e=map.get(s);
			System.out.println(s+"\t==>"+e.getEname()+"\t"+e.getEsal());
			
		}
	}
	
	public static void displaySort(Map<String,Employee> map)
	{
		System.out.println("Sorted..........");
		TreeMap<String,Employee> tmap=new TreeMap<String,Employee>();
		Set<String> st=tmap.keySet();
		
		for(String s:st)
		{
			Employee e=tmap.get(s);
			System.out.println(s+"\t==>"+e.getEname()+"\t"+e.getEsal());
		}
	}

}
