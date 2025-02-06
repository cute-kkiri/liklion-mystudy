package com.ll.chatAI.domain.chat.chatRoom.entity;

import com.ll.chatAI.domain.chat.chatMessage.entity.ChatMessage;
import com.ll.chatAI.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Setter
@Getter
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@SuperBuilder
@ToString(callSuper = true)
public class ChatRoom extends BaseEntity {
    private String name;

    @OneToMany
    private List<ChatMessage> chatMessages;
}
