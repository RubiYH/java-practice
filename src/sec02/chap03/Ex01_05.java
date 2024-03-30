package sec02.chap03;

public class Ex01_05 {
    public static void main(String[] args) {
        byte _1b_byte = 1;
        short _2b_short = 2;
        int _4b_int = 3; // ⭐️ 일반적으로 널리 사용
        long _8b_long = 4;

        //  큰 자료형에 작은 자료형의 값을 넣을 수 있음
        //  💡 묵시적(암시적) 형변환
        _2b_short = _1b_byte;
        _4b_int = _1b_byte; _4b_int = _2b_short;
        _8b_long = _1b_byte; _8b_long = _2b_short; _8b_long = _4b_int;

        //  ⭐ int의 범위를 벗어나는 수에는 리터럴에도 명시 필요
        //  끝에 l 또는 L을 붙여 볼 것
        long _8b_long1 = 123456789123456789L;

        byte byteNum;
        int smallIntNum = 123;

        //  명시적(강제) 형변환
        //  - 개발자 : "내가 책임질테니까 그냥 넣으세요."
        byteNum = (byte) smallIntNum;

        int intNum = 12345;

        //  ⚠️ 강제로 범주 외의 값을 넣을 경우 값 손실
        byteNum = (byte) intNum; // 💡 12345 % 128


    }
}
