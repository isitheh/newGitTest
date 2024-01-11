import React from 'react';
import { createRoot } from 'react-dom/client';

const styledBoxStyles = {
	backgroundColor: "lightblue",
	width: "300px",
	padding: "10px",
	borderRadius: "10px",
	textAlign: "center",
	fontSize: "24px",
	fontWeight: "bold",
};

const StyledBox = () => (
	<>
		<div style={styledBoxStyles}>
			Five Finger Death Punch
		</div>
	</>
);

const App = () => (
	<>
		<StyledBox />
	</>
);

const Container = document.getElementById("root");
const root = createRoot(Container);
root.render(<App />);