import React from 'react';
import '../App.css';



class DisplayParagraph extends React.Component{

    constructor(props){
        super(props);
        this.state={color:"blue"};
    }

    // Used arrow function so no need to bind this object reference.
    changeParagraphTextColor = () => {
        this.setState({color:"red"});
    }

    render(){

        return(
            <div>
                <p style={{ color : this.state.color}} onClick={this.changeParagraphTextColor}> Following are the topics of ReactJS : <br />
                
                  <ul>                 
                    <li>Component</li>
                    <li>Props</li>
                    <li>State</li>          
                  </ul>  
                </p>
            </div>
        );
    }
}

export default DisplayParagraph;