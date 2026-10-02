public class TimTuDaiNhat {
    public static void main(String[] args) {
        String cau = "hoc lap trinh tai CodeGym";
        String[] tu = cau.split(" ");
        String tuDaiNhat = tu[0];
        for (String s : tu) {
            if (s.length()>tuDaiNhat.length()) {
                tuDaiNhat=s;
            }
        }
        System.out.println("Từ dài nhất: "+tuDaiNhat);
        System.out.println("Độ dài: "+tuDaiNhat.length());
    }
}
