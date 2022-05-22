package LAB4_bai10;

import java.util.Scanner;

abstract class hocvien{
    protected String hoten,diachi;
    protected int loaiuutien, loaichuongtrinh,hocphi,sobuoi,dongiadh,dongialt;
 void nhapThongtin(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap ho ten hoc vien: ");
    hoten=  sc.nextLine();
    System.out.println("Nhap dia chi ho vien:");
    diachi= sc.nextLine();
    do{
    System.out.println("Loai uu tien:");
    loaiuutien= sc.nextInt();
    if(loaiuutien>2&& loaiuutien<1)
    System.out.println("Loai uu tien chi co the la 1 hoac 2");
    }while(loaiuutien >2 && loaiuutien < 1);
   do{
    System.out.println("Loai chuong trinh hoc: ");
    loaichuongtrinh= sc.nextInt();
    if(loaichuongtrinh >2 && loaichuongtrinh < 1)
    System.out.println("Loai chuong trinh chi co the la 1 hoac 2");
   }while(loaichuongtrinh >2 && loaichuongtrinh < 1);
   System.out.println("Nhao so buoi hoc: ");
   sobuoi =sc.nextInt();
   System.out.println("Don gia hoc do hoa");
   dongiadh=sc.nextInt();
   System.out.println("Don gia hoc lap trinh");
   dongialt= sc.nextInt();
 }
 public abstract void inPhi();
 void inttHocvien(){
     System.out.println("Ho va ten: "+hoten+"\nDia chi"+diachi+"\nLoai uu tien:"+loaiuutien+"\nLoai chuong trinh"+loaichuongtrinh);
 }
}