package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	JamesBond bond = new JamesBond();
	Vault vault = new Vault();
	int results = bond.findCode(vault);
	System.out.println( "The code is " + results);
	//new JamesBond().findCode(new Vault());
}
}












