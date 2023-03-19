package study.ll.section2.Test1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    @DisplayName("[-4, -1, 0, 3, 10] 입력하면 [0, 1, 9, 16, 100] 출력")
    void t1() {
        Assertions.assertThat(new Solution().solution(new int[]{-4, -1, 0, 3, 10}))
                .isEqualTo(new int[]{0, 1, 9, 16, 100});
    }

    @Test
    @DisplayName("[-7, -3, 2, 3, 11] 입력하면 [4, 9, 9, 49, 121] 출력")
    void t2() {
        Assertions.assertThat(new Solution().solution(new int[]{-7, -3, 2, 3, 11}))
                .isEqualTo(new int[]{4, 9, 9, 49, 121});
    }

}