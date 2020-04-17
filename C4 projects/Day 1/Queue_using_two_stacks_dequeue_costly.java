class Queue_using_two_stacks_dequeue_costly {
	Stack<Integer> s1,s2;
	int front;
	
	public Queue_using_two_stacks_dequeue_costly() {
		s1 = new Stack<Integer>();
		S2 = new Stack<Integer>();
		front = 0;
	}

	public void push(int x) {
		if(s1.empty())
			front = x;
		s1.push(x);
	}
	
	public int pop() {
		if(s2.isEmpty()) {
			while(!s1.isEmpty())
				s2.push(s1.pop());
		}
		int temp = s2.pop();
		return temp;
	}

	public int peek() {
		if(!s2.isEmpty()) {
			return s2.peek();
		return front;
	}
	
	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}
}