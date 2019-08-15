/**
 * 
 */
package data_structures;

/**
 * @author peterokello
 *
 */
public class LinkedList {

	/**
	 * @param args
	 */
	Node firstnode;
	
	//method to insert a new node 
	public static LinkedList insert(LinkedList linkedList, int data) 
	{
		//create a node & give it the current data
		Node newnode = new Node(data);
		newnode.next = null;
		
		if(linkedList.firstnode == null)
		{
			linkedList.firstnode = newnode;
		}
		else
		{
			//traverse the list & insert the node last 
			Node nextnode = new Node(data);
			
			while(nextnode.next != null)
			{
				nextnode = nextnode.next;
			}
			
			//Insert the new node, last
			newnode.next = newnode;
		}
		
		//return the list by head
		return linkedList;
	}
	
	static void printList(LinkedList linkedList)
	{
		Node current_node = linkedList.firstnode;
		
		System.out.println("LinkedList:");
		
		//Traverse through
		while(current_node != null)
		{
			System.out.println(current_node.data + " ");
			//Go to the next node
			current_node = current_node.next;
		}
	}

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//Start with empty list
		LinkedList list = new LinkedList();
		
		// ***** INSERTION ***** 
		
		//Insert the numbers
		
		list = insert(list, 22);
		list = insert(list, 34);
		
		//print the list
		printList(list);
	}

}
