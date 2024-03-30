package sec04.chap05;

public class Ex05 {
    public static void main(String[] args) {
        double avg = getAverage(3, 91, 14, 27, 4);

        //  💡 배열을 넣으면 자동으로 펼쳐져 인식됨
        int[] numbers = {3, 91, 14, 27, 4};
        double avgOfArr = getAverage(numbers);
    }

    //  💡 ... 연산자 : 해당 위치 뒤로 오는 연산자들을 배열로 묶음
    //  int[] (배열 자체를 받음)과는 다름!
    static double getAverage(int... nums) {
        double result = 0.0;
        for (int num : nums) {
            result += num;
        }
        return result / nums.length;
    }
}
