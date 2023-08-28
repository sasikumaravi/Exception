package exceptions;

public class StackError {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		StackError gf=new StackError();
		gf.findB();
	}
}
