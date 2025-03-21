show databases;
use mbasic;
desc milk;
select * from milk;
insert into milk values(1,'white',1000);
insert into milk values(2,'choco',1200);
insert into milk values(3,'banana',1800);
insert into milk values(4,'melon',5000);
#여러줄 실행은 컨트롤 쉬프트 엔터 

alter table milk drop mtotal;

update milk set mprice=1500 where mno=4;
delete from milk where mno=4 and mname='melon';
select * from milk;


##복습문제2

desc userinfo;
create table select_userinfo select * from userinfo;
-- 구조+데이터값만 복사했기때문에 프라이머리키나 자동증가는 따로 넣어줘야한다.
desc select_userinfo;
alter table select_userinfo change name name varchar(100) not null;
alter table select_userinfo change no no int not null primary key auto_increment;
select * from select_userinfo;

insert into select_userinfo  (name, age)  values ('first',55);
insert into select_userinfo  (name, age)  values ('third',66);

#2-2
-- 1 전체 데이터 검색
select * from select_userinfo;

-- 2 부분 검색
select name, age from select_userinfo;

-- 3 중복제거 "distinct" 
select distinct name from select_userinfo;

-- 4 별명 
select name as `이름`, age`나이` from select_userinfo;

-- 5 where 조건 (=같다, != <> 다르다, < <= > >= )
select * from select_userinfo where name='second';
select * from select_userinfo where name!='second';
select * from select_userinfo where name <> 'second';

select * from select_userinfo where age < 33;
select * from select_userinfo where age <= 33;

select * from select_userinfo where age > 33;
select * from select_userinfo where age >= 33;


-- 6 모든조건 and , between and // 조건중에 하나라도 or, in 
select * from select_userinfo where age>=22 and age<=33; 
select * from select_userinfo where age between 22 and 33; -- <=>=랑 between은 같다

select * from select_userinfo where age=22 or age=33;
select * from select_userinfo where age in(22,33);

desc select_userinfo;
-- 7 null 검색  
alter table select_userinfo change age age int;
select * from select_userinfo;
insert into select_userinfo (name) values ('seven');

## null은 값이 비어있다는 ""상태"" 값이 아니다. 상태다. is null, is not null // not in, not between 
select * from select_userinfo where age=null; -- 오류는 없지만 값은 안나온다. 빨간휴지 찾는 로봇한테 빈 휴지곽 준 꼴이다.

select * from select_userinfo where age is 	   null;
select * from select_userinfo where age is not null;


-- 아까 22살에서33살 사이를 찾는 구문. 부정하려면 <>를 막 바꿔야하는데 between, in 구문 앞에 not만 붙이면 훨씬 편하다 
select * from select_userinfo where age not between 22 and 33;
select * from select_userinfo where age not in(22,33);


