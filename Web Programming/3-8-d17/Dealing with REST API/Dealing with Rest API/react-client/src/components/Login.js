import React from 'react';

class Login extends React.Component {

    render(){
        return(
            <div>
                <center>
                <p> Welcome To Login Page </p>
                <br/>
                <form style={{border:'1px solid'}}>
                    <br/>
                    Username : <input type="text" name="uname" />
                    <br/><br/>
                    Password : <input type="password" name="pwd" />
                    <br/><br/>
                    <input type="submit" value="Login" />
                    <br/><br/>
                </form>
                </center>
            </div>
        );
    }

}

export default Login;