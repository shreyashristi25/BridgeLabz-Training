package com.chatlogparser;

public interface MessageFilter <T>{

	boolean filter(T message);

}
