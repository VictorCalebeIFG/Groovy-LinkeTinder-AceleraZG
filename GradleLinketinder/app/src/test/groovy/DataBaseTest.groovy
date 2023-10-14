package testgradle

import DataBase.DataBaseUtils
import spock.lang.Specification

class DataBaseTest extends Specification {
    def "database is working"() {
        setup:
        def candidatos = DataBaseUtils.getCandidatos()

        when:
        def result = candidatos

        then:
        result != null
    }
}
