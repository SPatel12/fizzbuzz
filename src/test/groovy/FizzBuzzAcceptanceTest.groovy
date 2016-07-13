import com.uw.FizzBuzz
import org.junit.Rule
import spock.lang.Ignore
import spock.lang.Specification
import uk.org.lidalia.test.SystemOutputRule

/**
 * Created by ShittulPatel on 12/07/2016.
 */
class FizzBuzzAcceptanceTest extends Specification{

    @Rule
    SystemOutputRule console = new SystemOutputRule()

    def "can test from specification"(){
        given:
        FizzBuzz fizzBuzz = new FizzBuzz()

        when:
        fizzBuzz.evaluate((1..20))

        then:
        console.systemOut == """1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
"""
    }
}



/**

 */
