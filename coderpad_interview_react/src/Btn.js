import React from 'react';

function Btn(props) {
  const handleClick = () => {
    props.onClick();
  };

  return <button onClick={handleClick}>Click me</button>;
}

export default Btn;