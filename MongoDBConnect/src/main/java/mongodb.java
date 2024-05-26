

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;




public class mongodb {
    public static void main(String[] args)
    {
        // Connect to MongoDB server
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        try {
            // Select the database
            MongoDatabase database = mongoClient.getDatabase("rushi");

            // Select the collection
            MongoCollection<Document> collection = database.getCollection("rushi");
            
            
            /******************* insert One Data*****************/
//            Document document = new Document();
//            document.append("name", "Ram");
//            document.append("age", 26);
//            document.append("city", "Hyderabad");
//            
//            //Inserting the document into the collection
//            database.getCollection("rushi").insertOne(document);
            
            
            
            /******************* insert Many Data*****************/
//            database.getCollection("rushi");
//            Document document1 = new Document("name", "Robert").append("age", 27).append("city", "Vishakhapatnam");
//            Document document2 = new Document("name", "Rhim").append("age", 30).append("city", "Delhi");
//            
//            //Inserting the created documents
//            List<Document> list = new ArrayList<Document>();
//            list.add(document1);
//            list.add(document2);
//            collection.insertMany(list);
//         
//            System.out.println("Document inserted successfully");
            
            
           
            /******************* display data*****************/
            try (MongoCursor<Document> cursor = collection.find().iterator()) 
            {
                while (cursor.hasNext()) 
                {
                    Document document11 = cursor.next();
                    System.out.println(document11.toJson());
                }
            }
        } finally {
            // Close the MongoDB client
            mongoClient.close();
        }
        
        
    }
}
