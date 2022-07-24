package study.abcshc.forgettingcurvewar.http.memory

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/memory")
class MemoryController {
    @GetMapping("/hello")
    suspend fun hello(): ResponseEntity<String> {
        return ResponseEntity("hello", HttpStatus.OK)
    }

    @PostMapping()
}