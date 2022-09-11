//with reference to javatpoint.com/how-to-iterate-map-in-java & javatpoint.com/how-to-return-an-array-in-java

import java.util.Collections;  
import java.util.Comparator;  
import java.util.HashMap;  
import java.util.Iterator;  
import java.util.LinkedHashMap;  
import java.util.LinkedList;  
import java.util.List;  
import java.util.Map;  
import java.util.Set;

public class stringsortingalgorithm {
    
    public static void main(String[] args) {  

	HashMap<Integer, String> nameList = new HashMap<Integer, String>();  
	nameList.put(1, "Alan");  
	nameList.put(2, "Roybal");  
	nameList.put(3, "Adheesh");  
	nameList.put(4, "Katru");  
	nameList.put(5, "Heng Yi");  
	nameList.put(6, "Lee");  
	nameList.put(7, "Zoe");
	nameList.put(8, "Yau");
	nameList.put(9, "David");
	nameList.put(10, "Ben-Yaakov");
	System.out.println("Given names:");
	
	Set nameset = nameList.entrySet();  
	Iterator nameiterator = nameset.iterator();  
	while(nameiterator.hasNext())   
	    {  
		Map.Entry map = (Map.Entry)nameiterator.next();  
		System.out.println("Hashmap Key:  "+map.getKey()+" |     Name:   "+map.getValue());  
	    }  
	Map<Integer, String> map = sortValues(nameList);   
	System.out.println("\n");  
	System.out.println("Name List After Sorting:");  
	Set newnameset = map.entrySet();  
	Iterator nameiterator2 = newnameset.iterator();
	
	while(nameiterator2.hasNext()) {  
		Map.Entry namemap = (Map.Entry)nameiterator2.next();  
		System.out.println("Hashmap Key:  "+namemap.getKey()+" |     Name:   "+namemap.getValue());  
	    }  
    }
    
    private static HashMap sortValues(HashMap map) {   
	List namelist = new LinkedList(map.entrySet());  
	Collections.sort(namelist, new Comparator()   
	    {  
		public int compare(Object name1, Object name2)   
		{  
		    return ((Comparable) ((Map.Entry) (name1)).getValue()).compareTo(((Map.Entry) (name2)).getValue());  
		}  
	    });  
	HashMap sortednameHashMap = new LinkedHashMap();  
	for (Iterator ifnextkey = namelist.iterator(); ifnextkey.hasNext();)   
	    {  
		Map.Entry entry = (Map.Entry) ifnextkey.next();  
		sortednameHashMap.put(entry.getKey(), entry.getValue());  
	    }   
	return sortednameHashMap;  
    }  
}  
