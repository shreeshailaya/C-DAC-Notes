import React from 'react';
import {Link} from 'react-router-dom';
import '../pages/homePageComponents/Navbar.css';


const NavbarDoctor = () => {
  return (
    <div>
    <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
    <div className="container-fluid">
      <i className="text-white">Online Clinic Management System</i>
      <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span className="navbar-toggler-icon"></span>
      </button>
      <div className="collapse navbar-collapse" id="navbarNav">
        <ul className="navbar-nav ms-md-auto gap-2">
          <li className="nav-item rounded">
            <a className="nav-link active" aria-current="page" href="doctor"><i className="bi bi-house-fill me-2"></i>Home</a>
          </li>

          <li className="nav-item rounded">
            <a className="nav-link" href="/dr_profile"><i className="bi bi-people-fill me-2" ></i>Profile</a>
          </li>
          
          <li className="nav-item rounded">
            <a className="nav-link" href="/viewappointments"><i className="bi bi-telephone-fill me-2"></i>Appointments</a>
          </li>

          <li className="nav-item rounded">
            <a className="nav-link" href="/applyleave"><i className="bi bi-telephone-fill me-2"></i>Apply for leave</a>
          </li>

          <li className="nav-item rounded">
            <a className="nav-link" href="/"><i className="bi bi-telephone-fill me-2"></i>Logout</a>
          </li>


        </ul>
      </div>
    </div>
  </nav>

  </div>
    );
  };


export default NavbarDoctor;