import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 변수 arr은 숫자가 들어있으면 show 메소드 호출시 아래와 같은 내용이 콘솔창에 표시된다.
 * -1,9,0,10,33,11,22,44,1000,3333,6665,43434,8111,99898,-111,2,111,66,-765,45454,5729
 * 라인 17 if문 안에 소스를 입력하여 show 메소드 호출시 아래와 같은 내용이 나오게 하시오(또는 다른 방식으로 적어도 생관없음)
 * -765,-111,-1,0,2,9,10,11,22,33,44,66,111,1000,3333,5729,6665,8111,43434,45454,99898
 */
public class Ex5 {
    public static void main(String[] args) {
        int[] arr = new int[] {-1, 9, 0, 10, 33, 11, 22, 44, 1000, 3333, 6665, 43434, 8111, 99898,-111, 2, 111, 66, -765, 45454, 5729};
        show(arr);

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < arr.length - i - 1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        show(arr);
    }

    public static void show(int[] arr) {
        System.out.println(Arrays.stream(arr).boxed().map(x -> String.valueOf(x)).collect(Collectors.joining(",")));
    }
}