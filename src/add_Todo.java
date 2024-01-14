import java.util.ArrayList;

import hu.szit.Convert;

public class add_Todo {
    
    TodoService todoService;

    public add_Todo() {
        todoService = new TodoService();
        //getTodos();
        addTodo();
    }

    public void getTodos() {        
        String todos = todoService.getTodos();        
        ArrayList<Todo> todoList = Convert.toListObject(todos, Todo.class);
        for(Todo todo: todoList) {
            System.out.println(todo.id);
        }
    }

    //Todo felvétele
    public void addTodo() {
        Todo todo = new Todo(1, 201, "Valamilyen teendő", true);
        String json = Convert.toJson(todo);

        String result = todoService.addTodo(json);
        System.out.println(result);
    }
}
