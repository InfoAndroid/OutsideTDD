package com.example.outsidetddexample

class Engine( var temperature: Int=15,var isTurnedOn: Boolean=false) {


    fun isTurnedOn() {
        isTurnedOn=true
        temperature=95
    }
}