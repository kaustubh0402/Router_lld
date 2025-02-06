package controllers;

import DTO.Request;
import schema.Todo;

public interface TodoController {
    Todo addTodo(Request request);
    Todo deleteTodo(Todo todo);
    Todo updateTodo(Todo todo);
    Todo getTodo(int id);
}
