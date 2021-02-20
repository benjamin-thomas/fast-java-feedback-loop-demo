package main

import groovy.transform.CompileStatic

import tools.GroovyWorker
import tools.JavaWorker

import java.time.Duration
import java.time.LocalDateTime

@CompileStatic
class Main {

    def static log(String message) {
        LocalDateTime timestamp = LocalDateTime.now()
        println("[$timestamp]: $message")
    }

    static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now()
        log("Starting main...")
        println GroovyWorker.doStuff("Configure environment")
        println JavaWorker.doStuff("Access database")
        LocalDateTime curr = LocalDateTime.now()
        Duration duration = Duration.between(start, curr)
        long durationMillis = duration.toMillis()
        log("Job done in ${durationMillis}ms!")
    }
}


