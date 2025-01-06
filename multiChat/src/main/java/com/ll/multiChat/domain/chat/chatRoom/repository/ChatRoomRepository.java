package com.ll.multiChat.domain.chat.chatRoom.repository;

import com.ll.multiChat.domain.chat.chatRoom.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
}