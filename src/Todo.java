public class Todo {
    int userId;
    int id;
    String title;
    boolean completed;
    public Todo() {}
    public Todo(String title) {
        this.title = title;
    }
    public Todo(String title, Boolean completed) {
        this.title = title;
        this.completed = completed;
    }
    public Todo(int userId, int id, String title, Boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
    
}