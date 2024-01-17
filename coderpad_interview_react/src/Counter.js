import React, {useState} from 'react';

const Counter = (props) => {
    const [count, setCount] = useState(0);
    const increment = () => {
        setCount(count + 1);
    }
    return (
        <div>
            {props.isLoggedIn ? <h1>Welcome Back!</h1> : <h1>Log in!</h1> }
            <p>Count: {count}</p>
            <button onClick={increment}>Increment</button>
        </div>
    );
}

export default Counter;