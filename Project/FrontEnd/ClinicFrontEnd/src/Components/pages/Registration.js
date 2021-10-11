import React, { useContext } from 'react';
//import './Login.css';
import Header from './homePageComponents/Header';
import { withRouter, Redirect } from 'react-router-dom';
import Cookies from 'universal-cookie';

class Registration extends React.Component {
    /**
     * @param props
     */
    constructor(props) {
        super(props);
        this.sms_api = "http://sms.vitkar.tech/sendSMS?username=Mech2it&message=ClinicAPICALLFROMREACT&sendername=SHREVI&smstype=PROMO&numbers=8483036123&apikey=01255428-72b3-4535-a284-70efbf746fb7"
        
        this.state =
            {
                role_id : "",
                fname : "",
                lname : "",
                contact_no : "",
                address : "",
                gender : "",
                dob : "",
                email : "",
                password : "",
                errormessage : ""

            }


        this.role_id = this.role_id.bind(this);
        this.fname = this.fname.bind(this);
        this.lname = this.lname.bind(this);
        this.contact_no = this.contact_no.bind(this);
        this.address = this.address.bind(this);
        this.gender = this.gender.bind(this);
        this.dob = this.dob.bind(this);
        this.email = this.email.bind(this);
        this.password = this.password.bind(this);
        this.register = this.register.bind(this);

    }

    /**
     * Set state of role_id
     * @param event
     */
    role_id(event) {
        this.setState({ role_id : event.target.value });
        console.log(event.target.value)
    }

    /**
     * Set state of fname
     * @param event
     */
    fname(event) {
        this.setState({ fname : event.target.value });
        console.log(event.target.value)
    }

    /**
     * Set state of lname
     * @param event
     */
    lname(event) {
        this.setState({ lname : event.target.value });
        console.log(event.target.value)
    }

    /**
     * Set state of contact_no
     * @param event
     */
    contact_no(event) {
        this.setState({ contact_no : event.target.value });
        console.log(event.target.value)
    }

    /**
     * Set state of address
     * @param event
     */
    address(event) {
        this.setState({ address : event.target.value });
        console.log(event.target.value)
    }

    /**
     * Set state of gender
     * @param event
     */
    gender(event) {
        this.setState({ gender : event.target.value });
        console.log("gender" + event.target.value);
    }

    /**
     * Set state of dob
     * @param event
     */
    dob(event) {
        this.setState({ dob : event.target.value });
        console.log("dob" + event.target.value);
    }

    /**
     * Set state of email
     * @param event
     */
    email(event) {
        this.setState({ email : event.target.value });
        console.log(event.target.value)
    }

    /**
     * Set state of password
     * @param event
     */
    password(event) {
        this.setState({ password : event.target.value });
        console.log(event.target.value)
    }

    /*
    
          "account_id": 7,
            "email":"abcd@gmail.com",
            "password":"1235",
            "fname":"xyz",
             "lname":"aaa",
            "contact_no":"11111",
            "gender":"M",
            "address":"abcs",
            "role_id":"3",
            "dob":"2021-09-22"
    
      */
    /**
     * fetch data, set cookies and redirect based on role_id
     * @param event
     */
    register(event) {

        alert("register");
        const requestOptions = {
            method : 'POST',
            headers : {
                'Content-Type' : 'application/json'
            },
            body : JSON.stringify({
                email : this.state.email,
                password : this.state.password,
                fname : this.state.fname,
                lname : this.state.lname,
                contact_no : this.state.contact_no,
                address : this.state.address,
                gender : this.state.gender,
                dob : this.state.dob,
                role_id : this.state.role_id
            })


        };
        fetch("http://localhost:8080/auth/v1/registeration", requestOptions)
            /*.then(response=>response.json())
            .then(data=>alert("Register Successful"));
            this.props.history.push("/login");
   
            console.log(requestOptions);*/



            .then(resp => resp.text())
            .then(data => {
                if (data.length != 0) {
                    alert(data)
                    const json = JSON.parse(data);
                    if (json.role_id == 2) {
                        const cookies = new Cookies();
                        var dr_id = json.u_id;
                        alert(dr_id);
                        cookies.set('dr_id', dr_id, { path : '/' });
                        alert("cookies" + cookies.get('dr_id'));

                        this.props.history.push("/dr_registration");
                    } else {
                        this.props.history.push("/login");
                    }
                }
            });


        /*
        if(this.state.role==1){
         alert(this.sms_api)
         this.props.history.push(this.sms_api);
         this.props.history.push('/dr_registration');
        }
        else if(this.state.role==2)
        {
         this.props.history.push('/Login');
        }
        */
    }


