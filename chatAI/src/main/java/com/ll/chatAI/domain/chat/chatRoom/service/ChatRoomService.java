package com.ll.chatAI.domain.chat.chatRoom.service;

import com.ll.chatAI.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.chatAI.domain.chat.chatRoom.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
        private final ChatRoomRepository chatRoomRepository;
    public ChatRoom create(String name) {

        ChatRoom chatRoom = ChatRoom.builder()
                .name(name)
                .build();
        chatRoomRepository.save(chatRoom);
        return chatRoom;
    }

    public List<ChatRoom> getAll() {
        return chatRoomRepository.findAll();
    }
}
