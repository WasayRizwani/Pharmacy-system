package application;

@SuppressWarnings("serial")
public class SaleNotProcessedException extends Exception {
	SaleNotProcessedException(String msg) {
		System.out.println(msg);
	}
}
