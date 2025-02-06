export const mockChats = [
    {
        id: 'msg1',
        content: '안녕하세요! 백엔드 개발에 관심이 있으신가요?',
        createdAt: '2024-03-15T10:00:00.000Z',
        isMyMessage: false,
    },
    {
        id: 'msg2',
        content: '네! JAVA와 Spring Boot를 공부하고 있습니다.',
        createdAt: '2024-03-15T10:01:00.000Z',
        isMyMessage: true,
    },
    {
        id: 'msg3',
        content: '좋은 선택이에요! 저도 Spring Boot로 개발하고 있습니다. 특히 JPA가 정말 편리하더라구요.',
        createdAt: '2024-03-15T10:02:00.000Z',
        isMyMessage: false,
    },
]

export const mockChatRooms = [
    {
        id: 'room1',
        name: '백엔드 개발자 모임',
        lastMessage: 'JPA 학습 중인데 연관관계 매핑이 조금 어렵네요 😅',
        createdAt: '2024-03-15T10:00:00.000Z',
        participantCount: 5,
    },
    {
        id: 'room2',
        name: 'Spring Boot 스터디',
        lastMessage: '트랜잭션 전파 레벨에 대해 토론해보아요!',
        createdAt: '2024-03-15T09:30:00.000Z',
        participantCount: 3,
    },
]
