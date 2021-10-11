import React from 'react';
import {Link} from 'react-router-dom';
import '../pages/homePageComponents/Navbar.css';


const NavbarPatient = () => {
  return (
      <div>
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
          <div className="container-fluid">
            <i className="text-white">Online Clinic Management System</i>
            <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span className="navbar-toggler-icon" />
            </button>
            <div className="collapse navbar-collapse" id="navbarNav">
              <ul className="navbar-nav ms-md-auto gap-2">
                <li className="nav-item rounded">
                  <a className="nav-link active" aria-current="page" href="patient"><i
                      className="bi bi-house-fill me-2" />Home</a>
                </li>
                <li className="nav-item rounded">
                  <a className="nav-link active" aria-current="page" href="bookappointment"><i
                      className="bi bi-house-fill me-2" />Book Appoinment</a>
                </li>
                <li className="nav-item rounded">
                  <a className="nav-link" href="/viewdoctors"><i className="bi bi-people-fill me-2" />View Doctors</a>
                </li>
                <li className="nav-item rounded">
                  <a className="nav-link" href="/patientprofile"><i className="bi bi-telephone-fill me-2" />Profile</a>
                </li>
                {/*<li className="nav-item rounded">
            <a className="nav-link" href="/aboutus"><i className="bi bi-telephone-fill me-2"></i>Medical Records</a>
          </li>
          <li className="nav-item rounded">
            <a className="nav-link" href="/aboutus"><i className="bi bi-telephone-fill me-2"></i>Pay Bill</a>
          </li>*/ }
                <li className="nav-item rounded">
                  <a className="nav-link" href="/"><i className="bi bi-telephone-fill me-2" />Logout</a>
                </li>


              </ul>
            </div>
          </div>
        </nav>

      </div>
  );
};


export default NavbarPatient;