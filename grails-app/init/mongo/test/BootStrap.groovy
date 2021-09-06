package mongo.test

import org.bson.types.ObjectId
import org.grails.web.json.JSONObject

class BootStrap {

    def init = { servletContext ->

        /*
        Author author = new Author()
        author.name = "Mario"
        author.email = "mario@gmail.com"
        author.save(flush: true)

        Book book = new Book()
        book.name = "How to do a kart?"
        book.price = 99.99
        book.author = author
        book.save(flush: true)

        Book book2 = new Book()
        book2.name = "Save the Princess!!"
        book2.price = 199.99
        book2.author = Author.load(new ObjectId("61322e97c3eb2cc884b68465"))
        book2.save(flush: true)
        */


        /*
        Map params = [
                authorID  : "61322e97c3eb2cc884b68465",
                name      : "Hello Boss",
                price     : 155.99,
                properties: [
                        pages    : 356,
                        paperSize: "A5"
                ]
        ]

        BookService service = new BookService()
        service.save(params as JSONObject)

        Book b = new Book(params)
        b.save(flush: true)
        */

        /*
        Publisher p = new Publisher([name: "Nintendo"])
        p.save(flush: true, failOnError: true)
        */
    }
    def destroy = {
    }
}
