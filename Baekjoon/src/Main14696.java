import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main14696 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// ���� Ƚ�� �Է¹ޱ�
		int T = Integer.parseInt(br.readLine());

		// ���� �� ��ŭ A�� B�� �Է°��� �ޱ�
		for (int t = 0; t < T; t++) {

			// A�� �Էư��� �ޱ�
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int[] Aarr = new int[5];
			for (int i = 0; i < A; i++) {
				Aarr[Integer.parseInt(st.nextToken())]++;
			}

			// B�� �Է°��� �ޱ�
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int B = Integer.parseInt(st2.nextToken());
			int[] Barr = new int[5];
			for (int i = 0; i < B; i++) {
				Barr[Integer.parseInt(st2.nextToken())]++;
			}
			// ���� �ε����� �ش��ϴ� �� ���غ���
			if (Aarr[4] != Barr[4]) {
				if (Aarr[4] > Barr[4])
					bw.write("A");
				else
					bw.write("B");
			} else if (Aarr[3] != Barr[3]) {
				if (Aarr[3] > Barr[3])
					bw.write("A");
				else
					bw.write("B");
			} else if (Aarr[2] != Barr[2]) {
				if (Aarr[2] > Barr[2])
					bw.write("A");
				else
					bw.write("B");
			} else if (Aarr[1] != Barr[1]) {
				if (Aarr[1] > Barr[1])
					bw.write("A");
				else
					bw.write("B");
			} else {
				bw.write("D");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
