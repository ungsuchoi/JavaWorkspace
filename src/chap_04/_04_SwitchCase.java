package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        /* Switch case 문을 이용
        switch ( expression) {
            case A: ...수행할 명령...
                break;
            case B: ...수행할 명령...
                break;
            default ...수행할 명령...
        }
         */
        int ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("전액");
                break;
            case 2:
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("대상 아님ㅇㅇ?");
        }
        System.out.println("조회 끝");

        // 중고 상품 등급에 따른 가격 책정 (1 ~ 4)
        int grade = 1; // 등급
        int price = 5000; // 기본 가격
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격" + price + "원");
    }
}
