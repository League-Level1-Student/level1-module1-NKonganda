package constructor;

public class Runner {
public static void main(String[] args) {
	Platypus platypus = new Platypus("Joe");
	platypus.sayHi();
	Platypus platypus1 = new Platypus("Billy");
	platypus1.sayHi();
	platypus = platypus1;
	platypus.sayHi();
}
}
