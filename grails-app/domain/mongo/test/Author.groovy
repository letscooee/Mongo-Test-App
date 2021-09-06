package mongo.test

import org.bson.types.ObjectId

class Author {

    static constraints = {
    }

    ObjectId id
    String name
    String email
}
