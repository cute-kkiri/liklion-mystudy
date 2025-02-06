package com.ll.chatAI.domain.chat.chatMessage.controller;

import com.ll.chatAI.domain.chat.chatMessage.entity.ChatMessage;
import com.ll.chatAI.domain.chat.chatMessage.service.ChatMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chat/rooms/")
@RequiredArgsConstructor
@CrossOrigin(
        origins = "https://cdpn.io"
)
public class ApiV1ChatMessageController {
    private final ChatMessageService chatMessageService;

    @GetMapping("/{roomId}/messages")
//    GET /api/v1/chat/rooms/1/messages?afterChatMessageId=2
    public List<ChatMessage> getChatMessages(@PathVariable("roomId") Long roomId,
                                  @RequestParam(value = "afterChatMessageId", defaultValue = "-1") long afterChatMessageId) {
        List<ChatMessage> chatMessages = chatMessageService.getAll();
        return chatMessages;
    }

    @PostMapping("/{roomId}/messages")
    public String createChatMessage(@PathVariable("roomId") Long roomId) {
        return roomId + "번 채팅방 메시지 생성 완료";
    }
}
