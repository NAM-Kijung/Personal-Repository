import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main8320 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		// 1�ٺ��� n�ٷ� ������ ���
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = i; i*j <= N; j++) {
					cnt++;
			}
		}

		bw.write(cnt + "");
		bw.flush();
		br.close();
		bw.close();
	}
}

		/*
		ex) 20
		i*j �� N�� ���� ������ ���� �� �ִ� ��.
		1��(i)��
		1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		2��(i)��
		���� ����� ��ġ�� 2(j)���� ã��
		2 3 4 6 7 8 9 10
		3��(i)��
		���� ����� ��ġ�� 3(j)���� ã��
		3 4 5 6
		4��(i)��
		- 4(j)���� ã��
		4 5
		5(i)�ٷ�
		5(j)���� ã��
		����
		������ �����.
		*/

// ȸ�� �� ���̷��� �־��µ� �̰� �����ϱ� Ʋ������.....
//		int n = 0; //���ٷ� ���� �� �ִ� �� Ȯ��
//		for (int i = 1; i < N; i++) {
//			if (i*i >= N) {
//				n = i-1;
//				break;
//			}
//		}