import React, { useContext } from 'react';
import { withRouter } from 'react-router';
import NavbarPatient from './NavbarPatient';
import Cookies from 'universal-cookie';
import { CalendarContainer } from 'react-datepicker';


class BookAppointment extends React.Component {
    /**
     * @param props
     */
    constructor(props) {
        super(props);
        this.state =
            {
                "fname" : "",
                "lname" : "",
                "email" : "",
                "contact_no" : "",
                "address" : "",
                "password" : "",
                "app_date" : "",
                "app_time" : "",
                "bdr_id" : "",
                "u_id" : ""

            }


        this.fname = this.fname.bind(this);
        this.lname = this.lname.bind(this);
        this.contact_no = this.contact_no.bind(this);
        this.address = this.address.bind(this);
        this.email = this.email.bind(this);
        this.password = this.password.bind(this);
        this.app_date = this.app_date.bind(this);
        this.app_time = this.app_time.bind(this);
        // this.onSubmit=this.onSubmit.bind(this);


    }

    /**
     * fetch data and set state data
     */
    componentDidMount() {
        const dr_id = window.location.search;
        const params = new URLSearchParams(dr_id);

        var bdr_id = params.get("bdr_id");
        const cookies = new Cookies();
        cookies.set('bdr_id', bdr_id, { path : '/' })

        this.setState({ bdr_id : cookies.get('bdr_id') })
        //const cookies = new Cookies();
        var api_get = "http://localhost:8080/auth/v1/get_by_id?user_id=" + cookies.get('u_id')
        fetch(api_get)
            .then(resp => resp.text())
            .then(data => {
                    alert(data)
                    const json = JSON.parse(data);


                    //alert(myobj[0].fname)
                    this.setState({ u_id : json[0].u_id });
                    this.setState({ fname : json[0].fname });
                    this.setState({ lname : json[0].lname });
                    this.setState({ email : json[0].email });
                    this.setState({ contact_no : json[0].contact_no });
                    this.setState({ password : json[0].password });
                    this.setState({ address : json[0].address });

                    alert(this.state.u_id)

                }
            );


    }

    /**
     * fetch data
     */
    bookApp() {
        alert(this.state.u_id)
        const cookies = new Cookies();
        const requestOptions = {
            method : 'POST',
            headers : {
                'Content-Type' : 'application/json'
            },
            body : JSON.stringify({

                u_id : this.state.u_id,
                dr_id : this.state.bdr_id,
                app_date : this.state.app_date,
                app_time : this.state.app_time

            })


        };
        fetch("http://localhost:8080/auth/v1/book_app", requestOptions)
            .then(resp => resp.text())
            .then(data => {
                if (data.length != 0) {
                    alert(data)
                    //const json = JSON.parse(data);

                }
            });

    }


    /**
     * Set state of fname
     * @param event
     */
    fname = (event) => {
        this.setState({ fname : event.target.value });
        console.log(this.state);
    }

    /**
     * Set state of lname
     * @param event
     */
    lname = (event) => {
        this.setState({ lname : event.target.value });
        console.log(this.state);
    }


    /**
     * Set state of email
     * @param event
     */
    email = (event) => {
        this.setState({ email : event.target.value });
        console.log(this.state);
    }


    /**
     * Set state of contact_no
     * @param event
     */
    contact_no = (event) => {
        this.setState({ contact_no : event.target.value });
        console.log(this.state);
    }

    /**
     * Set state of address
     * @param event
     */
    address = (event) => {
        this.setState({ address : event.target.value });
        console.log(this.state);
    }
    
    /**
     * Set state of password
     * @param event
     */
    password = (event) => {
        this.setState({ password : event.target.value });
        console.log(this.state);
    }

    /**
     * Set state of app_date
     * @param event
     */
    app_date = (event) => {
        this.setState({ app_date : event.target.value });
        console.log(this.state);
    }

    /**
     * Set state of app_time
     * @param event
     */
    app_time = (event) => {
        this.setState({ app_time : event.target.value });
        console.log(this.state);
    }


    render() {
        return (
            <div>
                <NavbarPatient/>
                <div className="contact-wrapper">
                    <div className="container-fluid no-padding">
                        <div className="row">
                            <div className="col-md-12">
                                <h3><i>Book Appointment</i></h3>
                                <img
                                    src="https://image.freepik.com/free-vector/appointment-booking-with-calendar_23-2148553008.jpg"
                                    className="img-responsive" height="440" width="350"/>
                            </div>
                        </div>
                    </div>

                    <form id="contact-form" className="form-horizontal" role="form">

                        <div className="form-outline mb-4">
                            <label className="form-label" htmlFor="form3Example9">First Name</label>
                            <input type="text" className="form-control" id="fname" value={ this.state.fname } name="name"
                                   onChange={ this.fname } required/>
                        </div>

                        <div className="form-outline mb-4">
                            <label className="form-label" htmlFor="form3Example9">Last Name</label>
                            <input type="text" className="form-control" id="lname" value={ this.state.lname } name="name"
                                   onChange={ this.lname } required/>
                        </div>

                        <div className="form-outline mb-4">
                            <label className="form-label" htmlFor="form3Example9">Doctor Id</label>
                            <input type="text" className="form-control" id="lname" value={ this.state.bdr_id } name="name"
                                   onChange={ this.bdr_id } required/>
                        </div>


                        <div className="form-outline mb-4">
                            <label className="form-label" htmlFor="form3Example9">Select Date</label>
                            <input type="Date" className="form-control" id="app_date" value={ this.state.app_date }
                                   name="name" onChange={ this.app_date } required/>
                        </div>


                        <div className="row">
                            <div className="form-outline mb-4">
                                <label className="form-label" htmlFor="form3Example9">Select Time : </label>
                                <select className="select" onChange={ this.time_slot }>
                                    <option value="0">Select</option>
                                    <option value="2">09AM-10PM</option>
                                    <option value="2">10AM-11AM</option>
                                    <option value="2">11AM-12PM</option>
                                    <option value="2">04PM-05PM</option>
                                    <option value="2">05PM-06PM</option>
                                    <option value="2">06PM-07PM</option>
                                    <option value="2">07PM-08PM</option>

                                </select>
                            </div>
                        </div>


                        <button className="btn btn-primary send-button" type="button" value="SEND" onClick={ this.bookApp }>
                            <div className="alt-send-button">
                                <i className="fa fa-paper-plane" /><span className="send-text">Book</span>
                            </div>

                        </button>


                    </form>
                </div>
            </div>
        )
    }
}
export default withRouter(BookAppointment);