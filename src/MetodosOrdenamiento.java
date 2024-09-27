public class MetodosOrdenamiento {
    public int[] sortBySeleccion (int[] arr, boolean ascendente){
        int tamanio= arr.length;
        for(int i=0;i<tamanio;i++){
            int indiceMayor=i;
            for(int j=i+1;j<tamanio;j++){
                if(ascendente
                ? arr[j]< arr[indiceMayor]
                : arr[j]> arr[indiceMayor]){
                    indiceMayor=j;
                }
            }
                //if(arr[j]<arr[indiceMayor]){
                  //  indiceMayor=j;
                //}
            //}
            //else(arr[j]<arr[indiceMayor]){
              //  indiceMayor=j;
            //}
        
            //intercambio del indice encontrado por el primero
            int aux=arr[indiceMayor];
            arr[indiceMayor]=arr[i];
            arr[i]=aux;
        }
        return arr;
    }
    public void printArreglo (int[] arreglo){
        for(int elemento:arreglo){
            System.out.print(elemento+"-");
        }
    }
}
