package com.ll.multiChat.domain.chat.chatRoom.service;

import com.ll.multiChat.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.multiChat.domain.chat.chatRoom.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;

    public ChatRoom make(String name) {
        ChatRoom chatRoom = ChatRoom.builder()
                .name(name)
                .build();

        chatRoomRepository.save(chatRoom);

        return chatRoom;
    }

    public void write(Long roomId, String writeName, String content) {
        ChatRoom chatRoom = chatRoomRepository.findById(roomId).get();

        chatRoom.writeMessage(writeName, content);
    }

    public List<ChatRoom> getList() {
        return chatRoomRepository.findAll();
    }
}
