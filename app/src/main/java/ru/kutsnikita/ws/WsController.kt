package ru.kutsnikita.ws;

import org.graalvm.compiler.debug.Assertions
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import ru.kutsnikita.ws.api.WikiSearchApi
import ru.kutsnikita.ws.api.model.CreateObjectAndArray


@RestController
class WsController (): WikiSearchApi{
    override fun findPath(src: String?, dst: String?): ResponseEntity<MutableList<String>> {
        TODO("Not yet implemented")
    }

    override fun getParentURL(url: String?): ResponseEntity<CreateObjectAndArray> {
        val restTemplate = RestTemplate()
        val response = restTemplate.getForEntity("$url/1", String::class.java)

        return ResponseEntity.ok(
            CreateObjectAndArray()
                .url(url)
//                .lastUpdataTime(response)
        )
    }
}