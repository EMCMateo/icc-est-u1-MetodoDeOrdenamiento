public class metodoSelection {

    public int[] ordenar(int[] arreglo, boolean isDes, boolean pas) {
        int x = arreglo.length;
        int contComp = 0; //comparaciones
        int contCambios = 0;//cambios 
        int aux = 0;

        for (int i = 0; i<x -1;i++) {
            int extremoIndex = i;
            for (int j = i + 1; j < x; j++) {
                if (pas) {
                    System.out.println("Comparando: arreglo[" + extremoIndex + "] = " + arreglo[extremoIndex] + " con arreglo[" + j + "] = " + arreglo[j]);
                    
                }
                
                contComp++;
                if ((isDes &&arreglo[extremoIndex]< arreglo[j])||(!isDes &&arreglo[extremoIndex]>arreglo[j])) {
                    extremoIndex =j;
                }
            }

            if (extremoIndex !=i) {
                if (pas) {
                    System.out.println("Intercambiando: arreglo[" + i + "] = " + arreglo[i] + " con arreglo[" + extremoIndex + "] = " + arreglo[extremoIndex]);
                }
                aux =arreglo[extremoIndex];
                arreglo[extremoIndex] =arreglo[i];
                arreglo[i]= aux;
                contCambios++;
            }else if (pas) {
                    System.out.println("No se realiza cambio en la posición " + i + " (arreglo[" + i + "] = " + arreglo[i] + ")");
                }

            if (pas) {
                System.out.print("Paso: ");
                imprArreglo(arreglo);
                
            }
        }

        int[] resultado = {contComp, contCambios};
        return resultado;
    }

    public void imprArreglo(int[] arreglo) {
        System.out.print("[ ");
        for (int t = 0; t < arreglo.length; t++) {
            System.out.print(arreglo[t] + " ");
        }
        System.out.println("]");
    }
}
