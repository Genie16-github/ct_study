package study.ll.Section1.Test2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("\"gooG\" 입력시 \"YES\" 출력")
    void t1(){
        assertThat(new Solution().solution("gooG"))
                .isEqualTo("YES");
    }

    @Test
    @DisplayName("\"Moon\" 입력시 \"NO\" 출력")
    void t2(){
        assertThat(new Solution().solution("Moon"))
                .isEqualTo("NO");
    }
}