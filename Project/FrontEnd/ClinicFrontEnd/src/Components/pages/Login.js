import React, { useContext } from 'react';
//import './Login.css';
import Header from './homePageComponents/Header';
import { withRouter, Redirect } from 'react-router-dom';
import ForgetPassword from './ForgetPassword';
import axios from 'axios';
import Cookies from 'universal-cookie'

class Login extends React.Component{ 
  //declare states
  constructor(props)
  {
    super(props);
    this.state=
    {
      email:"",
      password:"",
      patient:{},
      doctor:{},
      admin:{},
      loginerr:""

    }

    this.email=this.email.bind(this);
    this.password=this.password.bind(this);
  }

  email=(event)=>{
    this.setState({email: event.target.value});
  }
  password=(event)=>{
    this.setState({password: event.target.value});
  }

  forgetPassword =()=>
  {
    this.props.history.push("/forget_password");
  }

  //form onClick handler
  submitData =(e)=>
  {

    e.preventDefault();
    
    const requestOptions={
      method:'POST',
      headers:{
        'Content-Type':'application/json'
      },
      body:JSON.stringify({
       email: this.state.email,
       password: this.state.password

      })
    }
    
    const cookies = new Cookies();
   
    fetch("http://localhost:8080/auth/v1/login1",requestOptions)
    .then(resp=>resp.text())
    .then(data=> {if(data.length != 0){
      alert(data)
     const json = JSON.parse(data);
     
     
     if(json.role_id==2) 
     {
      this.setState({patient: json}); 
      cookies.set('u_id',json.u_id,{path:'/'})
      localStorage.setItem("loggedinuser", JSON.stringify(this.state.doctor));
      //mystore.dispatch({type: 'LOGGEDIN'})
      this.props.history.push("/doctor");
     }else if(json.role_id==3)
     {
      this.setState({doctor: json}); 
      cookies.set('u_id',json.u_id,{path:'/'})
      localStorage.setItem("loggedinuser", JSON.stringify(this.state.patient));
      //mystore.dispatch({type: 'LOGGEDIN'})
      this.props.history.push("/patient");
     }else if(json.role_id==1)
     {
       alert("admin")
      this.setState({admin: json}); 
      cookies.set('u_id',json.u_id,{path:'/'})
      localStorage.setItem("loggedinuser", JSON.stringify(this.state.admin));
      //mystore.dispatch({type: 'LOGGEDIN'})
      this.props.history.push("/admin");
     }
    }
    else
    {
    this.setState({loginerr: "wrong ID/pwd"});
    alert(this.state.loginerr);
    }
  });

  }

  render(){
  return (
    <div>
        <Header />
        <section class="h-100 bg-dark">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card card-registration my-4">
          <div class="row g-0">
            <div class="col-xl-6 d-none d-xl-block">
              <br/><br/>
              <img
                src="https://sgimed.com/images/blog/2020/2020-11-p001.jpg"
                alt="Sample photo"
                class="img-fluid"
                style={{"border-top-left-radius": ".25rem","border-bottom-left-radius": ".25rem"}} 
              />
            </div>
            
            <div class="col-xl-6">
           
            //login form
            <form class="row g-3 needs-validation" novalidate>

              <div class="card-body p-md-5 text-black">
                <h3 class="mb-5 text-uppercase">Login form</h3>

                <div class="form-outline mb-4">
               
                  <input type="email" id="form3Example97" class="form-control form-control-lg" value={this.state.email} onChange={this.email} required placeholder="Email address"/>
                  
                </div>
                <div class="form-outline mb-4">
                
                  <input type="password" id="form3Example97" class="form-control form-control-lg" value={this.state.password} onChange={this.password} required placeholder="Password"/>
                  
                </div>

                <div class="d-flex ">
                <button type="submit" class="btn btn-warning btn-lg ms-2" onClick={this.submitData}>Login</button>
                  <button type="submit" class="btn btn-light btn-lg" onClick={this.forgetPassword}>Forgot Password</button>
                  
                </div>

              </div></form>
              <p class="text-danger">{this.state.loginerr}</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
  </div>
  );
  }
};

export default withRouter(Login);
