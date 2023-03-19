package study.ll.section2.Test2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("[8, 12, 2, 3, 7, 6, 12, 20, 3] 입력 시 14 출력")
    void t1() {
        assertThat(new Solution().solution(new int[]{8, 12, 2, 3, 7, 6, 12, 20, 3}))
                .isEqualTo(14);
    }

    @Test
    @DisplayName("[5, 2, 4, 7, 7, 3, 9, 10, 11] 입력 시 8 출력")
    void t2() {
        assertThat(new Solution().solution(new int[]{5, 2, 4, 7, 7, 3, 9, 10, 11}))
                .isEqualTo(8);
    }

}