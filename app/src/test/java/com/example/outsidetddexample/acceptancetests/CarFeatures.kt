package com.example.outsidetddexample.acceptancetests

import com.example.outsidetddexample.Car
import com.example.outsidetddexample.Engine
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue

import org.junit.Test

class CarFeatures {

    private val  engine= Engine()
    private val  car= Car(engine,6.0)
    @Test
    fun carIsLoosingFuelWhenItTurnsOn(){
        car.turnOn()
        assertEquals(5.5,car.fuel)
    }
    @Test
    fun carIsTurningOnItEngineAndIncreaseTheTemperature(){
        car.turnOn()
        assertEquals(95,engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }
}