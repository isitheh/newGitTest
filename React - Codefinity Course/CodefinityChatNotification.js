import React from 'react';
import { createRoot } from 'react-dom/client';

const App = () => {
	return (
		<>
			<Notification messages={[
				{message: "Message 1"},
				{message: "Message 2"},
				{message: "Message 3"},
				{message: "Message 4"},
				{message: "Message 5"}
			]} />
		</>
	);
}

const Notification = (props) => {
	return (
		<>
		(props.messages.length > 0) && (
			<p>You have {props.messages.length} of unread messages.</p>
		);
		</>
	);
}

const Container = document.getElementById("root");
const root = createRoot(Container);
root.render(<App/>);