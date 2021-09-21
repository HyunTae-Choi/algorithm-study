package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CoordinateCompression {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		int[] sortNums = nums.clone();
		Arrays.sort(sortNums);

		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for (int n : sortNums) {
			if (!map.containsKey(n)) {
				map.put(n, idx++);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int n : nums) {
			sb.append(map.get(n)).append(' ');
        }

        System.out.println(sb);
	}

}