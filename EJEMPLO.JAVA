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
			switch(opcion) {
				case 1: System.out.println("El resultado de la suma es "+oper1);
					break;
				case 2: if (num1<num2){System.out.println("La resta no puede tener un resultado negativo");
				continue;}
				else {System.out.println("El resultado de la resta es "+oper2);}
				break;
				case 3: System.out.println("El resultado de la multiplicación es "+ oper3);
					break;
				case 4: if (num2 ==0){System.out.println("No se puede dividir por cero");
				continue;}
				else {System.out.println(oper4);}
					break;
				case 5: System.out.println("El resto es " +oper5);
				break;
				default: System.out.println("Opción inválida");
			}
				System.out.print("¿Quieres volver a empezar? ");
				System.out.println(" Escribe SI O NO");
					char siono=sc.next().toUpperCase().charAt(0);
				switch(siono) {
					case 'S': restart=1;
						break;
					case 'N': System.out.println("Vale, hasta pronto :)");
						restart=0;
						break;
					default: System.out.println("Opción inválida");
					restart=0;}
	}
}