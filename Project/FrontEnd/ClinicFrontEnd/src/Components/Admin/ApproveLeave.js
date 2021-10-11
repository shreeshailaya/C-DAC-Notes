import React, { useContext } from 'react';
import { withRouter } from 'react-router';
import NavbarAdmin from '../Admin/NavbarAdmin';
class DisplayPatient extends React.Component{

    constructor(props) {

        super(props);
        this.state = {

            account : [],

        }
    }

    /**
     * fetch data and set state of account
     */
    componentDidMount = () =>{
        fetch("http://localhost:8080/auth/v1/get_all_leave")
        .then(resp => resp.json())
        .then(data => {this.setState({account: data});
                       alert(this.state.account.length)});

       
    }

    render(){
        return (

            <div>
                <NavbarAdmin/>
                <h2>Leave Approval </h2>
                <table className="table table-bordered table-striped">
                    <thead>
                    <tr>

                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Reason</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    {
                        this.state.account.map(
                            obj => {
                                return (
                                    <tr>


                                        <td>{ obj.fname }</td>
                                        <td>{ obj.lname }</td>
                                        <td>{ obj.from }</td>
                                        <td>{ obj.to }</td>
                                        <td>{ obj.reason }</td>
                                        {/*<td>{obj.approval_status}</td>
                                        */ }
                                        <div class="d-flex ">

                                            <button type="button" class="btn btn-warning btn-lg ms-2"
                                                    onClick={ this.onSubmit }>Approve
                                            </button>
                                        </div>


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