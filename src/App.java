
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mostraremos la funcion de un Metodo de Inserción");
        System.out.println(
                "Mstrando el arreglo desordenado para posterior mente mostralo arreglado despues de pasar por el metodo");
        int[] Arr = { 5, 78, 21, 56, 91 };
        System.out.println();
        System.out.println("Este es el arreglo original");
        for (int num : Arr) {
            System.out.println(num + " ");
        }

        System.out.println();

        System.out.println("==============================");
        insertionsort(Arr);

        System.out.println("Este es el arreglo ya ordenado");
        for(int num : Arr) {
            System.out.println( num + " ");
        }
        
    }

    public static void insertionsort(int[] Arr) {
        int n = Arr.length;
        for (int i = 1; i < n; i++) {
            int extraido = Arr[i];
            int j = i - 1;
            while (j > 0 && Arr[j] > extraido) {
                Arr[j + 1] = Arr[j];
                j--;

            }
            Arr[j + 1] = extraido;
        }

    }

}
