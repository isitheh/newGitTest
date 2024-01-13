import React, { useMemo, useState } from 'react';

const CarList = ({ cars }) => {
    const [searchInput, setSearchInput] = useState("");
    const filteredCars = useMemo((cars) => {
        if (searchInput.trim() === "") {
            return cars;
        } else {
            return cars.filter((car) => {
                car.name.toLowerCase().includes(searchInput.toLowerCase());
            });
        }

    }, [cars, searchInput]);
    return (
        <>
            <input 
                type="text"
                value={searchInput}
                onChange={(e) => {setSearchInput(e.target.value)}}
                placeholder='Search here'
            />
        </>
    );
}