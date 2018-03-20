import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Blog {
	private List<Note> notes = new ArrayList();
	private String title;

	public Blog(String title) {
		this.title = title;
	}

	public void add(Note note) {
		notes.add(note);
	}

	public String toString() {
		return title + "\n\n" + notes;
	}

	public Note mostPopular() {
		if (notes.isEmpty())
			return null;
		Note result = notes.get(0);
		for (Note note : notes) {
			int count = note.numberOfComments();
			if (count > result.numberOfComments()) {
				result = note;
			}
		}
		return result;

	}

	public List<Note> mostPopulars() {

		return null;
	}

	public Comment lastComment() {
		List<Comment> allComments = new ArrayList();
		for (Note note : notes) {
			allComments.addAll(note.getComments());
		}
		Comment result = allComments.get(0);
		for (Comment comment : allComments) {
			LocalDateTime d1 = comment.getDate();
			LocalDateTime d2 = result.getDate();
			if (d1.isAfter(d2)) {
				result = comment;
			}
		}

		return result;
	}

	public Collection<Comment> lastComments() {
		SortedSet allComents = new TreeSet(Collections.reverseOrder());
		for (Note note : notes) {
			set.addAll(note.getComments());

		}
		Iterator<Comment> iter=new allComments.iterator();
		
		}
//		return

	}

}