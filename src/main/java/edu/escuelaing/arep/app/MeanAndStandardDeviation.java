package edu.escuelaing.arep.app;

import java.util.List;

public class MeanAndStandardDeviation {

    public static List<Double> secondList = new LinkedList<Double>();

    /**
     * Calcula la media de un arreglo de elementos
     * @param meanList Lista que contiene "n" reales.
     * @return La media.
     */
     public static Double mean(List<Double> meanList){
         Double sum = 0.0;
         for(Double num : meanList){
             secondList.add(num);
             sum += num;
         }
         Double res = sum/meanList.size();
         return res;
    }

    /**
     * Calcula la desviación estandar de un arreglo de "n" elementos.
     * @param stdList Lista que contiene "n" reales.
     * @return La desviación estandar.
     */
    public static Double stDeviation(List<Double> stdList){
        clear();
        Double meanData = mean(stdList);
        Double rest = 0.0;
        for(Double num : secondList){
            rest += Math.pow(num-meanData,2);
        }
        Double res = rest/(secondList.size()-1);
        clear();
        return Math.sqrt(res);
    }

    /**
     * Resetea el arreglo auxiliar.
     */
    public static void clear(){
        for(Double num : secondList){
            secondList.clear();
        }
    }

}
