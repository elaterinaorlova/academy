package by.academy.lesson3;

//		Перепишите программу:
//			public class Main {
//			  public static void main(String[] args) {
//			    int s = 370_000;
//			    int sec;
//			    int m;
//			    int min;
//			    int h;
//			    sec = s % 60;
//			    m = (s - sec) / 60;
//			    min = m % 60;
//			    h = (m - min) / 60;
//
//			    System.out.println(h + " часов " + min + " минут " 
//			    + sec + " секунд");
//			  }
//			}
//			// Продолжить пример, добавить расчет и вывод суток 
//			и недель. (месяц по желанию)
public class Task3 {

	public static void main(String[] args) {
		int s = 370000;
		int sec;
		int m;
		int min;
		int h;
		int hour;
		int d;
		int day;
		int w;
		int week;

		sec = s % 60;

		m = (s - sec) / 60;
		min = m % 60;

		h = (m - min) / 60;
		hour = h % 24;

		d = (h - hour) / 24;
		day = d % 24;

		w = (d - day) / 7;

		System.out.println(w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
	}

}
