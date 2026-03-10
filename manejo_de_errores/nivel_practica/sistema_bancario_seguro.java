package nivel_practica;
import java.util.Scanner;
public class sistema_bancario_seguro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Banco banco = new Banco();
        int opcion = 0;
        do {
            try {
                System.out.println("\n sistema bancario seguro ");
                System.out.println("1. crear cuenta");
                System.out.println("2. consultar saldo");
                System.out.println("3. depositar dinero");
                System.out.println("4. retirar dinero");
                System.out.println("5. salir");
                System.out.print("seleccione una opcion: ");
                opcion = Integer.parseInt(entrada.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.print("ingrese nombre del titular: ");
                        String nombre = entrada.nextLine();
                        banco.crearCuenta(nombre);
                        break;
                    case 2:
                        banco.mostrarCuentas();
                        break;
                    case 3:
                        System.out.print("numero de cuenta: ");
                        int cuentaDeposito = Integer.parseInt(entrada.nextLine());
                        System.out.print("monto a depositar: ");
                        double deposito = Double.parseDouble(entrada.nextLine());
                        banco.depositar(cuentaDeposito, deposito);
                        break;
                    case 4:
                        System.out.print("numero de cuenta: ");
                        int cuentaRetiro = Integer.parseInt(entrada.nextLine());
                        System.out.print("monto a retirar: ");
                        double retiro = Double.parseDouble(entrada.nextLine());
                        banco.retirar(cuentaRetiro, retiro);
                        break;
                    case 5:
                        System.out.println("cerrando sistema bancario...");
                        break;
                    default:
                        System.out.println("opcion invalida.");
                }
            } catch (Exception e) {
                System.out.println("error: entrada invalida.");
            }
        } while (opcion != 5);
        entrada.close();
    }
}
class Cuenta {
    String titular;
    double saldo;
    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }
}
class Banco {
    Cuenta[] cuentas = new Cuenta[10];
    int contador = 0;
    public void crearCuenta(String nombre) {
        if (contador < cuentas.length) {
            cuentas[contador] = new Cuenta(nombre);
            System.out.println("cuenta creada correctamente.");
            System.out.println("numero de cuenta: " + (contador + 1));
            contador++;
        } else {
            System.out.println("no se pueden crear mas cuentas.");
        }
    }
    public void mostrarCuentas() {
        if (contador == 0) {
            System.out.println("no hay cuentas registradas.");
            return;
        }
        System.out.println("\n cuentas bancarias ");
        for (int i = 0; i < contador; i++) {
            System.out.println(
                    "cuenta #" + (i + 1) +
                    " | titular: " + cuentas[i].titular +
                    " | saldo: $" + cuentas[i].saldo
            );
        }
    }
    public void depositar(int numeroCuenta, double monto) {
        numeroCuenta--;
        if (numeroCuenta >= 0 && numeroCuenta < contador) {
            if (monto > 0) {
                cuentas[numeroCuenta].saldo += monto;
                System.out.println("deposito realizado correctamente.");
            } else {
                System.out.println("el monto debe ser mayor que 0.");
            }
        } else {
            System.out.println("cuenta no valida.");
        }
    }
    public void retirar(int numeroCuenta, double monto) {
        numeroCuenta--;
        if (numeroCuenta >= 0 && numeroCuenta < contador) {
            if (monto <= 0) {
                System.out.println("el monto debe ser mayor que 0.");
                return;
            }
            if (cuentas[numeroCuenta].saldo >= monto) {
                cuentas[numeroCuenta].saldo -= monto;
                System.out.println("retiro realizado correctamente.");
            } else {
                System.out.println("saldo insuficiente.");
            }
        } else {
            System.out.println("cuenta no valida.");
        }
    }
}