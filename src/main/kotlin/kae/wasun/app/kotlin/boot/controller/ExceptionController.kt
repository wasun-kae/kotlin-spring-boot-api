package kae.wasun.app.kotlin.boot.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionController {

    @ExceptionHandler(Exception::class)
    fun handle(e: Exception) = ResponseEntity.status(500)
}