package by.academy.homework6.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileResult {

	public static void main(String[] args) throws IOException {

		File source = new File("task2.txt");
		File target = new File("task2_result.txt");

		try {
			if (!source.exists()) {
				source.createNewFile();

			}
			if (!target.exists()) {
				target.createNewFile();

			}
		} catch (IOException e) {
			System.out.println(e);
		}

		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;

		try {
			inputStream = new FileInputStream(source);
			outputStream = new FileOutputStream(target);
			int a;
			while ((a = inputStream.read()) != -1) {
				if ((char) a != ' ') {
					outputStream.write(a);
				}
			}
			System.out.println("File writing completed");

		} catch (IOException e) {
			System.out.println(e);

		} finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
