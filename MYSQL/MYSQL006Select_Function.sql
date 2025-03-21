show databases;
use mbasic;
desc emp;
select * from emp;

-- [1] 오류나고 헷갈려서 어제 한거 참고했다 
select deptno,job, avg(sal)`평균급여` from emp where sal<=3000 group by deptno, job  having avg(sal)>=2000 order by deptno;

-- [2]
select deptno, job, count(job)`사원수`, max(sal)`최고급여`, sum(sal)`급여합`, avg(sal)`평균급여` from emp group by  deptno, job order by deptno;

# ◆ function
#1 Number
#2 String
#3 Date
#4 if / case

-- #1 Number (ceil 올림, floor 내림, round 반올림, mod나머지) 
-- 			2				1					2				1
select ceil(1.1)'올림', floor(1.9)`버림`, round(1.5)`반올림`, mod(10,3)`나머지`;

-- 연습문제 1
select round(123.4578,4)`123.4578`, round(123.4578)`ROUND 1`, round(123.4578,-1)`ROUND 2`, round(123.4578,1)`ROUND 3`,round(123.4578,2)`ROUND 4`;

-- 연습문제 2
select round(123.4578,4)`123.4578`, ceil(123.4578)`CEIL`, floor(123.4578)`FLOOR`;








-- ------------------------------------------------------------------------------
-- #2 String
-- ------------------------------------------------------------------------------
-- 2-1 basic
-- 1) lenght('문자열'); 갯수
select length('abc');

-- 2) upper/ lower 
select 'abc', upper('abc'), lower('abc');

-- 3) instr 
select instr('abc', 'b') `b의 위치. 0부터가 아니라 1부터 시작한다!!`, instr('abc', 'ab')`ab의 위치`, instr('abc', 'ac')`ac의 위치`;

-- 4) left('문자열', 몇개), right, substr(문자열, 시작, 몇개) 문자열 일부분 
select left('abc',1), left('abc', 2), right('abc', 1),right('abc', 2); -- a ab c bc
select substr('abcde', 2, 2)`bc`, substr('abcde', 2, 3)`cde`, substr('abcde', 1, 3)`abc`;

-- 5) 문자열연결 concat(문자열1, 문자열2);
select concat('hello', 'mysql');

-- 6) trim
select trim(' a b c ')`a b c`;

select concat( '#', trim('   a b c   '), '#' ) `#a b c#`
	,  concat( '#', ltrim('   a b c   '), '#' ) `#a b c   #`
	,  concat( '#', rtrim('   a b c  '), '#' ) `#   a b c#` ; 


-- 7) repalce (문자열, 찾고싶은거, 바꿀거);
select replace("Hello sally",'sally','lulu')`hello lulu`;

-- 8) repeat('뭐를', 몇번);
#select repeat('*', 5);

-- 9) 빈칸 채우기  lpad, rpad
select lpad('abc', 10, '#'), rpad('abc', 10, '#');




-- 1) lenght('문자열'); 갯수
-- 2) upper('대문자로 출력하고싶은 문자열')/ lower('소문자로 출력하고싶은 문자열') ;
-- 3) instr ('문자열', '찾을 문자열'); 몇번째에 있는지 위치를 알려준다. 못찾으면 0 
-- 4) left('문자열', 몇개), right, substr(문자열, 시작, 몇개) 문자열 일부분
-- 5) concat 문자열연결 (문자열1, 문자열2, 3,4,5,,,,);
-- 6) trim 좌우 공백 자르기 
-- 7) repalce (문자열, 찾고싶은거, 바꿀거);
-- 8) repeat('뭐를', 몇번);
-- 9) lpad, rpad 빈칸 채우기  

-- 연습문제 
select * from userinfo;
create table fn_select_userinfo2 select * from userinfo;
select * from fn_select_userinfo2;
desc fn_select_userinfo2;
alter table fn_select_userinfo2 drop sex, drop kor, drop eng, drop math, drop ban, drop sns;
alter table fn_select_userinfo2 add age int , add email varchar(20);
-- delete from fn_select_userinfo2;
set sql_safe_updates=1;
insert into fn_select_userinfo2 values(1, 'aaa', 11, 'aaa@gmail.com');
insert into fn_select_userinfo2 values(2, 'bbb', 22, 'bbb@gmail.com');
insert into fn_select_userinfo2 values(3, 'ccc', 33, 'ccc@gmail.com');
insert into fn_select_userinfo2 values(4, 'ddd', 44, 'ddd@gmail.com');
insert into fn_select_userinfo2 values(5, 'abc', 55, 'abc@gmail.com');
insert into fn_select_userinfo2 values(6, 'bca', 66, 'bca@gmail.com');
-- 준비 아~~놔 다쓸어버린다 

-- 1
select name`이름`, length(name)`갯수` from fn_select_userinfo2 ;

-- 2
select name, left(name, 1)`첫번째글자`,right(name, 1)`마지막글자` from fn_select_userinfo2 ;

-- 3
select name, replace(name, 'aaa', 'aaa 1등') from  fn_select_userinfo2;

-- 4
select rpad(name, 12, '는 개발자입니다.') from fn_select_userinfo2;
select concat(name, '는 개발자입니다') from fn_select_userinfo2;

-- 5, 6
select upper(name), lower(name) from fn_select_userinfo2;

-- 7 
select name, instr(name, 'b') from fn_select_userinfo2 where age >40;

-- 8
select name, instr(name,'b') from fn_select_userinfo2 where age >40 order by age desc limit 2 ;

-- 9
select name, left(name,1), right(name,1) from fn_select_userinfo2;
select name, replace(name, left(name,1) , '*') from fn_select_userinfo2;
select concat(left(name,1),right(name,1)) from fn_select_userinfo2;

