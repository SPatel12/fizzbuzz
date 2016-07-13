import com.uw.FizzBuzz
import org.junit.Rule
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll
import uk.org.lidalia.test.SystemOutputRule

/**
 * Created by ShittulPatel on 12/07/2016.
 */
class FizzBuzzSpec  extends Specification {

    @Rule
    SystemOutputRule console = new SystemOutputRule()

    @Shared
    FizzBuzz fizzBuzz = new FizzBuzz()


    @Unroll
    def "prints fizz when the number is divisible by three alone #number"() {
        when: "I pass the number to printFizz"
        fizzBuzz.printFizz(number)

        then: "it prints out fizz"
        console.systemOut == "Fizz$System.lineSeparator"

        where:
        number << (1..100).findAll { fizzBuzz.isDivisibleByThree(it) && !fizzBuzz.isDivisibleByFifteen(it) }
    }

    @Unroll
    def "prints out buzz when the number is divisible by five alone #number"() {
        when: "I pass the number to printBuzz"
        fizzBuzz.printBuzz(number)

        then: "it prints out buzz"
        console.systemOut == "Buzz$System.lineSeparator"

        where:
        number << (1..100).findAll { fizzBuzz.isDivisibleByFive(it) && !fizzBuzz.isDivisibleByFifteen(it) }
    }

    @Unroll
    def "prints out fizzbuzz when the number is a multiple of three and five #number"() {
        when: "i pass the number to printFizzBuzz "
        fizzBuzz.printFizzBuzz(number)

        then: "it prints out Fizzbuzz"
        console.systemOut == "FizzBuzz$System.lineSeparator"

        where:
        number << (1..100).findAll{ fizzBuzz.isDivisibleByFifteen(it) }
    }

    @Unroll
    def "prints out the number if not a multiple of 3, 5, or 15 #number"(){
        when: "i pass the number "
        fizzBuzz.printNumber(number)

        then:
        console.systemOut == "$number$System.lineSeparator"

        where:
        number << (1..100).findAll{ !fizzBuzz.isDivisibleByThree(it)  && ! fizzBuzz.isDivisibleByFive(it)}
    }

}
