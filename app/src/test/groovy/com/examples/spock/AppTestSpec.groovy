/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package com.examples.spock

import spock.lang.Specification

class AppTestSpec extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.greeting

        then:
        result != null
    }

    def "should_be_a_simple_assertion"(){
        expect:
            1==1

    }

    def "should_use_given-when-then"(){
        given:
            def polygon = new Polygon(4)

        when:
            int sides = polygon.numberOfSides

        then:
            sides == 4

    }
}
