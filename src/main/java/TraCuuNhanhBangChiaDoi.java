public class TraCuuNhanhBangChiaDoi {
    public static int binarySearch(int[] arr,int target){
        int trai=0;
         int phai=arr.length-1;
         while(trai<phai){
             int giua=(trai+phai)/2;
             if(arr[giua]==target){
                 return giua+1;
             }
             if(target>arr[giua]){
                 phai=giua+1;
             }else {
                 trai=giua-1;
             }
         }
         return -1;

    }

    public static void main(String[] args) {
            int [] arr={2, 5, 8, 12, 15, 20, 25};
            int target=12;
            int result=binarySearch(arr,target);
            if(result==-1){
                System.out.println("Không tìm thấy");
            }else{
                System.out.println("Vị trí: "+ result);
            }
    }
}
