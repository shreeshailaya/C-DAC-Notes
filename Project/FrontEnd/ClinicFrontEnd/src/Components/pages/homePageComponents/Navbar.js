import React from 'react';
import {Link} from 'react-router-dom';
import './Navbar.css';


const Navbar = () => {
  return (
      <div>
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
          <div className="container-fluid">
            <i className="text-white">Online Clinic Management System</i>
            <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span className="navbar-toggler-icon"/>
            </button>
            <div className="collapse navbar-collapse" id="navbarNav">
              <ul className="navbar-nav ms-md-auto gap-2">
                <li className="nav-item rounded">
                  <a className="nav-link active" aria-current="page" href="/"><i className="bi bi-house-fill me-2"/>Home</a>
                </li>
                <li className="nav-item rounded">
                  <a className="nav-link" href="/registration"><i className="bi bi-people-fill me-2"/>Register</a>
                </li>
                <li className="nav-item rounded">
                  <a className="nav-link" href="/login"><i className="bi bi-telephone-fill me-2"/>Login</a>
                </li>
                <li className="nav-item rounded">
                  <a className="nav-link" href="/aboutus"><i className="bi bi-telephone-fill me-2"/>About us</a>
                </li>
                <li className="nav-item rounded">
                  <a className="nav-link" href="contactus"><i className="bi bi-telephone-fill me-2"/>Contact us</a>
                </li>

              </ul>
            </div>
          </div>
        </nav>

      </div>
  );
};






    /*
    <nav classNameName="navbar navbar-expand-md " id="main-home-navbar">
    <div classNameName="collapse navbar-collapse " id="navbarNav">
      <ul classNameName="navbar-nav ms-auto mb-2 mb-lg-0 ">
        <li classNameName="nav-item active">
          <Link classNameName="nav-link main-home-nav" to="/"><b>Home</b></Link>
        </li>
        <li classNameName="nav-item">
          <Link classNameName="nav-link main-home-nav" to="/registration"><b>Registration</b></Link>
        </li>
        <li classNameName="nav-item">
          <Link classNameName="nav-link main-home-nav" to="/login"><b>Login</b></Link>
        </li>
        <li classNameName="nav-item">
          <Link classNameName="nav-link main-home-nav" to="/"><b>Contact us</b></Link>
        </li>
        <li classNameName="nav-item">
          <Link classNameName="nav-link main-home-nav" to="/"><b>About</b></Link>
        </li>
      </ul>
    </div>
  </nav>




  profile 

   <li className="nav-item dropdown rounded">
            <a className="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i className="bi bi-person-fill me-2"></i>Profile</a>
            <ul className="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
              <li><a className="dropdown-item" href="#">Account</a></li>
              <li><a className="dropdown-item" href="#">Another action</a></li>
              <li>
                <hr className="dropdown-divider" />
              </li>
              <li><a className="dropdown-item" href="#">Logout</a></li>
            </ul>
          </li>
  */


export default Navbar;