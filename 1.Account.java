package THB2bai1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account{
private long soTK;
private String tenTK;
private double soTienTrongTK;
private String trangThai;
 
Scanner sc = new Scanner(System.in);
public Account(){
    this.soTK = 999999;
    this.tenTK = null;
    this.soTienTrongTK = 50;

}
public Account(long soTK, String tenTK, double soTienTrongTK, String trangThai){
    this.soTK = soTK;
    this.tenTK = tenTK;
    this.soTienTrongTK = soTienTrongTK;
    this.trangThai = trangThai;
}
public long getSoTK(){
    return soTK;
}
public void setSoTK(long soTK){
    if(soTK > 0 & soTK !=999999){
        this.soTK = soTK ;
}
else{
    this.soTK = 999999;
    System.out.println("So tai khoan khong hop le ");
}
}
public String getTenTK(){
    return tenTK;   
}
public void setTenTK(String tenTK){
    if(tenTK != null){
        this.tenTK = tenTK;
       }
       else{
        this.tenTK = null;
        System.out.println("Ten tai khoang khong hop le");
       }
    }
public double getSoTienTrongTK(){
    return soTienTrongTK;
}
public void setSoTienTrongTK(double soTienTrongTK){
    if(soTienTrongTK >= 50){
        this.soTienTrongTK = soTienTrongTK;
       }
       else{
        this.soTienTrongTK = 50;
        System.out.println("So tien khong hop le");
       }
    }
public String getTrangThai(){
    return trangThai;
}
public void setTrangThai(String trangThai){
    this.trangThai = trangThai;
}
@Override
public String toString(){
    return "Account [sotk=" + soTK + ", tentk=" + tenTK + ", sotien=" + soTienTrongTK + ", trangThai=" + trangThai + "]";
}
public Account(long sotk, String tentk){
    this.soTienTrongTK = 50;
}
public double napTien(){
    double nap;
    System.out.print("Nhap so tien ban can nap: ");
    nap = sc.nextDouble();
    if(nap >=0){
        soTienTrongTK = nap + soTienTrongTK;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(nap);
        System.out.println("ban vua nap" + str1 +"vao tai khoan.");

    } else{
        System.out.println("So tien nap vao khong hop le!");
    }
    return nap;
}
public double rutTien(){
    double phi = 5;
    double rut;
    System.out.print("Nhap so tien ban can rut: ");
    rut = sc.nextDouble();
    if(rut <= (soTienTrongTK - phi)){
        soTienTrongTK = soTienTrongTK - (rut + phi);
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(rut);
        System.out.println("Ban vua rut " + str1 + "Đ tu tai khoan. Phi là $5.");
    } else{
        System.out.println("So tien muon rut khong hop le!");
        return rutTien();
    }
    return rut;
}
public double daoHan(){
    double laiSuat = 0.035;
    soTienTrongTK = soTienTrongTK + soTienTrongTK * laiSuat;
    NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
    String str1 = currencyEN.format(soTienTrongTK);
    System.out.println("Ban vua duoc " + str1 + " tu dao han 1 thang");
    return soTienTrongTK;
}
void inTK(){
    NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
    String str1 = currencyEN.format(soTienTrongTK);
    System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, str1);
}
}

