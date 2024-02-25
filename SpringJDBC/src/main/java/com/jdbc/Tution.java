package com.jdbc;

public class Tution {
private int tId;
private String tName;
private String tType;
private long Phno;
public int gettId() {
	return tId;
}
public void settId(int tId) {
	this.tId = tId;
}
public String gettName() {
	return tName;
}
public void settName(String tName) {
	this.tName = tName;
}
public String gettType() {
	return tType;
}
public void settType(String tType) {
	this.tType = tType;
}
public long getPhno() {
	return Phno;
}
public void setPhno(long phno) {
	Phno = phno;
}
@Override
public String toString() {
	return "Tution [Id=" + tId + ", TutionName=" + tName + ", Stream=" + tType + ", Ph.no=" + Phno + "]";
}


}
