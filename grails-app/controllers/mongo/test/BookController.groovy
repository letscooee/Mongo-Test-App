package mongo.test

import org.bson.types.ObjectId
import org.grails.web.json.JSONObject

class BookController {

    static responseFormats = ['json']

    BookService bookService

    def test1() {
        Map data = [
                name      : "Book 1",
                price     : 500,
                properties: [
                        foo: "Bar",
                        age: 2
                ],
                authorID: new ObjectId().toString()
        ]

        Book book = bookService.save(new JSONObject(data))
        respond([book: book])
    }

    def test2() {

    }
}
