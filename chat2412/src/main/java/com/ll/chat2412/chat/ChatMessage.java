package com.ll.chat2412.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ChatMessage {
    private long id;
    private String authorName;
    private String content;
    private LocalDateTime createDate;

    public ChatMessage(String authorName, String content) {
        this.id = ChatMessageIdGenerator.genNextId();
        this.authorName = authorName;
        this.content = content;
        this.createDate = LocalDateTime.now();
    }

    class ChatMessageIdGenerator {
        private static long id = 0;
        public static long genNextId() {
            return ++id;
        }
    }
}
