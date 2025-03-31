package spring001_di;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.company.ioctest.Calc;

//1 Spring ioc 컨테이너 생성
//2 경로 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextCinfiguration(locations = "classpath:config/beans002.xml")
public class JunitTest002 {
	@Autowired ApplicationContext context;
			// ApplicationContext / bean 등록, 생성, 조회, 반환관리 
	//@Autowired - 객체를 있는지 검사하고 있다면 자동연결 

	@Test 
	//@Ignore
	public void test1() {
		Calc calc1 = context.getBean("rect",Calc.class);
		Calc calc2 = (Calc)context.getBean("tri");
		MyArea myArea = context.getBean("myArea",MyArea.class);
		// 사용방법: assertEquals("예상값","처리할값");
		assertEquals("lulu>15.0",myArea.mycalc(10,3));
	
	}
	@Ignore
	public void test2() {
		MyArea area1 = context.getBean("myArea",MyArea.class);
		MyArea area2 = context.getBean("myArea",MyArea.class);
		//사용방법2: assertSame (area1, area2)
		//
		assertSame(area1, area2);
		
	}

}
