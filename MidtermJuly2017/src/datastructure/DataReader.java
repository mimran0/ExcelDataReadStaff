package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
             //C:\Users\imran\workspace_Test\MidtermJuly2017\src\data\self-driving-car.txt
		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		System.out.println(textFile);
		BufferedReader br;
		FileReader fr=null;
		String line=null;
		try {
			//fr=new FileReader("C:/Users/imran/workspace_Test/MidtermJuly2017/src/data/self-driving-car.txt");
			fr=new FileReader(textFile);
		}catch (FileNotFoundException E){
			System.out.println("File not found" +E);
			System.exit(0);
		}
		br=new BufferedReader(fr);
		try {
			while ((line = br.readLine())!=null){
               System.out.println(line);
			}
		}catch (IOException EX){
			System.out.println("File not read");
		}


	}

}
