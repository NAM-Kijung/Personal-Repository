import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2309 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//�迭�����
		int sum = 0;
		int[] arr = new int[9];
		for (int n = 0; n < 9; n++) {
			int N = Integer.parseInt(br.readLine());
			arr[n] = N;
			sum+=arr[n];
		}
		
		//���� �ΰ� �̰� ������ �� ���غ���
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 1; j < arr.length; j++) {
				
				if (sum - arr[i] - arr[j] == 100) {
					for (int n = 0; n < arr.length; n++) {
						if(arr[n] != arr[i] && arr[n] != arr[j]) {
							System.out.println(arr[n]);
						}
					}
				}
			}
		}
	}
}
