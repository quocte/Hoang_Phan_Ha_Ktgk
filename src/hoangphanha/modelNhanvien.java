package Model;

public class modelNhanvien {
private int ID;
private String FullName;
protected int NamSinh;
private int phone;
String email;
private String Employee_Type;
int count =0;
public modelNhanvien(int iD, String fullName, int namSinh, int phone, String email, String employee_Type ) {
	ID = iD;
	FullName = fullName;
	NamSinh = namSinh;
	this.phone = phone;
	this.email= email;
	Employee_Type = employee_Type;

	
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	FullName = fullName;
}
public int getNamSinh() {
	return NamSinh;
}
public void setNamSinh(int namSinh) {
	NamSinh = namSinh;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getEmployee_Type() {
	return Employee_Type;
}
public void setEmployee_Type(String employee_Type) {
	Employee_Type = employee_Type;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	
	return "modelNhanvien [ID=" + ID + ", FullName=" + FullName + ", NamSinh=" + NamSinh + ", phone=" + phone
			+ ", email=" + email + ", Employee_Type=" + Employee_Type +"]";
}




}
