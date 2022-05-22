package LAB4_bai10;

public class main extends hocvien {
    public static void main(String[]args){
        hocviendh hai= new hocviendh();
        hai.nhapThongtin();
        hai.inttHocvien();
        hai.inPhi();
        hocvien son = new hocvienlt();
        son.nhapThongtin();
        son.inttHocvien();
        son.inPhi();
    }
}