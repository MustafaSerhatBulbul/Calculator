import java.util.Scanner;
public class Hesapmakinesi {

	public static void main(String[] args) {
		double num1, num2;
		int chose;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("İlk sayıyı giriniz ");
		num1 = scanner.nextDouble();

		System.out.println("Lütfen yapamk istediğinz işlemi seçiniz ");
		System.out.println("1: Toplama\n 2: Çıkarma\n 3: Çarpma\n 4: Bölme ");
		chose = scanner.nextInt();

		
		System.out.println("İkinci sayıyı giriniz ");
		num2 = scanner.nextDouble();
		
		if (chose ==1) {
			System.out.println(num1 + num2);
		}
		else if (chose ==2){
			System.out.println(num1 - num2);
		}
		
		else if (chose ==3) {
			System.out.println(num1 * num2);
		}
		
		else if (chose ==4) {
			if (num2 ==0) {
				System.out.println("Geçersiz işlem");
			}
			else {
				System.out.println(num1 / num2);
			}
		}
		
		else {
			System.out.println("Geçersiz işlem");
		}
	}
	

}
