package ru.practicum.ewm.dto.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchEventParamsAdmin {
    private List<Long> users;
    private List<String> states;
    private List<Long> categories;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime rangeStart;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime rangeEnd;
    @PositiveOrZero
    @Builder.Default
    private Integer from = 0;
    @Positive
    @Builder.Default
    private Integer size = 10;
}