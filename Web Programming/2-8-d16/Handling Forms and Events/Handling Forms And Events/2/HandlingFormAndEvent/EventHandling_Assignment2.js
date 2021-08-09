import React from 'react';

class RegFormComponent extends React.Component {
    constructor(props){
        super(props);
        this.state = {emailId:"",pwd:"",gender:"",city:"",checkFlag:false};
    }

    handleInput = (e) => {
        const input = e.target;
        const nm = input.name;

        
        const value = input.type==="checkbox"?input.checked:input.value;
        this.setState({[nm]:value});            
    }

    submitForm = (e) => {
        e.preventDefault();
        console.log(this.state);
    }

    render() {

        return(
            <div>
                <form style = {{border:'1px solid',width:'400px',height:'350px'}}>                    
                    <h3>Registration Form</h3><br/>
                    <label>Email ID  :  </label>  <input type ="email" name="emailId" onChange={this.handleInput}/> <br /><br />
                    <label>Password  :  </label>  <input type="password" name="pwd" onChange={this.handleInput}/> <br /><br />

                    <label> Select Gender  :  </label>  
                    <input type ="radio" name="gender" value="Female" onChange={this.handleInput}/><label>Female</label>  
                    <input type ="radio" name="gender" value="Male" onChange={this.handleInput}/><label>Male</label>
                    <br /><br />

                    <label>City    :  </label>  <input type="text" name="city" onChange={this.handleInput}/> <br /><br />
                    <input type="checkbox" name="checkFlag" onChange={this.handleInput} /><label>I agree </label> <br /> <br /> 
                    <input type="submit" onClick={this.submitForm}/> <br /> <br />                   
                    <br /><br /> 
                </form><br/>

                <p>
                    Details:<br />
                    Email Address : {this.state.emailId} <br />
                    Gender        : {this.state.gender} <br />
                    city          : {this.state.city} <br />
                    I agree       : {this.state.checkFlag.toString()} <br />
                </p>
            </div>
        );
    }
}

export default RegFormComponent;