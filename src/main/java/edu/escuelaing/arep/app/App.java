package edu.escuelaing.arep.app;

import spark.Request;
import spark.Response;

import java.util.List;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App{

    public static void main(String[] args) {
        staticFileLocation("/static");
        port(getPort());
        post("/mean",(req, res) -> calculateMean(req, res) );
        post("/standardDeviation",(req, res) -> calculateStd(req, res) );
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }

    static String calculateMean(Request req, Response res){
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

    static String calculateStd(Request req, Response res){
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
