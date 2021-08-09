import React from "react";
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';

class LoginCompo extends React.Component {

    constructor(props){
        super(props);
    }

    render(){
        return(
            <div style={{ display: 'block', 
            width: 500, 
            padding: 45 ,
            border: '2px Solid blue'}}>

                <h4>React-Bootstrap Form Component</h4><br></br>

                <Form>
                    <Form.Group>
                        <Form.Label>UserName</Form.Label>
                        <Form.Control type="text" 
                        placeholder="Enter user name" />
                    </Form.Group>
                    <Form.Group>
                        <Form.Label> Password </Form.Label>
                        <Form.Control type="text" 
                        placeholder="Enter your password" />
                    </Form.Group><br></br>
                    <Button variant="primary" type="submit">Login</Button>
                </Form>    



            {/*    <form style = {{border:'1px solid',width:'400px',height:'220px'}}>                    
                    <h3>Login Form</h3><br/>
                    <label>UserName  :  </label>  <input type ="text" name="uname" /> <br /><br />
                    <label>Password  :  </label>  <input type="password" name="pwd" /> <br /><br />
                    <input type="submit" /> <br /> <br />             
                </form>*/} 
            </div>
        );
    }
}
export default LoginCompo;