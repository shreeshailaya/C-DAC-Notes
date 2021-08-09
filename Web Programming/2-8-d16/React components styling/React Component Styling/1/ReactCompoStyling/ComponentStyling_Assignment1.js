import React from "react";
import '../App.css';
import mystyle from './mystyle.module.css' ;

class BootstrapCompo extends React.Component {

    constructor(props){
        super(props);

    }

    render(){
        return(
            <div>
                <p className="mymessage" style={{color: 'yellow',background: 'blue'}}> Hello World </p>
                <p className={mystyle.cssModule} style={{color: 'red'}}> Hello World </p>
            </div>
        )
    }

}

export default BootstrapCompo;