-- 8 like 문자열 검색 (like 'a%' // '%a' // '%a%' // '_a%')
select * from select_userinfo where name ='first';
select * from select_userinfo where name like 'f%'; -- f로 시작하는 그거 찾아줘 
select * from select_userinfo where name like '%t'; -- t로 끝나는 어쩌구 찾아줘 
select * from select_userinfo where name like '%i%'; -- 중간에 i를 포함하는 뭔가 찾아줘 
select * from select_userinfo where name like '_e%'; -- 두번째 글자가 e였거든? 찾아줘 

# 연습문제 
create table select_emp select * from emp; -- 구조+데이터 복사! 
desc select_emp;
alter table select_emp change empno empno int not null primary key auto_increment;
alter table select_emp change deptno dept int;

-- 1
select * from select_emp;
-- 2
select * from select_emp where dept=30;
-- 3
select * from select_emp where dept=30 and job like 'SALESMAN';
-- 4
select * from select_emp where dept=30 or job like 'CLERK';
-- 5
select * from select_emp where sal*12=36000;
-- 6
select * from select_emp where sal>=3000;
-- 7
select * from select_emp where ename >='F%' and ename<='Z%'; 
select * from select_emp where ename >='F'; -- 쌤 하신방법  
-- 8
select * from select_emp where ename <='FORD';
-- 9
select * from select_emp where sal != 3000;
-- 10
select * from select_emp where sal <> 3000;
-- 11~~~~~~~~~~~~~~~~~~~~~~~~~~~~
select * from select_emp where sal not like 3000;
-- 12 
select * from select_emp where job = 'MANAGER'or job ='SALESMAN'or job ='CLERK';
-- 13
select * from select_emp where job in ('MANAGER', 'SALESMAN', 'CLERK');
-- 14 
select * from select_emp where job != 'MANAGER' and job <> 'SALESMAN' and job !='CLERK';
-- 15
select * from select_emp where job not in ('MANAGER', 'SALESMAN', 'CLERK');
-- 16
select * from select_emp where sal>=2000 and sal<=3000;
-- 17
select * from select_emp where sal between 2000 and 3000;
-- 18
select * from select_emp where sal not between 2000 and 3000;
-- 19
select * from select_emp where not(sal>=2000 and sal<=3000);
-- 20
select * from select_emp where empno like 7499 and dept like 30;
-- 21~~~~~~~~~~~~~~~~~~~~~~~~~
select * from select_emp where dept like 20 or job like 'SALESMAN';
-- 22
select * from select_emp where sal>=2500 and job like 'ANALYST';
-- 23
select * from select_emp where dept like 10 or dept like 20;
select * from select_emp where dept in(10,20);
-- 24
select * from select_emp where dept not in(10, 20);
-- 25
select * from select_emp where ename like 'S%';
-- 26 
select * from select_emp where ename like '_L%';
-- 27
select * from select_emp where ename like '%AM%';
-- 28
select * from select_emp where ename not like '%AM%';
-- 29 숫자+null 계산안됨,,
select ename as `사원이름`, sal`급여`, sal*12+comm`연봉` , comm`커미션` 
from select_emp 
where ename like '%AM%';
-- 30
select * from select_emp where comm=null;
select * from select_emp where comm is null;
	-- 29번과 마찬가지로 안됨~!! 
-- 31~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
select * from select_emp where comm is null;
-- 32
select * from select_emp where mgr is not null;
-- 33
select * from select_emp where sal > null;
	-- 어떤값인지 모르는 값에 == 나 > 같은 비교연산자를 사용할 수 없음.
	-- 아무것도 출력되지 않는다... null은 값이 없다는 의미를 나타내기때문에 비교연산자를 사용할수없기때문이다....,..
-- 34
select * from select_emp where sal > null or comm is null;
	-- null or true-> true 오류가 나는게 아니라면 의미없는 연산은 무시하고 뒤의 true를 실행한다...??? 
-- 35
select * from select_emp where ename like '%S';
-- 36
select * from select_emp where dept like 30 and job like 'SALESMAN';
select empno, ename, job, sal, dept from select_emp where dept like 30 and job like 'SALESMAN';
-- 37 집합연산자가 뭐지???
select * from select_emp where dept in (20, 30) and sal >2000;
select empno, ename, job, sal, dept
from select_emp
where dept in (20, 30) and sal >2000;
-- 38
select * from select_emp where not (sal >=2000 and sal <=3000);
select empno, ename, job, sal, dept from select_emp where not (sal >=2000 and sal <=3000);
select empno, ename, job, sal, dept from select_emp where sal < 2000 or sal >3000;
-- 39
select * from select_emp where dept like 30 and ename like '%E%' and sal not between 1000 and 2000;
select ename, job, sal, dept from select_emp where dept like 30 and ename like '%E%' and sal not between 1000 and 2000;
-- 40
select * from select_emp 
where comm is null 
and mgr is not null 
and job in('MANAGER','CLERK') 
and ename not like '_L%';


