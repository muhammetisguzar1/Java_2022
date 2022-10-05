package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}
	//camel casing(kelimelerin -ilk kelime hariç- büyük harfle yazılması.)
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println("Sayı mevcuttur : "+aranacak);
		} else {
			System.out.println("Sayı mevcut değildir : "+aranacak);
		}

	}

}
