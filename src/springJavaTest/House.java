package springJavaTest;

import org.springframework.beans.factory.annotation.Autowired;

public class House {
	@Autowired
	private Room room;

	@Override
	public String toString() {
		return room.say();
	}
}
