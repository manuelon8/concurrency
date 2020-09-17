package memoryStore;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

 
 

public class GestorDeDatos {
	
	/*
	 * cada vez q se llame esta variable automaticamente llama este metodo cargarItems
	 * */
	private Map<String, Item> itemRepository = cargarItems(); 
	
	private Map<String, Item> cargarItems() {
		
		 Map<String, Item> itemList = new TreeMap<>();
		 
		 itemList.put("C01", new Item(11, 23));
		 itemList.put("C02", new Item(21, 23));
		 itemList.put("C03",  new Item(31, 23));
		 itemList.put("C04",  new Item(41, 24));
		 itemList.put("C05",  new Item(51, 25));
		 itemList.put("C06",  new Item(61, 26));
		 return itemList;
		 
	}
	
	public Item getItem(String key) {
	return this.itemRepository.get(key);
	}
	
	public int getTotalItems() {
		return this.itemRepository.size();
	}
	
	public boolean addItem(String key, Item i) {
		boolean respuesta = false;
		
		if(this.itemRepository.get(key)==null) {
			this.itemRepository.put(key, i);
			respuesta=true;
		}

		return respuesta;
	}
	
	public List<Item> getAllItem(){
		return new ArrayList<Item>(this.itemRepository.values());		
	}
	
	public void updateItem(String key, Item i) {
		Item temp=this.itemRepository.get(key);
		if(temp!=null){
			this.itemRepository.put(key, i);
			System.out.println("Item Actualizado con exito");
		}
	}

	public void removeItem(String key) {
		this.itemRepository.remove(key);
	}
}
