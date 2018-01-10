package manish.hackerrank;

import java.util.HashSet;
import java.util.Scanner;

public class WeightedUniformStrings {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		int n = scan.nextInt();

		HashSet<Integer> weights = getWeights(str);

		while (n-- > 0) {

			int x = scan.nextInt();

			System.out.println(weights.contains(x) ? "Yes" : "No");

		}

		scan.close();

	}

	private static HashSet<Integer> getWeights(String str) {

		HashSet<Integer> weights = new HashSet<>();

		int weight = 0;

		char prev = ' '; // so it doesn't match 1st character

		for (int i = 0; i < str.length(); i++) {

			char curr = str.charAt(i);

			if (curr != prev) {

				weight = 0;

			}

			weight += curr - 'a' + 1;

			weights.add(weight);

			prev = curr;

		}

		return weights;

	}

}
