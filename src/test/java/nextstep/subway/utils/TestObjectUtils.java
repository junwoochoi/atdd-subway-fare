package nextstep.subway.utils;

import nextstep.subway.maps.line.domain.Line;
import nextstep.subway.maps.station.domain.Station;
import org.springframework.test.util.ReflectionTestUtils;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestObjectUtils {
    public static Station createStation(Long id, String name) {
        LocalDateTime now = LocalDateTime.now();
        Station station = new Station(name);
        ReflectionTestUtils.setField(station, "id", id);
        ReflectionTestUtils.setField(station, "createdDate", now);
        ReflectionTestUtils.setField(station, "modifiedDate", now);
        return station;
    }

    public static Line createLine(Long id, String name, String color, int fare) {
        Line line1 = new Line(name, color, LocalTime.of(5, 30), LocalTime.of(23, 30), 10, fare);
        ReflectionTestUtils.setField(line1, "id", id);
        return line1;
    }
}