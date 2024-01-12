import React, { useState } from "react";

const Form = () => {
  const [username, setUserName] = useState("");
  const handleChange = (event) => {
    const val = event.target.value;
    setUserName(val);
  };
  return (
    <>
      <input
        type="text"
        value={username}
        onChange={handleChange}
        placeholder="User Name"
      />
      <p>Hello, {username}.</p>
    </>
  );
};

export default Form;
