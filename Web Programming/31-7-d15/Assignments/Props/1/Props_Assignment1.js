import React from 'react';

class Factorial extends React.Component {
    constructor(props){
        super(props);
    }

    /*  Calculates Factorial  */
    calculateFactorial(num){
        var fact =1;
        var i=1;
        for(i=1;i<=num;i++){
            fact = fact *i;
        }
        return fact;
    }

    render(){
        return(<h3>Calculate Factorial : {this.calculateFactorial(this.props.number)}</h3>);
    } 
}

export default Factorial;