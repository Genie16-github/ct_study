package study.ll.Section1.Test12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("[\"08:30\", \"09:00\", \"14:00\", \"16:00\", \"16:01\", \"16:06\", \"16:07\", \"16:11\"]  입력시 \"02:20\" 출력")
    void t1(){
        assertThat(new Solution().solution(new String[]{"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"}))
                .isEqualTo("02:20");
    }

    @Test
    @DisplayName("[\"01:00\", \"08:00\", \"15:00\", \"15:04\", \"23:00\", \"23:59\"]  입력시 \"02:44\" 출력")
    void t2(){
        assertThat(new Solution().solution(new String[]{"01:00", "08:00", "15:00", "15:04", "23:00", "23:59"}))
                .isEqualTo("02:44");
    }

}