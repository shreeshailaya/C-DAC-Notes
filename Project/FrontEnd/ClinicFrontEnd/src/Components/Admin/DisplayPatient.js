import React, { useContext } from 'react';
import { withRouter } from 'react-router';
import NavbarAdmin from '../Admin/NavbarAdmin';
class DisplayPatient extends React.Component{

    constructor(props) {

        super(props)
        this.state = {

            account : [],

        }
    }

    /**
     * fetch data and set state of account
     */
    componentDidMount = () =>{
        fetch("http://localhost:8080/auth/v1/allapp")
        .then(resp => resp.json())
        .then(data => {this.setState({account: data});
                       alert(this.state.account.length)});

       
    }

    render(){
        return (

            <div>
                <NavbarAdmin/>
                <h2> Patient List </h2>
                <div className="row"/>
                <table className="table table-dark  table-bordered table-hover ">
                    <thead>
                    <tr>
                        <th scope="col">First Name</th>
                        <th scope="col">Last Name</th>
                        <th scope="col">Contact No.</th>
                        <th scope="col">Address</th>
                        <th scope="col">Gender</th>
                        <th scope="col">Date of Birth</th>
                        <th scope="col">Doctor ID</th>
                        <th scope="col">Appointment ID</th>
                        <th scope="col">Appointment Date</th>
                        <th scope="col">Appointment Time</th>


                    </tr>
                    </thead>
                    {
                        this.state.account.map(
                            obj => {
                                return (
                                    <tr>


                                        <td style={ { color : 'black' } }>{ obj.fname }</td>
                                        <td style={ { color : 'black' } }>{ obj.lname }</td>
                                        <td style={ { color : 'black' } }>{ obj.contact_no }</td>
                                        <td style={ { color : 'black' } }>{ obj.address }</td>
                                        <td style={ { color : 'black' } }>{ obj.gender }</td>
                                        <td style={ { color : 'black' } }>{ obj.dob }</td>
                                        <td style={ { color : 'black' } }>{ obj.appointments[0].dr_id }</td>
                                        <td style={ { color : 'black' } }>{ obj.appointments[0].app_id }</td>
                                        <td style={ { color : 'black' } }>{ obj.appointments[0].app_date }</td>
                                        <td style={ { color : 'black' } }>{ obj.appointments[0].app_time }</td>


                                    </tr>
                                )
                            }
                        )

                    }

                </table>
            </div>
        );
    }
}
export default withRouter(DisplayPatient);