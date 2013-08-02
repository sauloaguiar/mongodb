package com.tengen;

import com.mongodb.*;

import java.net.UnknownHostException;

/**
 * Created by ufc23.aguiar on 8/2/13.
 */
public class HelloMongo {


    public static void main(String args[]){

        try {
            MongoClient client = new MongoClient(new ServerAddress("localhost", 27017));
            DB database = client.getDB("course");
            DBCollection helloCollection = database.getCollection("hello");

            DBObject document = helloCollection.findOne();

            System.out.println(document);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
