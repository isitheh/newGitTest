import { createRoot } from "react-dom/client";

const mToysData = [
  { id: 1, name: "Buzz Light Year" },
  { id: 2, name: "Sofia The First" },
  { id: 3, name: "Barney" },
  { id: 4, name: "Danger Force" },
];

const ToysComp = (props) => (
  <ul>
    {props.toys.map((toy) => {
      <li key={toy.id}>{toy.name}</li>;
    })}
  </ul>
);

const App = () => (
  <>
    <ToysComp toys={mToysData} />
  </>
);

const Container = document.getElementById("root");
const root = createRoot(Container);
root.render(<App />);