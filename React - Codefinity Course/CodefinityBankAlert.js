import { createRoot } from "react-dom/client";
const root = createRoot(document.getElementById("root"));

//Create the Message chile component.
const Message = (props) =>
  props.moneyAvailable - props.price > 0 ? (
    <p>
      Success! The remaining amount of money for {props.name} is:
      {props.moneyAvailable - props.price}. Thank you!
    </p>
  ) : (
    <p>
      Failure! The bank account balance for {props.name} is:
      {props.moneyAvailable}. Unfortunately, you need to pay: {props.price}.
    </p>
  );

//Create the main App parent component.
const App = () => (
  <div>
    <Message moneyAvailable={123} price={25} name="Sthe" />
    <Message moneyAvailable={12} price={78} name="Vusi" />
    <Message moneyAvailable={589} price={358} name="Ted" />
    <Message moneyAvailable={147} price={150} name="Atlas" />
  </div>
);
root.render(<App />);
