show databases;
use mbasic;
desc emp;
select * from emp;

-- [1] 오류나고 헷갈려서 어제 한거 참고했다 
select deptno,job, avg(sal)`평균급여` from emp where sal<=3000 group by deptno, job  having avg(sal)>=2000 order by deptno;

-- [2]
select deptno, job, count(job)`사원수`, max(sal)`최고급여`, sum(sal)`급여합`, avg(sal)`평균급여` from emp group by  deptno, job order by deptno;