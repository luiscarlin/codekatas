/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'luisc' at '6/1/16 2:30 AM' with Gradle 2.12
 *
 * @author luisc, @date 6/1/16 2:30 AM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
