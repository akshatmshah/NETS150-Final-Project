import java.util.Scanner;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class RecM {

	public static void main(String[] args) {
		//authentication and HTTP request
		
		String link = "https://api.propublica.org/congress/v1/bills/search.json?query=";
		String key = "oy8bhWLG92Y9880Vxs2wK5nBjAkgDyWbbDhgl5wX";
		
		Scanner sc = new Scanner(System.in);
		
		//information to send
		
		System.out.println("What is your query? : ");
		
		String query = sc.nextLine();
		
		System.out.println("Who is your senator? : ");
		
		String sen = sc.nextLine();
		
		sc.close();
		
		//client to get data
		
		RequestClient r = new RequestClient(link, key, "GET");
		JSONObject obj  = r.getObject(query);
		
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();

		

		try {
//	        String s = obj.get("results").toString();
//	        String gs = gson.toJson(s);
//
//	        
//	        JsonObject jsonObject = JsonParser.parseString(gs).getAsJsonObject();

//	        Set<String> keys = jsonObject.keySet();

	        
	        
			System.out.println("Indented Output : " + obj.toString(2));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
