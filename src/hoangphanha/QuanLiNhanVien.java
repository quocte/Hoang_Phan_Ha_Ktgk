package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLiNhanVien {
private ArrayList<modelNhanvien> Nv;

public QuanLiNhanVien(ArrayList<modelNhanvien> nv) {

	Nv = nv;
}
public QuanLiNhanVien() {
	this.Nv = new ArrayList<modelNhanvien>();
}
public void themsv(modelNhanvien md){
	this.Nv.add(md);	
}
public void xuat() {
	for (modelNhanvien modelNhanvien : Nv) {
		System.out.println(modelNhanvien);
	}
}
public void sapxeptângtheoanamsinh(){
    Collections.sort(this.Nv, new Comparator<modelNhanvien>() {
    	
        public int compare1(modelNhanvien o1, modelNhanvien o2) {
            if(o1.getNamSinh()>o2.getNamSinh()){
                return 1;
            }else if(o1.getNamSinh()< o2.getNamSinh()){
                return -1;
            }
            else {
                return 0;
            }
        }

		@Override
		public int compare(modelNhanvien o1, modelNhanvien o2) {
			// TODO Auto-generated method stub
			return 0;
		}
    });
}
}
