import './App.css';
import Btn from './Btn';
import Counter from './Counter';
import TodoList from './TodoList';
import CountUpDown from './CountUpDown';

let TODOS = [
  {
    id: 0,
    text: "Work more",
    status: "open"
  },

  {
    id: 0,
    text: "Work more and more",
    status: "closed"
  },
];
function App() {
  return (
    <div className='Container'>
      <Btn />
      <Counter isLoggedIn={true}/>
      <TodoList todos={TODOS}/>
      <CountUpDown />
    </div>
  );
}

export default App;
