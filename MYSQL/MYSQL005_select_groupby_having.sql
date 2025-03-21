show databases;
use mbasic;
show tables;
desc userinfo;
alter table userinfo change name name varchar(20) not null;
alter table userinfo add sex char(2);
alter table userinfo add kor int;
alter table userinfo add eng int;
alter table userinfo add math int;
alter table userinfo add ban char(2);
alter table userinfo add sns char(2) default 'y'; #여기는 새롭다 잘봐라 디폴트 

select * from userinfo;
insert into userinfo  (sex, kor, eng, math, ban, sns)  values (null, 100, 100, 99, 'A', 'n');
set sql_safe_updates=1;
update userinfo set name=2 where sex='m' and kor=89 and eng=92 and math=78 and ban='B';
-- 다꺼져



/*
select		필드1, 필드2
from		테이블명
where		조건식
group by	그룹핑
having		조건식 
order by	기준필드 [asc(1,2,3, 오름차순) | desc(3,2,1 내림차순)]
limit		몇개

!집계함수!
avg(컬럼 평) 평균 / max최댓값/ min최솟값/ sum 합계/ count 갯수 
*/





use mbasic;
drop table group_userinfo;
CREATE TABLE group_userinfo ( 
  no int not null auto_increment primary key ,  
  name varchar(20) not null , 
  age int not null ,  
  sex char(2) , 
  kor int , 
  eng int, 
  math int, 
  ban char(2),
  sns char(2) default 'y'
);
select * from group_userinfo;
desc group_userinfo;
insert into  group_userinfo (name, age , sns , kor , eng, math , ban) values ('first' , 11 , 'n' , 100 , 100 , 99 , 'A');
insert into  group_userinfo (name, age, sex , kor , eng, math , ban) values ('second' , 22 , 'm' , 89 , 92 , 78 , 'B');
insert into  group_userinfo (name, age, sex , kor , eng, math , ban) values ('third', 33 , 'm' , 90, 92,97,'A');
insert into  group_userinfo (name, age, sex , sns , kor , eng, math , ban) values ('fourth' , 44 , 'f' , 'n' , 40,42,67 , 'C');
insert into  group_userinfo (name, age, sex , kor , eng, math , ban) values ('fifth', 55 , 'f' , 89 , 86 , 99 , 'B');
insert into  group_userinfo (name, age, sex, sns , kor , eng, math , ban) values ('sixth', 66 , 'm', 'n' , 10,20,44 , 'C');

-- 2-2 기본 
select * from group_userinfo group by ban; -- 1 
select  @@sql_mode; -- 2
set  SESSION  sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
select * from group_userinfo;
select * from group_userinfo group by ban; -- 4

-- 나이평균 
select avg(age) from group_userinfo;

-- 반별 몇명있는지
select ban, count(*) from group_userinfo group by ban;

-- 반별 국어 영어 수학 총점 확인
select ban, sum(kor)`국어총합`, sum(eng)`영어총합`, sum(math)`수학총합` from group_userinfo; -- a반만 나온다 
select ban, sum(kor)`국어총합`, sum(eng)`영어총합`, sum(math)`수학총합` from group_userinfo group by ban; 

-- 반별 국영수의 평균 확인 
select ban, avg(kor)`국어 평균`, avg(eng)`영어 평균`, avg(math)`수학 평균` from group_userinfo group by ban;

-- 반별 나이 총합, 나이 평균 확인 
select ban, sum(age)`나이총합`, avg(age)`나이평균` from group_userinfo group by ban;
select ban, sum(age)`나이총합`, avg(age)`나이평균`, max(age)`최고나이`, min(age)`최저나이` from group_userinfo group by ban;

-- 반별 국영수의 평군 확인 후 '국어' 평균점수가 89이상인 데이터만 고르기. 
select ban, avg(kor)`국어평균`
from group_userinfo 
group by ban
having avg(kor) >= 89;

select ban, avg(kor)`국어평균`
from group_userinfo 
group by ban
having 국어평균 >= 89;

-- 반 별 나이의 총합과 나이 펼균 확인 후 그 중에서 나이의 평균이 35새 이상인 데이터 추출 후 평균나이의 내림차순으로 정렬하기.
select ban, sum(age)`나이총합`, avg(age)`나이평균`, max(age)`최고나이`, min(age)`최저나이`
from group_userinfo
group by ban
having 나이평균 >=35
order by 나이평균 desc;

## 연습문제~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
desc emp;
select * from emp;

-- 1
select sum(sal)`급여합계` from emp;

-- 2
select sum(comm)`추가수당` from emp;

-- 3 distinct 중복제거 
select sum(distinct sal), sum(all sal), sum(sal) from emp;

-- 4  count는 null을 세지않는다. 값이 있다면 다 걋수를 센다. 모든필드의 세로 갯수를 세고싶으면 *을 쓰면 된다. 
select count(*) `데이터 갯수` from emp;

-- 5 
select count( deptno ) from emp where deptno like 30;

-- 6
select count(distinct sal), count(all sal), count(sal) from emp;

-- 7
select count(comm)`추가수당을 받는 사원 수` from emp;

-- 8
select count(comm is not null)`추가수당을 받는 사원 수` from emp where comm is not null;

-- 9
select max(sal)`부서10 최대급여` from emp where deptno like 10;

-- 10
select min(sal)`부서10 최소급여` from emp where deptno like 10;

-- 11~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
select max(hiredate)`부서20 최근입사일` from emp where deptno like 20;

-- 12
select min(hiredate)`부서20 제일 오래된 입사일` from emp where deptno like 20;

-- 13 
select avg(sal)`부서30 평균급여` from emp where deptno like 30;

-- 14 
select avg(distinct sal) from emp where deptno like 30;

-- 15
select deptno, avg(sal)`평균급여` from emp group by deptno order by deptno asc ;

-- 16
select deptno, job, avg(sal) from emp group by deptno; #아진짜어캐함
select deptno, job, avg(sal) 
from emp 
group by deptno, job
order by deptno asc ;

-- 17
select deptno, job, avg(sal)`평균급여`
from emp
group by deptno, job
having avg(sal)>=2000
order by deptno asc ;

-- 18
select deptno, job, avg(sal)`평균급여`
from emp
group by deptno, job
having avg(sal)>=2000
order by deptno asc ;

select deptno, job, avg(sal)`평균급여`
from emp
where avg(sal) >=2000 ##이건 더 아래에 와야한다!
group by deptno, job
order by deptno asc ;

-- 19
select deptno, job, avg(sal)
from emp
where sal<=3000
group by deptno, job
having avg(sal) >=2000
order by deptno asc;

-- 20
select deptno, job, count(job), max(sal), sum(sal), avg(sal)
from emp
group by deptno, job
order by deptno, job;

