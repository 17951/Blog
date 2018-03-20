import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class NewMain1 {

	public static void main(String[] args) {
		Blog blog = new Blog("Blog programistyczny");
		Note note1 = new Note("Co nowego w Java 9", "Co nowego w Java 9");
		Note note2 = new Note("Kolekcje", "Kolekcje");
		Note note3 = new Note("JavaFX", "Aplikacje desktopowe");
		blog.add(note3);
		blog.add(note2);
		blog.add(note1);
		Comment c1 = new Comment("jan", "Kolekcje s¹ bardzo trudne");
		note2.add(c1);
		Comment c2 = new Comment("qwerty", "No coœ ty, bardzo ³atwe");
		note2.add(c2);
		System.out.println(blog);
		System.out.println("-----");
		System.out.println(blog.mostPopular());
		System.out.println("-----");
		LocalDateTime d1 = LocalDateTime.now();
		LocalDateTime d2 = LocalDateTime.of(2018, Month.FEBRUARY, 2,15,20,45);
		long u = d1.until(d2, ChronoUnit.DAYS);
		System.out.println(u);
		long u2 = d2.until(d1, ChronoUnit.DAYS);
		System.out.println(u2);
		System.out.println("-----");
		System.out.println(blog.lastComment());
	}

}
