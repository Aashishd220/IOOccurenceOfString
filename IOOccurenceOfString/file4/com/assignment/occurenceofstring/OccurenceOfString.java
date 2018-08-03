//program to find line number and the string in that line
package com.assignment.occurenceofstring;

import java.util.*;
import java.io.*;

public class OccurenceOfString {
	public static void main(String args[]) {

		Scanner get = new Scanner(System.in);
		String path;
		int lineNo = 0;
		int flag = 0;

		System.out.println("Enter path of the file");
		path = get.next();// takes the file path
		File file = new File(path);// passing path to file
		Scanner in = null;

		try {
			in = new Scanner(file);
			while (in.hasNext()) {
				lineNo++;
				String line = in.nextLine();
				if (line.contains("fileadf")) // checks the String
				{
					System.out.println("line:" + line + "\nline number" + lineNo);
					flag = 1;
				}

			}
			if (flag == 0) // if String is not there
			{
				System.out.println("string was not there");
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}
}