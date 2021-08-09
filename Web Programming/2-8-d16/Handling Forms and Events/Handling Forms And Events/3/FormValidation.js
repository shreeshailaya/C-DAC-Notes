import React from 'react';
export default class FormValidation extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            emailid: null,
            password: null,
            errors:{
                emailerror: "",
                pwderror:""
            },
            valid: false,
            emailValid : false,
            pwdValid:false
        }
      }

      

      handleInput=(e)=>{
        /*let email=e.target.value;
        this.setState({emailid: email});*/
        const emailregex = /^[A-Za-z0-9.-]{5,}@[A-Za-z0-9.-]{4,}\.[a-z]{2,5}$/;

        
        const input = e.target;
        const nm = input.name;
        let val = input.value;
        let errors = this.state.errors;
        let emailflag = this.state.emailValid;
        let pwdflag= this.state.pwdValid;
        switch(nm)
        {
            case 'emailid':
                 if(!emailregex.test(val))
                 {
                    errors.emailerror = "Email invalid";
                 }
                 else
                 {
                    errors.emailerror = "";  
                    emailflag = true;
                 }
                 break;
            case 'password':
                if(val.length < 5)
                    errors.pwderror = "pwd should be more than 5 chars";
                else
                {
                    errors.pwderror = ""   
                    pwdflag = true;
                } 
                break;
        }

        this.setState({errors, emailValid: emailflag, pwdValid: pwdflag, [nm]: val},() =>{this.setState({valid: this.state.emailValid && this.state.pwdValid})});
    }

    submitForm=(e)=>{
        e.preventDefault();
        alert("form is getting submitted");
        console.log(this.state);
    }
     
      render() {
        return (
          <div>
            <h1>Form Validation Example</h1>
            <form>
                     <label>Enter emailid : </label>
                    <input type="text" name="emailid" value={this.state.emailid} onChange={this.handleInput}/>
                    <br/>
                    <label>Select passowrd : </label>
                    <input type="password" name="password" value={this.state.password} onChange={this.handleInput}/>
                    <br/>
                    <input type="submit" className="btn btn-primary" value="Register" onClick={this.submitForm} disabled={!this.state.valid}/>
                    <br/>
                    {this.state.errors.emailerror} 
                    {this.state.errors.pwderror}
                    
            </form>
          </div>
        );
      }
}