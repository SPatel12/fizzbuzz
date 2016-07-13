package com.uw

/**
 * Created by ShittulPatel on 12/07/2016.
 */
class FizzBuzz {

    private def printNumber(Integer number) {
        if(!isDivisibleByFive(number) && !isDivisibleByThree(number)) {
            println number
        }
    }

    private def printFizz(Integer number){
        if(isDivisibleByThree(number) && !isDivisibleByFifteen(number)) {
            println "Fizz"
        }
    }

    private def printFizzBuzz(Integer number) {
        if ( isDivisibleByFifteen(number)) {
            println "FizzBuzz"
        }
    }

    private def printBuzz(Integer number) {
        if( isDivisibleByFive(number) && ! isDivisibleByFifteen(number)){
            println "Buzz"
        }
    }

    private static boolean isDivisibleByFive(Integer number) {
        number % 5 == 0
    }

    private static boolean isDivisibleByThree(Integer number){
        number % 3 == 0
    }

    private static isDivisibleByFifteen(Integer number){
        isDivisibleByFive(number) && isDivisibleByThree(number)
    }

    def evaluate(List<Integer> integers) {
        integers.each{ number ->
            printNumber(number)
            printBuzz(number)
            printFizz(number)
            printFizzBuzz(number)

        }
    }
}
