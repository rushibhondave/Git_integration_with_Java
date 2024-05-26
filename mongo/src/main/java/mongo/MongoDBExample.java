package mongo;

import java.util.Collection;

import javax.swing.text.Document;

import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBExample {
    public static void main(String[] args) {
        // MongoDB connection string
        String uri = "mongodb://localhost:27017";

        // Create a MongoClient instance
        MongoClient mongoClient = new MongoClient(new MongoClientURI(uri));

        // Access the database
        MongoDatabase database = mongoClient.getDatabase("rushi");

        // Access the collection
        MongoCollection<org.bson.Document> collection = database.getCollection("rushi");

    	DBCursor curor=Collection.find();
    	
    	while(curor.hasNext())
    	{int i=1;
    	System.out.println(curor.next());
    		i++;
    	}

        // Close the MongoClient
        mongoClient.close();
    }
}
