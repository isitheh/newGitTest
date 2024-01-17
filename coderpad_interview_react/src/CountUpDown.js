import React, { useState } from 'react';

const CountUpDown = () => {
    const [ count, setCount ] = useState(0);
    const doIncrement = () => {
        setCount(count + 1);
    }
    const doDecrement = () => {
        setCount(count - 1);
    }
    return (
        <div>
            <p>Counter: {count}</p>
            <button onClick={doIncrement}>Increment</button>
            <button onClick={doDecrement}>Decrement</button>
        </div>
    );
}

export default CountUpDown;