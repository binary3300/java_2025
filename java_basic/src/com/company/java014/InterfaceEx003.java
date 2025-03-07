package com.company.java014;
/* 1. 상속도
 * 
 * 			Vehicle
 * 		△			△
 * 		|			|
 * MotorCycle		Car
 * 		△			△
 * 		|			|
 * 			Driver
 * 이게 맞나
 * 
 * 컨트롤 알트 j = 한줄로 만들기
 */

interface Vehicle{public void run();}

class MotorCycle implements Vehicle{@Override public void run(){System.out.println("오토바이가 달립니다.");}}
class Car implements Vehicle{@Override public void run(){System.out.println("자동차가 달립니다.");}}

class Driver{
	//ver1
	//	void drive(Car car		){car.run();}
	//	void driver(MotorCycle mo){mo.run();}
	void drive(Vehicle v) {v.run();}
}

//main class
public class InterfaceEx003 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Car car = new Car();
		MotorCycle mo = new MotorCycle();
						  	//리턴값 메서드명(파라미터			  ){}
		driver.drive(car); 	//void	driver(Car car			  ){}
		driver.drive(mo); 	//void	driver(MotorCycle 		mo){}
							//void	driver(Vehicle 			 v){v.run();} @Override 자식메서드
		
	}//main
}//class
/*

------------------------------------------------------------------------------------------
[method: 정보] Vehicle.class, MotorCycle.class, Car.class, public interfaceEx003	//#1 설계도
------------------------------------------------------------------------------------------
[heap: 동적]							|	[stack: 지역]
										driver.drive(mo)	1번지.driver(Vehicle v){							v.run();}
																		1)Vehicle	v=car;부모=자식 의 형태		2)@Override 자식메서드 mo.run()
										
										driver.drive(car)	1번지.driver(Vehicle v){							v.run();}
																		1)Vehicle	v=car;부모=자식 의 형태		2)@Override 자식메서드 car.run()
3번지		MotorCycle{}			<-mo		3번지
2번지		Car{} 					<- car		2번지
1번지		Driver{} 				<- driver	1번지
									|	main //#2
------------------------------------------------------------------------------------------




 */
