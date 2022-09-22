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
import java.io.*;
import java.util.*;

public class stringsortingalgorithm {
    final static String filePath = "dict.txt";
    
    public static void main(String[] args) {  

	Map<String, String> mapFromFile = HashMapFromTextFile();  

	for (Map.Entry<String, String> entry : mapFromFile.entrySet() ) {
	    System.out.println(entry.getValue());
	}
    }

    public static Map<String, String> HashMapFromTextFile() {
	Map<String, String> map = new HashMap<String, String>();
	BufferedReader br = null;

	try {
	    File file = new File(filePath);

	    br = new BufferedReader(new FileReader(file));

	    String line = null;

	    while ((line = br.readLine()) != null) {

		String[] name = .trim();
		String number = parts[1].trim();

		if (!name.equals("") && !number.equals(""))
		    map.put(name,number);
		    }
	}
	catch (Exception e) {
	    e.printStackTrace();
	}
	finally {
	    if (br != null) {
		try {
		    br.close();
		}
		catch (Exception e) {
		};
	    }
	}
	return map;
    }
}
/*


    
	
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
*/
