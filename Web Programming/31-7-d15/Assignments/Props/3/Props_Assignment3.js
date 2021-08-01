import React from 'react';


class Employee extends React.Component {

    constructor(props){
        super(props);
    }

    static defaultProps = {
        name:"Monika",
        id:1001,
        salary:500000
    }

    render(){
        return(
            <div>
                <h4>Employee Information </h4><br/><br/>
                <table border='1'>
                    <tr><th>ID</th><th>Name</th><th>Salary</th></tr>
                    <tr>
                        <td>
                           {this.props.id}
                        </td>
                        <td>
                            {this.props.name}
                        </td>
                        <td>
                            {this.props.salary}
                        </td>
                    </tr>
                </table>    
            </div>
        );
    }
}

export default Employee;