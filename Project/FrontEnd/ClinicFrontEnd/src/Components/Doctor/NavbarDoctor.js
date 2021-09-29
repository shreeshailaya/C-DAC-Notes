import React from 'react';
import {Link} from 'react-router-dom';
import '../pages/homePageComponents/Navbar.css';


const NavbarDoctor = () => {
  return (
    <div>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
      <i class="text-white">Online Clinic Management System</i>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ms-md-auto gap-2">
          <li class="nav-item rounded">
            <a class="nav-link active" aria-current="page" href="doctor"><i class="bi bi-house-fill me-2"></i>Home</a>
          </li>

          <li class="nav-item rounded">
            <a class="nav-link" href="/dr_profile"><i class="bi bi-people-fill me-2" ></i>Profile</a>
          </li>
          
          <li class="nav-item rounded">
            <a class="nav-link" href="/viewappointments"><i class="bi bi-telephone-fill me-2"></i>Appointments</a>
          </li>

          <li class="nav-item rounded">
            <a class="nav-link" href="/applyleave"><i class="bi bi-telephone-fill me-2"></i>Apply for leave</a>
          </li>

          <li class="nav-item rounded">
            <a class="nav-link" href="/"><i class="bi bi-telephone-fill me-2"></i>Logout</a>
          </li>


        </ul>
      </div>
    </div>
  </nav>

  </div>
    );
  };


export default NavbarDoctor;