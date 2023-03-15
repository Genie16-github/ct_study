package study.ll.Section1.Test10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("[\"steasue\", \"sasseysu\", \"kseseas\"]   입력시 [\"s\", \"s\", \"e\", \"a\"] 출력")
    void t1(){
        assertThat(new Solution().solution(new String[]{"steasue", "sasseysu", "kseseas"}))
                .contains("s", "s", "e", "a");
    }

    @Test
    @DisplayName("[\"ackky\", \"kabck\", \"yokkcs\"]    입력시 [\"k\", \"k\", \"c\"] 출력")
    void t2(){
        assertThat(new Solution().solution(new String[]{"ackky", "kabck", "yokkcs"}))
                .contains("k", "k", "c");
    }

    @Test
    @DisplayName("[\"longlong\", \"longtong\", \"longbig\"]   입력시 [\"l\", \"o\", \"n\", \"g\", \"g\"] 출력")
    void t3(){
        assertThat(new Solution().solution(new String[]{"longlong", "longtong", "longbig"}))
                .contains("l", "o", "n", "g", "g");
    }

}