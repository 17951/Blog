import java.time.LocalDateTime;
import java.time.Month;
import java.util.TreeSet;

public class NewMain {
	public static void main(String[] args) {
		Comment c3 = new Comment("Kasia", "Cala java jest bardzo trudna",
				LocalDateTime.of(2017, Month.FEBRUARY, 2, 15, 20, 45));
		Comment c1 = new Comment("Ania", "Kolekcje s¹ bardzo trudne",
				LocalDateTime.of(2015, Month.FEBRUARY, 2, 15, 20, 45));
		Comment c2 = new Comment("Taduesz", "No coœ ty, bardzo ³atwe",
				LocalDateTime.of(2016, Month.FEBRUARY, 2, 15, 20, 45));

		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c3);

		TreeSet<Comment> set = new TreeSet<>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		System.out.println(set);
		
		System.out.println();
		
		TreeSet<Comment> set2 = new TreeSet<>(new CommentComparator());
		set2.add(c1);
		set2.add(c2);
		set2.add(c3);
		System.out.println(set2);

	}
}
