package study.ll.Section1.Test11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("[\"00:12\",\"00:00\", \"01:05\", \"00:57\"]  입력시 8 출력")
    void t1(){
        assertThat(new Solution().solution(new String[]{"00:12","00:00", "01:05", "00:57"}))
                .isEqualTo(8);
    }

    @Test
    @DisplayName("[\"00:00\",\"23:59\",\"00:00\"]  입력시 0 출력")
    void t2(){
        assertThat(new Solution().solution(new String[]{"00:00","23:59","00:00"}))
                .isEqualTo(0);
    }

    @Test
    @DisplayName("[\"23:59\",\"00:00\", \"23:57\"]  입력시 1 출력")
    void t3(){
        assertThat(new Solution().solution(new String[]{"23:59","00:00", "23:57", "00:57"}))
                .isEqualTo(1);
    }

}