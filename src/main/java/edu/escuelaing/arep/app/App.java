package edu.escuelaing.arep.app;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App{

    public static void main(String[] args) {
        get("/", (req, res) -> "Hello Heroku");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }
}
