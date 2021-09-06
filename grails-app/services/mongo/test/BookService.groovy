package mongo.test

import grails.compiler.GrailsCompileStatic
import grails.gorm.transactions.Transactional
import org.grails.web.json.JSONObject

@GrailsCompileStatic
@Transactional
class BookService {

    Book save(JSONObject requestData) {
        Map props = requestData.properties as Map

        println ">>>1: $props"
        //Book.findByName(requestData.name)
        println ">>>2: $props"

        println "Props datatype -> ${props.getClass()}"
        Book book = new Book()
        book.name = requestData.name
        book.price = requestData.getInt("price")
        book.author = Author.load(requestData.getString("authorID"))
        book.props = props
        book.save(flush: true, failOnError: true)

        book
    }

    def test() {
    }
}
