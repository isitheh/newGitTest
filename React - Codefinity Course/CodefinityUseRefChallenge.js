import React, { useRef } from 'react';

const Form = () => {
	const emailRef = useRef(null);
	const passwordRef = useRef(null);
	const onSubmit = () => {
		emailRef.current.value = "";
		passwordRef.current.value = "";
	}
	return (
		<>
			<input type="text" ref={emailRef}/>
			<input type="password" ref={passwordRef}/>
			<button onClick={onSubmit}>Submit</button>
		</>
	);
}