import React, { useContext } from 'react';
import { withRouter } from 'react-router';
import NavbarDoctor from '../Doctor/NavbarDoctor';

class ViewAppointments extends React.Component {


    constructor(props) {

        super(props)
        this.state = {

            account : [],

        }
    }

    /**
     * fetch data and set state of account
     */
    componentDidMount = () => {
        fetch("http://localhost:8080/auth/v1/allapp")
            .then(resp => resp.json())
            .then(data => {
                this.setState({ account : data });
                alert(this.state.account.length)
            });


    }

    render() {
        return (

            <div>
                <NavbarDoctor/>
                <h2> Appointments </h2>
                <table className="table table-bordered ">

                    <thead>
                    <tr>

                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Contact No.</th>
                        <th>Address</th>
                        <th>Gender</th>
                        <th>Date of Birth</th>

                        <th>Appointment ID</th>
                        <th>Appointment Date</th>
                        <th>Appointment Time</th>


                    </tr>
                    </thead>
                    {
                        this.state.account.map(
                            obj => {
                                return (
                                    <tr>


                                        <td>{ obj.fname }</td>
                                        <td>{ obj.lname }</td>
                                        <td>{ obj.contact_no }</td>
                                        <td>{ obj.address }</td>
                                        <td>{ obj.gender }</td>
                                        <td>{ obj.dob }</td>

                                        <td>{ obj.appointments[0].app_id }</td>
                                        <td>{ obj.appointments[0].app_date }</td>
                                        <td>{ obj.appointments[0].app_time }</td>


                                    </tr>
                                )
                            }
                        )

                    }

                </table>
            </div>
        )
    }
}
export default withRouter(ViewAppointments);