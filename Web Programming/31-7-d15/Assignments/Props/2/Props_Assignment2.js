import React from 'react';

function DisplayNameList(props){

    return (
        <div>
            <ul>
                <li>
                    {props.names[0]}
                </li>
                <li>
                    {props.names[1]}
                </li>
                <li>
                    {props.names[2]}
                </li>
                <li>
                    {props.names[3]}
                </li>
            </ul>
        </div>
    );
}

export default DisplayNameList;