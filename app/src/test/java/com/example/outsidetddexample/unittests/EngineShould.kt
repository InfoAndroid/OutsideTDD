package com.example.outsidetddexample.unittests

import com.example.outsidetddexample.Engine
import junit.framework.TestCase
import junit.framework.TestCase.assertTrue

import org.junit.Test

class EngineShould {
    private val engine = Engine()
    @Test
    fun turnOn(){
        engine.isTurnedOn()
        assertTrue(engine.isTurnedOn)

    }
    @Test
    fun riseTheTemperatureThenTurnsOn(){
        engine.isTurnedOn()
        TestCase.assertEquals(95, engine.temperature)
    }
}