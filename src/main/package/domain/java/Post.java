public class Post {

    // tage v1

    private int id; // уникальный id записи
    private int postMakerId; // указание id автора поста
    private int date; // дата публикации
    private String text; // текст, наполнение записи
    private int countViews; // счетчик просмотров
    private CommentInfo commentInfo; // комментарии к посту
    private Likes likes; // количество отметок "Мне нравится" к посту
    private Share share; // количество репостов поста
    private Geografy geografy; // информация о местоположении автора поста

    // tag v2 *no ARRAY

    private int ownerId; // id владельца стены, где расположен пост
    private int adminId; // id администратора, опубликовавшего запись
    private int replyOwnerId; // id пользователя, в ответ на запись которого создана запись
    private int replyPostId; // id записи, на которую опубликован этот пост-ответ
    private boolean friendsOnly; // видна ли запись только друзьям
    private String postType; // тип поста
    private boolean sign; // подписана запись или нет
    private boolean userCanPin; // может ли пользователь закрепить пост
    private boolean userCanDel; // может ли пользователь удалить пост
    private boolean userCanEdit; // может ли пользователь редактировать запись
    private boolean postPinned; // закреплен ли пост
    private boolean favorite; // добавлен ли пост в "Избранное"
}
