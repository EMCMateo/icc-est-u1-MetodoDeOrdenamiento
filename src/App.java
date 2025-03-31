import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leer = new Scanner(System.in);

        int contador = 10;
        while (contador != 0) {
            System.out.println("-----------------------------------------------------------------");

            /*
            int [] arregloNew = new int[20];
            for (int h = 0; h < 20; h++) {
                arregloNew[h] = (int) (Math.random() * 20);
                */
            
            System.out.println("Bienvenido!");
            System.out.println("1 - Metodo Bubble ");
            System.out.println("2 - Metodo Selection ");
            System.out.println("3 - Metodo Insercion ");
            System.out.println("4 - Metodo Bubble Mejorado: ");
            System.out.println("5 - Exit ");
            System.out.println("-----------------------------------------------------------------");

            int metodo = getPositivo(leer, "\nIngrese el número del método que desea ejecutar!");
            System.out.println("Desea ver los pasos?: (true/false)");
            boolean pas = leer.nextBoolean();
            //System.out.println("Desea ver el arreglo ordenado de forma descendente?: (Asc/Des)");
            //String orden2 = leer.next();
            String [] posibles = {"Asc", "Des"};
            String orden2 = getValidString(leer, "Ingrese el orden del arreglo (Asc/Des)", posibles);
            boolean desc = orden2.equalsIgnoreCase("Des" )? false : true;

            int[] arreglo = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
            switch (metodo) {
                

                case 1:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Vector inicial: " + arreglo.toString());
                    metodoBubble metodoBurbujaClase = new metodoBubble(); //Instanciar clase, la clase  metodo bubble no puede estar en static
                    metodoBubble imprBubble = new metodoBubble();
                    int xBubble [] = metodoBurbujaClase.ordenar(arreglo, true, pas);
                    if (desc) {
                        System.out.println("Orden Ascendente, Metodo Bubble");
                        metodoBurbujaClase.ordenar(arreglo, true, pas);
                        
                        
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Arreglo ordenado: ");
                        imprBubble.imprArreglo(arreglo);
                        System.out.println("Comparaciones: " + xBubble[0] + " Cambios: " + xBubble[1]);
                    } else if (desc== false || desc== false) {
                        System.out.println("Orden Descendente, Metodo Bubble");
                        metodoBurbujaClase.ordenar(arreglo, false, pas);
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Arreglo ordenado: ");
                        imprBubble.imprArreglo(arreglo);
                        System.out.println("Comparaciones: " + xBubble[0] + " Cambios: " + xBubble[1]);
                    } else {
                        System.out.println("Valor incorrecto");
                    }

                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Vector inicial: "+arreglo.toString());
                    metodoSelection metodoSelectionClase = new metodoSelection();
                    metodoSelection imprMetodoSelec = new metodoSelection();
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Metodo Selection");
                    if (desc) {
                        System.out.println("Orden Ascendente, Metodo Selection");
                        int [] xSe = metodoSelectionClase.ordenar(arreglo, true, pas);
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Arreglo ordenado: ");
                        imprMetodoSelec.imprArreglo(arreglo);
                        System.out.println("Comparaciones: "+xSe[0] + " Cambios: "+xSe[1]);
                    } else if (desc == false) {
                        System.out.println("Orden Descendete, Metodo Selection");
                        int [] xSe = metodoSelectionClase.ordenar(arreglo, false, pas);
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Arreglo ordenado: ");
                        imprMetodoSelec.imprArreglo(arreglo);
                        System.out.println("Comparaciones: "+xSe[0] + " Cambios: "+xSe[1]);
                        
                    } else {
                        System.out.println("Valor incorrecto");
                    }
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Vector inicial: "+arreglo.toString());
                    metodoInsercion metodoInsercionClase = new metodoInsercion();
                    metodoInsercion imprMetodoI = new metodoInsercion();
                    int arrIns [] = metodoInsercionClase.ordenar(arreglo, true, pas);
                    System.out.println("Metodo Insercion");
                    System.out.println("-----------------------------------------------------------------");
                    if (desc) {
                        System.out.println("Orden Ascendente, Metodo Insercion");
                        metodoInsercionClase.ordenar(arreglo, true, pas);
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Arreglo ordenado: ");
                        imprMetodoI.imprArreglo(arreglo);
                        System.out.println("Comparaciones: "+arrIns[0]+" Cambios: "+arrIns[1]);
                    } else if (desc == false) {
                        System.out.println("Orden Descendente, Metodo Insercion");
                        metodoInsercionClase.ordenar(arreglo, false, pas);
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Arreglo ordenado: ");
                        imprMetodoI.imprArreglo(arreglo);
                        System.out.println("Comparaciones: "+arrIns[0]+" Cambios: "+arrIns[1]);
                    } else {
                        System.out.println("Valor incorrecto");
                    }
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Vector inicial: "+arreglo.toString());
                    metodoBubbleMejorado bubbleMejorado = new metodoBubbleMejorado();
                    metodoBubbleMejorado imprArregloBM = new metodoBubbleMejorado();
                    
                    System.out.println("Metodo Burbuja Mejorado: ");
                    System.out.println("---------------------------------------------------------------------");
                    if (desc) {
                        System.out.println("Orden Ascendente, Metodo Insercion");
                        int [] xBuMe = bubbleMejorado.ordenarAsc(arreglo, true, pas);
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Arreglo ordenado: ");
                        imprArregloBM.imprArregloBM(arreglo);
                        System.out.println("Comparaciones: "+xBuMe[0]+" Cambios: "+xBuMe[1]);
                    } else if (desc == false) {
                        System.out.println("Orden Descendente, Metodo Insercion");
                        int [] xBuMe = bubbleMejorado.ordenarAsc(arreglo, false, pas);
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Arreglo ordenado: ");
                        imprArregloBM.imprArregloBM(arreglo);
                        System.out.println("Comparaciones: "+xBuMe[0]+" Cambios: "+xBuMe[1]);
                    } else {
                        System.out.println("Valor incorrecto");
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    contador = 0;
                    break;

                default:
                    System.out.println("Valor incorrecto");
            }
        }
    }
    
        

        public static int getPositivo(Scanner scanner, String message){
            int x;
            do{
                System.out.println(message + "");
                x = scanner.nextInt();
                if (x <= 0){
                    System.out.println("El valor debe ser positivo!");
                }
        
            }while(x <= 0);
            return x;
        }

        public static String getValidString(Scanner leer, String message, String posibles[]){
            String input;
            boolean valido;
            do{
                System.out.println(message + ": ");
                input = leer.nextLine();
                valido = false;
                

                for(String posible : posibles){
                    if (input.equalsIgnoreCase(posible)){
                        valido = true;
                        break;
                    }
                }

            } while (!valido);
            return input;
        }
    }


    /*
     * RECORDAR:  /*
        int [] arreglo = {15,9,10,9,7,0,1,2};
        int [] arregloS = {23,5,6,69,8,4,2,3,4,1,0};
        int [] vI = {456,485,1,23,56,3,45,0,31,546,6};
        System.out.println("Metodo Bubble");
        metodoBubble metodoBurbujaClase = new metodoBubble(); //Instanciar clase, la clase  metodo bubble no puede estar en static
        metodoBubble imprBubble = new metodoBubble();
        metodoBurbujaClase.ordenar(arreglo, false);
        imprBubble.imprArreglo(arreglo);
        metodoBurbujaClase.ordenar(arreglo, true);
        imprBubble.imprArreglo(arreglo);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Metodo Selection");
        metodoSelection metodoSelectionClase = new metodoSelection();
        metodoSelectionClase.ordenarSel(arregloS, false);
        metodoSelection imprMetodoSelec = new metodoSelection();
        imprMetodoSelec.imprArregloSele(arregloS,false);
        metodoSelectionClase.ordenarSel(arregloS, true);
        imprMetodoSelec.imprArregloSele(arregloS,true);


        System.out.println("-----------------------------------------------------------------");
        System.out.println("Metodo Insercion");
        metodoInsercion metodoInsercionClase = new metodoInsercion();
        metodoInsercionClase.ordenarSel(vI, false);
        metodoInsercion imprMetodoI = new metodoInsercion();
        imprMetodoI.imprArregloSele(vI,false);
        metodoInsercionClase.ordenarSel(vI, true);
        imprMetodoI.imprArregloSele(vI,true);

        
        */
     


