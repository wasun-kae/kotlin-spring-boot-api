package kae.wasun.app.kotlin.boot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/health")
    fun checkAlive() = "OK"
}