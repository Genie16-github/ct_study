package study.ll.Section1.Test1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    @DisplayName("\"KKHSSSSSSSE\" 입력시 \"K2HS7E\" 출력")
    void t1(){
        Assertions.assertThat(new Main().solution("KKHSSSSSSSE"))
                .isEqualTo("K2HS7E");
    }

    @Test
    @DisplayName("\"AAABCCCDD\" 입력시 \"A3BC3D2\" 출력")
    void t2(){
        Assertions.assertThat(new Main().solution("AAABCCCDD"))
                .isEqualTo("A3BC3D2");
    }

}