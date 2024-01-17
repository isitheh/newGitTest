import React, { useState } from 'react';

const TodoList = (props) => {
    const[todos, setTodos] = useState([]);

    return (
        <div>
            <ul>
                {todos.map((todo) => {
                    <li key={todo.id}>
                        <p>Description: {todo.text}</p>
                        <p>Status: {todo.status}</p>
                    </li>
                })}
            </ul>
        </div>
    );
}

export default TodoList;