select name, concat(left(name,1), '*', right(name,1) )`test` from fn_select_userinfo2;

-- 10 테이블 복사해야하는데 9번에서 막혀서 시간없어서 못함. 답만 적음. 
-- select name, concat( left(name,1), repeat('*', length(name)-2), right(name,1) )`test`
-- from fn_select_userinfo2;





-- ------------------------------------------------------------------------------
-- #3 date
-- ------------------------------------------------------------------------------
-- 1) 시스템의 현재 시각 조회
select now(); -- 2025-03-21 11:58:41
select current_time(); -- 11:59:18

-- 2) 요일 (0=Mon, 1=tue, ~~ 6=Sun)
select weekday(now());	-- 4 금요일 
select weekday("2025-03-21"); -- 4 금요일

-- 3) 날짜형식 date_format (날짜지정, '%Y - %m - %d')
select date_format("2025-03-21", '%Y - %m - %d');
select date_format(now(), '%Y - %m - %d  %H:%i:%s'); -- 2025 - 03 - 21  12:03:58

-- 4) 100일 전/후		data_add 
select date_add(now(), interval -10 day); -- 2025-03-11 12:05:34
select date_add(now(), interval 10 day); -- 2025-03-31 12:05:56
select date_add(now(), interval -3 day); -- 2025-03-18 12:06:12

-- 5) datediff(날짜1, 날짜2) 며칠차이인지...
select datediff('2025-03-22', '2025-03-21');
select datediff('1997-09-13', '2025-03-21'); -- 우와 만일
select timestampdiff(hour, '2025-03-22', '2025-03-21'); -- -24

-- Date 연습문제
-- 준비...
desc date_userinfo;
select * from date_userinfo;
create table date_userinfo select * from userinfo;
-- delete from date_userinfo;
set sql_safe_updates=1;
alter table date_userinfo drop sex, drop kor, drop eng, drop math, drop ban, drop sns;
alter table date_userinfo change date date datetime default current_timestamp;

insert into date_userinfo values(1, 'aaa', 11, '2022-12-30 00:00:00');
insert into date_userinfo values(2, 'bbb', 22, '2022-11-30 00:00:00');
insert into date_userinfo values(3, 'ccc', 33, '2022-10-30 00:00:00');
insert into date_userinfo values(4, 'ddd', 44, '2022-09-30 00:00:00');

-- 1 2022-11-01이전에 회원가입한 유저 데이터 조회
-- 모루게쏘요  select name, date<'2022-11-01 00:00:00' from date_userinfo;
select name, date from date_userinfo where date < '2022-11-01';

-- 2 12월달에 회원가입한 유저에게 30일 연장이벤트 
select name, date, date_add(date, interval 30 day)`event`
from date_userinfo
where date>= '2022-12-1' and date <='2022-12-31';

select name, date, date_add(date, interval 30 day)`event`
from date_userinfo
where month(date)=12;

-- 3 유저의 가입날짜 조회
select name, date_format(date, '%y년 %m월 %d일')`가입날짜`
from date_userinfo;

-- 4 번외문제,,,,,
select now();






-- ------------------------------------------------------------------------------
-- #4 if / case
-- ------------------------------------------------------------------------------
-- if(조건, 참, 거짓)
-- 다형식 
/*  case
	when	조건1	then	상태1
	when	조건2	then	상태2
    else	모든 조건에 해당하지 않을때. 생략가능
	end
*/

create table control(no int);
insert into control values (1), (2), (3);
desc control;
select * from control;

-- 1-1
select no, if(no=1, '1이다', '1이 아니다')`상태` from control;

-- 1-2
select no, if(no>1, '1보다 크다', '1보다 작다')`싱태` from control;

-- 1-3	case	when/then			end
select no, case
				when no=1 then '1이다'
				when no=2 then '2이다'
                when no=3 then '3이다'
                else '1,2,3이 아니다'
			end `state`
from control;

-- 1-4 2이다, 크다, 작다 
select no, case 
			when no>2 then '크다'
            when no=2 then '2이다'
            when no<3 then '작다'
			end `state`
from control;


-- 연습문제 준비~~!!!!
create table if_userinfo select * from userinfo;
desc if_userinfo;
select * from if_userinfo;
alter table if_userinfo drop kor, drop eng, drop math, drop ban;
alter table if_userinfo change no no int not null primary key auto_increment;
alter table if_userinfo change name name varchar(100);
alter table if_userinfo change age age int default 0 ;
alter table if_userinfo change sex sex char(1);
alter table if_userinfo change sns sns char(1) default null;

update if_userinfo set sns='n' where no=1;
update if_userinfo set age=122, sex='m' where no=2;
update if_userinfo set sex='m' where no=3;
update if_userinfo set sex='f', sns='n' where no=4;
update if_userinfo set name='fifth', age=55, sex='f', sns='y'where no=5;
insert into if_userinfo value(6, 'sixth', 66, 'm', 'n');

-- 1 
select *, if(sns='y', '수신유지','수신거부')`수신여부상태` from if_userinfo ;

-- 2
select *, if(age<19,'미성년자' ,'성인')`성인여부` from if_userinfo;

-- 3 어렵군....
-- select if(sns='n', , ) from if_userinfo;
select sum( if(sns='n', 1,0) ) `sns수신거부수` from if_userinfo;
select count(if(sns='n', 1,null)) from if_userinfo;

-- case연습문제 1
select ename, deptno, case deptno
when 10 then 'ACCOUNTING'
when 20 then 'RESERCH'
when 30 then 'SALES'
end `부서이름`
from if_userinfo;

-- case연습문제 2
select ename, job, case job
when 'CLERK' then '판매원'
when 'SALESMAN' then '영업사원'
else '사원'
end`job2`
from emp;
