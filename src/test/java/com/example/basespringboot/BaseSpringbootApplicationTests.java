package com.example.basespringboot;

//import org.junit.jupiter.api.Test;
import com.example.basespringboot.service.TestService;
//import org.junit.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseSpringbootApplicationTests {

	@Autowired
	private TestService testService;

	@Test
	public void helloTest(){
		String re=testService.hello("tuzongxun");
		System.out.println(re);
	}

}
