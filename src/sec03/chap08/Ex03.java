package sec03.chap08;

public class Ex03 {
    public static void main(String[] args) {
        //  이중 배열
        boolean[][] dblBoolAry = new boolean[3][3];

        int[][] dblIntAry = new int[][] {
                //  ⭐️ 요소 배열의 크기가 다를 수 있음
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
        };

        //  삼중 배열
        char[][][] trpChrAry = {
                {{'자', '축'}, {'인', '묘'}},
                {{'진', '사'}, {'오', '미'}},
                {{'신', '유'}, {'술', '해'}},
        };
    }
}
