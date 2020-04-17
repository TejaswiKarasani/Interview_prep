class Stack_using_two_queue_pop_costly {
	Queue<Integer> q1  = new LinkedList<>();
	Queue<Integer> q2  = new LinkedList<>();
	int curr_size();
	
	public Stack_using_two_queue_pop_costly() {
		curr_size = 0;
	}

	public void push(int x) {
		q1.add(x);
		curr_size++;	
	}
	
	public int pop() {
		if(q1.isEmpty())
			return -1;
		while(q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}
		int temp  = q1.remove();
		curr_size--;
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
		return temp;
	}

	public int top() {
		if(q1.isEmpty())
			return -1;
		while(q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}
		int temp = q1.peek();
		q1.remove();
		q2.add(temp);
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
		return temp;
	}

	public boolean empty() {
		return q1.isEmpty();
	}
}
