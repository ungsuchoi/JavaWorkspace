package chap_02;
// 키가 115cm 이므로 탑승 불가능
// 키가 121cm 이므로 탑승 가능
public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 115;
        String result = (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println("키가" + height + "cm 이므로 " + result);

        height = 121;
        result = (height >= 111) ? "탑승 가능" : "탑승 불가능";
        System.out.println("키가" + height + "cm 이므로 " + result);
    }
}
