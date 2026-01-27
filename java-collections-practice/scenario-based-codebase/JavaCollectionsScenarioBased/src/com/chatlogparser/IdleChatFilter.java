package com.chatlogparser;
import java.util.* ;

public class IdleChatFilter implements MessageFilter<String>{

	private List<String> idleKeywords;

	//constructor
    public IdleChatFilter(List<String> idleKeywords) {
        this.idleKeywords = idleKeywords;
    }

    @Override
    public boolean filter(String message) {
        for (String keyword : idleKeywords) {
            if (message.toLowerCase().contains(keyword.toLowerCase())) {
                return false;
            }
        }
        return true;
    }

}
