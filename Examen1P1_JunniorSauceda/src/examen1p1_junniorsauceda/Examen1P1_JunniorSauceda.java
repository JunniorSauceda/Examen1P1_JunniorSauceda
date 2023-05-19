/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_junniorsauceda;

import java.util.Scanner;

/**
 *
 * @author Junnior Sauceda
 */
public class Examen1P1_JunniorSauceda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        do {
            System.out.println("1.-Sumador binario");
            System.out.println("2.-Estrella de David");
            System.out.println("3.-Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el primer numero:");
                    String numero1 = sc.next();
                    boolean binarios = false;
                    while (binarios == false) {
                        for (int x = 0; x < numero1.length(); x++) {
                            char carac = numero1.charAt(x);
                            int ascii = carac;
                            if (ascii < 48 || ascii > 49) {
                                binarios = false;
                                break;
                            } else {
                                binarios = true;
                            }
                        }
                        if (binarios == false) {
                            System.out.println("El numero contiene caracteres distintos de '0'y'1'.");
                            System.out.println("Ingrese otro numero");
                            numero1 = sc.next();
                        }
                    }
                    System.out.println("Ingrese el segundo numero:");
                    String numero2 = sc.next();
                    boolean binarios2 = false;
                    while (binarios2 == false) {
                        for (int x = 0; x < numero2.length(); x++) {
                            char carac = numero2.charAt(x);
                            int ascii = carac;
                            if (ascii < 48 || ascii > 49) {
                                binarios2 = false;
                                break;
                            } else {
                                binarios2 = true;
                            }
                        }
                        if (binarios2 == false) {
                            System.out.println("El numero contiene caracteres distintos de '0'y'1'.");
                            System.out.println("Ingrese otro numero");
                            numero2 = sc.next();
                        }
                    }
                    if (numero1.length() > numero2.length()) {
                        System.out.println("Los numeros deben tener el mismo numero de bits");
                    } else if (numero1.length() < numero2.length()) {
                        System.out.println("Los numeros deben tener el mismo numero de bits");
                    } else {
                        String acum = "";
                        String acum_final = "";
                        int digito_int, digito2_int = 0, residuo = 0, suma = 0;
                        for (int i = numero1.length() - 1; i >= 0; i--) {
                            char digito = numero1.charAt(i);
                            char digito2 = numero2.charAt(i);
                            digito_int = Integer.parseInt(String.valueOf(digito));
                            digito2_int = Integer.parseInt(String.valueOf(digito2));
                            suma = digito_int + digito2_int + residuo;
                            if (suma > 1) {
                                residuo = 1;
                                suma = 0;
                            } else {
                                suma = 1;
                                residuo = 0;
                            }
                            acum += suma;
                        }
                        if (residuo == 1) {
                            acum += residuo;
                        }
                        for (int x = acum.length() - 1; x >= 0; x--) {
                            char reverso = acum.charAt(x);
                            acum_final += reverso;
                        }
                        System.out.println("La suma es: " + acum_final);
                    }
                }
                break;
                case 2: {
                    System.out.println("Ingrese un tamaño:");
                    int wide = sc.nextInt();
                    boolean tamaño = false;
                    while (tamaño == false) {
                        if (wide < 9 || wide % 2 == 0) {
                            System.out.println(" ¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                            System.out.println("Ingrese otro tamaño:");
                            wide = sc.nextInt();
                        } else {
                            tamaño = true;
                        }
                    }
                    int size = wide - ((wide / 2) - 1);
                    for (int x = 0; x < size; x++) {
                        for (int j = 1; j <= wide; j++) {
                            if (x == 0 && j == wide / 2 + 1) {
                                System.out.print("+");
                            } else if (x == 1) {
                                System.out.print("*");
                            } else if (x == size - 2) {
                                if (j == x || j == wide - x + 1) {
                                    System.out.print("*");
                                } else {
                                    System.out.print("+");
                                }
                            } else if ((x > 0 && x < size - 1) && (j == x || j == wide - x + 1)) {
                                System.out.print("*");
                            } else if (x > 1 && x < size - 2) {
                                if (j == wide / 2 - x + 1 || j == wide / 2 + x + 1) {
                                    System.out.print("+");
                                } else {
                                    System.out.print(" ");
                                }
                            } else if (x == size - 1 && j == wide / 2 + 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                }
                break;
                case 3: {
                    seguir = false;
                }
                break;
                default: {

                }
                break;
            }
        } while (seguir);
        // TODO code application logic here
    }

}
