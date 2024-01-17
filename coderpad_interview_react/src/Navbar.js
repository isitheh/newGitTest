import React from 'react';

const Navbar = ({ links }) => {

    return (
        <nav>
            <ul>
            {
                links.map((link) => (
                    <li key={link.id}>
                        <a href={link.url}>{link.text}</a>
                    </li>
                ))
            }
        </ul>
        </nav>
    );
}

export default Navbar;