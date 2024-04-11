package sample;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;



public class HashMapSample_re {

    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        
        members.put("GK", "ヤマダ");
        members.put("GH", "ヤマダ");
        members.put("GB", "ヤマダ");
        
        System.out.println(members.get("GK"));
        
        for (Map.Entry<String, String> entry : members.entrySet()) {
            System.out.println(entry);
            
        }
        
        for (String key : members.keySet()) {
            System.out.println(key);
        }
        
        for (String value : members.values()) {
            System.out.println(value);
            
            
        }
        
        
         
 
    }

}
