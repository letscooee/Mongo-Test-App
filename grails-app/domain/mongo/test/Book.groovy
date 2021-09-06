package mongo.test

import org.bson.types.ObjectId

class Book {

    static constraints = {
    }

    ObjectId id
    String name
    Double price
    Map<String, Object> props
    Author author
}
