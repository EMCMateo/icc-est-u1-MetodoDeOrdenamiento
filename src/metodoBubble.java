public class metodoBubble {

    public int[] ordenar(int[] arreglo, boolean isDes, boolean pas) {
    int n = arreglo.length;
    int contComp = 0; 
    int contCambios = 0; 
    int aux = 0;

    if (isDes == false) { // Orden Ascendente
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (pas) {
                    System.out.println("Comparando: arreglo[" + j + "] = " + arreglo[j] + " con arreglo[" + (j + 1) + "] = " + arreglo[j + 1]);
                }
                contComp++;
                if (arreglo[j] > arreglo[j +1]) {
                    aux = arreglo[j];
                    arreglo[j] =arreglo[j+1];
                    arreglo[j +1] = aux;
                    contCambios++;

                    if (pas) { 
                        System.out.println("Cambio realizado: arreglo[" + j + "] = " + arreglo[j] + " con arreglo[" + (j + 1) + "] = " + arreglo[j + 1]);
                    }
                }

                if (pas) {
                    System.out.println("Cambio realizado: " + arreglo[j] + " con  " + arreglo[j + 1]);
                    System.out.print("Paso: ");
                    imprArreglo(arreglo);
                }  else if (pas) {
                    System.out.println("No se realiza cambio entre arreglo[" + j + "] = " + arreglo[j] + " y arreglo[" + (j + 1) + "] = " + arreglo[j + 1]);
                
            }
        }
        }
    } else { // Orden Descendente
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (pas) {
                    System.out.println("Comparando: arreglo[" + j + "] = " + arreglo[j] + " con arreglo[" + (j + 1) + "] = " + arreglo[j + 1]);
                }
                contComp++;
                if (arreglo[j] < arreglo[j +1]) {
                    aux = arreglo[j];
                    arreglo[j] =arreglo[j+1];
                    arreglo[j +1] = aux;
                    contCambios++;

                    if (pas) {
                        System.out.println("Cambio realizado: arreglo[" + j + "] = " + arreglo[j] + " con arreglo[" + (j + 1) + "] = " + arreglo[j + 1]);
                    }
                }

                if (pas) { 
                    System.out.print("Paso: ");
                    imprArreglo(arreglo);
                }
            }
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