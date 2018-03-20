import java.util.Comparator;

public class CommentComparator implements Comparator<Comment>{

	@Override
	public int compare(Comment o1, Comment o2) {
		return (o1.getAuthor().compareTo(o2.getAuthor()));
	}

}
