package collectionsArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {
	public static void main(String[] args) {
		int[] ab= {10,20,30,40,50};
		List<Integer> nums=Arrays.stream(ab).boxed().collect(Collectors.toList());
		System.out.println(nums);
	}
}
