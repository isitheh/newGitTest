import React, { useState } from 'react';

const ToggleVisibility = () => {
	const [toggleState, setToggleState] = useState(false);
	const showHide = () => {
		setToggleState(!toggleState);
	}
	return (
		<>
			<button onClick={showHid}>Show/Hide</button>
			{toggleState && <p>Shown/Hidden</p>}
		</>
	)
}

export default ToggleVisibility;