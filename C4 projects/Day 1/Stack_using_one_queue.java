class Stack_using_one_queue {
	Queue<Integer> q =new LinkedList<Integer>();
	int curr_size;

	public Stack_using_one_queue() {
		curr_size = 0;
	}

	public void push(int x) {
		curr_size = q.size();
		q.add(x);
		for(int i = 0; i < curr_size; i++)
		{
			int temp = q.remove();
			q.add(temp);
		}	
	}

	public int pop() {
		if(q.isEmpty())
			return -1;
		int temp = q.remove();
		return temp;	
	}

	public int top() {
		if(q.isEmpty())
			return -1;
		return q.peek();
	}
	
	public boolean empty() {
		return q.isEmpty();
	}
}