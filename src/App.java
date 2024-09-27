public class App {
    public static void main(String[] args) throws Exception {
        MetodosOrdenamiento mO=new MetodosOrdenamiento();
        int[] arreglo ={10,5,8,2,0};
        mO.sortBySeleccion(arreglo, true);
        mO.printArreglo(arreglo);
        System.out.println();
        mO.sortBySeleccion(arreglo, false);
        mO.printArreglo(arreglo);
    }
}