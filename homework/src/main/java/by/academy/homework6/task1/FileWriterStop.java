package by.academy.homework6.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterStop {

	public static void main(String[] args) throws IOException {

		File file = new File("task1.txt");
		if (!file.exists()) {
			file.createNewFile();

		}

		try (FileWriter fos = new FileWriter(file); Scanner scanner = new Scanner(System.in)) {
			System.out.println("Insert text (insert \"stop\", when you finish writing):");

			while (scanner.hasNextLine()) {
				String string = scanner.nextLine();
				if (string.equals("stop")) {
					System.out.println("File writing completed");
					break;

				} else {
					fos.write(string + "\r\n");
				}

			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
