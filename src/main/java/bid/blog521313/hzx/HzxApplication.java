package bid.blog521313.hzx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("bid.blog521313.hzx.module1.mapper")
public class HzxApplication {

	public static void main(String[] args) {
		SpringApplication.run(HzxApplication.class, args);
	}

}
