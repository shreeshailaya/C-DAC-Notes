import React, { useContext } from 'react';
import { withRouter } from 'react-router';
import NavbarAdmin from '../Admin/NavbarAdmin';

class Admin extends React.Component{
    render()
    {
        return(
            <div>
                <NavbarAdmin/>
                
                <h1>This is Admin Dashboard </h1>
            </div>
        )
    }
}
export default withRouter(Admin);