package LAB4_bai10;

public class hocvienlt extends hocvien {
    public void inPhi(){
        if(loaichuongtrinh==2 && loaiuutien==1)
        {hocphi=sobuoi*dongialt-1000000;
        System.out.println("Hoc phi :"+hocphi);}
          else if(loaichuongtrinh==2 && loaiuutien==2)
        {hocphi= sobuoi*dongialt-800000;
        System.out.println("Hoc phi :"+hocphi);}
    }
}