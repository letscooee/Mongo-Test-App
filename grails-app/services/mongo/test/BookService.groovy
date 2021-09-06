package mongo.test

import grails.gorm.transactions.Transactional
import org.bson.types.ObjectId
import org.grails.web.json.JSONObject

@Transactional
class BookService {

    Book save(JSONObject requestData) {

        Map props = requestData.properties as Map
        String name = requestData.name
        String authorID = requestData.authorID
        Integer price = requestData.price
        String publisherID = requestData.publisherID
        requestData.getProperties()

        println "Props datatype -> ${props.getClass()}"
        Book book = new Book()
        book.name = name
        book.price = price
        book.author = Author.load(new ObjectId(authorID))
        book.props = props
        book.publisher = Publisher.load(new ObjectId(publisherID))
        book.save(flush: true, failOnError: true)

        book
    }
}
