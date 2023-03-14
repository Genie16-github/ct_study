package study.ll.Section1.Test3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("\"a#b!GE*T@S\" 입력시 \"S#T!EG*b@a\" 출력")
    void t1(){
        assertThat(new Solution().solution("a#b!GE*T@S"))
                .isEqualTo("S#T!EG*b@a");
    }

    @Test
    @DisplayName("\"###ab*@@Sty\" 입력시 \"###yt*@@Sba\" 출력")
    void t2(){
        assertThat(new Solution().solution("###ab*@@Sty"))
                .isEqualTo("###yt*@@Sba");
    }
}