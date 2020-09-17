package memoryStore;



 

public class mainConcurrent implements ConcurrentMemoryStore{
	
	GestorDeDatos gd = new GestorDeDatos();
	
	/**
	* Almacena un Item asociado a una clave key
	* @throws IllegalArgumentException Si ya existe un valor
	* asociado a la clave
	*/
	@Override
	public void store(String key, Item item) throws IllegalArgumentException {
		
			if(gd.getItem(key)==null) {
			gd.addItem(key, item);
			}
			else {
				throw new IllegalArgumentException("Key ya existe");
			} 
		
	}
	/**
	* Actualiza los valores del Item asociado a key.
	* La instancia de Item que queda almacenada no debe cambiar.
	**/
	@Override
	public void update(String key, int value1, int value2) {
		Item i = new Item(value1, value2);
		gd.updateItem(key, i);
		
	}
	
	public void getAll(){
		
		for(Item i : this.gd.getAllItem())
		{
			
		System.out.println(i.getValue1()+"-"+i.getValue2());	
	}
	} 

	@Override
	public void remove(String key) {
		gd.removeItem(key);
		
	}
	
	@Override
	public XIterator<Item> valueIterator(Item[] arrayList) {
		XIterator<Item> it = new XIterator(arrayList);				
		return it;
	}
	
	public static void main(String[] args) {
		Item i1= new Item(44, 55);
		
		mainConcurrent m = new mainConcurrent();
		m.store("C07", i1);
		m.getAll();
		System.out.println("b e f o r e");
		m.update("C02", 34, 36);
		m.getAll();
	}
	

	

}
