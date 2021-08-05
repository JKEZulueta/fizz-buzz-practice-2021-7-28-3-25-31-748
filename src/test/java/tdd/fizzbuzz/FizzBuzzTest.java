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
}
