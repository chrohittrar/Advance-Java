package assignment4;

import java.sql.Date;

public class Employee implements Comparable<Employee> {
	
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private float sal;
	private int deptno;
	
	public Employee(int empno, String ename, String job, int mgr, Date hiredate, float sal, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", Job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", sal=" + sal + ", deptno=" + deptno + "]";
	}

	@Override
	public int compareTo(Employee obj) {
		// here diff between this and obj
		
		if(this.sal > obj.sal) {
			return -1;
		}
		else if(this.sal < obj.sal){
			return 1;
		}
		else {
			return this.empno - obj.empno;
		}
	}
	
	
	
	
}
