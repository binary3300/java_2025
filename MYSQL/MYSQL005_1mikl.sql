 use mbasic;
 
 
create table milk_order(
ono int not null auto_increment primary key,
oname varchar(20) not null,
onum int not null,
odata datetime default now(),
oip varchar(100) not null
);
desc milk_order;
select * from milk_order;

-- 1 milk_order 값 삽입  insert 구문 완성 (oname, onum, oip) 'white',2,'127.0.0.1'
insert into milk_order (oname, onum, oip) values ('white',2,'127.0.0.1');

-- 2 milk_order no가 1인 데이터 조회 

-- 3 milk_order 전체데이터 조회 

-- 4 milk_order 해당본호의 이름과 갯수 수정 

-- 5 milk_order 해당번호 데이터 삭제 



