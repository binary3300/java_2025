show databases;
use mbasic;
show tables;
desc emp;
select * from emp;
-- 1
select * from emp where deptno like 30 and sal not between 1000 and 2000;
-- 2
select * from emp where comm is null and mgr is not null and job in( 'MANAGER','CLERK') and ename not like '_L%';
-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
/*
◆1. order by + limit
select		필드1, 필드2
from		테이블명
where		조건식
order by	기준필드 [asc(1,2,3, 오름차순) | desc(3,2,1 내림차순)]
limit		몇개
*/
-- 1-1
select * from select_userinfo;
desc select_userinfo;
alter table select_userinfo change name name varchar(100) ;
delete from select_userinfo where no=6;
insert into select_userinfo  (name, age)  values ('third',66);

-- 1-2 정렬 
select * from select_userinfo;
select * from select_userinfo order by age desc; -- 내림차순
select * from select_userinfo order by age asc; -- 오름차순. 기본적으로 오름차순이다!

-- 나이많은 3명
select * from select_userinfo order by age desc limit 2;

-- no가 높은순으로 4명
select * from select_userinfo order by no desc limit 4;
-- no가 두번째로 높은순으로 2명 limit 어디서부터 몇개 가능..
select * from select_userinfo order by no desc limit 2; -- 6, 5

select * from select_userinfo order by no desc limit 0, 2; -- 6, 5  limit 0개 건너뛰고 2개만;
select * from select_userinfo order by no desc limit 1, 2; -- 5, 4

-- 1-3 연습문제 
desc select_emp;
select * from select_emp;
-- 2)
select * from select_emp where job like 'SALESMAN';
-- 3)
select ename, mgr, sal from select_emp; 
-- 4)
select ename, mgr, sal from select_emp where job like 'SALESMAN'; 
-- 5)
select * from select_emp order by sal desc;
-- 6) 오름차순 내림차순 기준이 두개는 , 로
select * from select_emp order by job asc, sal desc;
-- 7) 별명 짓는거 깜빡했다 별명 지은거는 원본이름도 별명도 다 사용가능하다 
select ename, sal, empno `select_empno` from select_emp where sal>2000 order by empno desc;
-- 8)
select distinct job from select_emp ;
-- 9)
select empno as`사원번호`, ename `이름`, job `담당 업무` from select_emp;
-- 10)
select * from select_emp order by sal asc;
-- 11) 
select * from select_emp order by sal desc;
-- 12)
select * from select_emp order by dept asc, sal desc;
-- 13) 기준이 dept말고 또 뭐임?
-- select * from select_emp order by dept desc;
-- | select_empLOYEE_NO | select_empLOYEE_NAME | JOB       | MANAGER | HIREDATE   | SALARY | COMMISSION | DEPARTMENT_NO |
select empno `select_empLOYEE_NO`, ename`select_empLOYEE_NAME`, job `JOB`, mgr `MANAGER`, hiredate`HIREDATE`, sal`SALARY`, comm`COMMISSION`, dept`DEPARTMENT_NO`
from select_emp
order by dept desc, ename asc;

# ◆3.

