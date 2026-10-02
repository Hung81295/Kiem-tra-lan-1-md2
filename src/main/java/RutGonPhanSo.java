public class RutGonPhanSo {
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
            int a=15;
            int b=35;
            int ucln=ucln(a,b);
            int tuSoMoi=a/ucln;
            int mauSOMoi=b/ucln;
        System.out.println(" Phân số ban đầu "+a+"/"+b+" sau khi rút gọn "+tuSoMoi+"/"+mauSOMoi);
    }
}
