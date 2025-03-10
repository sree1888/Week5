import java.util.Scanner;
class Calculator{
	int a;
	int b;
	//constructor
	Cal(int a,int b){
	this.a=a;
	this.b=b;
	
}
}
class Simple extends Calculator{
	add=a+b;
	sub=a-b;
	System.out.println("Addition:"+add+"Subtraction"+sub);
}
	class Cal{
	public static void main (String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter a value");
	System.out.println("Enter b value");
	int a=input.nextInt();
	int b=input.nextInt();
	Simple s=new Simple(a,b);
}
}
	