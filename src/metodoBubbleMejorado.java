public class metodoBubbleMejorado {

    public int[] ordenarAsc(int[] arreglo, boolean isDes, boolean pas) {
        int n = arreglo.length;
        int contComp = 0; // Contador de comparaciones
        int contCambios = 0; // Contador de cambios
        int aux = 0;

        if (!isDes) { 
            for (int i = 0; i < n - 1; i++) {
                for (int j =0; j < n - 1; j++) {
                    // Mostrar comparación y los índices i y j
                    System.out.println("Comparando: arreglo[" + i + "] = " + arreglo[i] + " con arreglo[" + j + "] = " + arreglo[j]);
                    contComp++;
                    if (arreglo[i] > arreglo[j]) {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                        contCambios++;
                    }

                    if (pas) { // Mostrar pasos si 'pas' es true
                        System.out.print("Paso: ");
                        imprArregloBM(arreglo);
                    }
                }
            }
        } else { // Orden Descendente
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (pas) {
                        System.out.println("Comparando: arreglo[" + i + "] = " + arreglo[i] + " con arreglo[" + j + "] = " + arreglo[j]);
                    }
                    // Mostrar comparación y los índices i y j
                    
                    contComp++;
                    if (arreglo[i] < arreglo[j]) {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                        contCambios++;
                    }

                    if (pas) { // Mostrar pasos si 'pas' es true
                        System.out.print("Paso: ");
                        imprArregloBM(arreglo);
                    }
                }
            }
        }

        // Devolver un arreglo con los cntadores de comparacions y cambios
        int[] arreglo2 = {contComp, contCambios};
        return arreglo2;
    }

    // Método para imprimir el arreglo
    public void imprArregloBM(int[] arreglo) {
        System.out.print("[ ");
        for (int t = 0; t < arreglo.length; t++) {
            System.out.print(arreglo[t] + ", ");
        }
        System.out.println("]");
    }
}
