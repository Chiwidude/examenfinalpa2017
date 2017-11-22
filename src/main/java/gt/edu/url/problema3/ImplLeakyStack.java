package gt.edu.url.problema3;

public class ImplLeakyStack<E> implements LeakyStack<E> {
	CircularLinkedList<E> History;
	private int history;
	
	public ImplLeakyStack(int historial) {
		history = historial;
		History = new CircularLinkedList<E>();
		
	}
	@Override
	public int size() {
	
		
		return History.size();
	}

	@Override
	public boolean isEmpty() {
		
		
		return History.isEmpty();
	}

	@Override
	public E saveHistory(E e) {
		E temp;
		if(History.size() == history) {
			History.removeLast();
			History.addFirst(e);
			 temp = History.first();
		} else {
			History.addFirst(e);
			temp = History.first();
		}
		
		
		return temp;
	}

	@Override
	public E actual() {
		if(History.isEmpty() == true) {
			return null;
		} else {
			return History.first();
		}
	}

	@Override
	public E undo() throws IllegalArgumentException {
		return History.removeFirst();
	}

}
