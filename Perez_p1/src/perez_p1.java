import java.util.Scanner;

public class perez_p1 {

	
	public static int encrypt(int n)
	{
		int a, b, c, d;
		
		//Using arithmetic to split number into 4 individual digits for encryption.
		
		a = n/1000; 
		b = (n % 1000) / 100;
		c = (n % 100) / 10; 
		d = n % 10; 
		
		//Using algorithm defined in problem statement, encrypt each individual number.
		
		a = (a+7) % 10;
		b = (b+7) % 10;
		c = (c+7) % 10;
		d = (d+7) % 10;
		
		return (c * 1000 + d * 100 + a * 10 + b);
	};
	
	//Now we can decrypt.
	
	public static int decrpyt(int n)
	{
		int a, b, c, d;
		
		//Using arithmetic to split number into 4 individual digits for decryption.
		
		a = n/1000;
		b = (n % 1000) / 100; 
		c = (n % 100) / 10; 
		d = n % 10; 
		
		//And now we can decrypt any numbers given
		
		a = (a+3) % 10;
		b = (b+3) % 10;
		c = (c+3) % 10;
		d = (d+3) % 10;
		
		return(c * 1000 + d * 100 + a * 10 + b);	
	};
	
	public static void main(String[] args)
	{
		int n;
		System.out.println("Please enter a 4 digit number for encryption: ");
		Scanner scnr = new Scanner(System.in);
		n = scnr.nextInt();
		scnr.close();
		System.out.println("The number after encryption is: " + encrypt(n));
		System.out.println("The number after decryption is: " + decrpyt(encrypt(n))); //Run the number through both encryption and decryption.
	};
	
}

