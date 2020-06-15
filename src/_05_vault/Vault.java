package _05_vault;

import java.util.Random;

public class Vault {
	int code;
	public Vault() {
		Random rand = new Random();
		code = rand.nextInt(1000000);
	}
public boolean tryCode(int attemptedCode) {
	if(attemptedCode == code) { 
		return true;
	}
	else {
		return false;
	}
}
}
