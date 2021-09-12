package step09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class turret {
	
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int repeat = Integer.parseInt(br.readLine());
 
		for(int i = 0; i < repeat; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
 
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			sb.append(tangent_point(x1, y1, r1, x2, y2, r2)).append('\n');
		}
		System.out.println(sb);
 
	}
 
 
	// 접점 개수 구하는 함수
	public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		// 중점간 거리 distance의 제곱
		int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
 
		// case 1 : 중점이 같으면서 반지름도 같을 경우(접점의 개수가 무한대일 경우)
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		
		// case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때 (접점이 없는 경우)
		else if(distance_pow > Math.pow(r1 + r2, 2)) {
			return 0;
		}
 
		// case 2-2 : 원 안에 원이 있으나 내접하지 않을 때 (접점이 없는 경우)
		else if(distance_pow < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		
		// case 3-1 : 내접할 때 (접점이 한 개인 경우)
		else if(distance_pow == Math.pow(r2 - r1, 2)) {
			return 1;
		}
        
		
		// case 3-2 : 외접할 때 (접점이 한 개인 경우)
		else if(distance_pow == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		
		else {
			return 2;
		}
		
	}

}
