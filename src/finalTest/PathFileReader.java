package finalTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PathFileReader {

	
	public static void main(String[] args) {
		doesFileExist("C:\\Users\\abdou\\new eclipse\\eclipse-workspace\\FinalExam001\\DataExam\\data.txt");

	}

	public static void doesFileExist(String path) {
		try {

			File f = new File(path);
			FileReader fr = new FileReader(f);
			BufferedReader r = new BufferedReader(fr);

			ArrayList<String> fileData = new ArrayList<String>();

			try {

				String k = r.readLine();
				fileData.add(k);
				while (k != null) {
					k = r.readLine();
					if (k != null)
						fileData.add(k);
				}

			} catch (IOException e) {

				e.printStackTrace();
			}

			for (int i = 0; i < fileData.size(); i++) {
				String h = fileData.get(i);
				String[] ary = h.split("-");
				System.out.println(ary[0]);
				String[] ary2 = ary[1].split(",");
				for (int j = 0; j < ary2.length; j++) {

					System.out.println(ary2[j]);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("the file does not exist");
		}

	}
}

