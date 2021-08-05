package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    @Test
    void should_return_order_number_when_count_off_given_normal_case_order_number() {
        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.countOff(orderNumber);
        
        assertThat(result).isEqualTo("1");

    }

    @Test
    void should_return_order_number_when_count_off_given_order_number_multiple_of_3() {
        //give
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when

        String result = fizzBuzz.countOff(orderNumber);

        //then
        assertThat(result).isEqualTo("Fizz");


    }

    @Test
    void should_return_order_number_when_count_off_given_order_number_multiple_of_5() {
        int orderNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.countOff(orderNumber);

        assertThat(result).isEqualTo("Buzz");
    }
}
