
import java.io.*;
	import java.util.*;

	// Read only region start
	public class Jumble {

		public static String JumbleWords(String input1, int input2) {
			// Read only region end
			String p[] = input1.split(" ");
			int a = p.length;
			int size[] = new int[a];
			String arr[] = new String[a];
			String temp = "";
			if (input2 == 1) {
				for (int i = 0; i < a; i++) {
					size[i] = p[i].length();
					for (int j = 0; j < size[i]; j++) {
						if (j % 2 == 0) {
							temp = temp + p[i].charAt(j);
						}
					}
					for (int l = size[i] - 1; l >= 0; l--) {
						if (l % 2 == 1) {
							temp = temp + p[i].charAt(l);
						}
					}
					if (i < a - 1)
						temp = temp + " ";
				}
			} else if (input2 == 2) {
				for (int i = 0; i < a; i++) {
					size[i] = p[i].length();
					for (int j = 0; j < size[i]; j++) {
						if (j % 2 == 0) {
							temp = temp + p[i].charAt(j);
						}
					}
					for (int l = 0; l < size[i]; l++) {
						if (l % 2 == 1) {
							temp = temp + p[i].charAt(l);
						}
					}
					if (i < a - 1)
						temp = temp + " ";
				}
			}
			System.out.println(temp);
			return temp;
		}
		public static void main(String args[]) {
			Scanner scan=new Scanner(System.in);
			String input1=scan.nextLine();
			int input2=scan.nextInt();
			JumbleWords(input1,input2);
		}
	}

