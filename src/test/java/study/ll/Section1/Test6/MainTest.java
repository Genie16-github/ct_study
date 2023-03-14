package study.ll.Section1.Test6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("\"statitsics\"  입력시 3 출력")
    void t1(){
        assertThat(new Solution().solution("statitsics"))
                .isEqualTo(3);
    }

    @Test
    @DisplayName("\"aabb\"  입력시 -1 출력")
    void t2(){
        assertThat(new Solution().solution("aabb"))
                .isEqualTo(-1);
    }

    @Test
    @DisplayName("\"stringshowtime\"  입력시 3 출력")
    void t3(){
        assertThat(new Solution().solution("stringshowtime"))
                .isEqualTo(3);
    }
}