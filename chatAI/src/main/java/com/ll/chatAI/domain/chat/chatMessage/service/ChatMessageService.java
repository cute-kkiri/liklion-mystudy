package com.ll.chatAI.domain.chat.chatMessage.service;

import com.ll.chatAI.domain.chat.chatMessage.entity.ChatMessage;
import com.ll.chatAI.domain.chat.chatMessage.repository.ChatMessageRepository;
import com.ll.chatAI.domain.chat.chatRoom.entity.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;

    public void write(ChatRoom chatRoom, String writerName, String content) {
        ChatMessage chatMessage = ChatMessage.builder()
                .chatRoom(chatRoom)
                .writerName(writerName)
                .content(content)
                .build();

        chatMessageRepository.save(chatMessage);
    }

    public List<ChatMessage> getAll() {
        return chatMessageRepository.findAll();
    }
}
