import React  from 'react';

class LoginComponent extends React.Component {
    constructor(props){
        super(props);
        this.state = {uname:"", pwd:""};
    }

    submitForm =(e) => {
        e.preventDefault();        
        console.log(this.state);
    }

    handleInput = (e) => {
        const input = e.target;
        const nm = input.name;
        const value = input.value;
        this.setState({[nm]:value});            
    }

    render(){
        return(
            <div>
                <form style = {{border:'1px solid',width:'400px',height:'220px'}}>                    
                    <h3>Login Form</h3><br/>
                    <label>UserName  :  </label>  <input type ="text" name="uname" onChange={this.handleInput}/> <br /><br />
                    <label>Password  :  </label>  <input type="password" name="pwd" onChange={this.handleInput}/> <br /><br />
                    <input type="submit" onClick={this.submitForm}/> <br /> <br /> 
                    <p> Welcome {this.state.uname}</p>
                    <br /><br /> 
                </form>
            </div>
        );
    }
}

export default LoginComponent;