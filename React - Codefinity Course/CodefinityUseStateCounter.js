import React, { useState } from "react";

const Count = () => {
  const [counter, setCounter] = useState(0);
  const doIncrement = () => {
    setCounter(counter + 1);
  };
  return (
    <>
      <p>Value Now: {counter} </p>
      <button onClick={doIncrement}>Go Up</button>
    </>
  );
};

export default Count;