package com.ll.chat2412.chat.dto;

import com.ll.chat2412.chat.ChatMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MessagesResponse {
    private List<ChatMessage> chatMessages;
    private int totalCount;
}
