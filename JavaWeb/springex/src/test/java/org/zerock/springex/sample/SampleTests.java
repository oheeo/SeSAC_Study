package org.zerock.springex.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.springex.mapper.TimeMapper;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2
@ExtendWith(SpringExtension.class)
// JUnit5버전에서 'spring-test'를 이용하기 위한 설정

@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
// 스프링의 설정 정보를 로딩하기 위해 사용
// 현재 프로젝트의 경우 XML로 설정돼있기에 location 속성을 이용함 (Java의 경우 classes 속성)

public class SampleTests {

    @Autowired
    // 스프링에서 사용하는 의존성 주입 어노테이션
    // 해당 타입의 빈(Bean)이 존재하면 여기에 주입해 주기를 원한다는 의미

    private SampleService sampleService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void testService1() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }

    @Test
    public void testConnection() throws Exception {

        Connection connection = dataSource.getConnection();
        log.info(connection);
        Assertions.assertNotNull(connection);

        connection.close();

    }

}
