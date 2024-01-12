import React from "react";
import { createRoot } from "react-dom/client";
import "./CodefinityCSSFileStylingChallenge.css";

const Alert = (props) => <div className="alert">{props.children}</div>;

const App = () => (
  <Alert>
    <p className="text">Success: Thank You!</p>
  </Alert>
);

const Container = document.getElementById("root");
const root = createRoot(Container);
root.render(<App />);