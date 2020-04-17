class Queue_using_two_stacks_enqueue_costly {
	
	Stack<Integer> s1,s2;

	public Queue_using_two_stacks_enqueue_costly() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}

	public void push(int x)	{
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(x);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	public int pop() {
		if(s1.isEmpty())
			return -1;
		int temp=s1.pop();
		return temp;
	}

	public int peek() {
		int temp = s1.peek();
		return temp;
	}

	public boolean empty() {
		return s1.isEmpty();
	}
}