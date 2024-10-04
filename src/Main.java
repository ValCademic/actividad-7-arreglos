import java.util.Scanner;

class Main {

    public static int cuadrado(int num) {
            int cuadrado;
            cuadrado = num * num;
            return cuadrado;
        }

    public static int cubo(int num) {
                int cubo;
                cubo = num * num * num;
                return cubo;
            }
    public static <string> void main(String[] args) {
            int num;
            int cuad, cub;
            string reporte;
            reporte = (string) "Reporte\n";
            int[] arreglo = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

            Scanner teclado = new Scanner(System.in);
             System.out.println("Ingrese 20 numeros enteros:");

                    for (int i = 1; i <= 20; i++) {
                        System.out.println("#" + i + ": ");
                        num = teclado.nextInt();
                        arreglo[i] = num;
                        cuad = cuadrado(num);
                        cub = cubo(num);
                        reporte = (string) (reporte + "\n\nNumero #"+i+": " + (arreglo[i]) + "\nCuadrado: " + cuad + "\nCubo: " + cub);
                    }
        System.out.println(reporte);
                }
            }
