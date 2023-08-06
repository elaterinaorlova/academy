package by.academy.homework6.task3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserDemo {

	public static void main(String[] args) throws IOException {
		ArrayList<User> users = new ArrayList<>();

		users.add(new User("Robert", "Frost", 150));
		users.add(new User("Thomas", "Hardy", 180));
		users.add(new User("Rudyard ", "Kipling", 160));
		users.add(new User("Edgar", "Poe", 200));
		users.add(new User("William", "Shakespeare", 500));
		users.add(new User("Rabindranath", "Tagore", 160));
		users.add(new User("Walt", "Whitman", 200));
		users.add(new User("Oscar", "Wilde", 170));
		users.add(new User("Dante", "Alighieri", 650));
		users.add(new User("Henry ", "Longfellow", 220));

		File directory = new File("users");
		if (!directory.exists()) {
			directory.mkdirs();

		}

		File serializableFile = null;

		for (int i = 0; i < users.size(); i++) {

			try {
				serializableFile = new File("users",
						users.get(i).getFirstName() + "_" + users.get(i).getLastName() + ".txt");
				if (!serializableFile.exists()) {
					serializableFile.createNewFile();
				}

				try (ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(serializableFile)))) {
					oos.writeObject(users.get(i));
				}
				System.out.println("File " + (i + 1) + " writing completed");

			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
