import React, { useContext } from 'react';
import { withRouter } from 'react-router';
import Header from './homePageComponents/Header';
import './css/aboutus.css';

class AboutUs extends React.Component {

    render() {
        return (
            <div>
                <Header/>
                <section className=" bg-dark">

                    <div className="row d-flex justify-content-center align-items-center h-100">
                        <div className="col">
                            <div className="card card-registration my-4">
                                <div className="col-xl">

                                    <section className="text-center about">
                                        <h1>About Us</h1>
                                        <section className="bg-White c-quality-healthcare-wrapper coverbanner">
                                            <div className="row center-block">
                                                <div className="col-xs-12 col-sm-12 clear-hboth text-center">
                                                    <div>
                                                        <img className=" vector" alt="Practo&#x27;s Promise"
                                                             title="Practo&#x27;s Promise"
                                                             src="https://www.practo.com/providers/static/images/pages/company/about/quality-healthcaremadesimple.svg"/>
                                                    </div>
                                                </div>
                                            </div>
                                        </section>
                                        <br/>
                                        <div className="container">
                                            <div className="row">
                                                <div className="col-xl-12 about-item wow lightSpeedIn"
                                                     data-wow-offset="200">

                                                    <span className="fa fa-group"/>
                                                    <br/>
                                                    <h2>Our Vision</h2>
                                                    <p className="lead">Enable healthcare businesses to provide superior
                                                        healthcare delivery and patient care with technology –
                                                        globally</p>
                                                </div>

                                                <div className="col-xl-12 about-item wow lightSpeedIn "
                                                     data-wow-offset="200">
                                                    <div className="row center-block">
                                                    </div>
                                                    <div className="clearfix"/>
                                                    <span className="fa fa-info"/>
                                                    <br/>
                                                    <h2>Our Mission </h2>
                                                    <p className="lead">Online Clinic Management System is on a mission
                                                        to make quality healthcare affordable and accessible for over a
                                                        billion+ Indians. We believe in empowering our users with the
                                                        most accurate, comprehensive, and curated information and care,
                                                        enabling them to make better healthcare decisions.</p>
                                                    <div className="row">
                                                        <div className="col-xl-12 about-item wow lightSpeedIn"
                                                             data-wow-offset="200">
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </section>
                                    <div>

                                    </div>


                                    <p/>
                                </div>
                            </div>

                        </div>

                    </div>
                </section>
            </div>
        );
    }
}
export default withRouter(AboutUs);