    render() {

        return (
            <div>
                <Header/>
                <section className="h-100 bg-dark">

                    <div className="container py-5 h-100">
                        <div className="row d-flex justify-content-center align-items-center h-100">
                            <div className="col">
                                <div className="card card-registration my-4">
                                    <div className="row g-0">
                                        <div className="col-xl-6 d-none d-xl-block">
                                            <img
                                                src="https://mdbootstrap.com/img/Photos/new-templates/bootstrap-registration/img4.jpg"
                                                alt="Sample photo"
                                                className="img-fluid"
                                                style={ {
                                                    "border-top-left-radius" : ".25rem",
                                                    "border-bottom-left-radius" : ".25rem"
                                                } }
                                            />
                                        </div>


                                        <div className="col-xl-6">

                                            <form className="row g-3 needs-validation" noValidate>

                                                <div className="card-body p-md-5 text-black">
                                                    <h3 className="mb-5 text-uppercase">Registration form</h3>


                                                    <div className="row">
                                                        <div className="col-md-6 mb-4">
                                                            <select className="select" value={ this.state.role_id }
                                                                    onChange={ this.role_id }>
                                                                <option value="0">Select User Type</option>
                                                                <option value="2">Doctor</option>
                                                                <option value="3">Patient</option>

                                                            </select>
                                                        </div>
                                                    </div>


                                                    <div className="row">
                                                        <div className="col-md-6 mb-4">
                                                            <div className="form-outline">
                                                                <input type="text" id="validationCustom01"
                                                                       className="form-control form-control-lg"
                                                                       value={ this.state.fname }
                                                                       onChange={ this.fname }
                                                                       placeholder="First Name"/>

                                                            </div>

                                                        </div>


                                                        <div className="col-md-6 mb-4">
                                                            <div className="form-outline">
                                                                <input type="text" id="form3Example1n"
                                                                       className="form-control form-control-lg"
                                                                       value={ this.state.lname }
                                                                       onChange={ this.lname } required
                                                                       placeholder="Last Name"/>


                                                            </div>

                                                        </div>


                                                        <div className="form-outline mb-4">
                                                            <input type="" id="form3Example8"
                                                                   className="form-control form-control-lg"
                                                                   value={ this.state.contact_no }
                                                                   onChange={ this.contact_no } required
                                                                   placeholder="Contact No"/>


                                                        </div>


                                                    </div>

                                                    <div className="form-outline mb-4">
                                                        <input type="text" className="form-control form-control-lg"
                                                               id="validationCustom031" value={ this.state.address }
                                                               onChange={ this.address } required
                                                               placeholder="Address"/>


                                                    </div>
                                                    {/*
                <div className="form-outline mb-4">
                  <input type="text" id="form3Example8" className="form-control form-control-lg" value={this.state.address} onChange={(event)=>this.address(event)} />
                  
                
                  <label className="form-label" for="form3Example80">Address</label>
                </div>
                */ }
                                                    <div
                                                        className="d-md-flex justify-content-start align-items-center mb-4 py-2">

                                                        <h6 className="mb-0 me-4">Gender: </h6>

                                                        <div className="form-check form-check-inline mb-0 me-4">
                                                            <input
                                                                className="form-check-input"
                                                                type="radio"
                                                                name="inlineRadioOptions"
                                                                id="femaleGender"
                                                                value="female"
                                                                onChange={ this.gender }
                                                            />
                                                            <label className="form-check-label"
                                                                   htmlFor="femaleGender">Female</label>
                                                        </div>

                                                        <div className="form-check form-check-inline mb-0 me-4">
                                                            <input
                                                                className="form-check-input"
                                                                type="radio"
                                                                name="inlineRadioOptions"
                                                                id="maleGender"
                                                                value="male"
                                                                onChange={ this.gender }
                                                            />
                                                            <label className="form-check-label"
                                                                   htmlFor="maleGender">Male</label>
                                                        </div>

                                                        <div className="form-check form-check-inline mb-0">
                                                            <input
                                                                className="form-check-input"
                                                                type="radio"
                                                                name="inlineRadioOptions"
                                                                id="otherGender"
                                                                value="other"
                                                                onChange={ this.gender }
                                                            />
                                                            <label className="form-check-label"
                                                                   htmlFor="otherGender">Other</label>
                                                        </div>

                                                    </div>


                                                    <div className="form-outline mb-4">
                                                        <label className="form-label" for="form3Example9">Date of
                                                            Birth</label>
                                                        <input type="date" id="form3Example9"
                                                               className="form-control form-control-lg; form-control datepicker"
                                                               value={ this.state.dob } onChange={ this.dob } required/>


                                                    </div>


                                                    <div className="form-outline mb-4">
                                                        <input type="email" id="form3Example97"
                                                               className="form-control form-control-lg"
                                                               value={ this.state.email } onChange={ this.email }
                                                               required placeholder="Email address"/>


                                                    </div>
                                                    <div className="form-outline mb-4">
                                                        <input type="password" id="form3Example97"
                                                               className="form-control form-control-lg"
                                                               value={ this.state.password } onChange={ this.password }
                                                               required placeholder="Password"/>

                                                    </div>

                                                    <div>
                                                        <button type="button" className="btn btn-warning btn-lg ms-2"
                                                                onClick={ this.register }>Create Account
                                                        </button>

                                                        <button type="button" className="btn btn-light btn-lg">Reset all
                                                        </button>
                                                    </div>

                                                </div>
                                            </form>
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

}

export default withRouter(Registration);