import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int sc;
        Scanner sc = new Scanner(System.in);
        int restart = 0;
        int opcion = sc.nextInt();
        do {
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es " + oper1);
                    break;
                case 2:
                    if (num1 < num2) {
                        System.out.println("La resta no puede tener un resultado negativo");
                        continue;
                    } else {
                        System.out.println("El resultado de la resta es " + oper2);
                    }
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es " + oper3);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero");
                        continue;
                    } else {
                        System.out.println(oper4);
                    }
                    break;
                case 5:
                    System.out.println("El resto es " + oper5);
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            System.out.print("¿Quieres volver a empezar? ");
            System.out.println(" Escribe SI O NO");
            char siono = sc.next().toUpperCase().charAt(0);
            switch (siono) {
                case 'S':
                    restart = 1;
                    break;
                case 'N':
                    System.out.println("Vale, hasta pronto :)");
                    restart = 0;
                    break;
                default:
                    System.out.println("Opción inválida");
                    restart = 0;
            }

        } while (restart == 1);
    }
}
