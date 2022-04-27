package depuracion1;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50;
		int y = 100;
		int num = 0;
		String pais ="Francia";
		
		for (int i = 0; i < 100; i++) {
			x++;
			System.out.println(x + ". estoy dentro del for");
		}
		
		System.out.println();
		System.out.println(pais);
		System.out.println();
		while (num < 50) {
			num++;
			x--;
			System.out.println(x + ". estoy dentro del while");
		}
		System.out.println();
		System.out.println(pais);
		System.out.println();
		
		if (x == y) {
			pais ="Italia";
		}else if (x != y) {
			if (x < y) {
				pais ="Grecia";
			}else {
				pais ="Alemania";
			}
		}
		System.out.println();
		System.out.println(pais);
	}
}
