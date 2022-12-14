
package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author guill
 */
public class Histogram<T>{
    private Map<T,Integer> map;

    public Histogram() {
        map = new HashMap<T,Integer>();
    }
    
    public Integer get(T key){
        return this.map.get(key);
    }
    
    public Set<T> keySet(){
        return this.map.keySet();
    }

    
    void increment(T key) {
        this.map.put(key, this.map.containsKey(key) ? this.map.get(key) + 1 : 1);
    }

}
