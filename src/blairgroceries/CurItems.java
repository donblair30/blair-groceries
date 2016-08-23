package blairgroceries;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import com.google.gson.Gson;

@Path(value="curitems")

public class CurItems {

	private String item;
	private int quantity;
	private String comments;
	
	public void constructor () {
		return;
	}
	
	public CurItems(String item, int quantity, String comments) {
		this.item=item;
		this.quantity=quantity;
		this.comments=comments;
	}
	
	@GET
	@Consumes("text/plain")
	@Produces("text/plain")
	public String get(String item) {	
		if (item.equals("*"))  {
			Gson gson = new Gson();
			String jsonStr = gson.toJson(this);
			return jsonStr;
		}
		else
		{
			System.out.println("Error - must retrieve all items (*) for now!");
			return "";
		}
	}
	
	@Override
	public String toString() { 
		return "CurItems [Item=\"" + this.item + "\", Quantity=" + this.quantity +
			", Comments=\"" + this.comments + "\"]";
	}

	
/* 	@PUT
	@Consumes("text/html")
	public void put (int i, int val) {
		bigArray.set(i, val);
	}

	@DELETE
	@Consumes("text/html")
	public void delete (int i) {
		bigArray.remove(i);
	}
*/
	
}


