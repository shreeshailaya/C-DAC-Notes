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
          <a class="nav-link" href="/displaypatient"><i class="bi bi-people-fill me-2"></i>Patient</a>
          </li>
          <li class="nav-item rounded">
            <a class="nav-link" href="/displaydoctors"><i class="bi bi-people-fill me-2"></i>Doctors</a>
          </li>
          <li class="nav-item rounded">
            <a class="nav-link" href="/aboutus"><i class="bi bi-telephone-fill me-2"></i>Payment Collection</a>
          </li>
          <li class="nav-item rounded">
            <a class="nav-link" href="approveleave"><i class="bi bi-telephone-fill me-2"></i>Approve leave</a>
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