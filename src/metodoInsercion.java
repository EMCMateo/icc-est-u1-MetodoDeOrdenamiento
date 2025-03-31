public class metodoInsercion {

    public int[] ordenar(int[] arreglo, boolean isDes, boolean pas) {
        int tam =arreglo.length;
        int contComp= 0; //Comparaciones
        int contCambios = 0; //Cambios

        for (int i = 1; i < tam; i++) {
            int aux = arreglo[i];
            int j= i-1;
            while (j>=0 && ((isDes&& arreglo[j] < aux)|| (!isDes&& arreglo[j] > aux))) {
                if (pas) {
                System.out.println("Comparando: Arreglo["+j+"] = "+ arreglo[j] + " con aux = " + aux);
                }
                contComp++;
                arreglo[j+1] =arreglo[j];
                j =j-1;
            }
            arreglo[j+1] = aux;
            contCambios++;

            if (pas) { 
                System.out.print("Paso: ");
                imprArreglo(arreglo);
                System.out.println("Cambio realizado: " + aux + " colocado en posición " +(j+1));
            }
        }

        int[] resultado ={contComp, contCambios};
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
