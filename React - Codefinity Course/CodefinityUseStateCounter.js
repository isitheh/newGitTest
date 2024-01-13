import React, { useState, useEffect } from "react";

const Count = () => {
  const [counter, setCounter] = useState(0);
  useEffect(() => {
	console.log("Counter changed: ", counter);
  }, [counter]);
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