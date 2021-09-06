package mongo.test

class UrlMappings {

    static mappings = {
        "/$controller/$action/$id?"()
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
