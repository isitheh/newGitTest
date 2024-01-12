import React, { useRef } from 'react';

const FormInput = () => {
	const focusRef = useRef();
	const doFocus = () => {
		focusRef.current.focus();
	}
	return (
		<>
			<input type="text" ref={focusRef}/>
			<button onClick={doFocus}>Click Me</button>
		</>
	);
}

export default FormInput;