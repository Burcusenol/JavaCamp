package StaticDemo;

public class ProductManager {
 public void add(Product product) {
	 
	 if(ProductValidator.IsValid(product)) {
		 System.out.println("Eklendi");
	 }else {
		 System.out.println("Ürün bilgileri geçersiz");
	 }
	 
 }
 
 
}
