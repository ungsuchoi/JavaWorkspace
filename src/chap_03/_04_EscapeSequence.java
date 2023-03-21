package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 언어 공통
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n 줄바꿈 \t 탭
        System.out.println("자바가\n너무\n재밌어요");

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java"); // 파일 경로 표현할 때 사용

        // 단비가 "냐옹" 이라고 했어요 \"
        System.out.println("단비가 \"냐옹\" 이라고 했어요.");

        char c = 'A';
        c = '\'';
        System.out.println(c);

    }
}
