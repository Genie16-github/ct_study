package study.ll.section2.Test7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("\"time to time\", 5 입력 시 12 출력")
    void t1() {
        assertThat(new Solution().solution("time to time", 5))
                .isEqualTo(12);
    }

    @Test
    @DisplayName("\"time to study\", 7 입력 시 -1 출력")
    void t2() {
        assertThat(new Solution().solution("time to study", 7))
                .isEqualTo(-1);
    }

    @Test
    @DisplayName("\"Big Life is Good\", 10 입력 시 16 출력")
    void t3() {
        assertThat(new Solution().solution("Big Life is Good", 10))
                .isEqualTo(16);
    }

    @Test
    @DisplayName("\"Life is Good\", 7 입력 시 -1 출력")
    void t4() {
        assertThat(new Solution().solution("Life is Good", 7))
                .isEqualTo(-1);
    }

}