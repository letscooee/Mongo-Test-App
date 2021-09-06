package mongo.test

import org.grails.web.json.JSONObject

class BookController {

    static responseFormats = ['json']

    BookService bookService

    def save() {
        println "Request Data ${request.JSON}"
        JSONObject requestData = (JSONObject) request.JSON
        Book book = bookService.save(requestData)

        respond([book: book])
    }
}
