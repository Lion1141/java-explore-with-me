package ru.practicum.ewm.dto.compilation;

import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCompilationDto {
    private Long id;
    private Set<Long> events;
    private Boolean pinned;
    @Size(max = 50)
    private String title;
}
