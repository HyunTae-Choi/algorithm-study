package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CowBugger {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int min = Math.min(B, Math.min(C, D));
		
		List<Integer> bugger = new ArrayList<Integer>();
		List<Integer> sideMenu = new ArrayList<Integer>();
		List<Integer> drink = new ArrayList<Integer>();
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			if(i == 0) {
				for(int x = 0; x < B; x++) {
					bugger.add(Integer.parseInt(st.nextToken()));
				}
			} else if(i == 1) {
				for(int x = 0; x < C; x++) {
					sideMenu.add(Integer.parseInt(st.nextToken()));
				}
			} else {
				for(int x = 0; x < D; x++) {
					drink.add(Integer.parseInt(st.nextToken()));
				}
			}
		}
		
		Collections.sort(bugger);
		Collections.reverse(bugger);
		Collections.sort(sideMenu);
		Collections.reverse(sideMenu);
		Collections.sort(drink);
		Collections.reverse(drink);
		int buggerSum = bugger.stream().mapToInt(Integer::intValue).sum();
		int sideMenuSum = sideMenu.stream().mapToInt(Integer::intValue).sum();
		int drinkSum = drink.stream().mapToInt(Integer::intValue).sum();
		int beforeSum = buggerSum + sideMenuSum + drinkSum;
		int sum = 0;
		for(int i = 0; i < min; i++) {
			buggerSum -= bugger.get(i);
			sideMenuSum -= sideMenu.get(i);
			drinkSum -= drink.get(i);
			sum += (bugger.get(i) + sideMenu.get(i) + drink.get(i)) * 0.9;
		}
		
		sum += buggerSum + sideMenuSum + drinkSum;
		System.out.println(beforeSum);
		System.out.println(sum);
		
	}

}