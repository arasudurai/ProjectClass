package org.collections;

public abstract class C implements A,B {
	
	public  void employeeName(String name2) {
		System.out.println("employeename is:"+name2);

	}

	@Override
	public void industryId(int id) {
		this.employeeName("SGR");
		System.out.println("industryid is:"+id);
		
	}

	@Override
	public void industryName(String name) {
		this.industryId(10);
		System.out.println("industryname is:"+name);
		
	}

	@Override
	public void companyId(int id1) {
		this.industryName("IBM");
		System.out.println("companyid is:"+id1);
		
	}

	@Override
	public void companyName(String name1) {
		this.companyId(123);
		System.out.println("companyname is:"+name1);
	}
	
	

}
