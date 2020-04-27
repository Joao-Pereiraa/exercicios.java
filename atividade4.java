package atividades;

public class atividade4 {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 2;
		float c = 1;
		float x = 0;
		

		System.out.print("a | b | c | x \n");
		System.out.print("...............\n");
		
		
		System.out.printf("%d | %d| %f| %f \n", a, b, c, x); 
		
		
		x = --b - b-1;
		System.out.printf("%d | %d| %f| %f \n", a, b, c, x);
		
		c = a/b;
		System.out.printf("%d | %d| %f| %f \n", a, b, c, x);
		
		a += x + c * b++;
		System.out.printf("%d | %d| %f| %f \n", a, b, c, x);
		
		c = ++x + x *3 + x;
		System.out.printf("%d | %d| %f| %f \n", a, b, c, x);
		
		c = --x * 4 /b;
		System.out.printf("%d | %d| %f| %f \n", a, b, c, x);
		
		a /= --b;
		System.out.printf("%d | %d| %f| %f \n", a, b, c, x);
		
		x *= c++;
		System.out.printf("%d | %d| %f| %f \n", a, b, c, x);
		
	
		
		
		
	
		
	}
	
}
