package study.ll.Section1.Test7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("\"aaabc\" 입력 시 [0, 2, 2] 출력")
    void t1() {
        assertThat(new Solution().solution("aaabc"))
                .isEqualTo(new int[]{0, 2, 2});
    }

    @Test
    @DisplayName("\"aabb\" 입력 시 [0, 0, 2] 출력")
    void t2() {
        assertThat(new Solution().solution("aabb"))
                .isEqualTo(new int[]{0, 0, 2});
    }

    @Test
    @DisplayName("\"abc\" 입력 시 [0, 0, 0] 출력")
    void t3() {
        assertThat(new Solution().solution("abc"))
                .isEqualTo(new int[]{0, 0, 0});
    }
}