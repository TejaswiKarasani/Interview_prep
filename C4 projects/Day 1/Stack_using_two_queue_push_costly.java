class Stack_using_two_queue_push_costly {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer)();
	int curr_size();

	public Stack_using_two_queue_push_costly() {
		curr_size = 0;
	}

	public void push(int x) {
		curr_size++;
		q2.add(x);
		while(!q1.Empty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	public int pop() {
		if(q1.isEmpty())
			return -1;
		int temp = q1.remove();
		curr_size--;
		return temp;
	}

	public int top() {
		if(q1.isEmpty())
			return -1;
		return q1.peek();
	}

	public boolean empty() {
		return q1.isEmpty();
	}
}