package com.eliyaz.jpm;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * This is a Web Service client loading the corresponding Web Service and invoking the Web methods.
 * This is written only to test the application. This class loads the temp.txt to simulate the messages coming from an external client.
 * @author Eliyaz
 *
 */
public class JPMessageProcessorClient {

	public static void main(String[] args) {
		JPMorganMessageProcessorService jpmMPS = new JPMorganMessageProcessorService();
		JPMorganMessageProcessor jpmMP = jpmMPS.getJPMorganMessageProcessorPort();
		JPMessageProcessorClient client = new JPMessageProcessorClient();

		try {
			String line;
			BufferedReader br = new BufferedReader(new FileReader("data\\temp.txt"));
			while ((line = br.readLine()) != null) {
				System.out.println("Processing message :: " + line);
				client.parseMessage(line, jpmMP);
			}
		} catch (java.io.IOException e) {
			System.err.println(e.getMessage());
		}

	}

	/**
	 * @param message
	 * @param jpmMP
	 * @return
	 */
	private boolean parseMessage(String message, JPMorganMessageProcessor jpmMP) {

		String[] messageArray = message.trim().split("\\s+");
		String firstWord = messageArray[0].toLowerCase();
		if (firstWord.matches("add|subtract|multiply")) {
			return parseMessageType3(messageArray, jpmMP);
		} else if (firstWord.matches("^\\d+")) {
			return parseMessageType2(messageArray, jpmMP);
		} else if (messageArray.length == 3 && messageArray[1].contains("at")) {
			return parseMessageType1(messageArray, jpmMP);
		} else {
			System.out.println("Invalid Message ... !");
		}
		return false;
	}

	/**
	 * This message is to parse the Message Type1
	 * @param messageArray
	 * @param jpmMP
	 * @return
	 */
	private boolean parseMessageType1(String[] messageArray, JPMorganMessageProcessor jpmMP) {
		if (messageArray.length != 3)
			return false;
		String name = parseName(messageArray[0]);
		int price = Integer.parseInt(messageArray[2]);
		return jpmMP.addSingleSale(name, price);
	}

	/**
	 * This message is to parse the Message Type2
	 * @param messageArray
	 * @param jpmMP
	 * @return
	 */
	private boolean parseMessageType2(String[] messageArray, JPMorganMessageProcessor jpmMP) {
		if (messageArray.length != 7)
			return false;
		String name = parseName(messageArray[3]);
		int price = Integer.parseInt(messageArray[5]);
		int quantity = Integer.parseInt(messageArray[0]);
		return jpmMP.addMultipleSales(name, price, quantity);
	}

	/**
	 * This message is to parse the Message Type3
	 * @param messageArray
	 * @param jpmMP
	 * @return
	 */
	private boolean parseMessageType3(String[] messageArray, JPMorganMessageProcessor jpmMP) {
		if (messageArray.length != 3)
			return false;
		String instruction = messageArray[0];
		String name = parseName(messageArray[2]);
		int price = Integer.parseInt(messageArray[1]);
		return jpmMP.adjustSales(instruction, price, name);
	}

	/**
	 * @param name
	 * @return
	 */
	public String parseName(String name) {
		String parsedName = "";
		String typeWithoutLastChar = name.substring(0, name.length() - 1);
		if (name.endsWith("o")) {
			parsedName = String.format("%soes", typeWithoutLastChar);
		} else if (name.endsWith("y")) {
			parsedName = String.format("%sies", typeWithoutLastChar);
		} else if (name.endsWith("h")) {
			parsedName = String.format("%shes", typeWithoutLastChar);
		} else if (!name.endsWith("s")) {
			parsedName = String.format("%ss", name);
		} else {
			parsedName = String.format("%s", name);
		}
		return parsedName.toLowerCase();
	}

}
