import java.util.Scanner;

public class prodotto {

	public static void stampaMatrice(int m[][]) {
		for (int v[] : m) {
			for (int e : v) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

	public static void riempiMatrice(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	public static void prodottoMatrice(int a[][], int b[][], int c[][]) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] a, b, c;
		int ro, cr, co;

		System.out.println("Inserire la prima riga e colonna");
		ro = sc.nextInt();
		cr = sc.nextInt();
		System.out.println("Inserire la seconda colonna");
		co = sc.nextInt();

		a = new int[ro][cr];
		b = new int[cr][co];
		c = new int[ro][co];

		System.out.println();
		System.out.println("Matrice A");
		riempiMatrice(a);
		stampaMatrice(a);

		System.out.println();
		System.out.println("Matrice B");
		riempiMatrice(b);
		stampaMatrice(b);

		System.out.println();
		System.out.println("Matrice C");
		prodottoMatrice(a, b, c);
		stampaMatrice(c);

	}

}
