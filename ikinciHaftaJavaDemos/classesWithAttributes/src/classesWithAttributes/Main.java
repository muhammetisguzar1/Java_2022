package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.set_name("Laptop");
		product.setId(1);
		product.set_description("Asus Laptop");
		product.set_price(5000);
		product.set_stockAmount(3);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.get_code());
		
		System.out.println(product.get_name());
		System.out.println(product._id);
		System.out.println(product.get_description());
		System.out.println(product.get_price());
		System.out.println(product.get_stockAmount());
		
		
		
		

	}

}
