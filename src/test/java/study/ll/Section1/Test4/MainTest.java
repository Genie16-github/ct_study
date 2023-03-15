package study.ll.Section1.Test4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("\"abcbdcba\" 입력시 \"YES\" 출력")
    void t1(){
        assertThat(new Solution().solution("abcbdcba"))
                .isEqualTo("YES");
    }

    @Test
    @DisplayName("\"abcabbakcba\" 입력시 \"YES\" 출력")
    void t2(){
        assertThat(new Solution().solution("abcabbakcba"))
                .isEqualTo("YES");
    }

    @Test
    @DisplayName("\"abcacbakcba\" 입력시 \"NO\" 출력")
    void t3(){
        assertThat(new Solution().solution("abcacbakcba"))
                .isEqualTo("NO");
    }
}