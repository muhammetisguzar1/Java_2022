package conditionals;

public class Main {

	public static void main(String[] args) {

		int sayi1 = 20;
		int sayi2 = 20;
		if(sayi1<sayi2) {
			System.out.println("Sayi " +sayi2+"'den kucuktur.");
			
		}else if(sayi1==sayi2){
			System.out.println("Sayi " +sayi2+"'ye esittir.");
		}else {
			System.out.println("Sayi " +sayi2+"'den Buyuktur.");
		}
		
			

	}

}