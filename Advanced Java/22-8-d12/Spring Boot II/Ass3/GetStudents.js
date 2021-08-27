import React from "react";

export class GetStudents extends React.Component{

    constructor(props)
    {
        super(props)
        this.state={
            students: []
        }
    }

    componentDidMount = () =>{
        fetch("http://localhost:8080/all")
        .then(resp => resp.json())
        .then(data => {this.setState({students: data});
                       alert(this.state.students.length)});
    }

    render(){
        return (
            <div>
                <h2> Student List </h2>
                <table className="table table-bordered table-striped">
                    {
                        this.state.students.map(
                            obj=>{
                                return(
                                    <tr>
                                        <td>{obj.sid}</td>
                                        <td>{obj.name}</td>
                                        <td>{obj.city}</td>
                                        <td>{obj.bdate}</td>
                                    </tr>
                                )
                            }
                        )
                    }
                </table>
            </div>
        )
    }

}