package com.example.outsidetddexample

class Car(val engine: Engine,var fuel:Double ) {
    fun turnOn() {
        fuel-=0.5
        engine.isTurnedOn()
    }
}