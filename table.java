public class table {
    public static void main(String[]args){
        System.out.println("----");
        for(int a=9;a>=1;a--){
            for (int b=a;b<=a&&b>=1;b--){
                System.out.print(a+"*"+b+"="+a*b+" ");
            }
            System.out.println();
        }
        for (int k = 1; k <= 9; k++) {
			for (int j = 1; j <= k; j++) {
				System.out.print(j + " * " + k + " = " + j * k + "\t");
			}
			System.out.println();
        }
        System.out.println();

		for (int i = 9; i >= 1; i--) {
			for (int j = 9; j >= i; j--) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println();
        }
        System.out.println();

        for (int x = 9; x > 0; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + " * " + x + " = " + x*y + "\t");
            }
            System.out.println();
        }
    }
}