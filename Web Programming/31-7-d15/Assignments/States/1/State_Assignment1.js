import React from 'react';

class DisplayMessage extends React.Component {

    constructor(props){
        super(props);
        this.state = { message : "Welcome"};
        // binding this object reference to updateMeaasge function
        this.updateMessage = this.updateMessage.bind(this);
    }

    updateMessage(){
        this.setState({ message:"Hello"});
    } 

    render(){
        return(
        
            <div>
                <p>{this.state.message}</p>
                <button onClick={this.updateMessage}> Change Message</button>
            </div>
        );
    
    }
}

export default DisplayMessage;