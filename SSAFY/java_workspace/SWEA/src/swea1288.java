
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class swea1288 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int N = sc.nextInt();
			int count = 1;
			Set<Integer> numbers = new HashSet<>();
			// 9까지 담을 수 있는 set을 만듬. 중복된 숫자가 들어가도 자동 삭제
			while (numbers.size() == 10) {				
				// 곱해서 나온 숫자를 한개씩 나눠야함.
				int tmp = N * count;
				// 1. tmp를 나누는 방법 나눠서 몫을 출력하여 set에 넣기
				
				
				
				
			System.out.println("#" + t + " " );
		}

	}

}
