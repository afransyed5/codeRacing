package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author Code Forces.  Solution by: L.Azuaje.
 *
 * Problem: 499B Lecture.
 *
 * Used at Codeforces: #284 Div-2 .
 *
 */

public class Lecture {
	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

        int[] data = scanner.nextIntArray();
        String[][] sentences = new String[data[1]][2];
        String[] lecture;

        for (int i = 0; i < data[1]; i++) {
            sentences[i] = scanner.nextStringArray();
        }

        lecture  = scanner.nextStringArray();

        for (int i = 0; i < lecture.length; i++) {
            for (int j = 0; j < data[1]; j++) {
                if (lecture[i].equals( sentences[j][0])) {
                    if (lecture[i].length() > sentences[j][1].length()) {
                        lecture[i] = sentences[j][1];
                    }
                }
            }
        }

        for (int i = 0; i < lecture.length; i++) {
            out.format("%s ", lecture[i]);
        }

		scanner.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader reader;

		public MyScanner() {
			this.reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public void close() throws IOException {
			this.reader.close();
		}

		int nextInt() {
			return Integer.parseInt(this.next());
		}

		long nextLong() {
			return Long.parseLong(this.next());
		}

		double nextDouble() {
			return Double.parseDouble(this.next());
		}

		String next() {
			String str = "";
			try {
				str = this.reader.readLine().trim();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		String[] nextStringArray() {
			String[] str = null;
			try {
				str = this.reader.readLine().trim().split(" ");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int[] nextIntArray() {
			String[] data  = nextStringArray();
			int[] a  = new int[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(data[i]);
			}

			return a;
		}

		Integer[] nextIntegerArray() {
			String[] data  = nextStringArray();
			Integer[] a  = new Integer[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(data[i]);
			}

			return a;
		}

		long[] nextLongArray() {
			String[] data  = nextStringArray();
			long[] a  = new long[data.length];

			for (int i = 0; i < a.length; i++) {
				a[i] = Long.parseLong(data[i]);
			}

			return a;
		}
	}
}

