package _02_nested_loops._3_for_loop_gauntlet;

public class Loop_Gauntlet {
public static void main(String[] args) {
	/*0-100:
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}*/
	
	/*100-0:
	for (int i = 100; i > -1; i--) {
		System.out.println(i);
	}*/
	
	/*even from 2-100:
	for (int i = 2; i < 101; i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}*/
	
	/*odd from 1-99:
	for (int i = 1; i < 100; i++) {
		if(i%2==1) {
			System.out.println(i);
		}
	}*/
	
	/*odd or even from 1-500:
	for (int i = 1; i < 501; i++) {
		if(i%2==0) {
			System.out.println(i + " is even.");
		}
		else {
			System.out.println(i + " is odd.");
		}
	}*/
	
	/*multiples of 7 from 0-777:
	for (int i = 0; i < 778; i++) {
		if(i%7==0) {
			System.out.println(i);
		}
	}*/
	
	/* in __year I was __years old:
	int yr=2007;
	for (int i = 0; i < 14; i++) {
		System.out.println("In " + yr + " I was " + i + ".");
		yr++;
	}*/

	/*nested loop#1
	for (int i = 0; i < 3; i++) {
		
	for (int j = 0; j < 3; j++) {
		System.out.println(i + " " + j);
	}	
	}*/
	
	/*nested loop#2
	for (int i = 1; i < 9; i+=3) {
		
		for (int j = i; j < i+3; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
}*/
	
	/*nested loop#3
	for(int i = 1; i<100; i+=10) {
		for(int j = i; j < i + 10; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}*/
	
	
	/*nested loop#4
	for (int i = 6; i >= 1; i--) {
	
		for (int j = i; j <= 6; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}*/
	
	//bonus
	for (int i = 0; i > -101; i--) {
		System.out.println(i+100);
	}
	
}}
