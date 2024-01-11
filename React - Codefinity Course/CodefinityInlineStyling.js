import React from 'react';
import { createRoot } from 'react-dom/client';

const appStyles = {
	fontWeight: 700,
	fontSize: "32px",
	color: "red"
};

const App = () => (
	<>
		<h1 style={appStyles}>This is App</h1>
	</>
);