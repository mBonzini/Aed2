package ucu.edu.uy.clasificador;

import java.util.LinkedList;
import java.util.List;

public class TClasificador
{

    public static final int METODO_CLASIFICACION_INSERCION = 1;
    public static final int METODO_CLASIFICACION_SHELL = 2;
    public static final int METODO_CLASIFICACION_BURBUJA = 3;
    public static final int METODO_CLASIFICACION_QUICKSORT = 4;
    public static final int METODO_CLASIFICACION_SELECCION = 5;
    public static final int METODO_CLASIFICACION_HEAP = 6;

    /**
     * Punto de entrada al clasificador
     *
     * @param datosParaClasificar
     * @param metodoClasificacion
     * @return Un vector del tam. solicitado, ordenado por el algoritmo
     * solicitado
     */
    public int[] clasificar(int[] datosParaClasificar, int metodoClasificacion)
    {
        switch (metodoClasificacion)
        {
            case METODO_CLASIFICACION_INSERCION:
                return ordenarPorInsercion(datosParaClasificar);
            case METODO_CLASIFICACION_SHELL:
                return ordenarPorShell(datosParaClasificar);
            case METODO_CLASIFICACION_BURBUJA:
                return ordenarPorBurbuja(datosParaClasificar);
            case METODO_CLASIFICACION_QUICKSORT:
                return ordenarPorQuickSort(datosParaClasificar);
            case METODO_CLASIFICACION_SELECCION:
                return ordenarPorSeleccion(datosParaClasificar);
            case METODO_CLASIFICACION_HEAP:
                return ordenarPorHeapSort(datosParaClasificar);
            default:
                System.err.println("Este codigo no deberia haberse ejecutado");
                break;
        }
        return datosParaClasificar;
    }

    /**
     * Punto de entrada al clasificador
     *
     * @param datosParaClasificar
     * @param metodoClasificacion
     * @param noCascara
     * @return Un vector del tam. solicitado, ordenado por el algoritmo
     * solicitado
     */
    public int[] clasificar(int[] datosParaClasificar, int metodoClasificacion, boolean noCascara)
    {
        switch (metodoClasificacion)
        {
            case METODO_CLASIFICACION_INSERCION:
                return noCascara ? ordenarPorInsercion(datosParaClasificar) : ordenarPorInsercionDummy(datosParaClasificar);
            case METODO_CLASIFICACION_SHELL:
                return noCascara ? ordenarPorShell(datosParaClasificar) : ordenarPorShellDummy(datosParaClasificar);
            case METODO_CLASIFICACION_BURBUJA:
                return noCascara ? ordenarPorBurbuja(datosParaClasificar) : ordenarPorBurbujaDummy(datosParaClasificar);
            case METODO_CLASIFICACION_QUICKSORT:
                return noCascara ? ordenarPorQuickSort(datosParaClasificar) : ordenarPorQuickSortDummy(datosParaClasificar);
            case METODO_CLASIFICACION_SELECCION:
                return noCascara ? ordenarPorSeleccion(datosParaClasificar) : ordenarPorSeleccionDummy(datosParaClasificar);
            case METODO_CLASIFICACION_HEAP:
                return noCascara ? ordenarPorHeapSort(datosParaClasificar) : ordenarPorHeapSortDummy(datosParaClasificar);
            default:
                System.err.println("ESTO NO DEBERIA PASAR....");
                break;
        }
        return datosParaClasificar;
    }

    protected int[] ordenarPorInsercionDummy(int[] datosParaClasificar)
    {
        return datosParaClasificar;
    }

    private int[] ordenarPorBurbujaDummy(int[] datosParaClasificar)
    {
        return datosParaClasificar;
    }

    private int[] ordenarPorShellDummy(int[] datosParaClasificar)
    {
        return datosParaClasificar;
    }

    private void quicksortDummy(int[] entrada, int i, int j)
    {
        return;
    }

    protected int[] ordenarPorQuickSortDummy(int[] datosParaClasificar)
    {
        quicksortDummy(datosParaClasificar, 0, datosParaClasificar.length - 1);
        return datosParaClasificar;
    }

    protected int[] ordenarPorSeleccionDummy(int[] datosParaClasificar)
    {
        return datosParaClasificar;
    }

    protected int[] ordenarPorHeapSortDummy(int[] datosParaClasificar)
    {
        return datosParaClasificar;
    }

    public static int[] copiar(int[] entrada)
    {
        int[] salida = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++)
        {
            salida[i] = entrada[i];
        }
        return salida;
    }

    public static List<int[]> copiarConjunto(List<int[]> entrada)
    {
        List<int[]> conjuntoCopia = new LinkedList<>();
        if (entrada != null)
        {
            entrada.forEach(vectores ->
            {
                conjuntoCopia.add(copiar(vectores));
            });
        }
        return conjuntoCopia;
    }

    public static String getMethodName(int metodoClasificacion)
    {
        return switch (metodoClasificacion)
        {
            case METODO_CLASIFICACION_INSERCION -> "M??todo de clasificaci??n por Inserci??n";
            case METODO_CLASIFICACION_SHELL -> "M??todo de clasificaci??n Shellsort";
            case METODO_CLASIFICACION_BURBUJA -> "M??todo de clasificaci??n Burbuja";
            case METODO_CLASIFICACION_QUICKSORT -> "M??todo de clasificaci??n Quicksort";
            case METODO_CLASIFICACION_SELECCION -> "M??todo de clasificaci??n por Selecci??n";
            case METODO_CLASIFICACION_HEAP -> "M??todo de clasificaci??n Heapsort";
            default -> "M??todo desconocido";
        };
    }
    
    //######################################################################
    // M??todos de clasificaci??n a desarrollar
    

    
}
