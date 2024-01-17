package org.codefinity.reactquestions;
/*
 *   Question x:
 *
 *
 *   Answer:
 *
 */
public class ReactDummyClass {
    /*
     *   Question 1:
     *   What is a prop in React and how is it used in components?
     *
     *   Answer:
     *   A prop (Property) in react provides a means for the parent component to pass data down to a child component.
     *   Props are read only and allow the parent component to pass configuration to the child component as attributes.
     */

    /*
     *   Question 2:
     *   How do you import named vs exported components?
     *
     *   Answer:
     *   import Comp from './Comp'; if Comp was exported as default. Import {Comp} from './Comp'; for named export.
     */

    /*
     *   Question 3:
     *   What is the difference between a class component and a functional component in React?
     *
     *   Answer:
     *   A class component needs to extend React.Component and render which returns a React component to the DOM. Class
     *   component has its own state and constructor.
     *   A functional component is a simple JavaScript function which takes an argument of props (may be empty) and
     *   returns JSX to the DOM to be rendered. With the introduction of props, functional components can also handle or
     *   maintain state.
     */

    /*
     *   Question 4:
     *   What is the purpose of the useState hook in React?
     *
     *   Answer:
     *   UseState is a React hook which allows functional components to have state management without having to convert
     *   the class into a class component. UseState returns the state and a function to set the state which when called
     *   triggers the component to re-render on the virtual DOM.
     */

    /*
     *   Question 5:
     *   What is the significance of keys in React when rendering a list of components?
     *
     *   Answer:
     *   Unique keys are used to identify each item in the list element. By each item having a unique key, it can be
     *   identified by the list component and this helps render items efficiently when updating lists.
     */

    /*
     *   Question 6:
     *   What are React hooks and how do they differ from class components?
     *
     *   Answer:
     *   React hooks are functions that allow functional React components to manage state and handle side effects
     *   without having to convert into class components. Class component handles its own state and have its own
     *   constructor.
     */

    /*
     *   Question 7:
     *   Write a functional component called Navbar that renders a navigation bar with links. It should receive an
     *   array of links as a prop, and each link should be displayed as an anchor tag within a list item.
     *
     *   Answer:
     *   See Coderpad_interview_react project for file Navbar.js
     */

    /*
     *   Question 8:
     *   Explain the concept of React Context and when it is appropriate to use it in a React application.
     *
     *   Answer:
     *   React Context is a React API which allows for the sharing of props throughout the component tree without prop
     *   drilling. This allows distant child components , at any level in the component tree, to be able to access props
     *   from the parent component by subscribing to the Context which the parent component provides.
     */

    /*
     *   Question 9:
     *   Explain the concept of React Hooks and how they enhance functional components.
     *
     *   Answer:
     *   React hooks are functions that allow the functional components of React to be able to manage state (useSate)
     *   handle side effects (useEffect) as well as use lifecycle methods without having to make class components.
     */

    /*
     *   Question 10:
     *   What is the purpose of the useEffect hook in React?
     *
     *   Answer:
     *   UseEffect is a React hook used to handle side effects and runs code whenever component mounts, updates etc.
     *   UseEffect takes in two arguments, the callback function and the dependency array.
     *   1. The callback function runs when the component is finished rendering
     *   2. The dependency array specifies triggers that will trigger the effect to run
     *      Ex: An empty dependency array indicates a component should run only once, mimicking a ComponentDidMount.
     */

    /*
     *   Question 11:
     *   Write a functional component called Counter that renders a counter with increment and decrement buttons. It
     *   should maintain its own internal state for the count value and update it accordingly when the buttons are
     *   clicked.
     *
     *   Answer:
     *   See Coderpad_interview_react project for file CountUpDown.js
     */

    /*
     *   Question 12:
     *   Explain the concept of React Prop Drilling and suggest an approach to mitigate it. Explain Redux.
     *
     *   Answer:
     *   Prop drilling refers to the practice of passing down props through multiple levels of component tree, even
     *   through components that might not use the props themselves. Can be avoided by using Context API for small scale
     *   applications or Redux for large scale applications. Redux is a standalone state management library that uses a
     *   centralized store for managing the complex state in larger JavaScript applications.
     */

    /*
     *   Question 13:
     *   What is the purpose of React Router in a React application, and how does it work?
     *
     *   Answer:
     *   React Router is a library used to manage routes between multiple components in a single page React application.
     *   React router defines the route-component mapping and manages the URLs and assigns the current URL based on the
     *   router-component relationship during UI navigation.
     */

    /*
     *   Question 14:
     *   Explain the concept of virtual DOM in React and how it improves performance. Discuss the diffing algorithm used
     *   by React to update the virtual DOM efficiently.
     *
     *   Answer:
     *   The web page in view is rendered to the Browser DOM (Document Object Model). But when the state changes in the
     *   React application, React does not re-render the Browser DOM. React instead keeps a virtual copy of the DOM in
     *   memory and iteratively compares the previous virtual DOM to the current virtual DOM on every change to the UI
     *   and renders just the component that is affected instead of the entire DOM.
     */
}
