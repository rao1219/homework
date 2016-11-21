package Model;

import java.awt.List;
import java.util.ArrayList;

public class MsgProcessor {
	public static String getMessage(String zodiac,boolean man){
		String msg;
		ArrayList earlyZodiacs = new ArrayList<String>(){{
			add("Aries");
			add("Taurus");
			add("Gemini");
			add("Cancer");
			add("Leo");
			add("Virgo");
		}};
		if(earlyZodiacs.contains(zodiac)){
			if(man)msg = "You will have a long life";
			else msg = "You will find a tall handsome stranger.";
		}
		else{
			if(man) msg = "You will have a rich life.";
			else msg = "You will have six children.";
		}
		return msg;
	}
}
