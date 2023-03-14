package study.ll.Section1.Test5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("\"BACBACCACCBDEDE\" 입력시 \"C\" 출력")
    void t1(){
        assertThat(new Solution().solution("BACBACCACCBDEDE"))
                .isEqualTo("C");
    }

    @Test
    @DisplayName("\"AAAAABBCCDDDD\"  입력시 \"A\" 출력")
    void t2(){
        assertThat(new Solution().solution("AAAAABBCCDDDD" ))
                .isEqualTo("A");
    }

}