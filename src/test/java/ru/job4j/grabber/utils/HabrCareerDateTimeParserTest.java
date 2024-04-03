package ru.job4j.grabber.utils;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;

class HabrCareerDateTimeParserTest {

    private static final DateTimeParser DATE_TIME_PARSER = new HabrCareerDateTimeParser();

    @Test
    void when20240401T182156() {
        String date = "2024-04-01T18:21:56+03:00";
        String expected = "2024-04-01T18:21:56";
        LocalDateTime formattedDate = DATE_TIME_PARSER.parse(date);
        assertThat(formattedDate).isEqualTo(expected);
    }

    @Test
    void when20111111T111111() {
        String date = "2011-11-11T11:11:11+02:00";
        String expected = "2011-11-11T11:11:11";
        LocalDateTime formattedDate = DATE_TIME_PARSER.parse(date);
        assertThat(formattedDate).isEqualTo(expected);
    }
}