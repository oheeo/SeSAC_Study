package org.zerock.springex.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    // 데이터베이스의 현재 시각을 문자열로 처리
    @Select("select now()")
    String getTime();
    
}
