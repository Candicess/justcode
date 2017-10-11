package com.flyweight.chess;

import java.util.HashMap;
import java.util.Map;

public class ChessFactory {
	
	public static final String BLACK = "black";
	public static final String WHITE = "white";
	
	private static ChessFactory instance = new ChessFactory();
	private static Map<String, IChess> map;
	
	private ChessFactory() {
		map = new HashMap<String, IChess>();
		map.put(BLACK, new BlackChess());
		map.put(WHITE, new WhiteChess());
	}
	
	public static IChess getIChess(String key){
		return map.get(key);
	}
	
	public static ChessFactory getInstance(){
		if (instance == null){
			instance = new ChessFactory();
		}
		return instance;
	}
}
