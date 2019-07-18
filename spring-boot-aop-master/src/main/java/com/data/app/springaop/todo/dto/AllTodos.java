package com.data.app.springaop.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.data.app.springaop.todo.domain.TodoList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllTodos {
    private List<TodoList> todoLists;
}
