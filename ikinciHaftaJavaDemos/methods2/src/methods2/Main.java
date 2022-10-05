package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,7,8,9,120);
		System.out.println(toplam);
		

	}
	
	public static void ekle() {
		System.out.println("Eklendi");
		
	}
	
	public static void sil() {
		System.out.println("Silindi");
		
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
		
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	//variable arguments int... kullandıktan sonra sınırsız index girişi yapılabilir.
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
		
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
}
