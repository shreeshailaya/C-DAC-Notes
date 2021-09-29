import React, { useContext } from 'react';
import { withRouter } from 'react-router';
import NavbarPatient from '../Patient/NavbarPatient';
class Patient extends React.Component{
    render()
    {
        return(
            <div>
                <NavbarPatient/>
                <h1>Welcome Patient</h1>
                <div class="row">
                <div class="col-xl-6 d-none d-xl-block">
                 <br/><br/>
                    <img
                         src="https://www.cloudclinik.pk/documents/10830/130000833232/LoginPage.png/220c65e8-424a-4c1d-ade3-b76eba3c8ec1?t=1591880321000"
                         alt="Sample photo"
                         class="img-fluid"
                         style={{"border-top-left-radius": ".25rem","border-bottom-left-radius": ".25rem" }}
                    />
                </div>
                 <div class="col-xl-6 d-none d-xl-block">
                     <br/>    <br/>    <br/>    <br/><br/>    <br/><br/>    <br/>
                  <button type="button" class="btn btn-light btn-lg  p-3 mb-2 bg-dark text-white">Book Appoinment</button> 
                </div>
                </div>
            </div>
        )
    }
}
export default withRouter(Patient);