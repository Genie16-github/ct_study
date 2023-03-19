package study.ll.section2.Test3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("[1, 2, 3, 4, 5, 3, 1] 입력 시 \"YES\" 출력")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 3, 1}))
                .isEqualTo("YES");
    }

    @Test
    @DisplayName("[1, 3, 4, 5, 5, 6, 4, 3] 입력 시 \"NO\" 출력")
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 3, 4, 5, 5, 6, 4, 3}))
                .isEqualTo("NO");
    }

    @Test
    @DisplayName("[1, 2, 3, 4, 5] 입력 시 \"NO\" 출력")
    void t3() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}))
                .isEqualTo("NO");
    }


}