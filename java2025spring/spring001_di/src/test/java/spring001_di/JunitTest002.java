package spring001_di;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.company.ioctest.Calc;

//1 Spring ioc �����̳� ����
//2 ��� 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextCinfiguration(locations = "classpath:config/beans002.xml")
public class JunitTest002 {
	@Autowired ApplicationContext context;
			// ApplicationContext / bean ���, ����, ��ȸ, ��ȯ���� 
	//@Autowired - ��ü�� �ִ��� �˻��ϰ� �ִٸ� �ڵ����� 

	@Test 
	//@Ignore
	public void test1() {
		Calc calc1 = context.getBean("rect",Calc.class);
		Calc calc2 = (Calc)context.getBean("tri");
		MyArea myArea = context.getBean("myArea",MyArea.class);
		// �����: assertEquals("����","ó���Ұ�");
		assertEquals("lulu>15.0",myArea.mycalc(10,3));
	
	}
	@Ignore
	public void test2() {
		MyArea area1 = context.getBean("myArea",MyArea.class);
		MyArea area2 = context.getBean("myArea",MyArea.class);
		//�����2: assertSame (area1, area2)
		//
		assertSame(area1, area2);
		
	}

}
