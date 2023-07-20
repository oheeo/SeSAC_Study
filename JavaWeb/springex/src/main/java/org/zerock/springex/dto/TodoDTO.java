package org.zerock.springex.dto;

import lombok.*;
import org.zerock.springex.controller.formmater.LocalDateFormatter;

import java.time.LocalDate;

@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {
    
    private Long tno;
    
    private String title;
    
    private LocalDate dueDate;
    
    private boolean finished;
    
    private String writer;  // 새로 추가됨

    
}
