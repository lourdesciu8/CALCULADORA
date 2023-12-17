import java.util.Scanner;

public class CALCULADORA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Bienvenido a tu calculadora, introduce un número");
				double num1= sc.nextDouble();
			System.out.println("Muy bien, ahora introduce otro número");
				double num2=sc.nextDouble();
			System.out.println("Ahora, elige una opción");
			System.out.println("1.Suma");
			System.out.println("2.Resta");
			System.out.println("3.Multiplica");
			System.out.println("4.Divide");
			System.out.println("5.Calcula el resto");
				int opcion=sc.nextInt();
				double oper1=num1+num2;
				double oper2=num1-num2;
				double oper3=num1*num2;
				double oper4=num1/num2;
				double oper5=num1%num2;
			
	}
}