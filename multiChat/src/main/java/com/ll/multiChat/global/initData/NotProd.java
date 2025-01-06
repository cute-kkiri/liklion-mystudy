package com.ll.multiChat.global.initData;

import com.ll.multiChat.domain.chat.chatMessage.entity.ChatMessage;
import com.ll.multiChat.domain.chat.chatMessage.service.ChatMessageService;
import com.ll.multiChat.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.multiChat.domain.chat.chatRoom.service.ChatRoomService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.stream.IntStream;

@Configuration
@Profile("!prod")
public class NotProd {

    @Bean
    public ApplicationRunner initNotProd(ChatRoomService chatRoomService, ChatMessageService chatMessageService) {
        return args -> {
            ChatRoom chatRoom1 = chatRoomService.make("공부");
            ChatRoom chatRoom2 = chatRoomService.make("식사");
            ChatRoom chatRoom3 = chatRoomService.make("휴식");

            IntStream.rangeClosed(1, 100).forEach(num -> {
                chatMessageService.write(chatRoom1, "홍길동", "공부 메시지" + num);
//                chatRoomService.write(chatRoom1.getId(), "홍길동", "content" + num);
            });

            System.out.println("Not Prod");
        };
    }
}
