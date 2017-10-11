package com.shopmall.properties;

import java.util.Map;

import com.shopmall.command.Command;

public class CommandFactory {
	
	public static Command getCommand(String menuCommand){
		Map<String, String> map = new PropertiesReader().getProperties();
		try {
			Command command = (Command) Class.forName(map.get(menuCommand)).newInstance();
			return command;
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
