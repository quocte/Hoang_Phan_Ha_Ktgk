package Model;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	QuanLiNhanVien q = new QuanLiNhanVien();
	
	
	int choose = 0;
	do {
		System.out.println("--------------------------------Menu-------------------------------");
		System.out.println("1.Thêm Nhan Viên");
		System.out.println("2. Xuất sinh vien");
		System.out.println("3. Sắp xếp tăng theo năm sinh");
		Scanner sc = new Scanner(System.in);
		 choose = sc.nextInt();
		switch (choose) {
		case 1: {
			System.out.println("------------thêm nhân viên------------");
			System.out.println("Nhập id");
			int id = sc.nextInt();
			String hoten=sc.nextLine();
			System.out.println("Nhập tên");
			 hoten = sc.nextLine();
			System.out.println("Nhap năm sinh");
			int namsinh = sc.nextInt();
			System.out.println("Nhap phone");
			int Phone = sc.nextInt();
			String email =sc.nextLine();
			System.out.println(" nhap email");
			 email =sc.nextLine();
			 System.out.println("Kiểu công việc");
			 String Employee_type = sc.nextLine();
			 
modelNhanvien m = new modelNhanvien(id, hoten, namsinh, Phone, email, Employee_type);	 
		q.themsv(m);
		break;
		}
		
		case 2:{
			System.out.println("Xuất Nhân viên");
			q.xuat();
			break;
		}case 3:{
			q.sapxeptângtheoanamsinh();
			q.xuat();
			
		}
		
		}

	}while(choose!=0);
	
	
}

}
