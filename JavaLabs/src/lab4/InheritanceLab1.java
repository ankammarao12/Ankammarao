package lab4;

public class InheritanceLab1 {

	public static void main(String[] args) {

		Person a = new Person("smith", 40);
		Person b = new Person("Kathy", 35);

		Account acc = new Account(53215632, 2000, a);
		System.out.println(acc.getAccHolder());
		System.out.println("Initial Balance :  " + acc.getBalance());
		acc.deposit(2000);
		System.out.println("Account Number :  " + acc.getAccNum());
		System.out.println("Current Balance :  " + acc.getBalance());

		System.out.println();

		Account acc1 = new Account(35345678, 3000, b);
		System.out.println(acc1.getAccHolder());
		System.out.println("Initial Balance :  " + acc1.getBalance());
		acc1.withdraw(2000);
		System.out.println("Account Number :  " + acc1.getAccNum());
		System.out.println("Current Balance : " + acc1.getBalance());

		System.out.println();

	}
}