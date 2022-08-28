/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.clasificador;

import java.util.List;

/**
 *
 * @author nnavarro
 */
public final class TMedidorTiempo
{

    private final TClasificador clasificador;

    public TMedidorTiempo()
    {
        this.clasificador = new TClasificador();
    }

    public long medir(int[] datosParaClasificar, int metodoClasificacion)
    {
        long inicio = System.nanoTime();
        clasificador.clasificar(datosParaClasificar, metodoClasificacion, true);
        return System.nanoTime() - inicio;
    }

    public long medirPromedio(List<int[]> listaDatosParaClasificar, int metodoClasificacion)
    {
        if (listaDatosParaClasificar != null && !listaDatosParaClasificar.isEmpty())
        {
            long acumulador = 0L;
            for (int[] datos : listaDatosParaClasificar)
            {
                acumulador += this.medir(datos, metodoClasificacion);
            }
            return acumulador / listaDatosParaClasificar.size();
        }
        return 0L;
    }
}
