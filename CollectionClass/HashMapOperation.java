import java.util.HashMap;
import java.util.Map;
public class HashMapOperation {
    public static void main(String[] args) {
        HashMap <Integer, Integer> map = new HashMap<>();
        
        // Insert Key and Value
        map.put(1,100);
        map.put(2,200);
        map.put(3,300);
System.out.println();

        // Retrive value of Key
        System.out.println("get value using key : ");
        System.out.println(map.get(1));  //100
        System.out.println(map.get(3));  //300
System.out.println();

        //Lookup / search Operation
        System.out.println("search operation : ");
        if(map.containsKey(1)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
System.out.println();

        //Loop / Iteration of HashMap  (to perform this you need to insert import java.util.Map)
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            System.out.println("key : "+e.getKey() + " value : " + e.getValue());
        }
System.out.println();

        // print whole map
        System.out.println("whole map printing : ");
        System.out.println(map);

        //print print value using KeySet

        // Set<Integer> Keys = map.keySet();
        // for(int Key : Keys){
        //     System.out.println(Key + " " + map.get(Key));
        // }
        
    }
}
