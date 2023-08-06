package by.academy.homework7.task1;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		Map<Double, String> map = Stream.generate(() -> random.nextLong(0, 100)).limit(100).map(i -> i * Math.PI - 20)
				.filter(i -> i < 100).sorted().skip(3).distinct()
				.collect(Collectors.toMap(key -> key, value -> " Number: " + value));
		System.out.print(map);

	}

}
