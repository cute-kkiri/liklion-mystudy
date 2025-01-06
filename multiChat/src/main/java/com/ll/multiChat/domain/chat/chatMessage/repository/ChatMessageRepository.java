package com.ll.multiChat.domain.chat.chatMessage.repository;

import com.ll.multiChat.domain.chat.chatMessage.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
}
