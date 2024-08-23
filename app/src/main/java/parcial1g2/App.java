
package parcial1g2;

import java.util.Scanner;

  /* 🔴🔴🔴 No logré hallar por que me entrega los resultados en notacion cientifica, 
     Igual comprobando en la calculadora el resultado que da  veo q es correcto pero lo da
     en una notacion distinta. No se si sea configuracion del visual o algo raro pq nunca
     me habia pasado.... solo pasa cuando se introduce un evaluo grande ej 15 millones
     pero con un numero pequeño si lo entrega bien. espero eso no sea un inconveniente. 😊*/

public class App {
    
    public static void main(String[] args) {
        
        try {
           // Variables
            int numeroAutos = 0, avaluo = 0;
            String decada = "";
            double seguro = 0;
            double totalPagar = 0;


            // Logica de solución
             Scanner sc = new Scanner(System.in);

            //Entrada de datos
             System.out.println("Ingrese la cantidad de autos que desea calcular: ");
             numeroAutos = sc.nextInt();
             sc.nextLine();
            
            // Control para evitar autos por debajo de 0
            if (numeroAutos > 0 ) {
                

                for (int i = 1; i <= numeroAutos; i++){

                    System.out.println("Ingrese la decada del vehiculo #" + i + ": : | 90 | 00 | 10 | 20 |");
                    decada = sc.nextLine();

                    // control de decada, pa que solo admita los del problema
                    if (decada.equals("90") || decada.equals("00") || decada.equals("10") || decada.equals("20")) {
                        
                    System.out.println("Ingrese el avalúo del vehiculo #" + i + ":");
                    avaluo = sc.nextInt();
                    sc.nextLine();

                    // Control para que solo me deje pasa avulos melos, nada de negativos ni 0
                    if (avaluo > 0) {
                        
                        totalPagar = calcularTotalImpuestos(decada, avaluo);

                        System.out.println("\n ------- Vehiculo #" + i + ": ------- \n" + 
                                            "Decada: " + decada + "\n" +
                                            "Avalúo: $" + avaluo + " COP \n" +
                                            "Total a pagar: $" + totalPagar + " COP \n");

                    // error cuando no puso el avaluo bien
                    }else {
                        System.out.println("Avalúo del vehiculo invalido");
                        return;
                    }

                    
                    // error cuando no ingrese la decada bien
                    } else {
                        System.out.println("Asegurese de ingresar bien la decada: | 90 | 00 | 10 | 20 | ");
                        return;
                    }

                   
    
                }

               
            // error cuando mete una cantidad invalida de carros
            } else {
                System.out.println("Error, Asegurese de  ingresar una cantidad de autos valida");
            }

        
        } catch (Exception e) {
           System.out.println("error" + e.getMessage());
        }


        


    }

    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    
    public static int calcularTotalImpuestos(String decada, int avaluo){
        
        
        // Variables tasas
        double tasaRodamiento = 0, tasaSeguro = 0;
        // Variables resultados
        double impuestoRodamiento = 0, seguro = 0;


        try {

            switch (decada) {
                case "90":

                    // Calculo tasa rodamiento
                    tasaRodamiento = 4.09;
                    impuestoRodamiento = avaluo * tasaRodamiento;
                    
                
                    // Calculo tasa seguro
                    tasaSeguro = 0.816;
                    seguro = avaluo * tasaSeguro;
                    break;
                case "00":

                    // Calculo tasa rodamiento
                    tasaRodamiento = 4.34;
                    impuestoRodamiento = avaluo * tasaRodamiento;

                     // Calculo tasa seguro
                     tasaSeguro = 0.798;
                     seguro = avaluo * tasaSeguro;
                     break; 
                    
                case "10":

                    // Calculo tasa rodamiento
                    tasaRodamiento = 4.93;
                    impuestoRodamiento = avaluo * tasaRodamiento;

                     // Calculo tasa seguro
                     tasaSeguro = 0.712;
                     seguro = avaluo * tasaSeguro;
                     break; 

                case "20":

                    // Calculo tasa rodamiento
                    tasaRodamiento = 5.680;
                    impuestoRodamiento = avaluo * tasaRodamiento;
                   
                    // Calculo tasa seguro
                    tasaSeguro = 0.699;
                    seguro = avaluo * tasaSeguro;
                    break; 

                default:
                    return -1;
                  
            }


            
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
            return -1;
        }

        return (int)impuestoRodamiento + (int)seguro;

    }

    //------------------------------------------------------------------

}


  
