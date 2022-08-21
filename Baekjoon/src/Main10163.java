import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main10163 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// ������ ���� �ޱ�
		int T = Integer.parseInt(br.readLine());

		// �迭 �����
		int[][] arr = new int[1001][1001];

		// ������ ���� ��ŭ ��ġ �ޱ�
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int start = Integer.parseInt(st.nextToken());
			int start1 = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());

			// ������ �κ� 0���� �켱 ä���
			// �������ִ� �� �ش� ���ڷ� ä���
			for (int i = start; i < start + w; i++) {
				for (int j = start1; j < start1 + h; j++) {
					arr[i][j] = t;
				}
			}
		}
		// ������ ������� � �����ϰ� �ִ��� ���
		for (int z = 1; z <= T; z++) {
			int cnt = 0;
			for (int i = 0; i < 1001; i++) {
				for (int j = 0; j < 1001; j++) {
					if (arr[i][j] == z) {
						cnt++;
					}
				}
			}
			bw.write(cnt + "");
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}