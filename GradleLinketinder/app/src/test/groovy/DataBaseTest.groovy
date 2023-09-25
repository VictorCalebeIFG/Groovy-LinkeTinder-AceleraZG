package testgradle

import DataBase.DataBaseUtils
import spock.lang.Specification

class DataBaseTest extends Specification {
    def "application has a greeting"() {
        setup:
        def candidatos = DataBaseUtils.getCandidatos()

        when:
        def result = candidatos

        then:
        result != null
    }
}
