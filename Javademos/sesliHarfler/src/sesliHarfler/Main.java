package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'A';
		// a,ı,o,u
		// e,i,ö,ü

		switch (harf) {
		case 'A':
		case 'I':
		case '0':
		case 'U':
			System.out.println("Kalin sesli harf");
			break;
		default:
			System.out.println("Ince sesli harf");
		}

	}

}

