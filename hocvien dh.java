package LAB4_bai10;

public class hocviendh extends hocvien {
    public void inPhi(){
        if(loaichuongtrinh==1 && loaiuutien==1)
        {hocphi=sobuoi*dongiadh-1000000;
            System.out.println("Hoc phi :"+hocphi);}
          else if(loaichuongtrinh==1 && loaiuutien==2)
        {hocphi= sobuoi*dongiadh-800000;
            System.out.println("Hoc phi :"+hocphi);}
    }
    
}