package mapDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Demos {

	/**
	 * "aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1),显然是排序过的
	 */
	public static void Demo1() {
		String str = "aababcabcdabcde";
		TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (!treeMap.containsKey(str.charAt(i))) {
				treeMap.put(str.charAt(i), 1);
			} else {
				Integer value = ((Integer) treeMap.get(str.charAt(i)));
				value++;
				treeMap.put(str.charAt(i), value);
			}
		}
		StringBuilder sbBuilder = new StringBuilder();
		for (Map.Entry<Character, Integer> treemap : treeMap.entrySet()) {
			sbBuilder.append(treemap.getKey());
			sbBuilder.append('(');
			sbBuilder.append(treemap.getValue());
			sbBuilder.append(')');
		}

		System.out.println(sbBuilder.toString());
	}

	/**
	 * 模拟斗地主发牌
	 */
	public static void Demo2() {
		String[] icons = { "梅", "桃", "方", "心" };
		String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		
		ArrayList<String> cardS=new ArrayList<String>();
		for (String icon : icons) {
			for (String number : numbers) {
				cardS.add(icon+number);
			}
		}
		cardS.add("大王");
		cardS.add("小王");
		//洗牌
		Collections.shuffle(cardS);
		
		ArrayList<String> player1=new ArrayList<String>();
		ArrayList<String> player2=new ArrayList<String>();
		ArrayList<String> player3=new ArrayList<String>();
		ArrayList<String> leftCards=new ArrayList<String>();
		//发牌
		for(int i=cardS.size()-1;i>=0;i--){
			if(i<3){
				leftCards.add(cardS.get(i));
			}else if(i%3==0){
				player1.add(cardS.get(i));
			}else if(i%3==1) {
				player2.add(cardS.get(i));
			}else if(i%3==2){
				player3.add(cardS.get(i));
			}
		}
		
		ShowCards("play1",player1);
		ShowCards("play2",player2);
		ShowCards("play3",player3);
		ShowCards("底牌", leftCards);
	}
	
	/**
	 * 展示
	 * @param playerName
	 * @param cards
	 */
	public static void  ShowCards(String playerName,ArrayList<String> cards){
		System.out.println();
		
		System.out.println(playerName+"的牌是");
		for (String string : cards) {
			System.out.print(string+"\t");
		}
	}
	


}
