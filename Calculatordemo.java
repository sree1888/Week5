import java.util.Scanner;
//parent class
class Calculator{
	
	public int add(int a ,int b){
		return a+b;
	}
	public int Subtraction(int a,int b){
		return a-b;
	}
	public int multiplication(int a,int b){
		return a*b;
	}
	public int modulo(int a,int b){
		return a%b;
	}
}
//sub class
class advancedcalculator extends Calculator{
	public int power(int a,int b){
		return (int)Math.pow(a,b);
		}
		public int square(int a){
			return a*a;
			}
			public int cube(int a){
				return a*a*a;
				}
				}
//Main class
public class Calculatordemo{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter first number:");
	int a =input.nextInt();
	System.out.println("Enter second number:");
	int b =input.nextInt();
		advancedcalculator obj=new advancedcalculator();
		System.out.println("Addition : "+obj.add(a,b));
		System.out.println("Subtraction :"+obj.Subtraction(a,b));
		System.out.println("Multiplication :  "+obj.multiplication(a,b));
		System.out.println("Division : "+obj.modulo(a,b));
		System.out.println("Power : "+obj.power(a,b));
		System.out.println("Square : "+obj.square(((a))));
		System.out.println("Cube : "+obj.cube((a)));
		}
}
