package org.example.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

public class ExceptionTest {

    @Test
    @DisplayName("normal Exception")
    void testException() {
        assertThatThrownBy(() -> { throw new Exception("boom!"); }).isInstanceOf(Exception.class)
                .hasMessageContaining("boom");
    }

    @Test
    @DisplayName("IOException")
    void IOException() {
        assertThatExceptionOfType(IOException.class).isThrownBy(() -> { throw new IOException("boom!");})
                .withMessage("%s!", "boom") // 이 메시지가 있어야 한다.
                .withMessageContaining("boom") // 이 메시지를 포함하고 있다.
                .withNoCause(); // 원인이 없다.
    }

    @Test
    @DisplayName("not Throw Exception")
    void notThrowException() {
        assertThatCode(() -> {
            String abc = "aa";
        }).doesNotThrowAnyException();
    }
}
