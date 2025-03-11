package com.company.java016;

/*abstract과 interface의 공통점과 차이점
공통점: 자손객체를 통해서 코드를 수현
차이점: 주상화정도가 interface가 더 크다
abstract: 인스턴스변수, 인스턴스메서드 사용가능
interface: 상수, 앱스트랙메서드 

			Vehicle (run)
			↑			↑
MotorCycle(run)			 Car(run)


*/






interface Vehicle{public void run();}
class MotorCycle implements Vehicle{
   @Override public void run()
   {System.out.println("오토바이가 달립니다.");}
   public void helmet() {System.out.println("헬멧을 착용합니다");}
}
class Car implements Vehicle{
   @Override public void run()
   {System.out.println("자동차가 달립니다.");}
}
class Driver{
	void drive(Vehicle a) {
		a.run();
		if(a instanceof MotorCycle) { ((MotorCycle) a).helmet(); }
	}
}


//main
public class Repeat001_oop8_009 {
	public static void main(String[] args) {
		 Driver driver = new Driver();
	      
	      MotorCycle motorCycle = new MotorCycle();
	      Car car = new Car();
	      
	      driver.drive(car);//리턴값 메서드명(파라미터)
	      					//void drive(car)
	      					//void drive(motorCycle)
	      System.out.println("\n\n>>자동차가 고장나서 교통수단을 바꿉니다");

	      driver.drive(motorCycle);

	}//
}//
