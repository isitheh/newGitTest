import React from "react";
import { createRoot } from "react-dom/client";

const appStyles = {
  fontWeight: 700,
  fontSize: "32px",
  color: "red",
};

const notificationStyles = {
  padding: "20px",
  fontSize: "24px",
  color: "aquamarine",
};

const setBackgroundColor = (behavior) => {
  switch (behavior) {
    case "positive":
      return "green";
    case "negative":
      return "red";
    case "neutral":
      return "blue";
    default:
      return "transparent";
  }
};

const Notification = (props) => (
  <>
    <p
      style={{
        notificationStyles,
        backgroundColor: setBackgroundColor(props.behavior),
      }}
    >
      {props.text}
    </p>
  </>
);

const App = () => (
  <>
    <h1 style={appStyles}>This is App</h1>
    <Notification text="Success" behavior="positive" />
    <Notification text="Failure" behavior="negative" />
    <Notification text="Information" behavior="neutral" />
  </>
);

const Container = document.getElementById("root");
const root = createRoot(Container);
root.render(<App />);
