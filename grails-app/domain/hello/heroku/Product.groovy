package hello.heroku

class Product {

    String name
    Currency currency
    Double price
    
    static constraints = {
        name()
        currency()
        price scale:2
    }
}
