package com.tengen;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * Created by ufc23.aguiar on 8/2/13.
 */
public class HelloSpark {

    public static void main(String args[]){

        Spark.get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello Spark";
            }
        });


    }
}
