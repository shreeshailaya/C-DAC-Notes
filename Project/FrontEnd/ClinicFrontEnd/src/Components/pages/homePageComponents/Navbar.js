import React from 'react';
import {Link} from 'react-router-dom';
import './Navbar.css';


const Navbar = () => {
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
            <a class="nav-link active" aria-current="page" href="/"><i class="bi bi-house-fill me-2"></i>Home</a>
          </li>
          <li class="nav-item rounded">
            <a class="nav-link" href="/registration"><i class="bi bi-people-fill me-2"></i>Register</a>
          </li>
          <li class="nav-item rounded">
            <a class="nav-link" href="/login"><i class="bi bi-telephone-fill me-2"></i>Login</a>
          </li>
          <li class="nav-item rounded">
            <a class="nav-link" href="/aboutus"><i class="bi bi-telephone-fill me-2"></i>About us</a>
          </li>
          <li class="nav-item rounded">
            <a class="nav-link" href="contactus"><i class="bi bi-telephone-fill me-2"></i>Contact us</a>
          </li>
         
        </ul>
      </div>
    </div>
  </nav>

  </div>
    );
  };






    /*
    <nav className="navbar navbar-expand-md " id="main-home-navbar">
    <div className="collapse navbar-collapse " id="navbarNav">
      <ul className="navbar-nav ms-auto mb-2 mb-lg-0 ">
        <li className="nav-item active">
          <Link className="nav-link main-home-nav" to="/"><b>Home</b></Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link main-home-nav" to="/registration"><b>Registration</b></Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link main-home-nav" to="/login"><b>Login</b></Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link main-home-nav" to="/"><b>Contact us</b></Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link main-home-nav" to="/"><b>About</b></Link>
        </li>
      </ul>
    </div>
  </nav>




  profile 

   <li class="nav-item dropdown rounded">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="bi bi-person-fill me-2"></i>Profile</a>
            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
              <li><a class="dropdown-item" href="#">Account</a></li>
              <li><a class="dropdown-item" href="#">Another action</a></li>
              <li>
                <hr class="dropdown-divider" />
              </li>
              <li><a class="dropdown-item" href="#">Logout</a></li>
            </ul>
          </li>
  */


export default Navbar;