package domain;

public class CommentInfo {
    private int count; //количество комментариев
    private boolean isPrivate; // приватна ли запись
    private boolean canComment; // может ли пользователь комментировать запись
    private Likes likes; // отметки "Мне нравится" в комментарии
}
