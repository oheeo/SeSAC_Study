package org.zerock.springex.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor  // 원래는 이거 안 쓰는게 좋다. 그러나 여기선 @Builder 쓸 땐 필요하니까 쓰는거
@NoArgsConstructor
@Builder
public class TodoVO {

    private Long tno;
    private String title;
    private LocalDate dueDate;
    private String writer;
    private boolean finished;
}
