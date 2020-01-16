package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
		if(eggs.get(i).equals("cracked")) {
		return i;	
		}
		}
		return -1;
	}

public static int	countPearls(List<Boolean> oysters) {
	int pearlsfound=0;
	for (int i = 0; i < oysters.size(); i++) {
		if(oysters.get(i)==true) {
		pearlsfound++;	
		}
	}
	return pearlsfound;
}

public static double findTallest(List<Double>peeps) {
	double tallest=0.0;
	for (int i = 0; i < peeps.size(); i++) {
		if(peeps.get(i)>tallest) {
			tallest=peeps.get(i);
		}
		System.out.println(tallest);
	}
	return tallest;
}

public static String findLongestWord(List<String> words) {
	String longest="";
	for (int i = 0; i < words.size(); i++) {
		if(words.get(i).length()>longest.length()) {
			longest=words.get(i);
		}
		System.out.println(longest);
	}
	return longest;
}

public static boolean containsSOS(List<String> message) {
	for (int i = 0; i < message.size(); i++) {
	if(message.get(i).equals(" ... --- ... ")){
	return true;
	}
	}
return false;
}

public static List<Double> sortScores(List<Double >results) {
	System.out.println(results);
	for(int j=0; j<results.size();j++) {
	for (int i = 1; i<results.size(); i++) {
		if(results.get(i)<results.get(i-1)) {
		Double pone=results.get(i);
		Double ptwo=results.get(i-1);
		results.set(i, ptwo);
		results.set(i-1, pone);
		}
		System.out.println(results);
	}
}
	return results;
}

public static List<String> sortDNA(List<String> stuff){
	System.out.println(stuff);
	for(int j=0; j<stuff.size();j++) {
		for (int i = 1; i<stuff.size(); i++) {
			if(stuff.get(i).length()<stuff.get(i-1).length()) {
			String pone=stuff.get(i);
			String ptwo=stuff.get(i-1);
			stuff.set(i, ptwo);
			stuff.set(i-1, pone);
			}
			System.out.println(stuff);
		}
}
	return stuff;
}

public static List<String> sortWords(List<String> wurds){
	List<String> orderedwurds=new ArrayList<String>();
String earliest="zzz";
for (int i = 0; i < wurds.size(); i++) {
for (int j = 1; j < wurds.size(); j++) {
	if(wurds.get(i).compareTo(earliest)<0) {
		orderedwurds.add(wurds.get(i));
		wurds.remove(wurds.get(i));
	}
}
}
return orderedwurds;
}
}
