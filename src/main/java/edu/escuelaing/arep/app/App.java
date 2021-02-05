package edu.escuelaing.arep.app;

import spark.Request;

import java.util.List;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App{

    /**
     *El metodo mean permite iniciar el programa cuando este es ejecutado.
     * @param args
     */
    public static void main(String[] args) {
        staticFileLocation("/static");
        port(getPort());
        post("/mean",(req, res) -> calculateMean(req) );
        post("/standardDeviation",(req, res) -> calculateStd(req) );
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }

    /**
     * Cuando spark hace un post pide calcular la media.
     * @param req contiene la petición que había echo desde la página web
     * @return Un string que contiene la media.
     */
    static String calculateMean(Request req){
        String chain = req.body().substring(1,req.body().length()-1);
        String[] datos = chain.split(",");
        List lis = new LinkedList();
        System.out.println("Mean");
        for (String i : datos){
            System.out.println(i);
            lis.add(Double.parseDouble(i));
        }
        Double ans = MeanAndStandardDeviation.mean(lis);
        System.out.println(ans);
        return ans.toString();
    }

    /**
     * Cuando spark hace un post pide calcular la desviación estándar.
     * @param req contiene la petición que había echo desde la página web
     * @return Un string que contiene la desviación estándar.
     */
    static String calculateStd(Request req){
        String chain = req.body().substring(1,req.body().length()-1);
        String[] datos = chain.split(",");
        List lis = new LinkedList();
        System.out.println("Standard deviation");
        for (String i : datos){
            System.out.println(i);
            lis.add(Double.parseDouble(i));
        }
        Double ans = MeanAndStandardDeviation.stDeviation(lis);
        return ans.toString();
    }

}
