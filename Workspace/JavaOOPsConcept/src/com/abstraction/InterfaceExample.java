package com.abstraction;
interface Hsbc {
	String withdraw(int accno, float amount);
}
interface Sbi {
	String deposit(int accno, float amount);
}
class Bank implements Hsbc,Sbi{
	@Override
	public String withdraw(int accno, float amount) {
		// TODO Auto-generated method stub
		return "Hsbc withdrawn done successfully";
	}
	@Override
	public String deposit(int accno, float amount) {
		// TODO Auto-generated method stub
		return "Sbi deposit done successfully";
	}
	void ownMethod() {
		System.out.println("Bank own method");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		Bank bb = new Bank();
		bb.ownMethod();
		bb.withdraw(123, 500);
		bb.deposit(145, 560);
	Hsbc obj1 = new Bank();
	Sbi obj2 = new Bank();
		obj1.withdraw(123, 500);
		obj2.deposit(345, 560);
	}

}
