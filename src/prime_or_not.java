import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	String x= JOptionPane.showInputDialog(null, "Give me a number.");
	int num=Integer.parseInt(x);
	if(num==1) {
		JOptionPane.showMessageDialog(null, "Your number is neither prime nor composite.");
		System.exit(0);
	}
	else if(num==0) {
		JOptionPane.showMessageDialog(null, "Your number is composite.");
		System.exit(0);
	}
	for (int i = 2; i < num; i++) {
		if(num % i == 0) {
			JOptionPane.showMessageDialog(null, "Your number is not prime. One of its divisors is " + i + ".");
			System.exit(0);
		}
	
	}
	JOptionPane.showMessageDialog(null, "Your number is prime.");
}
}
