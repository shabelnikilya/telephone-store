package store.telephone.controller

import com.mongodb.client.MongoClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController(val mongoClient: MongoClient) {


    @GetMapping("/index")
    fun index(): String {
        println("INDEX!!!")
        val database = mongoClient.getDatabase("test")
        println(database.name)
        return "Hello!"
    }
}