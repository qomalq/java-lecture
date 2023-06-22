package ch04;

public class Ex_13_NestedFor {

	public static void main(String[] args) {
		for (int i =0; i< 5; i++) {
			for (int k =0; k< 4-i; k++) {
				System.out.print(" ");
			}
			for (int k =0; k < i+1; k++) {
					System.out.print('*');
				}
			for (int k=0; k< i+1; k++) {
				System.out.print("*");
			}
				System.out.println();
		for (i =0; i< 5; i++) {
			for (int k =0; k < i; k++) {
				System.out.print(" ");
			}
			for (int k=0; k< 5-i; k++) {
				System.out.print("*");
			}
			for (int k =0; k < 4-i; k++) {
			System.out.print('*');
			}
			System.out.println();
			}

//		// diamond 1사분면
//		for (int i =0; i< 5; i++) {
//			for (int k =0; k < i+1; k++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//		// diaomond 2사분면
//		for (int i =0; i< 5; i++) {
//			for (int k =0; k < 4-i; k++) {
//				System.out.print(" ");
//			}
//			for (int k=0; k< i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		// diaomond 3사분면
//		for (int i =0; i< 5; i++) {
//			for (int k =0; k < i; k++) {
//				System.out.print(" ");
//			}
//			for (int k=0; k< 5-i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		// diaomond 4사분면
//		for (int i =0; i< 5; i++) {
//			for (int k =0; k < 5-i; k++) {
//				System.out.print('*');
//			}
//			System.out.println();
	
	}
	}
}
