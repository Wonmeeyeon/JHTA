package sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo4 {
	
	public static void main(String[] args) {
		
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		contacts.add(new Contact(10, "유관순", "010-8956-1911", "ryu@Gmail.com"));
		contacts.add(new Contact(7, "강감찬", "010-2226-1911", "gang@Gmail.com"));
		contacts.add(new Contact(3, "이순신", "010-1156-1911", "lee@Gmail.com"));
		contacts.add(new Contact(6, "김유신", "010-6356-1911", "kim@Gmail.com"));
		contacts.add(new Contact(2, "윤봉길", "010-8556-1911", "bong@Gmail.com"));
		
		Collections.sort(contacts);
		
		for (Contact c : contacts) {
			System.out.println(c.getNo()+","+c.getName()+"," + c.getTel()+"," + c.getEmail());
		}
	}

}
