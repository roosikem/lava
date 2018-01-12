import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConvertor {
	
	private JsonConvertor(){}
	
	public static String objectToJson(Object obj){
		if(obj == null)
			throw new IllegalArgumentException("null cannot be converted to Json string");
		Gson gson = new GsonBuilder().disableHtmlEscaping().setDateFormat("dd-MMM-yyyy").create();
		return gson.toJson(obj);
	}
	
	public static <T> Object jsonToObject(String json, Class<T> clazz){
		if(json == null)
			throw new IllegalArgumentException("null cannot be converted to Object");
		Gson gson = new GsonBuilder().disableHtmlEscaping().setDateFormat("dd-MMM-yyyy").create();
		return gson.fromJson(json, clazz);
	}

}
