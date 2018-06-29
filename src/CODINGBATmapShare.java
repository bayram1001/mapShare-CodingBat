
import java.util.HashMap;
import java.util.Map;

public class CODINGBATmapShare {

	public static void main(String[] args) {

		
/*
 * 
   Modify and return the given map as follows: if the key "a" has a value, 
   set the key "b" to have that same value. In all cases remove the key "c", 
   leaving the rest of the map unchanged.


mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */
		
		Map<String, String> map = new HashMap<>();
		
		map.put("a", "aaa");
		map.put("b", "xyz");
		map.put("c", "meh");
		map.put("d", "hi");
		
		System.out.println("Elements in Map:"+map);
		System.out.println("-----------------------------------");
		
		/*
		 * Modify and return the given map as follows: if the key "a" has a value, 
           set the key "b" to have that same value. In all cases remove the key "c", 
           leaving the rest of the map unchanged.
		 */
		
		if (map.containsKey("a")) {
			map.remove("c");
			map.put("b", map.get("a"));
		}else {
			map.remove("c");
		}
		System.out.println(map);
	}

}
