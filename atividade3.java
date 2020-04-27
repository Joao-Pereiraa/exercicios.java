package atividades;

public class atividade3 {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		
		System.out.print("a | b  \n");
		System.out.print(".......\n");
		
		System.out.printf("%d | %d \n", a, b); 
		
		
		b = a* (a++); 
		System.out.printf("%d | %d \n", a, b); 
		
		 b = a * (--a);
		System.out.printf("%d | %d \n", a, b);
		
		b = a * ++a;
		System.out.printf("%d | %d \n", a, b); 
		
		b = a * a--;		
		System.out.printf("%d | %d \n", a, b); 
		
		a += b++;
		System.out.printf("%d | %d \n", a, b); 
		
		a += --b;
		System.out.printf("%d | %d \n", a, b); 
		
		a = b++ * ++a;
		System.out.printf("%d | %d \n", a, b); 
		
		a = (b++ % 2 ) * (++a *3);
		System.out.printf("%d | %d \n", a, b); 
		
		a = (--b % 2 ) * (++a /3 * b++);
		System.out.printf("%d | %d \n", a, b);
		
		b = (a * ++a) / (a * ++a);		
		System.out.printf("%d | %d \n", a, b); 
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
