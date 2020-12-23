public class Post {
    private int id; // уникальный id записи
    private int postMakerId; // указание id автора поста
    private int date; // дата публикации
    private String text; // текст, наполнение записи
    private int countViews; // счетчик просмотров
    private CommentInfo commentInfo; // комментарии к посту
    private Likes likes; // количество отметок "Мне нравится" к посту
    private Share share; // количество репостов поста
    private Geografy geografy; // информация о местоположении автора поста
}
