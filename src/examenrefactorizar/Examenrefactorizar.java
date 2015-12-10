package examenrefactorizar;

/**
 *
 * @author julianlinux
 */
public class Examenrefactorizar {

    public static boolean p = false;

    public static void main(String[] args) {
        {
            int digitos = 3;
            int ndigitos = 0;
            if (digitos <= 0) {
                System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
            }
            for (int i = 1; i <= 99999; i++) {
                int aux = i;

                int conta = 0;

                while (aux != 0) {
                    aux = aux / 10;
                    conta++;
                }
                ndigitos = conta;

                if (ndigitos == digitos) {
                    if (i < 4) {
                        p = true;
                    } else {
                        if (i % 2 == 0) {
                            p = false;
                        } else {
                            int conta1 = 0;
                            int i1 = 1;
                            int k = (i - 1) / 2;
                            if (k % 2 == 0) {
                                k--;
                            }

                            while (i1 <= k) {
                                if (i % i1 == 0) {
                                    conta1++;
                                }
                                i1 += 2;
                                if (conta1 == 2) {
                                    i1 = k + 1;
                                }
                            }

                            if (conta1 == 1) {
                                p = true;
                            }
                        }
                    }

                    if (p == true) {
                        System.out.println(i);
                    }
                }
            }
        }

    }
}
    

