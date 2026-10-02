import java.util.HashMap;
import java.util.Map;

public class KiemTraMonBanChay {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 5, 4, 7, 23, 4, 7, 35, 4, 6, 3, 7};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int oldValue = map.get(arr[i]);
                map.put(arr[i], oldValue + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int max = 0;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Số lần bán nhiều nhất: " + max);
        System.out.println("Món bán chạy nhất:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("Mã món: " + entry.getKey());
            }
        }
    }
}
