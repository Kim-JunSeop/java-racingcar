package gmbs.util;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomGeneratorTest {
    @Test
    void 랜덤_값() {
        // given
        int min = 0;
        int max = 10;

        // when
        int number = RandomGenerator.generateNumber(min, max);

        // then
        assertThat(number).isGreaterThanOrEqualTo(min).isLessThan(max);
    }
}