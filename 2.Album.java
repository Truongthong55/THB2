package THB2bai2;

    public class Album {
        private int  maCD, soBH;
        private String tenCD;
        private float giaThanh;
    public Album(){
    this.maCD = 99999;
    this.tenCD = null;
    }
    public Album(int maCD, int soBH, String tenCD, float giaThanh){
        this.maCD = maCD;
            this.tenCD = tenCD;         
            this.soBH = soBH;
            this.giaThanh = giaThanh;
    }
    public int getMaCD(){
        return maCD;    
    }
    public void setMaCD(int maCD){
        this.maCD = maCD;
    }
    public int getSoBH(){
        return soBH;
    }
    public void setSoBH(int soBH){
        this.soBH = soBH;
    }
    public String getTenCD(){
        return tenCD;
    }
    public void setTenCD(String tenCD){
        this.tenCD = tenCD;
    }
    public float getGiaThanh(){
        return giaThanh;    
    }
    public void setGiaThanh(float giaThanh){
        this.giaThanh = giaThanh;
    }
    @Override
    public String toString() {
        return "Album{" +
                "maCD=" + maCD +", tenCD='" + tenCD +" soBH=" + soBH +", giaThanh=" + giaThanh +'}';
    }
    public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n", maCD, tenCD, soBH, giaThanh);
    }
    }

