import React from "react";
import {Table}  from 'react-bootstrap';

class WelcomeCompo extends React.Component {

    constructor(props){
        super(props);
    }

    render() {
        return(
            <div>
                <h1> Welcome To React </h1> <br></br><br></br>

  <Table striped bordered hover>
    <thead>
      <tr>
        <th width="470">Feature</th>
        <th width="870">Discription</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td> The Virtual DOM </td>
        <td> An in-memory representation of the DOM and a reconciliation algorithm that
             is at the heart of React’s performance.</td>
        
      </tr>
      <tr>
        <td>Declarative Programming & State </td>
        <td> State is the data that describes what your component renders as its content. 
            You simply update the state and React manages the rest of the process that leads to the view getting updated. 
            This is known as declarative programming where you simply describe your views in terms of data that it has to show.</td>
    
      </tr>
      <tr>
        <td> Components </td>
        <td>Everything that you build with React, is known as a component. By breaking down UIs into functional
             and atomic pieces, you can compose together interfaces that scale well.
             The image below demonstrates a login interface which has been composed together using three components.</td>
    
      </tr>
      <tr>
        <td>JSX</td>
        <td>The render method inside a class component or the function component itself allows you to use JSX,
             which is like an XML language that incorporates JavaScript expressions.
             Internally, JSX is compiled into efficient render functions.</td>
      </tr>
      <tr>
        <td>Synthetic Events </td>
        <td>Browsers handle events differently. React wraps browser specific implementations into Synthetic Events,
             which are dispatched on user interaction.
             React takes care of the underlying browser specific implementation internally.</td>
      </tr>
      <tr>
        <td>Props </td>
        <td>Components can either fetch data from an API and store in the local state, or they can ingest data using props, which are like inlets into a prop.
             Components re-render if the data in the props update.</td>
      </tr>    
    </tbody>
  </Table>
  </div>
    )
    }
}

export default WelcomeCompo;


/* npm install bootstrap
   npm install react-bootstrap
*/