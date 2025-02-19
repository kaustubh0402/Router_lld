package controllers;

import DTO.Request;
import factory.RouterHandlerFactory;
import handlers.*;
import schema.Todo;

public class TodoControllerImpl implements TodoController {
    public Todo addTodo(Request request) {
        System.out.println("Adding a todo");
        Router router= RouterHandlerFactory.getRouterHandler();
        router.handleRequest(request);
        return new Todo();
    }

    public Todo deleteTodo(Todo todo) {
        System.out.println("Deleting a todo");
        return todo;
    }

    public Todo updateTodo(Todo todo) {
        System.out.println("Updating a todo");
        return todo;
    }

    public Todo getTodo(int id) {
        System.out.println("Getting a todo");
        return new Todo();
    }
}
