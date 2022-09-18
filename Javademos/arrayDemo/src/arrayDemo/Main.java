package arrayDemo;

public class Main {

	public static void main(String[] args) {
		String Ogrenci1 = "Muhammet";
		String Ogrenci2 = "Kadir";
		String Ogrenci3 = "Necat";
		String Ogrenci4 = "Caner";
		
		System.out.println(Ogrenci1);
		System.out.println(Ogrenci2);
		System.out.println(Ogrenci3);
		System.out.println(Ogrenci4);
		
		System.out.println("-----------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Muhammet";
		ogrenciler[1]="Kadir";
		ogrenciler[2]="Necat";
		ogrenciler[3]="Caner";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-----------------------------");
		
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

		
	}

}
