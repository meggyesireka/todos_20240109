import hu.szit.Client;

public class TodoService {
    String url;
    Client client;
    public TodoService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getTodos() {
        return client.get(url);
    }
    public String addTodo(String json) {
        return client.post(url, json);        
    }


}
