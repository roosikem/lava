
package manish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ps{

public static void printLargeRepeatedNumber(String s){
		Map<String, Integer> repeated = new HashMap<String, Integer>();
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(new ValueComparator(repeated));
		char[] ar = s.toCharArray();
		int length = ar.length;
		/*for (int i = 0; i < length; i++) {
			String temp = String.valueOf(ar[i]);
			for (int j = i + 1; j < length; j++) {
				if (ar[i] == ar[j]) {
					temp = temp + String.valueOf(ar[i]);
					repeated.put(temp, temp.length());
				} else {
					break;
				}
			}
		}*/
		int count = 1;
		for (int i = 0; i < length - 1; i++) {
			if (ar[i] == ar[count]) {
				if (repeated.containsKey(String.valueOf(ar[i]))) {
					repeated.put(String.valueOf(ar[i]), repeated.get(String.valueOf(ar[i])) + 1);
				} else {
					repeated.put(String.valueOf(ar[i]), 2);
				}

			}
			count++;
		}
		
		sortedMap.putAll(repeated);
		System.out.println(sortedMap);
		java.util.Map.Entry<String, Integer> df = sortedMap.lastEntry();
		System.out.println(df.getKey()+" count "+df.getValue());
	}
  
public static void getLargeSum(int[] k){
		List<Integer> list = new ArrayList<>();
		TreeMap<Integer,Integer> sort = new TreeMap<>();
		int count = 1;
		int sum =0;
		int j =1;
		for(int i = 0;i<k.length-1;i++){
			if(k[i]+1 == k[count]){
				list.add(k[i]);
				sum = sum+k[i];
				if(count == k.length-1){
					if(k[count]-1 == k[count-1]){
						list.add(k[count]);
						sum = sum+k[count];
					}
				}else{
					if(k[count]+1 != k[count+1]){
						list.add(k[count]);
						sum = sum+k[count];
					}
				}
				sort.put(j, sum);
			}else{
				sum = 0;
				//j=i+1;
				j++;
			}
			count++;
		}
		/*Set<Integer> set = new TreeSet<>();
		TreeMap<Integer,Integer> sort = new TreeMap<>();
		Object[] seqObj = list.toArray();
		count = 1;
		int sum =0;
		int j =1;
		for(int i=0;i<seqObj.length-1;i++){
			if((int)seqObj[i]+1 == (int)seqObj[count]){
				sum = sum+(int)seqObj[i];
				if(count == seqObj.length-1){
					if((int)seqObj[count]-1 == (int)seqObj[count-1]){
						sum = sum+(int)seqObj[count];
					}
				}else{
					if((int)seqObj[count]+1 != (int)seqObj[count+1]){
						sum = sum+(int)seqObj[count];
					}
				}
				sort.put(j, sum);
				set.add(sum);
			}else{
				sum = 0;
				j++;
			}
			//sort.put(i, sum);
			count++;
		}*/
		System.out.println(sort);
	}



}

class ValueComparator implements Comparator<String> {

    private Map<String, Integer> map;

    public ValueComparator(Map<String, Integer> map) {
        this.map = map;
    }

    public int compare(String a, String b) {
        return map.get(a).compareTo(map.get(b));
    }
}




