package com.bean.tri;

public class Triangle {
	double sideA=-1,sideB=-1,sideC=-1,area=-1,lenght=-1;
	boolean triangle;
	public double getsideA() {
		return sideA;
		
	}
	public void setsideA(double sideA) {
		this.sideA=sideA;
		
	}
	public double getsideB() {
		return sideB;
		
	}
	public void setsideB(double sideB) {
		this.sideB=sideB;
		
	}
	public double getsideC() {
		return sideC;
		
	}
	public void setsideC(double sideC) {
		this.sideC=sideC;
		
	}
	public double getarea() {
		double p=(sideA+sideB+sideC)/2.0;
		if(triangle)
			area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
		return area;
	}
	public void setarea(double area) {
		this.area=area;
	}
	public boolean isTriangle() {
	if(sideA<sideB+sideC&&sideB<sideA+sideC&&sideC<sideA+sideB)
		triangle=true;
		else
			triangle=false;
	return triangle;
	}
	public void setTriangle(boolean triangle) {
		this.triangle=triangle;
	}
	public double getlenght() {
		lenght=sideA+sideB+sideC;
		return lenght;
	}
	public void setlenght(double lenght){
		this.lenght=lenght;
		}
}
