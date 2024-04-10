package Model;

public class NhanVienFresh extends modelNhanvien implements InterFaceEmplayee {


private int Graduation_date;
private String Graduation_Rank;
private String Education;



public NhanVienFresh(int iD, String fullName, int namSinh, int phone, String email, String employee_Type,
		int graduation_date, String graduation_Rank, String education) {
	super(iD, fullName, namSinh, phone, email, employee_Type);
	Graduation_date = graduation_date;
	Graduation_Rank = graduation_Rank;
	Education = education;
}

public int getGraduation_date() {
	return Graduation_date;
}

public void setGraduation_date(int graduation_date) {
	Graduation_date = graduation_date;
}
public String getGraduation_Rank() {
	return Graduation_Rank;
}
public void setGraduation_Rank(String graduation_Rank) {
	Graduation_Rank = graduation_Rank;
}
public String getEducation() {
	return Education;
}
public void setEducation(String education) {
	Education = education;
}


@Override
public String Showinfo() {
	return "NhanVienFresh [Graduation_date=" + Graduation_date + ", Graduation_Rank=" + Graduation_Rank + ", Education="
			+ Education + ", NamSinh=" + NamSinh + ", getGraduation_date()=" + getGraduation_date()
			+ ", getGraduation_Rank()=" + getGraduation_Rank() + ", getEducation()=" + getEducation() + ", Showinfo()="
			+ Showinfo() + ", getID()=" + getID() + ", getFullName()=" + getFullName() + ", getNamSinh()="
			+ getNamSinh() + ", getPhone()=" + getPhone() + ", getEmployee_Type()=" + getEmployee_Type()
			+ ", getEmployee_count()=" + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}


}
