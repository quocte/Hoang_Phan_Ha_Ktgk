package Model;

public class NhanVienExpenrience extends modelNhanvien implements InterFaceEmplayee  {
private int SoNamKinhNghiem;
private String ProSkill;



public NhanVienExpenrience(int iD, String fullName, int namSinh, int phone, String email, String employee_Type,
		int soNamKinhNghiem, String proSkill) {
	super(iD, fullName, namSinh, phone, email, employee_Type);
	SoNamKinhNghiem = soNamKinhNghiem;
	ProSkill = proSkill;
}



@Override
public String Showinfo() {
	return "NhanVienExpenrience [SoNamKinhNghiem=" + SoNamKinhNghiem + ", ProSkill=" + ProSkill + ", NamSinh=" + NamSinh
			+ ", getID()=" + getID() + ", getFullName()=" + getFullName() + ", getNamSinh()=" + getNamSinh()
			+ ", getPhone()=" + getPhone() + ", getEmployee_Type()=" + getEmployee_Type() + ", getEmployee_count()="
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}



}
