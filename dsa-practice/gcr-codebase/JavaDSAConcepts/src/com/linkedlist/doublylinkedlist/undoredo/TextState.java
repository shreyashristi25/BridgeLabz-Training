package com.linkedlist.doublylinkedlist.undoredo;

public class TextState {

	String content;
    TextState prev;
    TextState next;

    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }

}
